package userinterface.FactoryRole;

import Business.SortByPrice;
import Business.SortByQuantity;
import Business.Enterprise.Cargo;
import Business.Role.StoreManagerRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.OrderRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zhanghaojie
 */
public class AddShoesJpanel extends javax.swing.JPanel {

    private JPanel userJpanel;
    private OrderRequest request;
    private UserAccount userAccount;
    private ArrayList<Cargo>cargolist;
    
    public AddShoesJpanel(JPanel userJpanel /*, OrderRequest request*/, UserAccount userAccount) {
        this.userJpanel = userJpanel;
 //       this.request = request;
        this.userAccount = userAccount;
        initComponents();
        populateStoreTable();
//        this.cargolist=request.getOrder().getCargoDirectory().getCargoList();
    }
/*
    public void populateStoreTable(Comparator<Cargo> aComparator) {
        DefaultTableModel model = (DefaultTableModel) storeJtable.getModel();
        model.setRowCount(0);
       Collections.sort(cargolist, aComparator);
        for (Cargo cargo : ((StoreManagerRole)this.userAccount.getRole()).getStoreCargoDirectory().getCargoList()) {
            Object[] row = new Object[3];
            row[0] = cargo;
            row[1] = cargo.getQuantity();
            row[2] = cargo.getPrice();
            model.addRow(row);
        }
    }
*/
     public void populateStoreTable() {
        DefaultTableModel model = (DefaultTableModel) storeJtable.getModel();
        model.setRowCount(0);
        for (Cargo cargo : ((StoreManagerRole)this.userAccount.getRole()).getStoreCargoDirectory().getCargoList()) {
            Object[] row = new Object[3];
            row[0] = cargo;
            row[1] = cargo.getQuantity();
            row[2] = cargo.getPrice();
            model.addRow(row);
        }
    }
     
    private boolean checkValidCargoName(String name) {
        for (Cargo cargo : ((StoreManagerRole)this.userAccount.getRole()).getStoreCargoDirectory().getCargoList()) {
            if (cargo.getCargoName().equalsIgnoreCase(name)) {
                return false;
            }
        }
        return true;
    }     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        storeJtable = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        titleJlabel = new javax.swing.JLabel();
        viewBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        cargoNameJlabel = new javax.swing.JLabel();
        cargoNameJtext = new javax.swing.JTextField();
        quantityJlabel = new javax.swing.JLabel();
        priceJlabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cargoNameJlabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        quantityCombo = new javax.swing.JComboBox<>();
        priceSpinner = new javax.swing.JSpinner();

        setBackground(new java.awt.Color(244, 236, 236));

        storeJtable.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        storeJtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Products Name", "Quantity", "Price"
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
        storeJtable.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane3.setViewportView(storeJtable);

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
        titleJlabel.setText("Add Product");
        titleJlabel.setMaximumSize(new java.awt.Dimension(170, 30));
        titleJlabel.setMinimumSize(new java.awt.Dimension(170, 30));
        titleJlabel.setPreferredSize(new java.awt.Dimension(170, 30));

        viewBtn.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        viewBtn.setText("Update");
        viewBtn.setMaximumSize(new java.awt.Dimension(90, 30));
        viewBtn.setMinimumSize(new java.awt.Dimension(90, 30));
        viewBtn.setPreferredSize(new java.awt.Dimension(90, 30));
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        addBtn.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        addBtn.setText("Add");
        addBtn.setMaximumSize(new java.awt.Dimension(90, 30));
        addBtn.setMinimumSize(new java.awt.Dimension(90, 30));
        addBtn.setPreferredSize(new java.awt.Dimension(90, 30));
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        cargoNameJlabel.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        cargoNameJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cargoNameJlabel.setText("Product Name:");
        cargoNameJlabel.setMaximumSize(new java.awt.Dimension(150, 30));
        cargoNameJlabel.setMinimumSize(new java.awt.Dimension(120, 30));
        cargoNameJlabel.setPreferredSize(new java.awt.Dimension(150, 30));

        cargoNameJtext.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        cargoNameJtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cargoNameJtext.setMaximumSize(new java.awt.Dimension(120, 30));
        cargoNameJtext.setMinimumSize(new java.awt.Dimension(120, 30));
        cargoNameJtext.setPreferredSize(new java.awt.Dimension(120, 30));

        quantityJlabel.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        quantityJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantityJlabel.setText("Quantity:");
        quantityJlabel.setMaximumSize(new java.awt.Dimension(150, 30));
        quantityJlabel.setMinimumSize(new java.awt.Dimension(120, 30));
        quantityJlabel.setPreferredSize(new java.awt.Dimension(150, 30));

        priceJlabel.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        priceJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        priceJlabel.setText("Retail Price:");
        priceJlabel.setMaximumSize(new java.awt.Dimension(150, 30));
        priceJlabel.setMinimumSize(new java.awt.Dimension(120, 30));
        priceJlabel.setPreferredSize(new java.awt.Dimension(150, 30));

        cargoNameJlabel1.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        cargoNameJlabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cargoNameJlabel1.setText("Store Products：");
        cargoNameJlabel1.setMaximumSize(new java.awt.Dimension(150, 30));
        cargoNameJlabel1.setMinimumSize(new java.awt.Dimension(120, 30));
        cargoNameJlabel1.setPreferredSize(new java.awt.Dimension(150, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/best_air_jordan_5-11.gif"))); // NOI18N

        quantityCombo.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        quantityCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "20", "30", "40", "50", "60", "70", "80", "90" }));
        quantityCombo.setPreferredSize(new java.awt.Dimension(150, 30));

        priceSpinner.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        priceSpinner.setModel(new javax.swing.SpinnerNumberModel(160, null, null, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(26, 26, 26)
                            .addComponent(viewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cargoNameJlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(quantityJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(priceJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(cargoNameJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cargoNameJtext, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                            .addComponent(quantityCombo, 0, 0, Short.MAX_VALUE)
                            .addComponent(priceSpinner))))
                .addContainerGap(759, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titleJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(cargoNameJlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cargoNameJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(quantityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(priceSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cargoNameJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(quantityJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(priceJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userJpanel.remove(this);
        Component[] componentArray = userJpanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        StoreManagerJPanel sellerInterface = (StoreManagerJPanel) component;
        sellerInterface.populateRequestTable();
        CardLayout layout = (CardLayout) userJpanel.getLayout();
        layout.previous(userJpanel);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        int selectedRow = storeJtable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please at least select a row", "VIEW", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Cargo cargo = (Cargo) storeJtable.getValueAt(selectedRow, 0);
        CardLayout layout = (CardLayout) userJpanel.getLayout();
        userJpanel.add("CargoDetailJpanel", new RepertoryDetailJPanel(userJpanel, cargo));
        layout.next(userJpanel);
    }//GEN-LAST:event_viewBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        String cargoName = cargoNameJtext.getText();
//        String quantityStr = quantityJtext.getText();
        String quantityCom = quantityCombo.getSelectedItem().toString();
//        String priceStr = priceJtext.getText();
        String priceSp = priceSpinner.getValue().toString();
        if (cargoName == null || cargoName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please input the Cargo Name", "ADD", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (!checkValidCargoName(cargoName)) {
            JOptionPane.showMessageDialog(null, " \"" + cargoName + "\" is already in stock", "IN STOCK", JOptionPane.ERROR_MESSAGE);
             return;
        }
        
        Cargo cargo = new Cargo(cargoName);
        int quantity = (quantityCom == null || quantityCom.isEmpty()) ? 0 : Integer.parseInt(quantityCom);
        int price = (priceSp == null || priceSp.isEmpty()) ? 0 : Integer.parseInt(priceSp);
        cargo.setPrice(price);
        cargo.setQuantity(quantity);
        ((StoreManagerRole) this.userAccount.getRole()).getStoreCargoDirectory().getCargoList().add(cargo);
        populateStoreTable();
    }//GEN-LAST:event_addBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel cargoNameJlabel;
    private javax.swing.JLabel cargoNameJlabel1;
    private javax.swing.JTextField cargoNameJtext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel priceJlabel;
    private javax.swing.JSpinner priceSpinner;
    private javax.swing.JComboBox<Object> quantityCombo;
    private javax.swing.JLabel quantityJlabel;
    private javax.swing.JTable storeJtable;
    private javax.swing.JLabel titleJlabel;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}
