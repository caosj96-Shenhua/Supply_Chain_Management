package userinterface.FactoryRole;

import Business.Enterprise.Cargo;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ProductRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.OrderRequest;

import Business.WorkQueue.ProductRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zhanghaojie
 */
public class FactoryRequestReceiveJPanel extends javax.swing.JPanel {

   
    private JPanel userJpanel;
    private UserAccount userAccount;
    private WorkRequest workrequest;
    public FactoryRequestReceiveJPanel(JPanel userJpanel, UserAccount userAccount) {
      
         this.userJpanel = userJpanel;
        this.userAccount = userAccount;
        
        initComponents();
        populateRequestTable();
        jpg.setValue(85);
    }

    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJtable.getModel();
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
           
            System.out.println(userAccount.getUsername());
           if(request.getMessage().equals("Sent to Factory") || request.getMessage().equals("Factory Received") ){ 
            
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
                Object[] row = new Object[5];
                row[0] = request;
                row[1] = ((ProductRequest) request).getReceiveEnterprise();
                row[2] = request.getReceiver() == null ? "not assign" : request.getReceiver();
                row[3] = cargo.getCargoName();           
                row[4] = request.getMessage();
                model.addRow(row);
            }
           }
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleJlabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJtable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jpg = new javax.swing.JProgressBar();

        setBackground(new java.awt.Color(244, 238, 236));

        titleJlabel.setFont(new java.awt.Font("Futura", 1, 48)); // NOI18N
        titleJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleJlabel.setText("Logistics To Factory");
        titleJlabel.setMaximumSize(new java.awt.Dimension(170, 30));
        titleJlabel.setMinimumSize(new java.awt.Dimension(170, 30));
        titleJlabel.setPreferredSize(new java.awt.Dimension(170, 30));

        workRequestJtable.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        workRequestJtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Product Request", "Sender Enterprise", "Assigned Worker", "Product Name", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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

        jButton1.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        jButton1.setText("Process");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/nwvl-gif.gif"))); // NOI18N

        jpg.setFont(new java.awt.Font("Futura", 0, 13)); // NOI18N
        jpg.setString("85%");
        jpg.setStringPainted(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(titleJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jpg, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpg, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(155, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJtable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please at least select a Work Request row", "GET REQUEST", JOptionPane.ERROR_MESSAGE);
            return;
        }
        ProductRequest request = (ProductRequest) workRequestJtable.getValueAt(selectedRow, 0);
        request.setMessage("Factory Received");
      /*  
        WorkRequest orderRequest = (OrderRequest)workRequestJtable.getValueAt(selectedRow, 0);
        orderRequest.setMessage("COMPLETE");
        */
        
        populateRequestTable();
        jpg.setValue(100);
        jpg.setString("100%");
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JProgressBar jpg;
    private javax.swing.JLabel titleJlabel;
    private javax.swing.JTable workRequestJtable;
    // End of variables declaration//GEN-END:variables
}
