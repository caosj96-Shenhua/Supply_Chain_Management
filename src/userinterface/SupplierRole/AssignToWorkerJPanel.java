package userinterface.SupplierRole;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.AssignWorkerOrg;
import Business.Organization.Organization;
import Business.Organization.WorkerOrg;
import Business.Organization.LogisticsOrg;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ProductRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Kiksuya
 */
public class AssignToWorkerJPanel extends javax.swing.JPanel {

    private JPanel userJpanel;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private Employee employee;
    private ProductRequest productRequest;
    
    public AssignToWorkerJPanel(JPanel userJpanel, UserAccount userAccount, Enterprise enterprise, /*Employee  employee, */ProductRequest request) {
        this.userJpanel = userJpanel;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
//        this.employee = employee;
        this.productRequest = request;
        initComponents();
        valueJlabel.setText(enterprise.getEnterpriseName());
//        nameJlabel.setText(employee.getName());
        nameJlabel.setText(userAccount.getUsername());
        ageJlabel.setText(String.valueOf(userAccount.getEmployee().getAge()));
        salaryJlabel.setText(String.valueOf(userAccount.getEmployee().getSalary()));
        regTimeJlabel.setText(userAccount.getEmployee().getRegisterTime().toString());
        jpg.setValue(50);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enterpriseJlabel = new javax.swing.JLabel();
        valueJlabel = new javax.swing.JLabel();
        titleJlabel = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        submitJButton = new javax.swing.JButton();
        workerNameJlabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        enterpriseJlabel1 = new javax.swing.JLabel();
        enterpriseJlabel2 = new javax.swing.JLabel();
        enterpriseJlabel3 = new javax.swing.JLabel();
        ageJlabel = new javax.swing.JLabel();
        regTimeJlabel = new javax.swing.JLabel();
        salaryJlabel = new javax.swing.JLabel();
        nameJlabel = new javax.swing.JLabel();
        jpg = new javax.swing.JProgressBar();

        setBackground(new java.awt.Color(244, 238, 236));

        enterpriseJlabel.setFont(new java.awt.Font("Futura", 0, 22)); // NOI18N
        enterpriseJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enterpriseJlabel.setText("Enterprise:");
        enterpriseJlabel.setMaximumSize(new java.awt.Dimension(120, 30));
        enterpriseJlabel.setMinimumSize(new java.awt.Dimension(120, 30));
        enterpriseJlabel.setPreferredSize(new java.awt.Dimension(120, 30));

        valueJlabel.setFont(new java.awt.Font("Futura", 0, 22)); // NOI18N
        valueJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        valueJlabel.setText("value");
        valueJlabel.setMaximumSize(new java.awt.Dimension(120, 30));
        valueJlabel.setMinimumSize(new java.awt.Dimension(120, 30));
        valueJlabel.setPreferredSize(new java.awt.Dimension(120, 30));

        titleJlabel.setFont(new java.awt.Font("Futura", 1, 48)); // NOI18N
        titleJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleJlabel.setText("Assign to THIS Worker");
        titleJlabel.setMaximumSize(new java.awt.Dimension(170, 30));
        titleJlabel.setMinimumSize(new java.awt.Dimension(170, 30));
        titleJlabel.setPreferredSize(new java.awt.Dimension(170, 30));

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

        workerNameJlabel.setFont(new java.awt.Font("Futura", 0, 22)); // NOI18N
        workerNameJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        workerNameJlabel.setText("Worker Name:");
        workerNameJlabel.setMaximumSize(new java.awt.Dimension(120, 30));
        workerNameJlabel.setMinimumSize(new java.awt.Dimension(120, 30));
        workerNameJlabel.setPreferredSize(new java.awt.Dimension(120, 30));

        enterpriseJlabel1.setFont(new java.awt.Font("Futura", 0, 22)); // NOI18N
        enterpriseJlabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enterpriseJlabel1.setText("Age：");
        enterpriseJlabel1.setMaximumSize(new java.awt.Dimension(120, 30));
        enterpriseJlabel1.setMinimumSize(new java.awt.Dimension(120, 30));
        enterpriseJlabel1.setPreferredSize(new java.awt.Dimension(120, 30));

        enterpriseJlabel2.setFont(new java.awt.Font("Futura", 0, 22)); // NOI18N
        enterpriseJlabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enterpriseJlabel2.setText("Salary:");
        enterpriseJlabel2.setMaximumSize(new java.awt.Dimension(120, 30));
        enterpriseJlabel2.setMinimumSize(new java.awt.Dimension(120, 30));
        enterpriseJlabel2.setPreferredSize(new java.awt.Dimension(120, 30));

        enterpriseJlabel3.setFont(new java.awt.Font("Futura", 0, 22)); // NOI18N
        enterpriseJlabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enterpriseJlabel3.setText("Register Time:");
        enterpriseJlabel3.setMaximumSize(new java.awt.Dimension(120, 30));
        enterpriseJlabel3.setMinimumSize(new java.awt.Dimension(120, 30));
        enterpriseJlabel3.setPreferredSize(new java.awt.Dimension(120, 30));

        ageJlabel.setFont(new java.awt.Font("Futura", 0, 22)); // NOI18N
        ageJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ageJlabel.setText("value");
        ageJlabel.setMaximumSize(new java.awt.Dimension(120, 30));
        ageJlabel.setMinimumSize(new java.awt.Dimension(120, 30));
        ageJlabel.setPreferredSize(new java.awt.Dimension(120, 30));

        regTimeJlabel.setFont(new java.awt.Font("Futura", 0, 22)); // NOI18N
        regTimeJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        regTimeJlabel.setText("value");
        regTimeJlabel.setMaximumSize(new java.awt.Dimension(120, 30));
        regTimeJlabel.setMinimumSize(new java.awt.Dimension(120, 30));
        regTimeJlabel.setPreferredSize(new java.awt.Dimension(120, 30));

        salaryJlabel.setFont(new java.awt.Font("Futura", 0, 22)); // NOI18N
        salaryJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salaryJlabel.setText("value");
        salaryJlabel.setMaximumSize(new java.awt.Dimension(120, 30));
        salaryJlabel.setMinimumSize(new java.awt.Dimension(120, 30));
        salaryJlabel.setPreferredSize(new java.awt.Dimension(120, 30));

        nameJlabel.setFont(new java.awt.Font("Futura", 0, 22)); // NOI18N
        nameJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameJlabel.setText("value");
        nameJlabel.setMaximumSize(new java.awt.Dimension(120, 30));
        nameJlabel.setMinimumSize(new java.awt.Dimension(120, 30));
        nameJlabel.setPreferredSize(new java.awt.Dimension(120, 30));

        jpg.setFont(new java.awt.Font("Futura", 0, 13)); // NOI18N
        jpg.setString("60%");
        jpg.setStringPainted(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(titleJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(enterpriseJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(enterpriseJlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(enterpriseJlabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(81, 81, 81)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(37, 37, 37)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(valueJlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(nameJlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(ageJlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(salaryJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(regTimeJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(workerNameJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(enterpriseJlabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                    .addComponent(jpg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(352, 352, 352)
                                .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(657, 657, 657)
                        .addComponent(jLabel2)))
                .addContainerGap(569, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enterpriseJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(workerNameJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(enterpriseJlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(enterpriseJlabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(enterpriseJlabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpg, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(148, 148, 148))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(valueJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(nameJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(ageJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(salaryJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(regTimeJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userJpanel.remove(this);
        Component[] componentArray = userJpanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        AssignWorkerManagerJPanel generateInterface = (AssignWorkerManagerJPanel) component;
        generateInterface.populateRequestTable();
        CardLayout layout = (CardLayout) userJpanel.getLayout();
        layout.previous(userJpanel);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
 /*
         String message = messageJtext.getText();
        if (message == null || message.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please input the request message", "SUBMIT", JOptionPane.ERROR_MESSAGE);
            return;
        }
        */
        this.productRequest.setMessage("Assigned to worker");
        ArrayList<Organization> orgList = new ArrayList<Organization>();
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
//            if (organization instanceof WorkerOrg) {
            if (/*organization instanceof WorkerOrg ||*/ organization instanceof LogisticsOrg  ) {
                orgList.add(organization);
           //     organization.getWorkQueue().getWorkRequestList().add(productRequest);
            }
        }
        
        for (Organization organization : orgList) {
            organization.getWorkQueue().getWorkRequestList().add(this.productRequest);
            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                ua.getWorkQueue().getWorkRequestList().add(this.productRequest);
                //this.productRequest.setReceiver(ua); //set receiver
            }
        }
        
        /*
        for (Organization organization : orgList) {
            organization.getWorkQueue().getWorkRequestList().add(this.productRequest);
        }
*/
        userAccount.getWorkQueue().getWorkRequestList().add(this.productRequest);
        this.productRequest.setReceiver(userAccount);
        JOptionPane.showMessageDialog(null, "Submit OK!", "SUMBIT", JOptionPane.INFORMATION_MESSAGE);
        jpg.setValue(60);
        jpg.setString("60%");
    }//GEN-LAST:event_submitJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageJlabel;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel enterpriseJlabel;
    private javax.swing.JLabel enterpriseJlabel1;
    private javax.swing.JLabel enterpriseJlabel2;
    private javax.swing.JLabel enterpriseJlabel3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar jpg;
    private javax.swing.JLabel nameJlabel;
    private javax.swing.JLabel regTimeJlabel;
    private javax.swing.JLabel salaryJlabel;
    private javax.swing.JButton submitJButton;
    private javax.swing.JLabel titleJlabel;
    private javax.swing.JLabel valueJlabel;
    private javax.swing.JLabel workerNameJlabel;
    // End of variables declaration//GEN-END:variables
}
