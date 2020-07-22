package userinterface.AdministrativeRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author zhanghaojie
 */
public class Factory_AdminWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userJpanel;
    private Enterprise enterprise;
    private EcoSystem ecoSystem;

    public Factory_AdminWorkAreaJPanel(JPanel userContainer, Enterprise enterprise, EcoSystem ecoSystem) {
        this.userJpanel = userContainer;
        this.enterprise = enterprise;
        this.ecoSystem = ecoSystem;
        initComponents();
        valueJlabel.setText(enterprise.getEnterpriseName());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleJlabel = new javax.swing.JLabel();
        enterpriseJlabel = new javax.swing.JLabel();
        valueJlabel = new javax.swing.JLabel();
        orgBtn = new javax.swing.JButton();
        employeeBtn = new javax.swing.JButton();
        userBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(244, 238, 236));

        titleJlabel.setFont(new java.awt.Font("Futura", 1, 48)); // NOI18N
        titleJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleJlabel.setText("Factory Admin");
        titleJlabel.setMaximumSize(new java.awt.Dimension(170, 30));
        titleJlabel.setMinimumSize(new java.awt.Dimension(170, 30));
        titleJlabel.setPreferredSize(new java.awt.Dimension(170, 30));

        enterpriseJlabel.setFont(new java.awt.Font("Futura", 2, 24)); // NOI18N
        enterpriseJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enterpriseJlabel.setText("Enterprise:");
        enterpriseJlabel.setMaximumSize(new java.awt.Dimension(120, 30));
        enterpriseJlabel.setMinimumSize(new java.awt.Dimension(120, 30));
        enterpriseJlabel.setPreferredSize(new java.awt.Dimension(120, 30));

        valueJlabel.setFont(new java.awt.Font("Futura", 2, 24)); // NOI18N
        valueJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        valueJlabel.setText("value");
        valueJlabel.setMaximumSize(new java.awt.Dimension(120, 30));
        valueJlabel.setMinimumSize(new java.awt.Dimension(120, 30));
        valueJlabel.setPreferredSize(new java.awt.Dimension(120, 30));

        orgBtn.setBackground(new java.awt.Color(204, 204, 204));
        orgBtn.setFont(new java.awt.Font("Futura", 0, 36)); // NOI18N
        orgBtn.setText("Manage Organization");
        orgBtn.setMaximumSize(new java.awt.Dimension(220, 30));
        orgBtn.setMinimumSize(new java.awt.Dimension(220, 30));
        orgBtn.setPreferredSize(new java.awt.Dimension(220, 30));
        orgBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgBtnActionPerformed(evt);
            }
        });

        employeeBtn.setBackground(new java.awt.Color(204, 204, 204));
        employeeBtn.setFont(new java.awt.Font("Futura", 0, 36)); // NOI18N
        employeeBtn.setText("Manage Employee");
        employeeBtn.setMaximumSize(new java.awt.Dimension(220, 30));
        employeeBtn.setMinimumSize(new java.awt.Dimension(220, 30));
        employeeBtn.setPreferredSize(new java.awt.Dimension(220, 30));
        employeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeBtnActionPerformed(evt);
            }
        });

        userBtn.setBackground(new java.awt.Color(204, 204, 204));
        userBtn.setFont(new java.awt.Font("Futura", 0, 36)); // NOI18N
        userBtn.setText("Manage User");
        userBtn.setMaximumSize(new java.awt.Dimension(220, 30));
        userBtn.setMinimumSize(new java.awt.Dimension(220, 30));
        userBtn.setPreferredSize(new java.awt.Dimension(220, 30));
        userBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userBtnActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/f8c882b63dd99e6dcb2a87244b13349c.jpg"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/20150125_adidas_APP1.jpg"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/New-Balance-logo-2006.jpg"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Reebok_logo19.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(titleJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(45, 45, 45))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(enterpriseJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(valueJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(userBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(employeeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                                    .addComponent(orgBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(81, 81, 81)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4))))
                            .addComponent(jLabel3))))
                .addContainerGap(822, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titleJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(enterpriseJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valueJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(orgBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(employeeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel4)
                        .addGap(29, 29, 29)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(userBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(132, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void orgBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgBtnActionPerformed
        Factory_ManageOrganizationJPanel mngOrgJpanel = new Factory_ManageOrganizationJPanel(userJpanel, enterprise);
        userJpanel.add("mngOrganizationJPanel", mngOrgJpanel);
        CardLayout layout = (CardLayout) userJpanel.getLayout();
        layout.next(userJpanel);
    }//GEN-LAST:event_orgBtnActionPerformed

    private void employeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeBtnActionPerformed
        Factory_ManageEmployeeJPanel mngEmpJpanel = new Factory_ManageEmployeeJPanel(userJpanel, enterprise);
        userJpanel.add("manageEmployeeJPanel", mngEmpJpanel);
        CardLayout layout = (CardLayout) userJpanel.getLayout();
        layout.next(userJpanel);
    }//GEN-LAST:event_employeeBtnActionPerformed

    private void userBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userBtnActionPerformed
        Factory_ManageUserAccountJPanel mngAccountJpanel = new Factory_ManageUserAccountJPanel(userJpanel, enterprise, ecoSystem);
        userJpanel.add("ManageUserAccountJPanel", mngAccountJpanel);
        CardLayout layout = (CardLayout) userJpanel.getLayout();
        layout.next(userJpanel);
    }//GEN-LAST:event_userBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton employeeBtn;
    private javax.swing.JLabel enterpriseJlabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton orgBtn;
    private javax.swing.JLabel titleJlabel;
    private javax.swing.JButton userBtn;
    private javax.swing.JLabel valueJlabel;
    // End of variables declaration//GEN-END:variables
}
