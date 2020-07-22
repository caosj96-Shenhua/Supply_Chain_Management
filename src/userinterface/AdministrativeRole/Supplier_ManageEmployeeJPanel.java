package userinterface.AdministrativeRole;


import Business.Employee.Employee;
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
public class Supplier_ManageEmployeeJPanel extends javax.swing.JPanel {

    private JPanel userJpanel;
    private Enterprise enterprise;

    public Supplier_ManageEmployeeJPanel(JPanel userJpanel, Enterprise enterprise) {
        this.userJpanel = userJpanel;
        this.enterprise = enterprise;
        initComponents();
        populateTable();
        populateCombo();
    }

    public void populateCombo() {
        orgCombo.removeAllItems();
        for (Type type : enterprise.getSupportedOrganization()) {
            orgCombo.addItem(type);
        }
        employeeCombo.removeAllItems();
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization.getOrgType() == Type.SupplierAdminOrg) {
                continue;
            }
            employeeCombo.addItem(organization);
        }
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) employeeJtable.getModel();
        model.setRowCount(0);
        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (Employee employee : org.getEmployeeDirectory().getEmployeeList()) {
                Object[] row = new Object[3];
                row[0] = employee;
                row[1] = employee.getOrgType();
                row[2] = employee.getName();
                model.addRow(row);
            }
        }
    }
    
    private boolean checkValidEmployeeName(String name) {
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (Employee employee : organization.getEmployeeDirectory().getEmployeeList())
            if (employee.getName().equalsIgnoreCase(name)) {
                return false;
            }
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        titleJlabel = new javax.swing.JLabel();
        nameJlabel = new javax.swing.JLabel();
        nameJtext = new javax.swing.JTextField();
        employeeJlabel = new javax.swing.JLabel();
        employeeCombo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        employeeJtable = new javax.swing.JTable();
        orgJlabel = new javax.swing.JLabel();
        orgCombo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(244, 238, 236));

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
        titleJlabel.setText("Manage Employee");
        titleJlabel.setMaximumSize(new java.awt.Dimension(270, 30));
        titleJlabel.setMinimumSize(new java.awt.Dimension(270, 30));
        titleJlabel.setPreferredSize(new java.awt.Dimension(270, 30));

        nameJlabel.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        nameJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameJlabel.setText("Employee Name:");
        nameJlabel.setMaximumSize(new java.awt.Dimension(130, 30));
        nameJlabel.setMinimumSize(new java.awt.Dimension(130, 30));
        nameJlabel.setPreferredSize(new java.awt.Dimension(130, 30));

        nameJtext.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        nameJtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nameJtext.setMaximumSize(new java.awt.Dimension(120, 30));
        nameJtext.setMinimumSize(new java.awt.Dimension(120, 30));
        nameJtext.setPreferredSize(new java.awt.Dimension(120, 30));

        employeeJlabel.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        employeeJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        employeeJlabel.setText("Employee Type:");
        employeeJlabel.setMaximumSize(new java.awt.Dimension(130, 30));
        employeeJlabel.setMinimumSize(new java.awt.Dimension(130, 30));
        employeeJlabel.setPreferredSize(new java.awt.Dimension(130, 30));

        employeeCombo.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        employeeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        employeeCombo.setPreferredSize(new java.awt.Dimension(90, 30));

        employeeJtable.setFont(new java.awt.Font("Futura", 0, 12)); // NOI18N
        employeeJtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Employee ID", "Organization", "Employee Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(employeeJtable);

        orgJlabel.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        orgJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        orgJlabel.setText("Organization:");
        orgJlabel.setMaximumSize(new java.awt.Dimension(130, 30));
        orgJlabel.setMinimumSize(new java.awt.Dimension(130, 30));
        orgJlabel.setPreferredSize(new java.awt.Dimension(130, 30));

        orgCombo.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        orgCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        orgCombo.setPreferredSize(new java.awt.Dimension(90, 30));
        orgCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgComboActionPerformed(evt);
            }
        });

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
                        .addGap(173, 173, 173)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameJlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(employeeJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(employeeCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nameJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addComponent(orgJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(orgCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(titleJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(315, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addComponent(titleJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orgCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orgJlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(employeeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameJtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(createBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                        .addGap(6, 6, 6)))
                .addGap(60, 60, 60))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        Organization organization = (Organization) employeeCombo.getSelectedItem();
        String name = nameJtext.getText();
        
        if (name == null || name.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please input the Employee Name", "Employee", JOptionPane.ERROR_MESSAGE);
            return;
        }        
        
        if (!checkValidEmployeeName(name)) {
            JOptionPane.showMessageDialog(null, "This name \"" + name + "\" has been used, please use another name", "Employee", JOptionPane.ERROR_MESSAGE);
             return;
        }
        
        organization.getEmployeeDirectory().createEmployee(name, organization.getOrgType());
        populateTable();
        nameJtext.setText("");
        JOptionPane.showMessageDialog(null, "Create OK!", "SUMBIT", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_createBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userJpanel.remove(this);
        CardLayout layout = (CardLayout) userJpanel.getLayout();
        layout.previous(userJpanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void orgComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgComboActionPerformed
        Type orgType = (Type) orgCombo.getSelectedItem();
        if (orgType != null) {
            DefaultTableModel model = (DefaultTableModel) employeeJtable.getModel();
            model.setRowCount(0);
            for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
                if (org.getOrgType() != orgType) {
                    continue;
                }
                for (Employee employee : org.getEmployeeDirectory().getEmployeeList()) {
                    Object[] row = new Object[3];
                    row[0] = employee.getId();
                    row[1] = employee.getOrgType();
                    
                    row[2] = employee.getName();
                    model.addRow(row);
                }
            }
        }
    }//GEN-LAST:event_orgComboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton createBtn;
    private javax.swing.JComboBox<Object> employeeCombo;
    private javax.swing.JLabel employeeJlabel;
    private javax.swing.JTable employeeJtable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameJlabel;
    private javax.swing.JTextField nameJtext;
    private javax.swing.JComboBox<Object> orgCombo;
    private javax.swing.JLabel orgJlabel;
    private javax.swing.JLabel titleJlabel;
    // End of variables declaration//GEN-END:variables
}
