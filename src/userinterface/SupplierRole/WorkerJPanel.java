package userinterface.SupplierRole;

import Business.Enterprise.Cargo;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.OrderRequest;
import Business.WorkQueue.ProductRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shijun
 */
public class WorkerJPanel extends javax.swing.JPanel {

    private JPanel userJpanel;
    private UserAccount userAccount;
 
    public WorkerJPanel(JPanel userJpanel, UserAccount userAccount) {
        this.userJpanel = userJpanel;
        this.userAccount = userAccount;
        initComponents();
        populateRequestTable();
        jpg.setValue(60);

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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleJlabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJtable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jpg = new javax.swing.JProgressBar();

        setBackground(new java.awt.Color(244, 238, 236));

        titleJlabel.setFont(new java.awt.Font("Futura", 1, 48)); // NOI18N
        titleJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleJlabel.setText("Worker Dashboard ");
        titleJlabel.setMaximumSize(new java.awt.Dimension(170, 30));
        titleJlabel.setMinimumSize(new java.awt.Dimension(170, 30));
        titleJlabel.setPreferredSize(new java.awt.Dimension(170, 30));

        workRequestJtable.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        workRequestJtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Product Request", "Sender Enterprise", "Receiver", "Cargo Name", "Cargo Quantity", "Result"
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
        if (workRequestJtable.getColumnModel().getColumnCount() > 0) {
            workRequestJtable.getColumnModel().getColumn(4).setPreferredWidth(70);
            workRequestJtable.getColumnModel().getColumn(5).setPreferredWidth(200);
        }

        jButton1.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        jButton1.setText("Processed & Delivered");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/20171130022057_4663b1bb57606b527a099840624554f2_16.gif"))); // NOI18N

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(titleJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jpg, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(titleJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel2))
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jpg, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        request.setMessage("Processed&Delivered");
        populateRequestTable();
        jpg.setValue(70);
        jpg.setString("70%");

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JProgressBar jpg;
    private javax.swing.JLabel titleJlabel;
    private javax.swing.JTable workRequestJtable;
    // End of variables declaration//GEN-END:variables
}
