package userinterface.SupplierRole;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Cargo;
import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.OrderRequest;
import Business.WorkQueue.ProductRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kiksuya
 */
public class AssignWorkerManagerJPanel extends javax.swing.JPanel {

    private JPanel userJpanel;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private Organization org;

    public AssignWorkerManagerJPanel(JPanel userJpanel, UserAccount userAccount, Enterprise enterprise, Organization org) {
        this.userJpanel = userJpanel;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.org = org;
        initComponents();
        valueJlabel.setText(enterprise.getEnterpriseName());
        orgValueJlabel.setText(org.getName());
        populateRequestTable();
 //       populateWorkerTable();
        popWorkerComboBox();
   ///print test
/*
   for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
           System.out.println(request.getName());
            for (Cargo cargo : ((ProductRequest) request).getCargoDirectory().getCargoList()) {
           //    System.out.println(cargo);
               
        }

    //    System.out.println(((ProductRequest) request).getCargoDirectory().getCargoList());
        }
   */
        jpg.setValue(50);
    }

    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJtable.getModel();
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
        
            if (((ProductRequest) request).getCargoDirectory().getCargoList().size() == 0) {
        
                Object[] row = new Object[6];
                row[0] = request;
                row[1] = ((ProductRequest) request).getReceiveEnterprise();
                row[2] = request.getReceiver() == null ? "not assign" : request.getReceiver();
                row[5] = request.getMessage();
                model.addRow(row);
                
                continue;
            }
            
            for (Cargo cargo : ((ProductRequest) request).getCargoDirectory().getCargoList()) {
                Object[] row = new Object[6];
                row[0] = request;
                row[1] = ((ProductRequest) request).getReceiveEnterprise();
                row[2] = request.getReceiver() == null ? "not assign" : request.getReceiver();
                row[3] = cargo.getCargoName();
                row[4] = cargo.getQuantity();
                row[5] = request.getMessage();
                model.addRow(row);
            }
        }
    }
/*
    public void populateWorkerTable() {
        DefaultTableModel model = (DefaultTableModel) workerJtable.getModel();
        model.setRowCount(0);
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization.getOrgType() != OrgType.WorkerOrg) {
                continue;
            }
            for (Employee employee : organization.getEmployeeDirectory().getEmployeeMap().values()) {
                Object[] row = new Object[1];
                row[0] = employee;
                model.addRow(row);
            }
        }
    }
 */
    
/////workerComboBox

    public void popWorkerComboBox() {
        workerCombo.removeAllItems();
 //       Enterprise enterprise = (Enterprise) enterpriseJComboBox.getSelectedItem();
/*
        for (UserAccount deliver : business.getOrganizationDirectory().getOrganizationList().get(2).getUserAccountDirectory().getUserAccountList()) {
            
            organizationJComboBox.addItem(deliver);
        }
*/

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization.getOrgType() != Type.WorkerOrg) {
                continue;
            }
            /*
            for (Employee employee : organization.getEmployeeDirectory().getEmployeeMap().values()) {
                workerCombo.addItem(employee);
            }
            */
            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()){
                workerCombo.addItem(ua);
            }       
        }
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleJlabel = new javax.swing.JLabel();
        enterpriseJlabel = new javax.swing.JLabel();
        valueJlabel = new javax.swing.JLabel();
        orgJlabel = new javax.swing.JLabel();
        orgValueJlabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJtable = new javax.swing.JTable();
        assignBtn = new javax.swing.JButton();
        markBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        workerCombo = new javax.swing.JComboBox<>();
        orgJlabel1 = new javax.swing.JLabel();
        jpg = new javax.swing.JProgressBar();

        setBackground(new java.awt.Color(244, 238, 236));

        titleJlabel.setFont(new java.awt.Font("Futura", 1, 48)); // NOI18N
        titleJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleJlabel.setText("Assign Worker ");
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

        orgJlabel.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        orgJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        orgJlabel.setText("Organization:");
        orgJlabel.setMaximumSize(new java.awt.Dimension(120, 30));
        orgJlabel.setMinimumSize(new java.awt.Dimension(120, 30));
        orgJlabel.setPreferredSize(new java.awt.Dimension(120, 30));

        orgValueJlabel.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        orgValueJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        orgValueJlabel.setText("value");
        orgValueJlabel.setMaximumSize(new java.awt.Dimension(120, 30));
        orgValueJlabel.setMinimumSize(new java.awt.Dimension(120, 30));
        orgValueJlabel.setPreferredSize(new java.awt.Dimension(120, 30));

        workRequestJtable.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        workRequestJtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Product Request", "Cargo Name", "Receiver", "Require Time", "Cargo Quantity", "Message"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        workRequestJtable.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(workRequestJtable);

        assignBtn.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        assignBtn.setText("Assign Worker");
        assignBtn.setMaximumSize(new java.awt.Dimension(90, 30));
        assignBtn.setMinimumSize(new java.awt.Dimension(90, 30));
        assignBtn.setPreferredSize(new java.awt.Dimension(150, 30));
        assignBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignBtnActionPerformed(evt);
            }
        });

        markBtn.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        markBtn.setText("Mark as Finish");
        markBtn.setMaximumSize(new java.awt.Dimension(90, 30));
        markBtn.setMinimumSize(new java.awt.Dimension(90, 30));
        markBtn.setPreferredSize(new java.awt.Dimension(150, 30));
        markBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markBtnActionPerformed(evt);
            }
        });

        workerCombo.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        workerCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        workerCombo.setPreferredSize(new java.awt.Dimension(90, 30));

        orgJlabel1.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        orgJlabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        orgJlabel1.setText("Choose  a worker");
        orgJlabel1.setMaximumSize(new java.awt.Dimension(120, 30));
        orgJlabel1.setMinimumSize(new java.awt.Dimension(120, 30));
        orgJlabel1.setPreferredSize(new java.awt.Dimension(120, 30));

        jpg.setFont(new java.awt.Font("Futura", 0, 13)); // NOI18N
        jpg.setString("50%");
        jpg.setStringPainted(true);

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
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(67, 67, 67)
                                        .addComponent(orgJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(84, 84, 84)
                                        .addComponent(enterpriseJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(146, 146, 146)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(valueJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(orgValueJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(assignBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(markBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(216, 216, 216)
                                    .addComponent(orgJlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jpg, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(titleJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(workerCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(665, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(titleJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(valueJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(orgValueJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enterpriseJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(orgJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(orgJlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(workerCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assignBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(markBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpg, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(257, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignBtnActionPerformed
        int selectedRow = workRequestJtable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please at least select a Work Request row", "GET REQUEST", JOptionPane.ERROR_MESSAGE);
            return;
        }
        ProductRequest request = (ProductRequest) workRequestJtable.getValueAt(selectedRow, 0);
/*
        int selectedWorkerRow = workerJtable.getSelectedRow();
        if (selectedWorkerRow < 0) {
            JOptionPane.showMessageDialog(null, "Please at least select a Worker row", "GET REQUEST", JOptionPane.ERROR_MESSAGE);
            return;
        }
*/
        UserAccount ua = (UserAccount) workerCombo.getSelectedItem();
//        Employee employee = (Employee) workerJtable.getValueAt(selectedWorkerRow, 0);
//        Employee employee = (Employee) workerCombo.getSelectedItem();
        CardLayout layout = (CardLayout) userJpanel.getLayout();
        userJpanel.add("GenerateRequestJpanel", new AssignToWorkerJPanel(userJpanel, /*userAccount,*/ua, enterprise, /*employee,*/ request));
        layout.next(userJpanel);
        jpg.setValue(60);
        jpg.setString("60%");
    }//GEN-LAST:event_assignBtnActionPerformed

    private void markBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markBtnActionPerformed
        int selectedRow = workRequestJtable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please at least select a Work Request row", "GET REQUEST", JOptionPane.ERROR_MESSAGE);
            return;
        }
        ProductRequest productRequest = (ProductRequest) workRequestJtable.getValueAt(selectedRow, 0);
        if (productRequest.getMessage().equals("Processed&Delivered")){
            productRequest.setMessage("COMPLETE");
            JOptionPane.showMessageDialog(null, "Product Completed", "FINISH", JOptionPane.INFORMATION_MESSAGE);            
        }else{
            JOptionPane.showMessageDialog(null, "Please Wait Worker to Process", "IN PROCESS", JOptionPane.ERROR_MESSAGE);            
            
        }
        populateRequestTable();
    }//GEN-LAST:event_markBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignBtn;
    private javax.swing.JLabel enterpriseJlabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JProgressBar jpg;
    private javax.swing.JButton markBtn;
    private javax.swing.JLabel orgJlabel;
    private javax.swing.JLabel orgJlabel1;
    private javax.swing.JLabel orgValueJlabel;
    private javax.swing.JLabel titleJlabel;
    private javax.swing.JLabel valueJlabel;
    private javax.swing.JTable workRequestJtable;
    private javax.swing.JComboBox<Object> workerCombo;
    // End of variables declaration//GEN-END:variables
}
