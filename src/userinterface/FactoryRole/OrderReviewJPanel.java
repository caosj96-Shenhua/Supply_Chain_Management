package userinterface.FactoryRole;


import Business.Enterprise.Cargo;
import Business.Enterprise.CargoDirectory;
import Business.Enterprise.Enterprise;
import Business.Role.StoreManagerRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.OrderRequest;
import Business.WorkQueue.ProductRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shijun
 */
public class OrderReviewJPanel extends javax.swing.JPanel {

    private JPanel userJpanel;
    private UserAccount userAccount;
    private UserAccount uaStore;
    private Enterprise enterprise;
    private CargoDirectory cargoDirectory;
    private ArrayList<Cargo>cargolist;
    
    public OrderReviewJPanel(JPanel userJpanel, UserAccount userAccount,UserAccount uaStore, Enterprise enterprise) {
        this.userJpanel = userJpanel;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.uaStore = uaStore;
        this.cargoDirectory = new CargoDirectory();
        initComponents();
        valueJlabel.setText(enterprise.getEnterpriseName());
        storeJlabel.setText(uaStore.getUsername());    
        populateRequestTable();
//        InitData();
        
    }

    private void InitData() {
//        cargoNameJtext.setText(cargo.getCargoName());
//        priceJtext.setText(String.valueOf(cargo.getPrice()));
        for (Cargo cargo : (((StoreManagerRole)uaStore.getRole()).getStoreCargoDirectory().getCargoList())) {
            System.out.println(cargo.isRateble());
        }


    }
/*
    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJtable.getModel();
        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            if(request.getMessage().equals("Send to Assign Worker")){
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getName();;
            row[2] = request.getPrice();
            row[3] = request.getMessage();
            model.addRow(row);
                continue;
            }

        for (Cargo cargo : (((StoreManagerRole)uaStore.getRole()).getStoreCargoDirectory().getCargoList())) {
            Object[] row = new Object[4];

            row[0] = request;
            row[1] = cargo.getCargoName();
            row[2] = cargo.getPrice();
            row[3] = cargo.getQuantity();
            model.addRow(row);
        }
    }
    }
 */
    private void populateRequestTable() {
//        UserAccount ua = (UserAccount) storeCombo.getSelectedItem();
        
        DefaultTableModel model = (DefaultTableModel) workRequestJtable.getModel();
        model.setRowCount(0);
        
        for (Cargo cargo : (((StoreManagerRole)uaStore.getRole()).getStoreCargoDirectory().getCargoList())) {
        if(cargo.isRateble() == false){
            continue;
        }
            Object[] row = new Object[4];
            row[0] = cargo;
            row[1] = cargo.getCargoName();
            row[2] = cargo.getPrice();
          //  row[3] = cargo.getRate();
            row[3] = cargo.getRate();
            model.addRow(row);
        }
    }
    
  /*  
    public static double roundup(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }    
   */ 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        valueJlabel = new javax.swing.JLabel();
        BackBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        orgJlabel = new javax.swing.JLabel();
        storeJlabel = new javax.swing.JLabel();
        titleJlabel = new javax.swing.JLabel();
        enterpriseJlabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        priceJlabel1 = new javax.swing.JLabel();
        priceJlabel2 = new javax.swing.JLabel();
        comfortSlider = new javax.swing.JSlider();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJtable = new javax.swing.JTable();
        priceJlabel3 = new javax.swing.JLabel();
        sizeSlider = new javax.swing.JSlider();
        valueSlider = new javax.swing.JSlider();

        setBackground(new java.awt.Color(244, 238, 236));
        setFont(new java.awt.Font("Futura", 0, 13)); // NOI18N

        valueJlabel.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        valueJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        valueJlabel.setText("value");
        valueJlabel.setMaximumSize(new java.awt.Dimension(120, 30));
        valueJlabel.setMinimumSize(new java.awt.Dimension(120, 30));
        valueJlabel.setPreferredSize(new java.awt.Dimension(120, 30));

        BackBtn.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        BackBtn.setText("< Back");
        BackBtn.setMaximumSize(new java.awt.Dimension(90, 30));
        BackBtn.setMinimumSize(new java.awt.Dimension(90, 30));
        BackBtn.setPreferredSize(new java.awt.Dimension(90, 30));
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        saveBtn.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        saveBtn.setText("Rate");
        saveBtn.setMaximumSize(new java.awt.Dimension(90, 30));
        saveBtn.setMinimumSize(new java.awt.Dimension(90, 30));
        saveBtn.setPreferredSize(new java.awt.Dimension(90, 30));
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        orgJlabel.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        orgJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        orgJlabel.setText("Store:");
        orgJlabel.setMaximumSize(new java.awt.Dimension(120, 30));
        orgJlabel.setMinimumSize(new java.awt.Dimension(120, 30));
        orgJlabel.setPreferredSize(new java.awt.Dimension(120, 30));

        storeJlabel.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        storeJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        storeJlabel.setText("value");
        storeJlabel.setMaximumSize(new java.awt.Dimension(120, 30));
        storeJlabel.setMinimumSize(new java.awt.Dimension(120, 30));
        storeJlabel.setPreferredSize(new java.awt.Dimension(120, 30));

        titleJlabel.setFont(new java.awt.Font("Futura", 1, 48)); // NOI18N
        titleJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleJlabel.setText("Rate your Order");
        titleJlabel.setMaximumSize(new java.awt.Dimension(170, 30));
        titleJlabel.setMinimumSize(new java.awt.Dimension(170, 30));
        titleJlabel.setPreferredSize(new java.awt.Dimension(170, 30));

        enterpriseJlabel.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        enterpriseJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enterpriseJlabel.setText("Enterprise:");
        enterpriseJlabel.setMaximumSize(new java.awt.Dimension(120, 30));
        enterpriseJlabel.setMinimumSize(new java.awt.Dimension(120, 30));
        enterpriseJlabel.setPreferredSize(new java.awt.Dimension(120, 30));

        priceJlabel1.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        priceJlabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        priceJlabel1.setText("Comfort:");
        priceJlabel1.setMaximumSize(new java.awt.Dimension(120, 30));
        priceJlabel1.setMinimumSize(new java.awt.Dimension(120, 30));
        priceJlabel1.setPreferredSize(new java.awt.Dimension(120, 30));

        priceJlabel2.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        priceJlabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        priceJlabel2.setText("True to size:");
        priceJlabel2.setMaximumSize(new java.awt.Dimension(120, 30));
        priceJlabel2.setMinimumSize(new java.awt.Dimension(120, 30));
        priceJlabel2.setPreferredSize(new java.awt.Dimension(120, 30));

        comfortSlider.setFont(new java.awt.Font("Futura", 0, 11)); // NOI18N
        comfortSlider.setMajorTickSpacing(1);
        comfortSlider.setMaximum(5);
        comfortSlider.setPaintLabels(true);
        comfortSlider.setValue(3);
        comfortSlider.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        workRequestJtable.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        workRequestJtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Product Request", "Product Name", "Price", "Rate"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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

        priceJlabel3.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        priceJlabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        priceJlabel3.setText("Value:");
        priceJlabel3.setMaximumSize(new java.awt.Dimension(120, 30));
        priceJlabel3.setMinimumSize(new java.awt.Dimension(120, 30));
        priceJlabel3.setPreferredSize(new java.awt.Dimension(120, 30));

        sizeSlider.setFont(new java.awt.Font("Futura", 0, 11)); // NOI18N
        sizeSlider.setMajorTickSpacing(1);
        sizeSlider.setMaximum(5);
        sizeSlider.setPaintLabels(true);
        sizeSlider.setValue(3);
        sizeSlider.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        valueSlider.setFont(new java.awt.Font("Futura", 0, 11)); // NOI18N
        valueSlider.setMajorTickSpacing(1);
        valueSlider.setMaximum(5);
        valueSlider.setPaintLabels(true);
        valueSlider.setValue(3);
        valueSlider.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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
                        .addGap(140, 140, 140)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(orgJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(enterpriseJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(storeJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(valueJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(priceJlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(priceJlabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(priceJlabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(comfortSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(sizeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(valueSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(280, 280, 280)
                                        .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(titleJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(595, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addComponent(titleJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valueJlabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterpriseJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(orgJlabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(storeJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(priceJlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comfortSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(priceJlabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sizeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(valueSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceJlabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(243, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        userJpanel.remove(this);
        Component[] componentArray = userJpanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        OrderManagerJPanel storeJpanel = (OrderManagerJPanel) component;
        storeJpanel.populateRequestTable();
        CardLayout layout = (CardLayout) userJpanel.getLayout();
        layout.previous(userJpanel);
    }//GEN-LAST:event_BackBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        int selectedRow = workRequestJtable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please at least select a product", "GET REQUEST", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        double comfort = comfortSlider.getValue();
        double size = sizeSlider.getValue();
        double value = valueSlider.getValue();
    
        double avg = (comfort + size + value)/3;
        System.out.println(avg);
        
        
        for (Cargo cargo : (((StoreManagerRole)uaStore.getRole()).getStoreCargoDirectory().getCargoList())) {
            if(cargo.getCargoName().equals(workRequestJtable.getValueAt(selectedRow, 0).toString())){
                cargo.setRate((cargo.getRate() + avg)/(cargo.getRateCount()));
                cargo.setRateCount(cargo.getRateCount() + 1);
                System.out.println(String.format("%.2f", cargo.getRate()));
            }

        }
        
//        cargo.setPrice(Integer.parseInt(priceStr));

        JOptionPane.showMessageDialog(null, "Save succeed", "SAVE", JOptionPane.INFORMATION_MESSAGE);
        populateRequestTable();
    }//GEN-LAST:event_saveBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JSlider comfortSlider;
    private javax.swing.JLabel enterpriseJlabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel orgJlabel;
    private javax.swing.JLabel priceJlabel1;
    private javax.swing.JLabel priceJlabel2;
    private javax.swing.JLabel priceJlabel3;
    private javax.swing.JButton saveBtn;
    private javax.swing.JSlider sizeSlider;
    private javax.swing.JLabel storeJlabel;
    private javax.swing.JLabel titleJlabel;
    private javax.swing.JLabel valueJlabel;
    private javax.swing.JSlider valueSlider;
    private javax.swing.JTable workRequestJtable;
    // End of variables declaration//GEN-END:variables
}
