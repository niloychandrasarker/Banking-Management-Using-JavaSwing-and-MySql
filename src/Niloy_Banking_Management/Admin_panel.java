/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Niloy_Banking_Management;

import java.awt.Color;

/**
 *
 * @author Niloy Sarker
 */
public class Admin_panel extends javax.swing.JFrame {
private AllUserPagePanel allUserPagePanel;
private DeleteUserPagePanel deleteUserPagePanel;
private AdminCreateAcountPanel adminCreateAcount;
private TotalAvailableBalancePanel totalAvailableBalancePanel;
private DashBoardPanel dashBoardPanel;
    public Admin_panel() {
        initComponents();
        allUserPagePanel = new AllUserPagePanel();
        allUserPagePanel.setVisible(false);
        
        deleteUserPagePanel = new DeleteUserPagePanel();
        deleteUserPagePanel.setVisible(false);
        
        adminCreateAcount = new AdminCreateAcountPanel();
        adminCreateAcount.setVisible(false);
        
        totalAvailableBalancePanel = new TotalAvailableBalancePanel();
        totalAvailableBalancePanel.setVisible(false);
        
        dashBoardPanel = new DashBoardPanel();
        dashBoardPanel.setVisible(false);
        
        getContentPane().add(allUserPagePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 800, 770));
        getContentPane().add(deleteUserPagePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 800, 770));
        getContentPane().add(adminCreateAcount, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 800, 770));
        getContentPane().add(totalAvailableBalancePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 800, 770));
        getContentPane().add(dashBoardPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 800, 770));
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        DAshBoardPanel = new javax.swing.JPanel();
        DashBoardLabel = new javax.swing.JLabel();
        CreateUserPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        DeleteUserPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        AllUserPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        HomePanel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        TotalBalancePanel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        LogoutPanel = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        HomePagePanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setPreferredSize(new java.awt.Dimension(1070, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1070, 40));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_menu_48px_1.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 10, 40, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("I");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 10, 20, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NS BANK");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(100, 10, 130, 30);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1070, 50));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(null);

        DAshBoardPanel.setBackground(new java.awt.Color(51, 51, 51));
        DAshBoardPanel.setForeground(new java.awt.Color(51, 51, 51));
        DAshBoardPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DAshBoardPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DAshBoardPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DAshBoardPanelMouseExited(evt);
            }
        });
        DAshBoardPanel.setLayout(null);

        DashBoardLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DashBoardLabel.setForeground(new java.awt.Color(255, 255, 255));
        DashBoardLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_Library_26px_1.png"))); // NOI18N
        DashBoardLabel.setText(" NS Bank DashBoard");
        DAshBoardPanel.add(DashBoardLabel);
        DashBoardLabel.setBounds(30, 10, 190, 30);

        jPanel2.add(DAshBoardPanel);
        DAshBoardPanel.setBounds(0, 80, 260, 50);

        CreateUserPanel.setBackground(new java.awt.Color(51, 51, 51));
        CreateUserPanel.setForeground(new java.awt.Color(51, 51, 51));
        CreateUserPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreateUserPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CreateUserPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CreateUserPanelMouseExited(evt);
            }
        });
        CreateUserPanel.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_Read_Online_26px.png"))); // NOI18N
        jLabel5.setText(" Create User Account");
        CreateUserPanel.add(jLabel5);
        jLabel5.setBounds(30, 10, 180, 30);

        jPanel2.add(CreateUserPanel);
        CreateUserPanel.setBounds(0, 170, 260, 50);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Features");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(30, 140, 130, 20);

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_Library_26px_1.png"))); // NOI18N
        jLabel7.setText(" NS Bank DashBoard");
        jPanel5.add(jLabel7);
        jLabel7.setBounds(30, 10, 190, 30);

        jPanel2.add(jPanel5);
        jPanel5.setBounds(0, 80, 260, 50);

        DeleteUserPanel.setBackground(new java.awt.Color(51, 51, 51));
        DeleteUserPanel.setForeground(new java.awt.Color(255, 255, 255));
        DeleteUserPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteUserPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DeleteUserPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DeleteUserPanelMouseExited(evt);
            }
        });
        DeleteUserPanel.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_Exit_26px.png"))); // NOI18N
        jLabel8.setText("Delete User Account");
        DeleteUserPanel.add(jLabel8);
        jLabel8.setBounds(30, 10, 160, 30);

        jPanel2.add(DeleteUserPanel);
        DeleteUserPanel.setBounds(0, 270, 260, 50);

        AllUserPanel.setBackground(new java.awt.Color(51, 51, 51));
        AllUserPanel.setForeground(new java.awt.Color(255, 255, 255));
        AllUserPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AllUserPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AllUserPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AllUserPanelMouseExited(evt);
            }
        });
        AllUserPanel.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_Conference_26px.png"))); // NOI18N
        jLabel10.setText("All User Accounts");
        AllUserPanel.add(jLabel10);
        jLabel10.setBounds(30, 10, 160, 30);

        jPanel2.add(AllUserPanel);
        AllUserPanel.setBounds(0, 220, 260, 50);

        HomePanel.setBackground(new java.awt.Color(255, 70, 51));
        HomePanel.setForeground(new java.awt.Color(255, 255, 255));
        HomePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomePanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HomePanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HomePanelMouseExited(evt);
            }
        });
        HomePanel.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_Home_26px_2.png"))); // NOI18N
        jLabel11.setText("  Home Page");
        HomePanel.add(jLabel11);
        jLabel11.setBounds(30, 10, 120, 30);

        jPanel2.add(HomePanel);
        HomePanel.setBounds(0, 30, 260, 50);

        TotalBalancePanel.setBackground(new java.awt.Color(51, 51, 51));
        TotalBalancePanel.setForeground(new java.awt.Color(255, 255, 255));
        TotalBalancePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TotalBalancePanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TotalBalancePanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TotalBalancePanelMouseExited(evt);
            }
        });
        TotalBalancePanel.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_Books_26px.png"))); // NOI18N
        jLabel12.setText("Total Available Balance");
        TotalBalancePanel.add(jLabel12);
        jLabel12.setBounds(30, 10, 180, 30);

        jPanel2.add(TotalBalancePanel);
        TotalBalancePanel.setBounds(0, 320, 260, 50);

        LogoutPanel.setBackground(new java.awt.Color(0, 51, 153));
        LogoutPanel.setForeground(new java.awt.Color(255, 255, 255));
        LogoutPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogoutPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogoutPanelMouseExited(evt);
            }
        });
        LogoutPanel.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_Exit_26px_1.png"))); // NOI18N
        jLabel14.setText("Log Out");
        LogoutPanel.add(jLabel14);
        jLabel14.setBounds(30, 10, 200, 30);

        jPanel2.add(LogoutPanel);
        LogoutPanel.setBounds(0, 370, 260, 50);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 260, 800));

        jLabel4.setIcon(new javax.swing.ImageIcon("H:\\CSE\\Java Swing\\Project\\Banking_Management_System\\src\\Images\\bnk (3).jpg")); // NOI18N

        javax.swing.GroupLayout HomePagePanelLayout = new javax.swing.GroupLayout(HomePagePanel);
        HomePagePanel.setLayout(HomePagePanelLayout);
        HomePagePanelLayout.setHorizontalGroup(
            HomePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        HomePagePanelLayout.setVerticalGroup(
            HomePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(HomePagePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 800, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DAshBoardPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DAshBoardPanelMouseEntered
         DAshBoardPanel.setBackground(new Color(0, 0, 0));
    }//GEN-LAST:event_DAshBoardPanelMouseEntered

    private void DAshBoardPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DAshBoardPanelMouseExited
        DAshBoardPanel.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_DAshBoardPanelMouseExited

    private void CreateUserPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateUserPanelMouseEntered
        CreateUserPanel.setBackground(new Color(0, 0, 0));
    }//GEN-LAST:event_CreateUserPanelMouseEntered

    private void CreateUserPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateUserPanelMouseExited
        CreateUserPanel.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_CreateUserPanelMouseExited

    private void AllUserPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AllUserPanelMouseEntered
        AllUserPanel.setBackground(new Color(0, 0, 0));
    }//GEN-LAST:event_AllUserPanelMouseEntered

    private void AllUserPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AllUserPanelMouseExited
        AllUserPanel.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_AllUserPanelMouseExited

    private void DeleteUserPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteUserPanelMouseEntered
        DeleteUserPanel.setBackground(new Color(0, 0, 0));
    }//GEN-LAST:event_DeleteUserPanelMouseEntered

    private void DeleteUserPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteUserPanelMouseExited
        DeleteUserPanel.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_DeleteUserPanelMouseExited

    private void TotalBalancePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TotalBalancePanelMouseEntered
        TotalBalancePanel.setBackground(new Color(0, 0, 0));
    }//GEN-LAST:event_TotalBalancePanelMouseEntered

    private void TotalBalancePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TotalBalancePanelMouseExited
        TotalBalancePanel.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_TotalBalancePanelMouseExited

    private void LogoutPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutPanelMouseEntered
       LogoutPanel.setBackground(new Color(0, 51, 102));
    }//GEN-LAST:event_LogoutPanelMouseEntered

    private void LogoutPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutPanelMouseExited
        LogoutPanel.setBackground(new Color(0, 51, 153));
    }//GEN-LAST:event_LogoutPanelMouseExited

    private void HomePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomePanelMouseEntered
        HomePanel.setBackground(new Color(255, 102, 102));
    }//GEN-LAST:event_HomePanelMouseEntered

    private void HomePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomePanelMouseExited
        HomePanel.setBackground(new Color(255,70,51));
    }//GEN-LAST:event_HomePanelMouseExited

    private void AllUserPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AllUserPanelMouseClicked
        HomePagePanel.setVisible(false);
        deleteUserPagePanel.setVisible(false);
        totalAvailableBalancePanel.setVisible(false);
        adminCreateAcount.setVisible(false);
        dashBoardPanel.setVisible(false);
        allUserPagePanel.setVisible(true);
        allUserPagePanel.AllInfo();  
    }//GEN-LAST:event_AllUserPanelMouseClicked

    private void HomePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomePanelMouseClicked
        HomePagePanel.setVisible(true);
        allUserPagePanel.setVisible(false);
        deleteUserPagePanel.setVisible(false);
        adminCreateAcount.setVisible(false);
        dashBoardPanel.setVisible(false);
        totalAvailableBalancePanel.setVisible(false);
    }//GEN-LAST:event_HomePanelMouseClicked

    private void DeleteUserPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteUserPanelMouseClicked
         HomePagePanel.setVisible(false);
         allUserPagePanel.setVisible(false);
         adminCreateAcount.setVisible(false);
         totalAvailableBalancePanel.setVisible(false);
         dashBoardPanel.setVisible(false);
         deleteUserPagePanel.setVisible(true);
         deleteUserPagePanel.AllInfo();  
    }//GEN-LAST:event_DeleteUserPanelMouseClicked

    private void CreateUserPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateUserPanelMouseClicked
        
         HomePagePanel.setVisible(false);
         allUserPagePanel.setVisible(false);
         deleteUserPagePanel.setVisible(false);
         totalAvailableBalancePanel.setVisible(false);
         dashBoardPanel.setVisible(false);
         adminCreateAcount.setVisible(true);
         
    }//GEN-LAST:event_CreateUserPanelMouseClicked

    private void TotalBalancePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TotalBalancePanelMouseClicked
         HomePagePanel.setVisible(false);
         allUserPagePanel.setVisible(false);
         deleteUserPagePanel.setVisible(false);
         adminCreateAcount.setVisible(false);
         dashBoardPanel.setVisible(false);
         totalAvailableBalancePanel.setVisible(true);
    }//GEN-LAST:event_TotalBalancePanelMouseClicked

    private void DAshBoardPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DAshBoardPanelMouseClicked
         HomePagePanel.setVisible(false);
         allUserPagePanel.setVisible(false);
         deleteUserPagePanel.setVisible(false);
         adminCreateAcount.setVisible(false);
         totalAvailableBalancePanel.setVisible(false);
         dashBoardPanel.setVisible(true);
    }//GEN-LAST:event_DAshBoardPanelMouseClicked

    private void LogoutPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutPanelMouseClicked
      Admin_login adminLogin = new Admin_login();

        // Set properties for the JFrame
        adminLogin.setVisible(true);
        adminLogin.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        adminLogin.setTitle("NS Bank");
        adminLogin.pack();
        adminLogin.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_LogoutPanelMouseClicked

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AllUserPanel;
    private javax.swing.JPanel CreateUserPanel;
    private javax.swing.JPanel DAshBoardPanel;
    private javax.swing.JLabel DashBoardLabel;
    private javax.swing.JPanel DeleteUserPanel;
    private javax.swing.JPanel HomePagePanel;
    private javax.swing.JPanel HomePanel;
    private javax.swing.JPanel LogoutPanel;
    private javax.swing.JPanel TotalBalancePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
