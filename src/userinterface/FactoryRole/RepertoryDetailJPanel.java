package userinterface.FactoryRole;


import Business.Enterprise.Cargo;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author zhanghaojie
 */
public class RepertoryDetailJPanel extends javax.swing.JPanel {

    private JPanel userJpanel;
    private Cargo cargo;

    public RepertoryDetailJPanel(JPanel userJpanel, Cargo cargo) {
        this.userJpanel = userJpanel;
        this.cargo = cargo;
        initComponents();
        InitData();
    }

    private void InitData() {
        cargoNameJtext.setText(cargo.getCargoName());
        quantityJtext.setText(String.valueOf(cargo.getQuantity()));
        priceJtext.setText(String.valueOf(cargo.getPrice()));
    }

    private void setTextEnable(boolean f) {
        cargoNameJtext.setEnabled(f);
        quantityJtext.setEnabled(f);
        priceJtext.setEnabled(f);
    }

    private boolean CheckValid(String cargoName, String quantity, String price) {
        if (cargoName == null || cargoName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please input the Cargo Name", "SAVE", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (quantity == null || quantity.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please input the Cargo Quantity", "SAVE", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (isNumber(quantity) == false) {
            JOptionPane.showMessageDialog(null, "Quantity should be a number instead of letters:\"" + quantity + "\"", "SAVE", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (price == null || price.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please input the Cargo Price", "SAVE", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (isNumber(price) == false) {
            JOptionPane.showMessageDialog(null, "Price should be a number instead of letters:\"" + price + "\"", "SAVE", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    private boolean isNumber(String str) {
        String reg = "^[0-9]+(.[0-9]+)?$";
        return str.matches(reg);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        valueJlabel = new javax.swing.JLabel();
        BackBtn = new javax.swing.JButton();
        cargoNameJlabel = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        cargoNameJtext = new javax.swing.JTextField();
        orgJlabel = new javax.swing.JLabel();
        orgValueJlabel = new javax.swing.JLabel();
        quantityJlabel = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        quantityJtext = new javax.swing.JTextField();
        titleJlabel = new javax.swing.JLabel();
        enterpriseJlabel = new javax.swing.JLabel();
        priceJlabel = new javax.swing.JLabel();
        priceJtext = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(244, 238, 236));

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

        cargoNameJlabel.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        cargoNameJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cargoNameJlabel.setText("Cargo Name:");
        cargoNameJlabel.setMaximumSize(new java.awt.Dimension(120, 30));
        cargoNameJlabel.setMinimumSize(new java.awt.Dimension(120, 30));
        cargoNameJlabel.setPreferredSize(new java.awt.Dimension(120, 30));

        saveBtn.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        saveBtn.setText("Save");
        saveBtn.setMaximumSize(new java.awt.Dimension(90, 30));
        saveBtn.setMinimumSize(new java.awt.Dimension(90, 30));
        saveBtn.setPreferredSize(new java.awt.Dimension(90, 30));
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        cargoNameJtext.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        cargoNameJtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cargoNameJtext.setEnabled(false);
        cargoNameJtext.setMaximumSize(new java.awt.Dimension(120, 30));
        cargoNameJtext.setMinimumSize(new java.awt.Dimension(120, 30));
        cargoNameJtext.setPreferredSize(new java.awt.Dimension(120, 30));

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

        quantityJlabel.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        quantityJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantityJlabel.setText("Quantity:");
        quantityJlabel.setMaximumSize(new java.awt.Dimension(120, 30));
        quantityJlabel.setMinimumSize(new java.awt.Dimension(120, 30));
        quantityJlabel.setPreferredSize(new java.awt.Dimension(120, 30));

        updateBtn.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        updateBtn.setText("Update");
        updateBtn.setMaximumSize(new java.awt.Dimension(90, 30));
        updateBtn.setMinimumSize(new java.awt.Dimension(90, 30));
        updateBtn.setPreferredSize(new java.awt.Dimension(90, 30));
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        quantityJtext.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        quantityJtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        quantityJtext.setEnabled(false);
        quantityJtext.setMaximumSize(new java.awt.Dimension(120, 30));
        quantityJtext.setMinimumSize(new java.awt.Dimension(120, 30));
        quantityJtext.setPreferredSize(new java.awt.Dimension(120, 30));

        titleJlabel.setFont(new java.awt.Font("Futura", 1, 48)); // NOI18N
        titleJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleJlabel.setText("Repertory Detail");
        titleJlabel.setMaximumSize(new java.awt.Dimension(170, 30));
        titleJlabel.setMinimumSize(new java.awt.Dimension(170, 30));
        titleJlabel.setPreferredSize(new java.awt.Dimension(170, 30));

        enterpriseJlabel.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        enterpriseJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enterpriseJlabel.setText("Enterprise:");
        enterpriseJlabel.setMaximumSize(new java.awt.Dimension(120, 30));
        enterpriseJlabel.setMinimumSize(new java.awt.Dimension(120, 30));
        enterpriseJlabel.setPreferredSize(new java.awt.Dimension(120, 30));

        priceJlabel.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        priceJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        priceJlabel.setText("Price:");
        priceJlabel.setMaximumSize(new java.awt.Dimension(120, 30));
        priceJlabel.setMinimumSize(new java.awt.Dimension(120, 30));
        priceJlabel.setPreferredSize(new java.awt.Dimension(120, 30));

        priceJtext.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        priceJtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        priceJtext.setEnabled(false);
        priceJtext.setMaximumSize(new java.awt.Dimension(120, 30));
        priceJtext.setMinimumSize(new java.awt.Dimension(120, 30));
        priceJtext.setPreferredSize(new java.awt.Dimension(120, 30));

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
                        .addGap(135, 135, 135)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(orgJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cargoNameJlabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(quantityJlabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(enterpriseJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(orgValueJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(valueJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cargoNameJtext, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(quantityJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(priceJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(priceJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(titleJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(672, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addComponent(titleJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orgJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orgValueJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cargoNameJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cargoNameJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantityJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(257, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        userJpanel.remove(this);
        Component[] componentArray = userJpanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        AddShoesJpanel storeJpanel = (AddShoesJpanel) component;
        storeJpanel.populateStoreTable();
        CardLayout layout = (CardLayout) userJpanel.getLayout();
        layout.previous(userJpanel);
    }//GEN-LAST:event_BackBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        String cargoName = cargoNameJtext.getText();
        String quantityStr = quantityJtext.getText();
        String priceStr = priceJtext.getText();
        if (!CheckValid(cargoName, quantityStr, priceStr)) {
            return;
        }

        cargo.setCargoName(cargoName);
        cargo.setQuantity(Integer.parseInt(quantityStr));
        cargo.setPrice(Integer.parseInt(priceStr));

        JOptionPane.showMessageDialog(null, "Save succeed", "SAVE", JOptionPane.INFORMATION_MESSAGE);
        setTextEnable(false);
    }//GEN-LAST:event_saveBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        setTextEnable(true);
    }//GEN-LAST:event_updateBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JLabel cargoNameJlabel;
    private javax.swing.JTextField cargoNameJtext;
    private javax.swing.JLabel enterpriseJlabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel orgJlabel;
    private javax.swing.JLabel orgValueJlabel;
    private javax.swing.JLabel priceJlabel;
    private javax.swing.JTextField priceJtext;
    private javax.swing.JLabel quantityJlabel;
    private javax.swing.JTextField quantityJtext;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel titleJlabel;
    private javax.swing.JButton updateBtn;
    private javax.swing.JLabel valueJlabel;
    // End of variables declaration//GEN-END:variables
}
