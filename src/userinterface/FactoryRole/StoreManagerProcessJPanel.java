package userinterface.FactoryRole;

import Business.SortByPrice;
import Business.SortByQuantity;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Cargo;
import Business.Organization.Organization;
import Business.Organization.AgentOrg;
import Business.Role.StoreManagerRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.OrderRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 * @author Kiksuya
 */
public class StoreManagerProcessJPanel extends javax.swing.JPanel {

    private JPanel userJpanel;
    private OrderRequest request;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private ArrayList<Cargo>cargolist;
    
    public StoreManagerProcessJPanel(JPanel userJpanel, OrderRequest request, UserAccount userAccount, Enterprise enterprise) {
        this.userJpanel = userJpanel;
        this.request = request;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        initComponents();
//        populateRequireTable();
        populateRemainTable();
        this.cargolist=request.getOrder().getCargoDirectory().getCargoList();
        
        nameJlabel.setText(request.getName());
        quantityJlabel.setText(String.valueOf(request.getQuantity()));
        priceJlabel.setText(String.valueOf(request.getPrice()));
        jpg.setValue(20);

    }
/*
    private void populateRequireTable() {
        DefaultTableModel model = (DefaultTableModel) requireJtable.getModel();
        model.setRowCount(0);
        for (Cargo cargo : request.getOrder().getCargoDirectory().getCargoList()) {
            Object[] row = new Object[3];
            row[0] = cargo;
            row[1] = cargo.getQuantity();
            row[2] = cargo.getPrice();
            model.addRow(row);
        }
    }
    

    
    
    private void populateRequireTable(Comparator<Cargo> aComparator) {
        DefaultTableModel model = (DefaultTableModel) requireJtable.getModel();
        model.setRowCount(0);
        for (Cargo cargo : request.getOrder().getCargoDirectory().getCargoList()) {
            Object[] row = new Object[3];
            row[0] = cargo;
            row[1] = cargo.getQuantity();
            row[2] = cargo.getPrice();
            model.addRow(row);
        }
    }
    */
    private void populateRemainTable() {
        DefaultTableModel model = (DefaultTableModel) remainJtable.getModel();
        model.setRowCount(0);
        
        for (Cargo cargo : ((StoreManagerRole) userAccount.getRole()).getStoreCargoDirectory().getCargoList()) {
            Object[] row = new Object[3];
            row[0] = cargo;
            row[1] = cargo.getQuantity();
            row[2] = cargo.getPrice();
            model.addRow(row);
        }
    }
    
    private void populateRemainTable(Comparator<Cargo> aComparator) {
        DefaultTableModel model = (DefaultTableModel) remainJtable.getModel();
        model.setRowCount(0);
        Collections.sort(cargolist, aComparator);
        for (Cargo cargo : ((StoreManagerRole) userAccount.getRole()).getStoreCargoDirectory().getCargoList()) {
            Object[] row = new Object[3];
            row[0] = cargo;
            row[1] = cargo.getQuantity();
            row[2] = cargo.getPrice();
            model.addRow(row);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJButton = new javax.swing.JButton();
        titleJlabel = new javax.swing.JLabel();
        submitJButton = new javax.swing.JButton();
        requireJlabel = new javax.swing.JLabel();
        remainJlabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        remainJtable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnSort = new javax.swing.JButton();
        jCBWayOfSort = new javax.swing.JComboBox<>();
        requireJlabel1 = new javax.swing.JLabel();
        requireJlabel2 = new javax.swing.JLabel();
        requireJlabel3 = new javax.swing.JLabel();
        nameJlabel = new javax.swing.JLabel();
        quantityJlabel = new javax.swing.JLabel();
        priceJlabel = new javax.swing.JLabel();
        jpg = new javax.swing.JProgressBar();

        setBackground(new java.awt.Color(244, 236, 236));

        backJButton.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        backJButton.setText("< Back");
        backJButton.setMaximumSize(new java.awt.Dimension(120, 30));
        backJButton.setMinimumSize(new java.awt.Dimension(120, 30));
        backJButton.setPreferredSize(new java.awt.Dimension(120, 30));
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        titleJlabel.setFont(new java.awt.Font("Futura", 1, 48)); // NOI18N
        titleJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleJlabel.setText("Store Manager Process");
        titleJlabel.setMaximumSize(new java.awt.Dimension(170, 30));
        titleJlabel.setMinimumSize(new java.awt.Dimension(170, 30));
        titleJlabel.setPreferredSize(new java.awt.Dimension(170, 30));

        submitJButton.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        submitJButton.setText("Submit");
        submitJButton.setMaximumSize(new java.awt.Dimension(90, 30));
        submitJButton.setMinimumSize(new java.awt.Dimension(90, 30));
        submitJButton.setPreferredSize(new java.awt.Dimension(90, 30));
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        requireJlabel.setFont(new java.awt.Font("Futura", 1, 24)); // NOI18N
        requireJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        requireJlabel.setText("Require:");
        requireJlabel.setMaximumSize(new java.awt.Dimension(150, 30));
        requireJlabel.setMinimumSize(new java.awt.Dimension(120, 30));
        requireJlabel.setPreferredSize(new java.awt.Dimension(150, 30));

        remainJlabel.setFont(new java.awt.Font("Futura", 1, 24)); // NOI18N
        remainJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        remainJlabel.setText("Remain:");
        remainJlabel.setMaximumSize(new java.awt.Dimension(150, 30));
        remainJlabel.setMinimumSize(new java.awt.Dimension(120, 30));
        remainJlabel.setPreferredSize(new java.awt.Dimension(150, 30));

        remainJtable.setFont(new java.awt.Font("Futura", 0, 12)); // NOI18N
        remainJtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Cargo Name", "Quantity", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        remainJtable.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane3.setViewportView(remainJtable);

        btnSort.setFont(new java.awt.Font("Futura", 0, 13)); // NOI18N
        btnSort.setText("Sort");
        btnSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortActionPerformed(evt);
            }
        });

        jCBWayOfSort.setFont(new java.awt.Font("Futura", 0, 13)); // NOI18N
        jCBWayOfSort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quantity", "Price" }));
        jCBWayOfSort.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jCBWayOfSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBWayOfSortActionPerformed(evt);
            }
        });

        requireJlabel1.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        requireJlabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        requireJlabel1.setText("Product Name:");
        requireJlabel1.setMaximumSize(new java.awt.Dimension(150, 30));
        requireJlabel1.setMinimumSize(new java.awt.Dimension(120, 30));
        requireJlabel1.setPreferredSize(new java.awt.Dimension(150, 30));

        requireJlabel2.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        requireJlabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        requireJlabel2.setText("Product Quantity:");
        requireJlabel2.setMaximumSize(new java.awt.Dimension(150, 30));
        requireJlabel2.setMinimumSize(new java.awt.Dimension(120, 30));
        requireJlabel2.setPreferredSize(new java.awt.Dimension(150, 30));

        requireJlabel3.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        requireJlabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        requireJlabel3.setText("Price:");
        requireJlabel3.setMaximumSize(new java.awt.Dimension(150, 30));
        requireJlabel3.setMinimumSize(new java.awt.Dimension(120, 30));
        requireJlabel3.setPreferredSize(new java.awt.Dimension(150, 30));

        nameJlabel.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        nameJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameJlabel.setText("value");
        nameJlabel.setMaximumSize(new java.awt.Dimension(150, 30));
        nameJlabel.setMinimumSize(new java.awt.Dimension(120, 30));
        nameJlabel.setPreferredSize(new java.awt.Dimension(150, 30));

        quantityJlabel.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        quantityJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantityJlabel.setText("value");
        quantityJlabel.setMaximumSize(new java.awt.Dimension(150, 30));
        quantityJlabel.setMinimumSize(new java.awt.Dimension(120, 30));
        quantityJlabel.setPreferredSize(new java.awt.Dimension(150, 30));

        priceJlabel.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        priceJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        priceJlabel.setText("value");
        priceJlabel.setMaximumSize(new java.awt.Dimension(150, 30));
        priceJlabel.setMinimumSize(new java.awt.Dimension(120, 30));
        priceJlabel.setPreferredSize(new java.awt.Dimension(150, 30));

        jpg.setFont(new java.awt.Font("Futura", 0, 13)); // NOI18N
        jpg.setString("20%");
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
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(remainJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(377, 377, 377)
                                .addComponent(btnSort)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCBWayOfSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(requireJlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(requireJlabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(titleJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(requireJlabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jpg, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(requireJlabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quantityJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(titleJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(requireJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(requireJlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(requireJlabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(requireJlabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(remainJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSort)
                    .addComponent(jCBWayOfSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpg, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userJpanel.remove(this);
        Component[] componentArray = userJpanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        StoreManagerJPanel storeInterface = (StoreManagerJPanel) component;
        storeInterface.populateRequestTable();
        CardLayout layout = (CardLayout) userJpanel.getLayout();
        layout.previous(userJpanel);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        ArrayList<Organization> orgList = new ArrayList<Organization>();
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof AgentOrg) {
                orgList.add(organization);
            }
        }
        for (Organization organization : orgList) {
            organization.getWorkQueue().getWorkRequestList().add(request);
            for (UserAccount useraccount : organization.getUserAccountDirectory().getUserAccountList()) {
                useraccount.getWorkQueue().getWorkRequestList().add(request);
            }
        }
        request.setResult(/*resultJtext.getText()*/"Store Processed");
        request.setStatus("PurchasingAgent Processed...");
        JOptionPane.showMessageDialog(null, "StoreManage Organization processed!", "SUMBIT", JOptionPane.INFORMATION_MESSAGE);
        jpg.setString("20%");
        jpg.setValue(30);
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed
        // TODO add your handling code here:
        String sortpattern = (String)jCBWayOfSort.getSelectedItem();
        switch(sortpattern){
            case "Quantity":
            SortByQuantity WayOfSortByAge = new SortByQuantity();
            //populateRequireTable(WayOfSortByAge);
            populateRemainTable(WayOfSortByAge);
            break;

            case "Price":
            SortByPrice WayOfSortByName = new SortByPrice();
           // populateRequireTable(WayOfSortByName);
            populateRemainTable(WayOfSortByName);
            break;

        }
    }//GEN-LAST:event_btnSortActionPerformed

    private void jCBWayOfSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBWayOfSortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBWayOfSortActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnSort;
    private javax.swing.JComboBox<String> jCBWayOfSort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JProgressBar jpg;
    private javax.swing.JLabel nameJlabel;
    private javax.swing.JLabel priceJlabel;
    private javax.swing.JLabel quantityJlabel;
    private javax.swing.JLabel remainJlabel;
    private javax.swing.JTable remainJtable;
    private javax.swing.JLabel requireJlabel;
    private javax.swing.JLabel requireJlabel1;
    private javax.swing.JLabel requireJlabel2;
    private javax.swing.JLabel requireJlabel3;
    private javax.swing.JButton submitJButton;
    private javax.swing.JLabel titleJlabel;
    // End of variables declaration//GEN-END:variables
}
