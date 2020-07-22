package userinterface.AdministrativeRole;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zhanghaojie
 */
public class Supplier_ManageOrganizationJPanel extends javax.swing.JPanel {

    private JPanel userJpanel;
    private Enterprise enterprise;

    public Supplier_ManageOrganizationJPanel(JPanel userJpanel, Enterprise enterprise) {
        this.userJpanel = userJpanel;
        this.enterprise = enterprise;
        initComponents();
        
        populateCombo();
        populateTable();
    }

    private void populateCombo() {
        orgCombo.removeAllItems();
        for (Type type : enterprise.getSupportedOrganization()) {
            if (!type.getValue().equals(Type.SupplierAdminOrg.getValue())) {
                orgCombo.addItem(type);
            }
        }
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) orgJtable.getModel();
        model.setRowCount(0);
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            Object[] row = new Object[3];
            row[0] = organization.getOrgType();
            row[1] = organization.getName();
            model.addRow(row);
        }
    }
    
  private boolean checkValidOrgName(String name) {
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization.getName().equalsIgnoreCase(name)) {
                return false;
            }
        }
        return true;
    }      

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        orgJlabel = new javax.swing.JLabel();
        orgCombo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        orgJtable = new javax.swing.JTable();
        createBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        titleJlabel = new javax.swing.JLabel();
        enterpriseJlabel = new javax.swing.JLabel();
        descriptionJtext = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(244, 238, 236));

        orgJlabel.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        orgJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        orgJlabel.setText("Organization:");
        orgJlabel.setMaximumSize(new java.awt.Dimension(130, 30));
        orgJlabel.setMinimumSize(new java.awt.Dimension(130, 30));
        orgJlabel.setPreferredSize(new java.awt.Dimension(130, 30));

        orgCombo.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        orgCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        orgCombo.setPreferredSize(new java.awt.Dimension(90, 30));

        orgJtable.setFont(new java.awt.Font("Futura", 0, 12)); // NOI18N
        orgJtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Org Type", "Org Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(orgJtable);

        createBtn.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        createBtn.setText("Create");
        createBtn.setMaximumSize(new java.awt.Dimension(90, 30));
        createBtn.setMinimumSize(new java.awt.Dimension(90, 30));
        createBtn.setPreferredSize(new java.awt.Dimension(90, 30));
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        backBtn.setText("< Back");
        backBtn.setMaximumSize(new java.awt.Dimension(120, 30));
        backBtn.setMinimumSize(new java.awt.Dimension(120, 30));
        backBtn.setPreferredSize(new java.awt.Dimension(120, 30));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        titleJlabel.setFont(new java.awt.Font("Futura", 1, 36)); // NOI18N
        titleJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleJlabel.setText("Manage Organization");
        titleJlabel.setMaximumSize(new java.awt.Dimension(270, 30));
        titleJlabel.setMinimumSize(new java.awt.Dimension(270, 30));
        titleJlabel.setPreferredSize(new java.awt.Dimension(270, 30));

        enterpriseJlabel.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        enterpriseJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enterpriseJlabel.setText("Organization Name:");
        enterpriseJlabel.setMaximumSize(new java.awt.Dimension(130, 30));
        enterpriseJlabel.setMinimumSize(new java.awt.Dimension(130, 30));
        enterpriseJlabel.setPreferredSize(new java.awt.Dimension(130, 30));

        descriptionJtext.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        descriptionJtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        descriptionJtext.setMaximumSize(new java.awt.Dimension(120, 30));
        descriptionJtext.setMinimumSize(new java.awt.Dimension(120, 30));
        descriptionJtext.setPreferredSize(new java.awt.Dimension(120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(titleJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(orgJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(enterpriseJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(orgCombo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(163, 163, 163)
                                            .addComponent(descriptionJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(515, 515, 515)
                                .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(506, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addComponent(titleJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(orgJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(orgCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(enterpriseJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(descriptionJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(271, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        String description = descriptionJtext.getText();
        
       if (description == null || description.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please Enter Organization Name", "Organization", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (!checkValidOrgName(description)) {
            JOptionPane.showMessageDialog(null, "This name \"" + description + "\" has been used, please use another name", "Organization", JOptionPane.ERROR_MESSAGE);
             return;
        }
        
        Type type = (Type) orgCombo.getSelectedItem();
        Organization org = enterprise.getOrganizationDirectory().createOrganization(type);
        org.setName(description);
        populateTable();
        descriptionJtext.setText("");
        JOptionPane.showMessageDialog(null, "Create Organization OK!", "SUMBIT", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_createBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userJpanel.remove(this);
        CardLayout layout = (CardLayout) userJpanel.getLayout();
        layout.previous(userJpanel);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton createBtn;
    private javax.swing.JTextField descriptionJtext;
    private javax.swing.JLabel enterpriseJlabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<Object> orgCombo;
    private javax.swing.JLabel orgJlabel;
    private javax.swing.JTable orgJtable;
    private javax.swing.JLabel titleJlabel;
    // End of variables declaration//GEN-END:variables
}
