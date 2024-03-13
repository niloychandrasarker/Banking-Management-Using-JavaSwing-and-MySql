/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Niloy_Banking_Management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import java.sql.ResultSet;

/**
 *
 * @author Niloy Sarker
 */
public class Diposit extends javax.swing.JFrame {

    private final String accountNumber; // Assuming you have a variable to store the account number
    private final String pin;

    public Diposit(String accountNumber, String pin) {
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

        DipositBtn = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        DpTextFeild = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 800));
        getContentPane().setLayout(null);

        DipositBtn.setBackground(new java.awt.Color(0, 51, 102));
        DipositBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DipositBtn.setForeground(new java.awt.Color(255, 255, 255));
        DipositBtn.setText("Deposit");
        DipositBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DipositBtnActionPerformed(evt);
            }
        });
        getContentPane().add(DipositBtn);
        DipositBtn.setBounds(410, 410, 140, 27);

        Back.setBackground(new java.awt.Color(0, 51, 102));
        Back.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back);
        Back.setBounds(410, 440, 140, 27);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("ENTER AMOUNT YOU WANT TO DEPOSIT");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(220, 300, 320, 30);

        DpTextFeild.setBackground(new java.awt.Color(255, 255, 255));
        DpTextFeild.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DpTextFeild.setForeground(new java.awt.Color(51, 51, 51));
        DpTextFeild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DpTextFeildActionPerformed(evt);
            }
        });
        getContentPane().add(DpTextFeild);
        DpTextFeild.setBounds(250, 330, 250, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon("H:\\CSE\\Java Swing\\Project\\Banking_Management_System\\src\\Images\\atm.jpeg")); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, -30, 900, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DipositBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DipositBtnActionPerformed
        String Amount, query;
        String SUrl, SUser, SPass;
        SUrl = "jdbc:MySQL://localhost:3306/banking_mangement_system";
        SUser = "root";
        SPass = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            Statement st = con.createStatement();
            if ("".equals(DpTextFeild.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Please enter the Amount to you want to Deposit", "Error",
                        JOptionPane.ERROR_MESSAGE);
            } else {
            Amount = DpTextFeild.getText();
            Date date = new Date();

            // Fetch the current total deposited amount for the account
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
            int depositAmount = Integer.parseInt(Amount);
            int newTotalAmount = totalDepositedAmount - totalWithdrawnAmount + depositAmount;

            // Update the total amount in the database
            query = "INSERT INTO bank(Acount_No, Pin, Date, Type, Amount, Total_Amount)"
                    + "VALUES('" + accountNumber + "', '" + pin + "' , '" + date + "' , '" + "Deposit" + "' , '" + depositAmount + "' , '" + newTotalAmount + "')";
            st.execute(query);
                DpTextFeild.setText("");
                JOptionPane.showMessageDialog(null, "Rs. " + Amount + " Deposited Successfully");
                Tranjection tranjection = new Tranjection(accountNumber,pin);
                    tranjection.setVisible(true);
                    tranjection.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    tranjection.setTitle("Home");
                    tranjection.pack();
                    tranjection.setLocationRelativeTo(null);
                    this.dispose();
            }
        } catch (Exception e) {
            System.out.println("Error!" + e.getMessage());
        }  // TODO add your handling code here:
    }//GEN-LAST:event_DipositBtnActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
                    Tranjection tranjection = new Tranjection(accountNumber,pin);
                    tranjection.setVisible(true);
                    tranjection.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    tranjection.setTitle("NS Bank");
                    tranjection.pack();
                    tranjection.setLocationRelativeTo(null);
                    this.dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void DpTextFeildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DpTextFeildActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DpTextFeildActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton DipositBtn;
    private javax.swing.JTextField DpTextFeild;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}