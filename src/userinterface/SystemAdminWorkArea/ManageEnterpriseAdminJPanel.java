package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import Business.Role.FactoryAdminRole;
import Business.Role.Role;
import Business.Role.SupplierAdminRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zhanghaojie
 */
public class ManageEnterpriseAdminJPanel extends javax.swing.JPanel {

    private JPanel userJpanel;
    private EcoSystem ecoSystem;

    public ManageEnterpriseAdminJPanel(JPanel userJpanel, EcoSystem ecoSystem) {
        this.userJpanel = userJpanel;
        this.ecoSystem = ecoSystem;
        initComponents();
        populateTable();
        populateNetworkCombo();
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();
        model.setRowCount(0);
        for (Network network : ecoSystem.getNetworkDirectory().getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    Object[] row = new Object[3];
                    row[0] = userAccount;
                    row[1] = network.getName();
                    row[2] = enterprise.getEnterpriseName();
                    model.addRow(row);
                }
            }
        }
    }

    private void populateNetworkCombo() {
        networkCombo.removeAllItems();
        for (Network network : ecoSystem.getNetworkDirectory().getNetworkList()) {
            networkCombo.addItem(network);
        }
    }

    private void populateEnterpriseCombo(Network network) {
        typeCombo.removeAllItems();
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            typeCombo.addItem(enterprise);
        }
    }

    private boolean checkValid(String userName, String psd, String employeeName) {
        if (userName == null || userName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please input the User Name", "ADMIN", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (psd == null || psd.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please input the Password", "ADMIN", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!checkValidPsd(psd)) {
            JOptionPane.showMessageDialog(null, "Please input Valid Password which "
                    + "contains numbers, English, two or more characters, length 6-20 ", "ADMIN", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (employeeName == null || employeeName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please input the Employee Name", "ADMIN", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    private boolean checkValidPsd(String str) {
        String reg = "^(?![0-9]+$)(?![a-z]+$)(?![A-Z]+$)(?!([^(0-9a-zA-Z)])+$).{6,20}$"; //密码包含 数字,英文,字符中的两种以上，长度6-20
        return str.matches(reg);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleJlabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        enterpriseJTable = new javax.swing.JTable();
        networkJlabel = new javax.swing.JLabel();
        networkCombo = new javax.swing.JComboBox<>();
        enterprisetypeJlabel = new javax.swing.JLabel();
        typeCombo = new javax.swing.JComboBox<>();
        userNameJlabel = new javax.swing.JLabel();
        userNameJtext = new javax.swing.JTextField();
        psdJlabel = new javax.swing.JLabel();
        psdField = new javax.swing.JPasswordField();
        employeeJlabel = new javax.swing.JLabel();
        employeeNameJtext = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        submitBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        deleteBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(244, 238, 236));
        setBorder(javax.swing.BorderFactory.createMatteBorder(13, 13, 13, 13, new java.awt.Color(153, 153, 153)));

        titleJlabel.setFont(new java.awt.Font("Futura", 1, 48)); // NOI18N
        titleJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleJlabel.setText("Manage Enterprise Admin ");
        titleJlabel.setMaximumSize(new java.awt.Dimension(270, 30));
        titleJlabel.setMinimumSize(new java.awt.Dimension(270, 30));
        titleJlabel.setPreferredSize(new java.awt.Dimension(270, 30));

        enterpriseJTable.setFont(new java.awt.Font("Futura", 0, 12)); // NOI18N
        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "User Name", "Network", "Enterprise name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        enterpriseJTable.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(enterpriseJTable);

        networkJlabel.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        networkJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        networkJlabel.setText("Network:");
        networkJlabel.setMaximumSize(new java.awt.Dimension(130, 30));
        networkJlabel.setMinimumSize(new java.awt.Dimension(130, 30));
        networkJlabel.setPreferredSize(new java.awt.Dimension(130, 30));

        networkCombo.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        networkCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkCombo.setPreferredSize(new java.awt.Dimension(150, 30));
        networkCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkComboActionPerformed(evt);
            }
        });

        enterprisetypeJlabel.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        enterprisetypeJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enterprisetypeJlabel.setText("Enterprise Type:");
        enterprisetypeJlabel.setMaximumSize(new java.awt.Dimension(130, 30));
        enterprisetypeJlabel.setMinimumSize(new java.awt.Dimension(130, 30));
        enterprisetypeJlabel.setPreferredSize(new java.awt.Dimension(130, 30));

        typeCombo.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        typeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        typeCombo.setPreferredSize(new java.awt.Dimension(150, 30));

        userNameJlabel.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        userNameJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userNameJlabel.setText("User Name:");
        userNameJlabel.setMaximumSize(new java.awt.Dimension(130, 30));
        userNameJlabel.setMinimumSize(new java.awt.Dimension(130, 30));
        userNameJlabel.setPreferredSize(new java.awt.Dimension(130, 30));

        userNameJtext.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        userNameJtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userNameJtext.setMaximumSize(new java.awt.Dimension(120, 30));
        userNameJtext.setMinimumSize(new java.awt.Dimension(120, 30));
        userNameJtext.setPreferredSize(new java.awt.Dimension(120, 30));

        psdJlabel.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        psdJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        psdJlabel.setText("Password:");
        psdJlabel.setMaximumSize(new java.awt.Dimension(130, 30));
        psdJlabel.setMinimumSize(new java.awt.Dimension(130, 30));
        psdJlabel.setPreferredSize(new java.awt.Dimension(130, 30));

        psdField.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        psdField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        psdField.setPreferredSize(new java.awt.Dimension(120, 30));

        employeeJlabel.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        employeeJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        employeeJlabel.setText("Employee Name:");
        employeeJlabel.setMaximumSize(new java.awt.Dimension(130, 30));
        employeeJlabel.setMinimumSize(new java.awt.Dimension(130, 30));
        employeeJlabel.setPreferredSize(new java.awt.Dimension(130, 30));

        employeeNameJtext.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        employeeNameJtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        employeeNameJtext.setMaximumSize(new java.awt.Dimension(120, 30));
        employeeNameJtext.setMinimumSize(new java.awt.Dimension(120, 30));
        employeeNameJtext.setPreferredSize(new java.awt.Dimension(120, 30));

        backBtn.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        backBtn.setText("< Back");
        backBtn.setMaximumSize(new java.awt.Dimension(120, 30));
        backBtn.setMinimumSize(new java.awt.Dimension(120, 30));
        backBtn.setPreferredSize(new java.awt.Dimension(120, 30));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        submitBtn.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        submitBtn.setText("Submit");
        submitBtn.setMaximumSize(new java.awt.Dimension(90, 30));
        submitBtn.setMinimumSize(new java.awt.Dimension(90, 30));
        submitBtn.setPreferredSize(new java.awt.Dimension(90, 30));
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        deleteBtn.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.setMaximumSize(new java.awt.Dimension(90, 30));
        deleteBtn.setMinimumSize(new java.awt.Dimension(90, 30));
        deleteBtn.setPreferredSize(new java.awt.Dimension(90, 30));
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
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
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(313, 313, 313)
                                                .addComponent(typeCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(104, 104, 104)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGap(13, 13, 13)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                    .addComponent(userNameJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(enterprisetypeJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(psdJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                            .addComponent(employeeJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(employeeNameJtext, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                                            .addComponent(psdField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(userNameJtext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(178, 178, 178)
                                                        .addComponent(networkJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(networkCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
                            .addComponent(titleJlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(11, 11, 11)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(networkJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(networkCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterprisetypeJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(employeeNameJtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(psdJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(psdField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameJtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(156, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void networkComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkComboActionPerformed
        Network network = (Network) networkCombo.getSelectedItem();
        if (network != null) {
            populateEnterpriseCombo(network);
        }
    }//GEN-LAST:event_networkComboActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userJpanel.remove(this);
        Component[] componentArray = userJpanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userJpanel.getLayout();
        layout.previous(userJpanel);
    }//GEN-LAST:event_backBtnActionPerformed


    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        Enterprise enterprise = (Enterprise) typeCombo.getSelectedItem();
        String username = userNameJtext.getText();
        String psd = String.valueOf(psdField.getPassword());
        String employeeName = employeeNameJtext.getText();
        if (!checkValid(username, psd, employeeName)) {
            return;
        }

        if (!ecoSystem.checkIfUserIsUnique(username)) {
            JOptionPane.showMessageDialog(null, "This name \"" + username + "\" has been used, please use another name", "ADMIN", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Factory) {
            Employee employee = enterprise.getEmployeeDirectory().createEmployee(employeeName, Type.FactoryAdminOrg);
            Organization org = enterprise.getOrganizationDirectory().createOrganization(Type.FactoryAdminOrg);
            UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(
                    username, psd, employee, new FactoryAdminRole(Role.RoleType.FactoryAdmin.getValue()), org);
        }
        if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Supplier) {
            Employee employee = enterprise.getEmployeeDirectory().createEmployee(employeeName, Type.SupplierAdminOrg);
            Organization org = enterprise.getOrganizationDirectory().createOrganization(Type.SupplierAdminOrg /*, enterprise.getEnterpriseID()*/);
            UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(
                    username, psd, employee, new SupplierAdminRole(Role.RoleType.SupplierAdmin.getValue()/*, org.getOrganizationID(), enterprise.getEnterpriseID()*/), org);
        }
        populateTable();
        JOptionPane.showMessageDialog(null, "Submit OK!", "SUMBIT", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_submitBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int selectedRow = enterpriseJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please at least select a row", "NETWORK", JOptionPane.ERROR_MESSAGE);
            return;
        }

        UserAccount account = (UserAccount) enterpriseJTable.getValueAt(selectedRow, 0);
        for (Network network : ecoSystem.getNetworkDirectory().getNetworkList()){
            for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                enterprise.getUserAccountDirectory().deleteUserAccount(account);
            }
        }
        ecoSystem.getUserAccountDirectory().getUserAccountList().remove(account);
        populateTable();
        JOptionPane.showMessageDialog(null, "Delete UserAccount OK!", "SUMBIT", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_deleteBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel employeeJlabel;
    private javax.swing.JTextField employeeNameJtext;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JLabel enterprisetypeJlabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<Object> networkCombo;
    private javax.swing.JLabel networkJlabel;
    private javax.swing.JPasswordField psdField;
    private javax.swing.JLabel psdJlabel;
    private javax.swing.JButton submitBtn;
    private javax.swing.JLabel titleJlabel;
    private javax.swing.JComboBox<Object> typeCombo;
    private javax.swing.JLabel userNameJlabel;
    private javax.swing.JTextField userNameJtext;
    // End of variables declaration//GEN-END:variables
}
