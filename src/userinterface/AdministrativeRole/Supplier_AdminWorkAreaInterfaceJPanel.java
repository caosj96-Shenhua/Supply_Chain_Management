package userinterface.AdministrativeRole;


import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author zhanghaojie
 */
public class Supplier_AdminWorkAreaInterfaceJPanel extends javax.swing.JPanel {

    private JPanel userJpanel;
    private Enterprise enterprise;
    private EcoSystem ecoSystem;

    public Supplier_AdminWorkAreaInterfaceJPanel(JPanel userContainer, Enterprise enterprise, EcoSystem ecoSystem) {
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
        titleJlabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(244, 238, 236));
        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setForeground(new java.awt.Color(255, 255, 255));

        titleJlabel.setFont(new java.awt.Font("Futura", 1, 48)); // NOI18N
        titleJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleJlabel.setText("Admin");
        titleJlabel.setMaximumSize(new java.awt.Dimension(170, 30));
        titleJlabel.setMinimumSize(new java.awt.Dimension(170, 30));
        titleJlabel.setPreferredSize(new java.awt.Dimension(170, 30));

        enterpriseJlabel.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        enterpriseJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enterpriseJlabel.setText("Enterprise:");
        enterpriseJlabel.setMaximumSize(new java.awt.Dimension(120, 30));
        enterpriseJlabel.setMinimumSize(new java.awt.Dimension(120, 30));
        enterpriseJlabel.setPreferredSize(new java.awt.Dimension(120, 30));

        valueJlabel.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        valueJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        valueJlabel.setText("value");
        valueJlabel.setMaximumSize(new java.awt.Dimension(120, 30));
        valueJlabel.setMinimumSize(new java.awt.Dimension(120, 30));
        valueJlabel.setPreferredSize(new java.awt.Dimension(120, 30));

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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/nba-basketball-shoes-clipart-9.gif"))); // NOI18N

        titleJlabel1.setFont(new java.awt.Font("Futura", 1, 48)); // NOI18N
        titleJlabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleJlabel1.setText("Supplier");
        titleJlabel1.setMaximumSize(new java.awt.Dimension(170, 30));
        titleJlabel1.setMinimumSize(new java.awt.Dimension(170, 30));
        titleJlabel1.setPreferredSize(new java.awt.Dimension(170, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(titleJlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addComponent(titleJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(enterpriseJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(valueJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(employeeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(orgBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(536, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(titleJlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titleJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(enterpriseJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(valueJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))))
                .addGap(18, 18, 18)
                .addComponent(orgBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(employeeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(userBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(281, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void orgBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgBtnActionPerformed
        Supplier_ManageOrganizationJPanel mngOrgJpanel = new Supplier_ManageOrganizationJPanel(userJpanel, enterprise);
        userJpanel.add("mngOrganizationJPanel", mngOrgJpanel);
        CardLayout layout = (CardLayout) userJpanel.getLayout();
        layout.next(userJpanel);
    }//GEN-LAST:event_orgBtnActionPerformed

    private void employeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeBtnActionPerformed
        Supplier_ManageEmployeeJPanel mngEmpJpanel = new Supplier_ManageEmployeeJPanel(userJpanel, enterprise);
        userJpanel.add("manageEmployeeJPanel", mngEmpJpanel);
        CardLayout layout = (CardLayout) userJpanel.getLayout();
        layout.next(userJpanel);
    }//GEN-LAST:event_employeeBtnActionPerformed

    private void userBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userBtnActionPerformed
        Supplier_ManageUserAccountJPanel mngAccountJpanel = new Supplier_ManageUserAccountJPanel(userJpanel, enterprise, ecoSystem);
        userJpanel.add("ManageUserAccountJPanel", mngAccountJpanel);
        CardLayout layout = (CardLayout) userJpanel.getLayout();
        layout.next(userJpanel);
    }//GEN-LAST:event_userBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton employeeBtn;
    private javax.swing.JLabel enterpriseJlabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton orgBtn;
    private javax.swing.JLabel titleJlabel;
    private javax.swing.JLabel titleJlabel1;
    private javax.swing.JButton userBtn;
    private javax.swing.JLabel valueJlabel;
    // End of variables declaration//GEN-END:variables
}
