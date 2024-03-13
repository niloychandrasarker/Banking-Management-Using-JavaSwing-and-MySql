/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Niloy_Banking_Management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Niloy Sarker
 */
public class Withdraw extends javax.swing.JFrame {

    private final String accountNumber; // Assuming you have a variable to store the account number
    private final String pin;

    public Withdraw(String accountNumber, String pin) {
        initComponents();
        this.accountNumber = accountNumber;
        this.pin = pin;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        WithdrawBtn2 = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        WithdrawAmmountFeild = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 800));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("ENTER AMOUNT YOU WANT TO WITHDRAW");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(210, 300, 340, 30);

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(270, 250, 38, 16);

        WithdrawBtn2.setBackground(new java.awt.Color(0, 51, 102));
        WithdrawBtn2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        WithdrawBtn2.setForeground(new java.awt.Color(255, 255, 255));
        WithdrawBtn2.setText("Withdraw");
        WithdrawBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WithdrawBtn2ActionPerformed(evt);
            }
        });
        getContentPane().add(WithdrawBtn2);
        WithdrawBtn2.setBounds(402, 420, 140, 27);

        backBtn.setBackground(new java.awt.Color(0, 51, 102));
        backBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        getContentPane().add(backBtn);
        backBtn.setBounds(402, 450, 140, 27);

        WithdrawAmmountFeild.setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().add(WithdrawAmmountFeild);
        WithdrawAmmountFeild.setBounds(260, 340, 220, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon("H:\\CSE\\Java Swing\\Project\\Banking_Management_System\\src\\Images\\atm.jpeg")); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, -20, 900, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void WithdrawBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WithdrawBtn2ActionPerformed
        String Amount, query;
        String SUrl, SUser, SPass;
        SUrl = "jdbc:MySQL://localhost:3306/banking_mangement_system";
        SUser = "root";
        SPass = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            Statement st = con.createStatement();
            if ("".equals(WithdrawAmmountFeild.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Please enter the Amount to you want to Deposit", "Error",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                Amount = WithdrawAmmountFeild.getText();
                Date date = new Date();
                String getTotalDepositedQuery = "SELECT SUM(Amount) AS TotalDeposited FROM bank WHERE Acount_No = '" + accountNumber + "' AND Type = 'Deposit'";
                ResultSet depositedResult = st.executeQuery(getTotalDepositedQuery);

                int totalDepositedAmount = 0;
                if (depositedResult.next()) {
                    totalDepositedAmount = depositedResult.getInt("TotalDeposited");
                }

                // Fetch the current total withdrawn amount for the account
                String getTotalWithdrawnQuery = "SELECT SUM(Amount) AS TotalWithdrawn FROM bank WHERE Acount_No = '" + accountNumber + "' AND Type = 'Withdraw'";
                ResultSet withdrawnResult = st.executeQuery(getTotalWithdrawnQuery);

                int totalWithdrawnAmount = 0;
                if (withdrawnResult.next()) {
                    totalWithdrawnAmount = withdrawnResult.getInt("TotalWithdrawn");
                }

                // Calculate the new total amount after deposit
                int WithdrawAmount = Integer.parseInt(Amount);
                int newTotalAmount = totalDepositedAmount - (totalWithdrawnAmount + WithdrawAmount);

                // Update the total amount in the database
                if (newTotalAmount < WithdrawAmount) {
                    JOptionPane.showMessageDialog(null, "Insuffient Balance");
                } // Update the total amount in the database
                else {
                    query = "INSERT INTO bank(Acount_No, Pin, Date, Type, Amount, Total_Amount)"
                            + "VALUES('" + accountNumber + "', '" + pin + "' , '" + date + "' , '" + "Withdraw" + "' , '" + WithdrawAmount + "' , '" + newTotalAmount + "')";
                    st.execute(query);

                    JOptionPane.showMessageDialog(null, "Rs. " + Amount + " Withdraw Successfully");
                    Tranjection tranjection = new Tranjection(accountNumber, pin);
                    tranjection.setVisible(true);
                    tranjection.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    tranjection.setTitle("Home");
                    tranjection.pack();
                    tranjection.setLocationRelativeTo(null);
                    this.dispose();
                }

            }
        } catch (Exception e) {
            System.out.println("Error!" + e.getMessage());
        }
    }//GEN-LAST:event_WithdrawBtn2ActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        Tranjection tranjection = new Tranjection(accountNumber, pin);
        tranjection.setVisible(true);
        tranjection.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tranjection.setTitle("NS Bank");
        tranjection.pack();
        tranjection.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField WithdrawAmmountFeild;
    private javax.swing.JButton WithdrawBtn2;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}