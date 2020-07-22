package userinterface.FactoryRole;

import Business.Enterprise.Cargo;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import Business.Role.StoreManagerRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.OrderRequest;
import Business.WorkQueue.WorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zhanghaojie
 */
public class OrderManagerJPanel extends javax.swing.JPanel {

    private JPanel userJpanel;
    private Enterprise enterprise;
    private Organization org;
    private UserAccount userAccount;

    public OrderManagerJPanel(JPanel userJpanel, Enterprise enterprise, Organization org, UserAccount userAccount) {
        this.userJpanel = userJpanel;
        this.enterprise = enterprise;
        this.org = org;
        this.userAccount = userAccount;
        initComponents();
        valueJlabel.setText(enterprise.getEnterpriseName());
        orgValueJlabel.setText(org.getName());
        populateRequestTable();
        popStoreComboBox();    
    }

    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJtable.getModel();
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[6];
            row[0] = request.getName();
            row[1] = request.getRequestDate();
            row[2] = request.getSender();
            row[3] = request.getReceiver() == null ? "not assign" : request.getReceiver();
            row[4] = request.getMessage();// + "(" + ((OrderRequest) request).getResult() + ")";
            String result = ((OrderRequest) request).getResult();
            row[5] = result == null ? "Waiting" : result;
            model.addRow(row);
        }
    }

    public void popStoreComboBox(){
        storeCombo.removeAllItems();
        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (org.getOrgType() != Type.StoreOrg){
                continue;
                
            }
            for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()){
                storeCombo.addItem(ua);
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
        sendBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        storeCombo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        orgJlabel1 = new javax.swing.JLabel();
        sendBtn1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(244, 236, 236));

        titleJlabel.setFont(new java.awt.Font("Futura", 1, 48)); // NOI18N
        titleJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleJlabel.setText("Order Manager ");
        titleJlabel.setMaximumSize(new java.awt.Dimension(170, 30));
        titleJlabel.setMinimumSize(new java.awt.Dimension(170, 30));
        titleJlabel.setPreferredSize(new java.awt.Dimension(170, 30));

        enterpriseJlabel.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        enterpriseJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enterpriseJlabel.setText("Enterprise:");
        enterpriseJlabel.setMaximumSize(new java.awt.Dimension(120, 30));
        enterpriseJlabel.setMinimumSize(new java.awt.Dimension(120, 30));
        enterpriseJlabel.setPreferredSize(new java.awt.Dimension(120, 30));

        valueJlabel.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        valueJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        valueJlabel.setText("value");
        valueJlabel.setMaximumSize(new java.awt.Dimension(120, 30));
        valueJlabel.setMinimumSize(new java.awt.Dimension(120, 30));
        valueJlabel.setPreferredSize(new java.awt.Dimension(120, 30));

        orgJlabel.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        orgJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        orgJlabel.setText("Organization:");
        orgJlabel.setMaximumSize(new java.awt.Dimension(120, 30));
        orgJlabel.setMinimumSize(new java.awt.Dimension(120, 30));
        orgJlabel.setPreferredSize(new java.awt.Dimension(120, 30));

        orgValueJlabel.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        orgValueJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        orgValueJlabel.setText("value");
        orgValueJlabel.setMaximumSize(new java.awt.Dimension(120, 30));
        orgValueJlabel.setMinimumSize(new java.awt.Dimension(120, 30));
        orgValueJlabel.setPreferredSize(new java.awt.Dimension(120, 30));

        workRequestJtable.setFont(new java.awt.Font("Futura", 0, 12)); // NOI18N
        workRequestJtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Order", "Start Time", "Order Creator", "StoreOrg Reciver", "Message", "Result"
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

        sendBtn.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        sendBtn.setText("Go to Store");
        sendBtn.setMaximumSize(new java.awt.Dimension(90, 30));
        sendBtn.setMinimumSize(new java.awt.Dimension(90, 30));
        sendBtn.setPreferredSize(new java.awt.Dimension(150, 30));
        sendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendBtnActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/_1460153399825-dunk_gif.gif"))); // NOI18N

        storeCombo.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        storeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        storeCombo.setPreferredSize(new java.awt.Dimension(150, 30));

        jLabel4.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        jLabel4.setText("Please Choose a Store to Place an Order");

        orgJlabel1.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        orgJlabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        orgJlabel1.setText("Order Placed:");
        orgJlabel1.setMaximumSize(new java.awt.Dimension(120, 30));
        orgJlabel1.setMinimumSize(new java.awt.Dimension(120, 30));
        orgJlabel1.setPreferredSize(new java.awt.Dimension(120, 30));

        sendBtn1.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        sendBtn1.setText("Write a Review");
        sendBtn1.setMaximumSize(new java.awt.Dimension(90, 30));
        sendBtn1.setMinimumSize(new java.awt.Dimension(90, 30));
        sendBtn1.setPreferredSize(new java.awt.Dimension(150, 30));
        sendBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendBtn1ActionPerformed(evt);
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
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(sendBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(orgJlabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                                        .addComponent(enterpriseJlabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(orgJlabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addGap(80, 80, 80)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(orgValueJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(valueJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addComponent(titleJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(6, 6, 6)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(storeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel4))))
                                            .addGap(43, 43, 43)))
                                    .addComponent(jLabel3)
                                    .addGap(31, 31, 31)))
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(sendBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(534, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(titleJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(enterpriseJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valueJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(orgJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(orgValueJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(storeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sendBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(orgJlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sendBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel2)
                .addGap(233, 233, 233))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendBtnActionPerformed
        UserAccount ua = (UserAccount) storeCombo.getSelectedItem();
        
        CardLayout layout = (CardLayout) userJpanel.getLayout();
        userJpanel.add("OrderRequestJpanel", new PlaceOrderJpanel(userJpanel, /*ua*/userAccount,ua, enterprise));
        layout.next(userJpanel);
    }//GEN-LAST:event_sendBtnActionPerformed

    private void sendBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendBtn1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJtable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please at least select a product", "GET REQUEST", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!workRequestJtable.getValueAt(selectedRow, 4).equals("Send to Assign Worker")){
            JOptionPane.showMessageDialog(null, "Please wait until worker Assigned", "IN PROCESS", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        UserAccount ua = (UserAccount) storeCombo.getSelectedItem();
        for (Cargo cargo : (((StoreManagerRole)ua.getRole()).getStoreCargoDirectory().getCargoList())) {
            
            if(cargo.getCargoName().equals(workRequestJtable.getValueAt(selectedRow, 0).toString())){
                cargo.setRateble(true);
            }
        }
        CardLayout layout = (CardLayout) userJpanel.getLayout();
        userJpanel.add("OrderRequestJpanel", new OrderReviewJPanel(userJpanel, /*ua*/userAccount,ua, enterprise));
        layout.next(userJpanel);        
    }//GEN-LAST:event_sendBtn1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseJlabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel orgJlabel;
    private javax.swing.JLabel orgJlabel1;
    private javax.swing.JLabel orgValueJlabel;
    private javax.swing.JButton sendBtn;
    private javax.swing.JButton sendBtn1;
    private javax.swing.JComboBox<Object> storeCombo;
    private javax.swing.JLabel titleJlabel;
    private javax.swing.JLabel valueJlabel;
    private javax.swing.JTable workRequestJtable;
    // End of variables declaration//GEN-END:variables
}
