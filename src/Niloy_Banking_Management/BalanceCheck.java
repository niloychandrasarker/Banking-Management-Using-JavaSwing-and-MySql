package Niloy_Banking_Management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JFrame;

public class BalanceCheck extends javax.swing.JFrame {

    private final String accountNumber;
    private final String pin;

    public BalanceCheck(String accountNumber, String pin) {
        initComponents();
        this.accountNumber = accountNumber;
        this.pin = pin;
        displayBalance();
    }

    private void initComponents() {

        BLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 800));
        getContentPane().setLayout(null);

        BLabel.setFont(new java.awt.Font("Segoe UI", 1, 16));
        BLabel.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(BLabel);
        BLabel.setBounds(220, 310, 310, 30);

        jButton1.setBackground(new java.awt.Color(0, 51, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("BACK");

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(460, 420, 90, 27);

        jLabel2.setIcon(new javax.swing.ImageIcon("H:\\CSE\\Java Swing\\Project\\Banking_Management_System\\src\\Images\\atm.jpeg"));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -20, 900, 800);

        pack();
    }

    private void displayBalance() {
        String Amount, query;
        String SUrl, SUser, SPass;
        SUrl = "jdbc:MySQL://localhost:3306/banking_mangement_system";
        SUser = "root";
        SPass = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            Statement st = con.createStatement();

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

            // Calculate the new total amount
            int newTotalAmount = totalDepositedAmount - totalWithdrawnAmount;

            BLabel.setText("Your Current Account Balance is Rs " + newTotalAmount);

        } catch (Exception e) {
            System.out.println("Error!" + e.getMessage());
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        Tranjection tranjection = new Tranjection(accountNumber, pin);
        tranjection.setVisible(true);
        tranjection.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tranjection.setTitle("NS Bank");
        tranjection.pack();
        tranjection.setLocationRelativeTo(null);
        this.dispose();
    }

    private javax.swing.JLabel BLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
}
