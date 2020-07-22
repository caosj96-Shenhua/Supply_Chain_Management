package userinterface;

import Business.EcoSystem;
import Business.DB4OUtil.DB4OUtil;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author zhanghaojie
 */
public class MainInterface extends javax.swing.JFrame {

    private EcoSystem system;
    private DB4OUtil dbUtil = DB4OUtil.getInstance();

    public MainInterface() {
        initComponents();
        system = dbUtil.retrieveSystem();
        usernameJtext.setToolTipText("<html> factory1, supplier1,order1, store1, <br>stock1, financial1,generate1, worker1<html>");
        psdField.setToolTipText("scm123");

    }

    private boolean checkDataValid(String userName, String psd) {
        if (userName == null || userName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please input the User Name", "LOGIN", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (psd == null || psd.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please input the Password", "LOGIN", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    private void cleanInterface() {
        logoutBtn.setEnabled(false);
        usernameJtext.setEnabled(true);
        psdField.setEnabled(true);
        loginBtn.setEnabled(true);
        usernameJtext.setText("");
        psdField.setText("");

        container.removeAll();
        container.add("blank", new JPanel());
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitJpanel = new javax.swing.JSplitPane();
        userJpanel = new javax.swing.JPanel();
        usernameJlabel = new javax.swing.JLabel();
        usernameJtext = new javax.swing.JTextField();
        psdJlabel = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        psdField = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        container = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        splitJpanel.setDividerLocation(160);

        userJpanel.setBackground(new java.awt.Color(102, 102, 102));

        usernameJlabel.setFont(new java.awt.Font("Futura", 0, 20)); // NOI18N
        usernameJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usernameJlabel.setText("UserName");
        usernameJlabel.setMaximumSize(new java.awt.Dimension(100, 30));
        usernameJlabel.setMinimumSize(new java.awt.Dimension(100, 30));
        usernameJlabel.setPreferredSize(new java.awt.Dimension(100, 30));

        usernameJtext.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        usernameJtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameJtext.setMaximumSize(new java.awt.Dimension(100, 30));
        usernameJtext.setMinimumSize(new java.awt.Dimension(100, 30));
        usernameJtext.setPreferredSize(new java.awt.Dimension(100, 30));

        psdJlabel.setFont(new java.awt.Font("Futura", 0, 20)); // NOI18N
        psdJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        psdJlabel.setText("Password");
        psdJlabel.setMaximumSize(new java.awt.Dimension(100, 30));
        psdJlabel.setMinimumSize(new java.awt.Dimension(100, 30));
        psdJlabel.setPreferredSize(new java.awt.Dimension(100, 30));

        loginBtn.setFont(new java.awt.Font("Futura", 0, 20)); // NOI18N
        loginBtn.setText("Login");
        loginBtn.setMaximumSize(new java.awt.Dimension(100, 30));
        loginBtn.setMinimumSize(new java.awt.Dimension(100, 30));
        loginBtn.setPreferredSize(new java.awt.Dimension(100, 30));
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        logoutBtn.setFont(new java.awt.Font("Futura", 0, 20)); // NOI18N
        logoutBtn.setText("Logout");
        logoutBtn.setEnabled(false);
        logoutBtn.setMaximumSize(new java.awt.Dimension(100, 30));
        logoutBtn.setMinimumSize(new java.awt.Dimension(100, 30));
        logoutBtn.setPreferredSize(new java.awt.Dimension(100, 30));
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        psdField.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        psdField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        psdField.setPreferredSize(new java.awt.Dimension(100, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/284722489000201.gif"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-team-30.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-lock-26.png"))); // NOI18N

        javax.swing.GroupLayout userJpanelLayout = new javax.swing.GroupLayout(userJpanel);
        userJpanel.setLayout(userJpanelLayout);
        userJpanelLayout.setHorizontalGroup(
            userJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userJpanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(userJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addGroup(userJpanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(psdJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(userJpanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
            .addGroup(userJpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(userJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameJtext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(psdField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userJpanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(userJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(logoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(loginBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        userJpanelLayout.setVerticalGroup(
            userJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userJpanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(userJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(usernameJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(userJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(psdJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(psdField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        splitJpanel.setLeftComponent(userJpanel);

        container.setLayout(new java.awt.CardLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(20000, 20000));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/d3591c63b81ba14696e290f74743e1de.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        container.add(jPanel1, "card2");

        splitJpanel.setRightComponent(container);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitJpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 971, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitJpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        String userName = usernameJtext.getText();
        char[] passwordCharArray = psdField.getPassword();
        String password = String.valueOf(passwordCharArray);

        if (!checkDataValid(userName, password)) {
            return;
        }

        UserAccount userAccount = system.getUserAccountDirectory().authenticateUser(userName, password);
        Enterprise inEnterprise = null;
        Organization inOrganization = null;
        if (userAccount == null) {
            for (Network network : system.getNetworkDirectory().getNetworkList()) {
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    userAccount = enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                    if (userAccount == null) {
                        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            userAccount = organization.getUserAccountDirectory().authenticateUser(userName, password);
                            if (userAccount != null) {
                                inEnterprise = enterprise;
                                inOrganization = organization;
                                break;
                            }
                        }

                    } else {
                        inEnterprise = enterprise;
                        break;
                    }
                    if (inOrganization != null) {
                        break;
                    }
                }
                if (inEnterprise != null) {
                    break;
                }
            }
        }

        if (userAccount == null) {
            JOptionPane.showMessageDialog(null, "Invalid User", "LOGIN", JOptionPane.ERROR_MESSAGE);
            return;
        }

        CardLayout layout = (CardLayout) container.getLayout();
        container.add("workArea", userAccount.getRole().createWorkArea(container, userAccount, inOrganization, inEnterprise, system));
        layout.next(container);

        loginBtn.setEnabled(false);
        logoutBtn.setEnabled(true);
        usernameJtext.setEnabled(false);
        psdField.setEnabled(false);
    }//GEN-LAST:event_loginBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        cleanInterface();
        dbUtil.storeSystem(system);
    }//GEN-LAST:event_logoutBtnActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JPasswordField psdField;
    private javax.swing.JLabel psdJlabel;
    private javax.swing.JSplitPane splitJpanel;
    private javax.swing.JPanel userJpanel;
    private javax.swing.JLabel usernameJlabel;
    private javax.swing.JTextField usernameJtext;
    // End of variables declaration//GEN-END:variables
}
