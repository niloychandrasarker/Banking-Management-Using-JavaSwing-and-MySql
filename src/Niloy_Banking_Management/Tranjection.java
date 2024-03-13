/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Niloy_Banking_Management;

/**
 *
 * @author Niloy Sarker
 */
public class Tranjection extends javax.swing.JFrame {

    private String accountNumber; // Assuming you have a variable to store the account number
    private String pin;

    public Tranjection(String accountNumber, String pin) {
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
        jLabel2 = new javax.swing.JLabel();
        FastCashBtn = new javax.swing.JButton();
        PinChangeBtn = new javax.swing.JButton();
        Withdraw = new javax.swing.JButton();
        TrnsHistoryBtn = new javax.swing.JButton();
        BalanceChk = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DipositBtn.setBackground(new java.awt.Color(0, 51, 102));
        DipositBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DipositBtn.setForeground(new java.awt.Color(255, 255, 255));
        DipositBtn.setText("Deposit");
        DipositBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DipositBtnActionPerformed(evt);
            }
        });
        getContentPane().add(DipositBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 130, 25));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Please Select Your Tranjection");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 300, 40));

        FastCashBtn.setBackground(new java.awt.Color(0, 51, 102));
        FastCashBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        FastCashBtn.setForeground(new java.awt.Color(255, 255, 255));
        FastCashBtn.setText("Fast Cash");
        FastCashBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FastCashBtnActionPerformed(evt);
            }
        });
        getContentPane().add(FastCashBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 130, 25));

        PinChangeBtn.setBackground(new java.awt.Color(0, 51, 102));
        PinChangeBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PinChangeBtn.setForeground(new java.awt.Color(255, 255, 255));
        PinChangeBtn.setText("Pin Change");
        PinChangeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PinChangeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(PinChangeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 130, 25));

        Withdraw.setBackground(new java.awt.Color(0, 51, 102));
        Withdraw.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Withdraw.setForeground(new java.awt.Color(255, 255, 255));
        Withdraw.setText("Withdraw");
        Withdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WithdrawActionPerformed(evt);
            }
        });
        getContentPane().add(Withdraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 130, 25));

        TrnsHistoryBtn.setBackground(new java.awt.Color(0, 51, 102));
        TrnsHistoryBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TrnsHistoryBtn.setForeground(new java.awt.Color(255, 255, 255));
        TrnsHistoryBtn.setText("Trns History");
        TrnsHistoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrnsHistoryBtnActionPerformed(evt);
            }
        });
        getContentPane().add(TrnsHistoryBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, 130, 25));

        BalanceChk.setBackground(new java.awt.Color(0, 51, 102));
        BalanceChk.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BalanceChk.setForeground(new java.awt.Color(255, 255, 255));
        BalanceChk.setText("Ballance Check");
        BalanceChk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BalanceChkActionPerformed(evt);
            }
        });
        getContentPane().add(BalanceChk, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 130, 25));

        Exit.setBackground(new java.awt.Color(0, 51, 102));
        Exit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 450, 130, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon("H:\\CSE\\Java Swing\\Project\\Banking_Management_System\\src\\Images\\atm.jpeg")); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.setMaximumSize(new java.awt.Dimension(1000, 900));
        jLabel5.setMinimumSize(new java.awt.Dimension(1000, 900));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 900, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DipositBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DipositBtnActionPerformed
        Diposit diposit = new Diposit(this.accountNumber, this.pin);

        // Set properties for the JFrame
        diposit.setVisible(true);
        diposit.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        diposit.setTitle("NS Bank");
        diposit.pack();
        diposit.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_DipositBtnActionPerformed

    private void WithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WithdrawActionPerformed
        Withdraw withdraw = new Withdraw(this.accountNumber, this.pin);

        // Set properties for the JFrame
        withdraw.setVisible(true);
        withdraw.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        withdraw.setTitle("NS Bank");
        withdraw.pack();
        withdraw.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_WithdrawActionPerformed

    private void FastCashBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FastCashBtnActionPerformed
        FastCash fastcash = new FastCash(this.accountNumber, this.pin);

        // Set properties for the JFrame
        fastcash.setVisible(true);
        fastcash.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        fastcash.setTitle("NS Bank");
        fastcash.pack();
        fastcash.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_FastCashBtnActionPerformed

    private void PinChangeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PinChangeBtnActionPerformed
        PinChange pinchange = new PinChange(this.accountNumber, this.pin);

        // Set properties for the JFrame
        pinchange.setVisible(true);
        pinchange.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        pinchange.setTitle("NS Bank");
        pinchange.pack();
        pinchange.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_PinChangeBtnActionPerformed

    private void BalanceChkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BalanceChkActionPerformed
        BalanceCheck balanceChk = new BalanceCheck(this.accountNumber, this.pin);

        // Set properties for the JFrame
        balanceChk.setVisible(true);
        balanceChk.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        balanceChk.setTitle("NS Bank");
        balanceChk.pack();
        balanceChk.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BalanceChkActionPerformed

    private void TrnsHistoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrnsHistoryBtnActionPerformed
        TrnsHistory trnsHistory = new TrnsHistory(this.accountNumber, this.pin);

        // Set properties for the JFrame
        trnsHistory.setVisible(true);
        trnsHistory.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        trnsHistory.setTitle("NS Bank");
        trnsHistory.pack();
        trnsHistory.setLocationRelativeTo(null);

    }//GEN-LAST:event_TrnsHistoryBtnActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        User_Login userLogin = new User_Login();

        // Set properties for the JFrame
        userLogin.setVisible(true);
        userLogin.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        userLogin.setTitle("NS Bank");
        userLogin.pack();
        userLogin.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_ExitActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BalanceChk;
    private javax.swing.JButton DipositBtn;
    private javax.swing.JButton Exit;
    private javax.swing.JButton FastCashBtn;
    private javax.swing.JButton PinChangeBtn;
    private javax.swing.JButton TrnsHistoryBtn;
    private javax.swing.JButton Withdraw;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}