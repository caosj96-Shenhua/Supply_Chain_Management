package userinterface.FactoryRole;

import Business.SortByPrice;
import Business.SortByQuantity;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Cargo;
import Business.Network.Network;
import Business.Network.NetworkDirectory;
import Business.Organization.AssignWorkerOrg;
import Business.Organization.OrderOrg;
import Business.Organization.Organization;
import Business.Organization.StoreOrg;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.OrderRequest;
import Business.WorkQueue.ProductRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kiksuya
 */
public class RequestToSupplierJpanel extends javax.swing.JPanel {

    private JPanel userJpanel;
    private NetworkDirectory networkDirectory;
    private OrderRequest orderRequest;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private ArrayList<Cargo>cargolist;
    public RequestToSupplierJpanel(JPanel userJpanel, NetworkDirectory networkDirectory, OrderRequest request, UserAccount userAccount, Enterprise enterprise) {
        this.userJpanel = userJpanel;
        this.networkDirectory = networkDirectory;
        this.orderRequest = request;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
       
        initComponents();
        populateSupplierTable();
//        populateCargoTable();
        this.cargolist=orderRequest.getOrder().getCargoDirectory().getCargoList();
        nameJlabel.setText(request.getName());
        quantityJlabel.setText(String.valueOf(request.getQuantity()));
        priceJlabel.setText(String.valueOf(request.getPrice()));    
        jpg.setValue(40);

    }

    private void populateSupplierTable() {
        DefaultTableModel model = (DefaultTableModel) requireJtable.getModel();
        model.setRowCount(0);
        for (Network network : networkDirectory.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise.getEnterpriseType() != Enterprise.EnterpriseType.Supplier) {
                    continue;
                }
                Object[] row = new Object[3];
                row[0] = network.getName();
                row[1] = enterprise;
                row[2] = enterprise.getEnterpriseType();
                model.addRow(row);
            }
        }
    }

    private void populateCargoTable() {
        DefaultTableModel model = (DefaultTableModel) requireJtable.getModel();
        model.setRowCount(0);
        for (Cargo cargo : orderRequest.getOrder().getCargoDirectory().getCargoList()) {
            Object[] row = new Object[3];
            row[0] = cargo;
            row[1] = cargo.getQuantity();
            row[2] = cargo.getPrice();
            model.addRow(row);
        }
    }

    private void populateCargoTable(Comparator<Cargo> aComparator) {
        DefaultTableModel model = (DefaultTableModel) requireJtable.getModel();
        model.setRowCount(0);
         Collections.sort(cargolist, aComparator);
        for (Cargo cargo : orderRequest.getOrder().getCargoDirectory().getCargoList()) {
            Object[] row = new Object[3];
            row[0] = cargo;
            row[1] = cargo.getQuantity();
            row[2] = cargo.getPrice();
            model.addRow(row);
        }
    }

/*   
    private boolean judgeValid(String month, String day, String year) {
        if (month == null || month.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please input the month", "SUBMIT", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (isNumber(month) == false) {
            JOptionPane.showMessageDialog(null, "Month should be a number instead of letters:\"" + month + "\"", "SUBMIT", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (day == null || day.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please input the day", "SUBMIT", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (isNumber(day) == false) {
            JOptionPane.showMessageDialog(null, "Day should be a number instead of letters:\"" + day + "\"", "SUBMIT", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (year == null || year.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please input the year", "SUBMIT", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (isNumber(year) == false) {
            JOptionPane.showMessageDialog(null, "Year should be a number instead of letters:\"" + year + "\"", "SUBMIT", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }
*/
    private boolean isNumber(String str) {
        String reg = "^[0-9]+(.[0-9]+)?$";
        return str.matches(reg);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJButton = new javax.swing.JButton();
        titleJlabel = new javax.swing.JLabel();
        requestBtn = new javax.swing.JButton();
        supplierListJlabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        requireJtable = new javax.swing.JTable();
        supplierListJlabel1 = new javax.swing.JLabel();
        supplierListJlabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        requireJlabel1 = new javax.swing.JLabel();
        nameJlabel = new javax.swing.JLabel();
        requireJlabel2 = new javax.swing.JLabel();
        quantityJlabel = new javax.swing.JLabel();
        requireJlabel3 = new javax.swing.JLabel();
        priceJlabel = new javax.swing.JLabel();
        jst = new com.toedter.calendar.JDateChooser();
        jpg = new javax.swing.JProgressBar();

        setBackground(new java.awt.Color(244, 236, 236));

        backJButton.setBackground(new java.awt.Color(204, 204, 204));
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
        titleJlabel.setText("Request To Supplier");
        titleJlabel.setMaximumSize(new java.awt.Dimension(170, 30));
        titleJlabel.setMinimumSize(new java.awt.Dimension(170, 30));
        titleJlabel.setPreferredSize(new java.awt.Dimension(170, 30));

        requestBtn.setBackground(new java.awt.Color(204, 204, 204));
        requestBtn.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        requestBtn.setText("Request");
        requestBtn.setMaximumSize(new java.awt.Dimension(90, 30));
        requestBtn.setMinimumSize(new java.awt.Dimension(90, 30));
        requestBtn.setPreferredSize(new java.awt.Dimension(90, 30));
        requestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestBtnActionPerformed(evt);
            }
        });

        supplierListJlabel.setFont(new java.awt.Font("Futura", 1, 18)); // NOI18N
        supplierListJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        supplierListJlabel.setText("Supplier List:");
        supplierListJlabel.setMaximumSize(new java.awt.Dimension(120, 30));
        supplierListJlabel.setMinimumSize(new java.awt.Dimension(120, 30));
        supplierListJlabel.setPreferredSize(new java.awt.Dimension(120, 30));

        requireJtable.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        requireJtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Location", "Enterprise Name", "Enterprise Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        requireJtable.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(requireJtable);

        supplierListJlabel1.setFont(new java.awt.Font("Futura", 1, 18)); // NOI18N
        supplierListJlabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        supplierListJlabel1.setText("Cargo Require:");
        supplierListJlabel1.setMaximumSize(new java.awt.Dimension(120, 30));
        supplierListJlabel1.setMinimumSize(new java.awt.Dimension(120, 30));
        supplierListJlabel1.setPreferredSize(new java.awt.Dimension(120, 30));

        supplierListJlabel2.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        supplierListJlabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        supplierListJlabel2.setText("Finish Date:");
        supplierListJlabel2.setMaximumSize(new java.awt.Dimension(120, 30));
        supplierListJlabel2.setMinimumSize(new java.awt.Dimension(120, 30));
        supplierListJlabel2.setPreferredSize(new java.awt.Dimension(120, 30));

        requireJlabel1.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        requireJlabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        requireJlabel1.setText("Product Name:");
        requireJlabel1.setMaximumSize(new java.awt.Dimension(150, 30));
        requireJlabel1.setMinimumSize(new java.awt.Dimension(120, 30));
        requireJlabel1.setPreferredSize(new java.awt.Dimension(150, 30));

        nameJlabel.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        nameJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameJlabel.setText("value");
        nameJlabel.setMaximumSize(new java.awt.Dimension(150, 30));
        nameJlabel.setMinimumSize(new java.awt.Dimension(120, 30));
        nameJlabel.setPreferredSize(new java.awt.Dimension(150, 30));

        requireJlabel2.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        requireJlabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        requireJlabel2.setText("Product Quantity:");
        requireJlabel2.setMaximumSize(new java.awt.Dimension(150, 30));
        requireJlabel2.setMinimumSize(new java.awt.Dimension(120, 30));
        requireJlabel2.setPreferredSize(new java.awt.Dimension(150, 30));

        quantityJlabel.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        quantityJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantityJlabel.setText("value");
        quantityJlabel.setMaximumSize(new java.awt.Dimension(150, 30));
        quantityJlabel.setMinimumSize(new java.awt.Dimension(120, 30));
        quantityJlabel.setPreferredSize(new java.awt.Dimension(150, 30));

        requireJlabel3.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        requireJlabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        requireJlabel3.setText("Retail Price:");
        requireJlabel3.setMaximumSize(new java.awt.Dimension(150, 30));
        requireJlabel3.setMinimumSize(new java.awt.Dimension(120, 30));
        requireJlabel3.setPreferredSize(new java.awt.Dimension(150, 30));

        priceJlabel.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        priceJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        priceJlabel.setText("value");
        priceJlabel.setMaximumSize(new java.awt.Dimension(150, 30));
        priceJlabel.setMinimumSize(new java.awt.Dimension(120, 30));
        priceJlabel.setPreferredSize(new java.awt.Dimension(150, 30));

        jpg.setFont(new java.awt.Font("Futura", 0, 13)); // NOI18N
        jpg.setString("40%");
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
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(supplierListJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(requestBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(supplierListJlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jpg, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(titleJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(supplierListJlabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(requireJlabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jst, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(requireJlabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(309, 309, 309))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(363, 363, 363)
                            .addComponent(quantityJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(177, 177, 177)
                            .addComponent(priceJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(177, 177, 177)
                            .addComponent(requireJlabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(32, 32, 32)
                            .addComponent(nameJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(755, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(titleJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(supplierListJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(supplierListJlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(requireJlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(quantityJlabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(requireJlabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(requireJlabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(priceJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addComponent(supplierListJlabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(backJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                            .addComponent(requestBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpg, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(173, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userJpanel.remove(this);
        Component[] componentArray = userJpanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        PurchaseManagerJPanel sellerInterface = (PurchaseManagerJPanel) component;
        sellerInterface.populateTable();
        CardLayout layout = (CardLayout) userJpanel.getLayout();
        layout.previous(userJpanel);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void requestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestBtnActionPerformed
        int selectedRow = requireJtable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please at least select a supplier", "VIEW", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
        Enterprise supplierEnterprise = (Enterprise) requireJtable.getValueAt(selectedRow, 1);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(jst.getDate());
        
        this.orderRequest.setResult("Send to Supplier");
        this.orderRequest.setMessage("Send to Assign Worker");
        //String month = monthJtext.getText();
       // String day = dayJtext.getText();
        //String year = yearJtext.getText();
        //if (judgeValid(month, day, year) == false) {
           // return;
       // }
       // String requireDate = month + "-" + day + "-" + year;
        
       
        ProductRequest request = new ProductRequest(userAccount, "", date);
        request.setName(orderRequest.getName());
        request.setQuantity(orderRequest.getQuantity());
        request.setSenderEnterprise(enterprise);
        request.setReceiveEnterprise(supplierEnterprise);
        request.setCargoDirectory(orderRequest.getOrder().getCargoDirectory());

        
        ArrayList<Organization> orgList = new ArrayList<Organization>();
        for (Organization organization : supplierEnterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof AssignWorkerOrg) {
                orgList.add(organization);
            }
        }
        
        for (Organization organization : orgList) {
            organization.getWorkQueue().getWorkRequestList().add(request);
            for (UserAccount useraccount : organization.getUserAccountDirectory().getUserAccountList()) {
                useraccount.getWorkQueue().getWorkRequestList().add(request);
            }
        }
        request.setStatus("Send to Supplier...");
        
        JOptionPane.showMessageDialog(null, "Your Request has been sumbit", "SUBMIT", JOptionPane.INFORMATION_MESSAGE);
        jpg.setValue(50);
        jpg.setString("50%");
    }//GEN-LAST:event_requestBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JProgressBar jpg;
    private com.toedter.calendar.JDateChooser jst;
    private javax.swing.JLabel nameJlabel;
    private javax.swing.JLabel priceJlabel;
    private javax.swing.JLabel quantityJlabel;
    private javax.swing.JButton requestBtn;
    private javax.swing.JLabel requireJlabel1;
    private javax.swing.JLabel requireJlabel2;
    private javax.swing.JLabel requireJlabel3;
    private javax.swing.JTable requireJtable;
    private javax.swing.JLabel supplierListJlabel;
    private javax.swing.JLabel supplierListJlabel1;
    private javax.swing.JLabel supplierListJlabel2;
    private javax.swing.JLabel titleJlabel;
    // End of variables declaration//GEN-END:variables
}
