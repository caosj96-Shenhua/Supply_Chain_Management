package userinterface.SystemAdminWorkArea;

import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;

/**
 *
 * @author Shijun
 */
public class ManageEnterpriseJPanel extends javax.swing.JPanel {

    private JPanel userJpanel;
    private EcoSystem ecoSystem;

    public ManageEnterpriseJPanel(JPanel userJpanel, EcoSystem ecoSystem) {
        this.userJpanel = userJpanel;
        this.ecoSystem = ecoSystem;
        initComponents();
        populateTable();
        populateComboBox();
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();
        model.setRowCount(0);
        for (Network network : ecoSystem.getNetworkDirectory().getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                Object[] row = new Object[3];
                row[0] = enterprise;
                row[1] = network.getName();
                row[2] = enterprise.getEnterpriseType().getValue();
                model.addRow(row);
            }
        }
    }

    private void populateComboBox() {
        networkCombo2.removeAllItems();
        typeCombo2.removeAllItems();
        for (Network network : ecoSystem.getNetworkDirectory().getNetworkList()) {
            networkCombo2.addItem(network);
        }
        for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) {
            typeCombo2.addItem(type);
        }
    }

    private boolean checkValidEnterpriseName(String enterpriseName, Enterprise.EnterpriseType enterpriseType, Network selectedNetwork) {
        for (Network network : this.ecoSystem.getNetworkDirectory().getNetworkList()) {
            if (selectedNetwork != network) {
                continue;
            }
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise.getEnterpriseType() != enterpriseType) {
                    continue;
                }
                if (enterprise.getEnterpriseName().equalsIgnoreCase(enterpriseName)) {
                    return false;
                }
            }
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleJlabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        enterpriseJTable = new javax.swing.JTable();
        networkJlabel = new javax.swing.JLabel();
        enterprisetypeJlabel = new javax.swing.JLabel();
        enterpriseJlabel = new javax.swing.JLabel();
        enterpriseNameJtext = new javax.swing.JTextField();
        submitBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        delteBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        networkCombo2 = new javax.swing.JComboBox<>();
        typeCombo2 = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(244, 238, 236));
        setBorder(javax.swing.BorderFactory.createMatteBorder(13, 13, 13, 13, new java.awt.Color(153, 153, 153)));

        titleJlabel.setBackground(new java.awt.Color(255, 255, 255));
        titleJlabel.setFont(new java.awt.Font("Futura", 1, 48)); // NOI18N
        titleJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleJlabel.setText("Manage Enterprise ");
        titleJlabel.setMaximumSize(new java.awt.Dimension(170, 30));
        titleJlabel.setMinimumSize(new java.awt.Dimension(170, 30));
        titleJlabel.setPreferredSize(new java.awt.Dimension(170, 30));

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
                "Enterprise Name", "Network", "Enterprise Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(enterpriseJTable);

        networkJlabel.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        networkJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        networkJlabel.setText("Network:");
        networkJlabel.setMaximumSize(new java.awt.Dimension(130, 30));
        networkJlabel.setMinimumSize(new java.awt.Dimension(130, 30));
        networkJlabel.setPreferredSize(new java.awt.Dimension(130, 30));

        enterprisetypeJlabel.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        enterprisetypeJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enterprisetypeJlabel.setText("Enterprise Type:");
        enterprisetypeJlabel.setMaximumSize(new java.awt.Dimension(130, 30));
        enterprisetypeJlabel.setMinimumSize(new java.awt.Dimension(130, 30));
        enterprisetypeJlabel.setPreferredSize(new java.awt.Dimension(130, 30));

        enterpriseJlabel.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        enterpriseJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enterpriseJlabel.setText("Enterprise Name:");
        enterpriseJlabel.setMaximumSize(new java.awt.Dimension(130, 30));
        enterpriseJlabel.setMinimumSize(new java.awt.Dimension(130, 30));
        enterpriseJlabel.setPreferredSize(new java.awt.Dimension(130, 30));

        enterpriseNameJtext.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        enterpriseNameJtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        enterpriseNameJtext.setMaximumSize(new java.awt.Dimension(120, 30));
        enterpriseNameJtext.setMinimumSize(new java.awt.Dimension(120, 30));
        enterpriseNameJtext.setPreferredSize(new java.awt.Dimension(120, 30));

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

        delteBtn.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        delteBtn.setText("Delete");
        delteBtn.setMaximumSize(new java.awt.Dimension(90, 30));
        delteBtn.setMinimumSize(new java.awt.Dimension(90, 30));
        delteBtn.setPreferredSize(new java.awt.Dimension(90, 30));
        delteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delteBtnActionPerformed(evt);
            }
        });

        networkCombo2.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        networkCombo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkCombo2.setPreferredSize(new java.awt.Dimension(90, 30));

        typeCombo2.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        typeCombo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        typeCombo2.setPreferredSize(new java.awt.Dimension(90, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(delteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(backBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(titleJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(networkJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(enterprisetypeJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(enterpriseJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(typeCombo2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(enterpriseNameJtext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(networkCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(191, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(networkJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(networkCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterprisetypeJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterpriseNameJtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(188, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        Network network = (Network) networkCombo2.getSelectedItem();
        Enterprise.EnterpriseType enterpriseType = (Enterprise.EnterpriseType) typeCombo2.getSelectedItem();
        if (network == null || enterpriseType == null) {
            JOptionPane.showMessageDialog(null, "Please input the Enterprise Type", "ENTERPRISE", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String name = enterpriseNameJtext.getText();
        if (name == null || name.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please input the Enterprise Name", "ENTERPRISE", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!checkValidEnterpriseName(name, enterpriseType, network)) {
            JOptionPane.showMessageDialog(null, "This name \"" + name + "\" has been used, please use another name", "ENTERPRISE", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Enterprise enterprise = network.getEnterpriseDirectory().createAndAddEnterprise(name, enterpriseType);
        populateTable();
        JOptionPane.showMessageDialog(null, "Submit OK!", "ENTERPRISE", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_submitBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userJpanel.remove(this);
        Component[] componentArray = userJpanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userJpanel.getLayout();
        layout.previous(userJpanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void delteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delteBtnActionPerformed
   /*     int selectedRow = enterpriseJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please at least select a row", "NETWORK", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Enterprise enterprise = (Enterprise) enterpriseJTable.getValueAt(selectedRow, 0);
        for (Network network : ecoSystem.getNetworkDirectory().getNetworkList()) {
            network.getEnterpriseDirectory().deleteEnterprise(enterprise);
        }
        populateTable();
        JOptionPane.showMessageDialog(null, "Delete Enterprise OK!", "SUMBIT", JOptionPane.INFORMATION_MESSAGE);
*/
    }//GEN-LAST:event_delteBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton delteBtn;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JLabel enterpriseJlabel;
    private javax.swing.JTextField enterpriseNameJtext;
    private javax.swing.JLabel enterprisetypeJlabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<Object> networkCombo2;
    private javax.swing.JLabel networkJlabel;
    private javax.swing.JButton submitBtn;
    private javax.swing.JLabel titleJlabel;
    private javax.swing.JComboBox<Object> typeCombo2;
    // End of variables declaration//GEN-END:variables
}
