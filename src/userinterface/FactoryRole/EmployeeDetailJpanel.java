package userinterface.FactoryRole;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author zhanghaojie
 */
public class EmployeeDetailJpanel extends javax.swing.JPanel {

    private JPanel userJpanel;
    private Employee employee;

    public EmployeeDetailJpanel(JPanel userJpanel, Enterprise enterprise, Organization org, Employee employee) {
        this.userJpanel = userJpanel;
        this.employee = employee;
        initComponents();
        valueJlabel.setText(enterprise.getEnterpriseName());
        orgValueJlabel.setText(org.getName());
        initData();
    }

    private void initData() {
        nameJtext.setText(employee.getName());
        LocJtext.setText(employee.getLocation());
        ageJtext.setText(String.valueOf(employee.getAge()));
        orgTypeJtext.setText(employee.getOrgType().getValue());
        salaryJtext.setText(String.valueOf(employee.getSalary()));
        regTimeJtext.setText(employee.getRegisterTime().toString());
    }

    private void setTextEnable(boolean f) {
        LocJtext.setEnabled(f);
        ageJtext.setEnabled(f);
        salaryJtext.setEnabled(f);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        orgJlabel = new javax.swing.JLabel();
        orgValueJlabel = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        titleJlabel = new javax.swing.JLabel();
        enterpriseJlabel = new javax.swing.JLabel();
        valueJlabel = new javax.swing.JLabel();
        BackBtn = new javax.swing.JButton();
        nameJlabel = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        nameJtext = new javax.swing.JTextField();
        sexJlabel = new javax.swing.JLabel();
        LocJtext = new javax.swing.JTextField();
        ageJlabel = new javax.swing.JLabel();
        ageJtext = new javax.swing.JTextField();
        orgTypeJlabel = new javax.swing.JLabel();
        orgTypeJtext = new javax.swing.JTextField();
        salaryJlabel = new javax.swing.JLabel();
        salaryJtext = new javax.swing.JTextField();
        regTimeJlabel = new javax.swing.JLabel();
        regTimeJtext = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(244, 238, 236));

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

        titleJlabel.setFont(new java.awt.Font("Futura", 1, 48)); // NOI18N
        titleJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleJlabel.setText("Employee Data");
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

        nameJlabel.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        nameJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameJlabel.setText("Name:");
        nameJlabel.setMaximumSize(new java.awt.Dimension(120, 30));
        nameJlabel.setMinimumSize(new java.awt.Dimension(120, 30));
        nameJlabel.setPreferredSize(new java.awt.Dimension(120, 30));

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

        nameJtext.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        nameJtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nameJtext.setEnabled(false);
        nameJtext.setMaximumSize(new java.awt.Dimension(120, 30));
        nameJtext.setMinimumSize(new java.awt.Dimension(120, 30));
        nameJtext.setPreferredSize(new java.awt.Dimension(120, 30));

        sexJlabel.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        sexJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sexJlabel.setText("Location:");
        sexJlabel.setMaximumSize(new java.awt.Dimension(120, 30));
        sexJlabel.setMinimumSize(new java.awt.Dimension(120, 30));
        sexJlabel.setPreferredSize(new java.awt.Dimension(120, 30));

        LocJtext.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        LocJtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        LocJtext.setEnabled(false);
        LocJtext.setMaximumSize(new java.awt.Dimension(120, 30));
        LocJtext.setMinimumSize(new java.awt.Dimension(120, 30));
        LocJtext.setPreferredSize(new java.awt.Dimension(120, 30));

        ageJlabel.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        ageJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ageJlabel.setText("Age:");
        ageJlabel.setMaximumSize(new java.awt.Dimension(120, 30));
        ageJlabel.setMinimumSize(new java.awt.Dimension(120, 30));
        ageJlabel.setPreferredSize(new java.awt.Dimension(120, 30));

        ageJtext.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        ageJtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ageJtext.setEnabled(false);
        ageJtext.setMaximumSize(new java.awt.Dimension(120, 30));
        ageJtext.setMinimumSize(new java.awt.Dimension(120, 30));
        ageJtext.setPreferredSize(new java.awt.Dimension(120, 30));

        orgTypeJlabel.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        orgTypeJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        orgTypeJlabel.setText("Organization:");
        orgTypeJlabel.setMaximumSize(new java.awt.Dimension(120, 30));
        orgTypeJlabel.setMinimumSize(new java.awt.Dimension(120, 30));
        orgTypeJlabel.setPreferredSize(new java.awt.Dimension(120, 30));

        orgTypeJtext.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        orgTypeJtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        orgTypeJtext.setEnabled(false);
        orgTypeJtext.setMaximumSize(new java.awt.Dimension(120, 30));
        orgTypeJtext.setMinimumSize(new java.awt.Dimension(120, 30));
        orgTypeJtext.setPreferredSize(new java.awt.Dimension(120, 30));

        salaryJlabel.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        salaryJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salaryJlabel.setText("Salary:");
        salaryJlabel.setMaximumSize(new java.awt.Dimension(120, 30));
        salaryJlabel.setMinimumSize(new java.awt.Dimension(120, 30));
        salaryJlabel.setPreferredSize(new java.awt.Dimension(120, 30));

        salaryJtext.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        salaryJtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        salaryJtext.setEnabled(false);
        salaryJtext.setMaximumSize(new java.awt.Dimension(120, 30));
        salaryJtext.setMinimumSize(new java.awt.Dimension(120, 30));
        salaryJtext.setPreferredSize(new java.awt.Dimension(120, 30));

        regTimeJlabel.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        regTimeJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        regTimeJlabel.setText("Reg Time:");
        regTimeJlabel.setMaximumSize(new java.awt.Dimension(120, 30));
        regTimeJlabel.setMinimumSize(new java.awt.Dimension(120, 30));
        regTimeJlabel.setPreferredSize(new java.awt.Dimension(120, 30));

        regTimeJtext.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        regTimeJtext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        regTimeJtext.setEnabled(false);
        regTimeJtext.setMaximumSize(new java.awt.Dimension(120, 30));
        regTimeJtext.setMinimumSize(new java.awt.Dimension(120, 30));
        regTimeJtext.setPreferredSize(new java.awt.Dimension(120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(enterpriseJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(ageJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(ageJtext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(nameJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(nameJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(salaryJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(salaryJtext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(orgJlabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(115, 115, 115)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(orgValueJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(valueJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(sexJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(LocJtext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(orgTypeJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(orgTypeJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(regTimeJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(regTimeJtext, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(2, 2, 2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(titleJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(636, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addComponent(titleJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orgJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orgValueJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameJtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sexJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LocJtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageJtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orgTypeJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orgTypeJtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salaryJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salaryJtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regTimeJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regTimeJtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(219, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        setTextEnable(true);
    }//GEN-LAST:event_updateBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        userJpanel.remove(this);
        Component[] componentArray = userJpanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        HRManager financialInterface = (HRManager) component;
        financialInterface.populateTable();
        CardLayout layout = (CardLayout) userJpanel.getLayout();
        layout.previous(userJpanel);
    }//GEN-LAST:event_BackBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        employee.setAge(Integer.parseInt(ageJtext.getText()));
        employee.setLocation(LocJtext.getText());
        employee.setSalary(Double.parseDouble(salaryJtext.getText()));

        JOptionPane.showMessageDialog(null, "Update succeed", "UPDATE", JOptionPane.INFORMATION_MESSAGE);
        setTextEnable(false);
    }//GEN-LAST:event_saveBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JTextField LocJtext;
    private javax.swing.JLabel ageJlabel;
    private javax.swing.JTextField ageJtext;
    private javax.swing.JLabel enterpriseJlabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nameJlabel;
    private javax.swing.JTextField nameJtext;
    private javax.swing.JLabel orgJlabel;
    private javax.swing.JLabel orgTypeJlabel;
    private javax.swing.JTextField orgTypeJtext;
    private javax.swing.JLabel orgValueJlabel;
    private javax.swing.JLabel regTimeJlabel;
    private javax.swing.JTextField regTimeJtext;
    private javax.swing.JLabel salaryJlabel;
    private javax.swing.JTextField salaryJtext;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel sexJlabel;
    private javax.swing.JLabel titleJlabel;
    private javax.swing.JButton updateBtn;
    private javax.swing.JLabel valueJlabel;
    // End of variables declaration//GEN-END:variables
}
