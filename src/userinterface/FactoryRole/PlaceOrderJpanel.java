package userinterface.FactoryRole;

import Business.SortByPrice;
import Business.SortByQuantity;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Cargo;
import Business.Enterprise.CargoDirectory;
import Business.Enterprise.FactoryEnterprise;
import Business.Organization.Organization;
import Business.Organization.OrderOrg;
import Business.Organization.StoreOrg;
import Business.Role.OrderManagerRole;
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
public class PlaceOrderJpanel extends javax.swing.JPanel {

    private JPanel userJpanel;
    private UserAccount userAccount;
    private UserAccount uaStore;
    private Enterprise enterprise;
    private CargoDirectory cargoDirectory;
    private ArrayList<Cargo>cargolist;
    public PlaceOrderJpanel(JPanel userJpanel, UserAccount userAccount,UserAccount uaStore, Enterprise enterprise) {
        this.userJpanel = userJpanel;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.uaStore = uaStore;
        this.cargoDirectory = new CargoDirectory();
        initComponents();
        valueJlabel.setText(enterprise.getEnterpriseName());
        storeJlabel.setText(uaStore.getUsername());
//        populateTable(ua);
//        System.out.println(((StoreManagerRole)userAccount.getRole()).getStoreCargoDirectory().getCargoList());
        //this.cargolist=cargoDirectory.getCargoList();
        choose1.setToolTipText("<html>Make sure your head isn’t in the beam while trying to grab the Jordan 6 Retro Black Infrared (2019).<br> This AJ6 come with a black upper, black midsole plus red accents, and a translucent sole. <br>These sneakers released in February 2019 and retailed for $200<html>");
        choose3.setToolTipText("<html>This AJ 1 features classic “Black Toe” color scheme.<br> This design is constructed in a mix of leather and satin construction providing a luxury feel.<br> A metal Wings logo on the heel completes the design. These sneakers released in August of 2019 and retailed for $160.<html>");
        choose2.setToolTipText("<html>This Jordan 11 features a black upper with shiny patent leather overlays and red detailing. <br>A red translucent outsole, white midsole, and “23” insignia on the heel completes the design.<br> These sneakers released in November of 2019 and retailed for $220.<html>");
    

        System.out.println(uaStore.getUsername());
        populateTable();
        jpg.setValue(0);

    }

    private void populateTable() {
//        UserAccount ua = (UserAccount) storeCombo.getSelectedItem();
        
        DefaultTableModel model = (DefaultTableModel) cargoJtable.getModel();
        model.setRowCount(0);
        for (Cargo cargo : (((StoreManagerRole)/*userAccount*/uaStore.getRole()).getStoreCargoDirectory().getCargoList())) {
            Object[] row = new Object[4];
            row[0] = cargo;
            row[1] = cargo.getPrice();
            row[2] = cargo.getQuantity();
            row[3] = cargo.getRate() == 0.0 ? "No Rates Yet" : cargo.getRate();

       //     row[3] = cargo.getRate();

            model.addRow(row);
        }
    }

     private void populateTable(Comparator<Cargo> aComparator) {
        DefaultTableModel model = (DefaultTableModel) cargoJtable.getModel();
        model.setRowCount(0);
//        Collections.sort(cargolist, aComparator);
        Collections.sort(((StoreManagerRole)uaStore.getRole()).getStoreCargoDirectory().getCargoList(), aComparator);
        for (Cargo cargo : ((StoreManagerRole)uaStore.getRole()).getStoreCargoDirectory().getCargoList()) {
            Object[] row = new Object[4];
            row[0] = cargo;
            row[1] = cargo.getPrice();
            row[2] = cargo.getQuantity();
            row[3] = cargo.getRate();
            
            model.addRow(row);
        }
    }
       

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        submitJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        titleJlabel = new javax.swing.JLabel();
        valueJlabel = new javax.swing.JLabel();
        enterpriseJlabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cargoJtable = new javax.swing.JTable();
        quantityJlabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnSort = new javax.swing.JButton();
        jCBWayOfSort = new javax.swing.JComboBox<>();
        choose2 = new javax.swing.JButton();
        choose3 = new javax.swing.JButton();
        choose1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        enterpriseJlabel1 = new javax.swing.JLabel();
        storeJlabel = new javax.swing.JLabel();
        quantityCombo = new javax.swing.JComboBox<>();
        choose4 = new javax.swing.JButton();
        nametextField = new java.awt.TextField();
        pricetextField = new java.awt.TextField();
        quantityJlabel1 = new javax.swing.JLabel();
        quantityJlabel2 = new javax.swing.JLabel();
        quantityJlabel3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jpg = new javax.swing.JProgressBar();

        label1.setText("label1");

        setBackground(new java.awt.Color(244, 238, 236));

        submitJButton.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        submitJButton.setText("Place Order");
        submitJButton.setMaximumSize(new java.awt.Dimension(90, 30));
        submitJButton.setMinimumSize(new java.awt.Dimension(90, 30));
        submitJButton.setPreferredSize(new java.awt.Dimension(90, 30));
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

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
        titleJlabel.setText("Place Order");
        titleJlabel.setMaximumSize(new java.awt.Dimension(170, 30));
        titleJlabel.setMinimumSize(new java.awt.Dimension(170, 30));
        titleJlabel.setPreferredSize(new java.awt.Dimension(170, 30));

        valueJlabel.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        valueJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        valueJlabel.setText("value");
        valueJlabel.setMaximumSize(new java.awt.Dimension(120, 30));
        valueJlabel.setMinimumSize(new java.awt.Dimension(120, 30));
        valueJlabel.setPreferredSize(new java.awt.Dimension(120, 30));

        enterpriseJlabel.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        enterpriseJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enterpriseJlabel.setText("Enterprise:");
        enterpriseJlabel.setMaximumSize(new java.awt.Dimension(120, 30));
        enterpriseJlabel.setMinimumSize(new java.awt.Dimension(120, 30));
        enterpriseJlabel.setPreferredSize(new java.awt.Dimension(120, 30));

        cargoJtable.setFont(new java.awt.Font("Futura", 0, 12)); // NOI18N
        cargoJtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Order Name", "Price", "Quantity Left", "Product Rate"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
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
        cargoJtable.setSelectionBackground(new java.awt.Color(204, 204, 204));
        cargoJtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cargoJtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(cargoJtable);

        quantityJlabel.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        quantityJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantityJlabel.setText("Choose Quantity:");
        quantityJlabel.setMaximumSize(new java.awt.Dimension(150, 30));
        quantityJlabel.setMinimumSize(new java.awt.Dimension(120, 30));
        quantityJlabel.setPreferredSize(new java.awt.Dimension(150, 30));

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

        choose2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/FactoryRole/aj11_gaitubao_108x77.jpg"))); // NOI18N
        choose2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choose2ActionPerformed(evt);
            }
        });

        choose3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/FactoryRole/aj1_gaitubao_133x86.jpg"))); // NOI18N
        choose3.setMaximumSize(new java.awt.Dimension(124, 89));
        choose3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choose3ActionPerformed(evt);
            }
        });

        choose1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/FactoryRole/aj3_gaitubao_131x103.jpg"))); // NOI18N
        choose1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choose1ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Apple Chancery", 3, 24)); // NOI18N
        jLabel2.setText("   Best  Seller");

        enterpriseJlabel1.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        enterpriseJlabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enterpriseJlabel1.setText("Store:");
        enterpriseJlabel1.setMaximumSize(new java.awt.Dimension(120, 30));
        enterpriseJlabel1.setMinimumSize(new java.awt.Dimension(120, 30));
        enterpriseJlabel1.setPreferredSize(new java.awt.Dimension(120, 30));

        storeJlabel.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        storeJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        storeJlabel.setText("value");
        storeJlabel.setMaximumSize(new java.awt.Dimension(120, 30));
        storeJlabel.setMinimumSize(new java.awt.Dimension(120, 30));
        storeJlabel.setPreferredSize(new java.awt.Dimension(120, 30));

        quantityCombo.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        quantityCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        quantityCombo.setPreferredSize(new java.awt.Dimension(90, 30));

        choose4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/BQ3381-001_Nike_Air_Jordan_34_PF_Black_a.jpg"))); // NOI18N
        choose4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choose4ActionPerformed(evt);
            }
        });

        nametextField.setEditable(false);
        nametextField.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        nametextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametextFieldActionPerformed(evt);
            }
        });

        pricetextField.setEditable(false);
        pricetextField.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        pricetextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pricetextFieldActionPerformed(evt);
            }
        });

        quantityJlabel1.setFont(new java.awt.Font("Futura", 1, 18)); // NOI18N
        quantityJlabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantityJlabel1.setText("Review your order");
        quantityJlabel1.setMaximumSize(new java.awt.Dimension(150, 30));
        quantityJlabel1.setMinimumSize(new java.awt.Dimension(120, 30));
        quantityJlabel1.setPreferredSize(new java.awt.Dimension(150, 30));

        quantityJlabel2.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        quantityJlabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantityJlabel2.setText("Order Name:");
        quantityJlabel2.setMaximumSize(new java.awt.Dimension(150, 30));
        quantityJlabel2.setMinimumSize(new java.awt.Dimension(120, 30));
        quantityJlabel2.setPreferredSize(new java.awt.Dimension(150, 30));

        quantityJlabel3.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        quantityJlabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantityJlabel3.setText("Price:");
        quantityJlabel3.setMaximumSize(new java.awt.Dimension(150, 30));
        quantityJlabel3.setMinimumSize(new java.awt.Dimension(120, 30));
        quantityJlabel3.setPreferredSize(new java.awt.Dimension(150, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/future-sneaker-reselling-stockx.gif"))); // NOI18N

        jpg.setFont(new java.awt.Font("Futura", 0, 13)); // NOI18N
        jpg.setAutoscrolls(true);
        jpg.setName(""); // NOI18N
        jpg.setStringPainted(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(170, 170, 170)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 46, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(choose1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(choose2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(choose3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(choose4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jpg, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(quantityJlabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(quantityJlabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(quantityJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nametextField, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(pricetextField, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(quantityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(quantityJlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(101, 101, 101))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSort)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCBWayOfSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(enterpriseJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(enterpriseJlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(94, 94, 94)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(valueJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(storeJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(titleJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(113, 113, 113))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(titleJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(78, 78, 78)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btnSort)
                                            .addComponent(jCBWayOfSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jLabel3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(quantityJlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(valueJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(enterpriseJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(129, 129, 129)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(enterpriseJlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(storeJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(choose1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(choose2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(choose3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nametextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantityJlabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pricetextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantityJlabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quantityJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(choose4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jpg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(236, 236, 236))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        int selectedRow = cargoJtable.getSelectedRow();
 /*
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please at least select a Request row", "GET REQUEST", JOptionPane.ERROR_MESSAGE);
            return;
        }
 */
 
        for (int i = 0; i < cargoJtable.getRowCount(); i++){

            if(cargoJtable.getValueAt(i, 0).toString().equals(nametextField.getText())){
            
            selectedRow = i;
            System.out.println(selectedRow);
            }
        }
        
        
        int quantityLeft = Integer.parseInt(cargoJtable.getValueAt(selectedRow, 2).toString());
        if (Integer.valueOf(quantityCombo.getSelectedItem().toString()) > quantityLeft ){
            JOptionPane.showMessageDialog(null, "Insufficient Product Quantity","PRODUCT", JOptionPane.ERROR_MESSAGE);
            return;
        }            

        if (nametextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please select a Product", "GET REQUEST", JOptionPane.ERROR_MESSAGE);
            return;
        }

        
        
        String cargoName = cargoJtable.getValueAt(selectedRow, 0).toString();
        int quantityRequire = Integer.parseInt(quantityCombo.getSelectedItem().toString());
        int price = Integer.parseInt(cargoJtable.getValueAt(selectedRow, 1).toString());
        
        Cargo cargo = new Cargo(cargoName);
        cargo.setPrice(price);
        cargo.setQuantity(quantityRequire);
        this.cargoDirectory.getCargoList().add(cargo);        
        
//        ((StoreManagerRole)userAccount.getRole());
//Store UA
//        UserAccount ua = (UserAccount) storeCombo.getSelectedItem();

        OrderRequest orderRequest = new OrderRequest(userAccount/*, message*/);
        orderRequest.getOrder().setCargoDirectory(this.cargoDirectory);        
       
        orderRequest.setName(cargoName);
        orderRequest.setPrice(price);
        orderRequest.setQuantity(quantityRequire);
        orderRequest.setMessage("Send to " + uaStore.getUsername());
//        orderRequest.setSender((OrderManagerRole)userAccount);
        ArrayList<Organization> orgList = new ArrayList<Organization>();
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof OrderOrg || organization instanceof StoreOrg) {
                orgList.add(organization);
            }
        }

        for (Organization organization : orgList) {
            organization.getWorkQueue().getWorkRequestList().add(orderRequest);
            for (UserAccount useraccount : organization.getUserAccountDirectory().getUserAccountList()) {
                useraccount.getWorkQueue().getWorkRequestList().add(orderRequest);
            }
        }
        
        this.cargoDirectory = new CargoDirectory();
        
        System.out.println(orderRequest.getOrder().getCargoDirectory().getCargoList());
        
//        populateTable();
        JOptionPane.showMessageDialog(null, "Order Placed!", "Thank you", JOptionPane.INFORMATION_MESSAGE);
        jpg.setString("10%");
        jpg.setValue(10);

    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userJpanel.remove(this);
        Component[] componentArray = userJpanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        OrderManagerJPanel orderInterface = (OrderManagerJPanel) component;
        orderInterface.populateRequestTable();
        CardLayout layout = (CardLayout) userJpanel.getLayout();
        layout.previous(userJpanel);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed
        // TODO add your handling code here:
        String sortpattern = (String)jCBWayOfSort.getSelectedItem();
        switch(sortpattern){
            case "Quantity":
            SortByQuantity WayOfSortByAge = new SortByQuantity();
            populateTable((Comparator<Cargo>)WayOfSortByAge);
            break;

            case "Price":
            SortByPrice WayOfSortByName = new SortByPrice();
            populateTable((Comparator<Cargo>)WayOfSortByName);
            break;

        }
    }//GEN-LAST:event_btnSortActionPerformed

    private void jCBWayOfSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBWayOfSortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBWayOfSortActionPerformed

    private void choose2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choose2ActionPerformed
        for (Cargo cargo : (((StoreManagerRole)uaStore.getRole()).getStoreCargoDirectory().getCargoList())) {
            if (cargo.getCargoName().equals("AJ11") || cargo.getCargoName().equals("Air Jordan11")){
                nametextField.setText(cargo.getCargoName());
                pricetextField.setText(String.valueOf(cargo.getPrice()));
                
            }

        }
        if(nametextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Product out of stock","OUT OF STOCK", JOptionPane.ERROR_MESSAGE);    
        }
    }//GEN-LAST:event_choose2ActionPerformed

    private void choose1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choose1ActionPerformed
        // TODO add your handling code here:
/*
        for (Cargo cargo : (((StoreManagerRole)uaStore.getRole()).getStoreCargoDirectory().getCargoList())) {
            if (cargo.getCargoName().equals("AJ1") || cargo.getCargoName().equals("Air Jordan1")){
                nametextField.setText(cargo.getCargoName());
                pricetextField.setText(String.valueOf(cargo.getPrice()));
            }
            else{
                JOptionPane.showMessageDialog(null, "Product out of stock","OUT OF STOCK", JOptionPane.ERROR_MESSAGE);
            }
            return;
        }
*/
        for (int i = 0; i < cargoJtable.getRowCount(); i++){
            if(cargoJtable.getValueAt(i, 0).toString().equals("AJ1")){
                nametextField.setText(cargoJtable.getValueAt(i, 0).toString());
                pricetextField.setText(cargoJtable.getValueAt(i, 1).toString());
            }
        }
        if(nametextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Product out of stock","OUT OF STOCK", JOptionPane.ERROR_MESSAGE);    
        }        
    }//GEN-LAST:event_choose1ActionPerformed

    private void choose3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choose3ActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < cargoJtable.getRowCount(); i++){
            if(cargoJtable.getValueAt(i, 0).toString().equals("AJ13")){
                nametextField.setText(cargoJtable.getValueAt(i, 0).toString());
                pricetextField.setText(cargoJtable.getValueAt(i, 1).toString());
            }
            }
        if(nametextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Product out of stock","OUT OF STOCK", JOptionPane.ERROR_MESSAGE);    
        }        
    }//GEN-LAST:event_choose3ActionPerformed

    private void choose4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choose4ActionPerformed
        // TODO add your handling code here:

        for (int i = 0; i < cargoJtable.getRowCount(); i++){
            System.out.println(cargoJtable.getValueAt(i, 0));
            if(cargoJtable.getValueAt(i, 0).toString().equals("AJ34")){
                nametextField.setText(cargoJtable.getValueAt(i, 0).toString());
                pricetextField.setText(cargoJtable.getValueAt(i, 1).toString());            
            }            
            }
        if(nametextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Product out of stock","OUT OF STOCK", JOptionPane.ERROR_MESSAGE);    
        }        

                   
    }//GEN-LAST:event_choose4ActionPerformed

    private void nametextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nametextFieldActionPerformed

    private void pricetextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pricetextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pricetextFieldActionPerformed

    private void cargoJtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cargoJtableMouseClicked
        // TODO add your handling code here:
        int selectedRow = cargoJtable.getSelectedRow();

        DefaultTableModel model = (DefaultTableModel) cargoJtable.getModel();
        
        nametextField.setText(model.getValueAt(selectedRow, 0).toString());
        pricetextField.setText(model.getValueAt(selectedRow, 1).toString());
    }//GEN-LAST:event_cargoJtableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnSort;
    private javax.swing.JTable cargoJtable;
    private javax.swing.JButton choose1;
    private javax.swing.JButton choose2;
    private javax.swing.JButton choose3;
    private javax.swing.JButton choose4;
    private javax.swing.JLabel enterpriseJlabel;
    private javax.swing.JLabel enterpriseJlabel1;
    private javax.swing.JComboBox<String> jCBWayOfSort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JProgressBar jpg;
    private java.awt.Label label1;
    private java.awt.TextField nametextField;
    private java.awt.TextField pricetextField;
    private javax.swing.JComboBox<Object> quantityCombo;
    private javax.swing.JLabel quantityJlabel;
    private javax.swing.JLabel quantityJlabel1;
    private javax.swing.JLabel quantityJlabel2;
    private javax.swing.JLabel quantityJlabel3;
    private javax.swing.JLabel storeJlabel;
    private javax.swing.JButton submitJButton;
    private javax.swing.JLabel titleJlabel;
    private javax.swing.JLabel valueJlabel;
    // End of variables declaration//GEN-END:variables
}
