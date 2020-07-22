package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Network.NetworkDirectory;
import Business.Organization.Organization;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author zhanghaojie
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userContainer;
    private EcoSystem ecosystem;

    public SystemAdminWorkAreaJPanel(JPanel userContainer, EcoSystem ecosystem) {
        initComponents();
        this.userContainer = userContainer;
        this.ecosystem = ecosystem;
        populateTree();
    }

    public void populateTree(){
        DefaultTreeModel model=(DefaultTreeModel)structureTree.getModel();
        ArrayList<Network> networkList=ecosystem.getNetworkDirectory().getNetworkList();
        ArrayList<Enterprise> enterpriseList;
        ArrayList<Organization> organizationList;
        
        Network network;
        Enterprise enterprise;
        Organization organization;
        
        DefaultMutableTreeNode networks=new DefaultMutableTreeNode("Networks");
        DefaultMutableTreeNode root=(DefaultMutableTreeNode)model.getRoot();
        root.removeAllChildren();
        root.insert(networks, 0);
        
        DefaultMutableTreeNode networkNode;
        DefaultMutableTreeNode enterpriseNode;
        DefaultMutableTreeNode organizationNode;
        
        for(int i=0;i<networkList.size();i++){
            network=networkList.get(i);
            networkNode=new DefaultMutableTreeNode(network.getName());
            networks.insert(networkNode, i);
            
            enterpriseList=network.getEnterpriseDirectory().getEnterpriseList();
            for(int j=0; j<enterpriseList.size();j++){
                enterprise=enterpriseList.get(j);
                enterpriseNode=new DefaultMutableTreeNode(enterprise.getEnterpriseName());
                networkNode.insert(enterpriseNode, j);
                
                organizationList=enterprise.getOrganizationDirectory().getOrganizationList();
                for(int k=0;k<organizationList.size();k++){
                    organization=organizationList.get(k);
                    organizationNode=new DefaultMutableTreeNode(organization.getName());
                    enterpriseNode.insert(organizationNode, k);
                }
            }
        }
        model.reload();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        manageJpanel = new javax.swing.JPanel();
        networkBtn = new javax.swing.JButton();
        adminBtn = new javax.swing.JButton();
        enterpriseBtn = new javax.swing.JButton();
        structureJpanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        structureTree = new javax.swing.JTree();
        selectedJlabel = new javax.swing.JLabel();
        nodeJlabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jSplitPane1.setDividerLocation(160);

        manageJpanel.setBackground(new java.awt.Color(102, 102, 102));

        networkBtn.setBackground(new java.awt.Color(153, 153, 153));
        networkBtn.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        networkBtn.setText("Manage Network");
        networkBtn.setMaximumSize(new java.awt.Dimension(130, 30));
        networkBtn.setMinimumSize(new java.awt.Dimension(130, 30));
        networkBtn.setPreferredSize(new java.awt.Dimension(130, 30));
        networkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkBtnActionPerformed(evt);
            }
        });

        adminBtn.setBackground(new java.awt.Color(153, 153, 153));
        adminBtn.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        adminBtn.setText("Enterprise Admin");
        adminBtn.setMaximumSize(new java.awt.Dimension(130, 30));
        adminBtn.setMinimumSize(new java.awt.Dimension(130, 30));
        adminBtn.setPreferredSize(new java.awt.Dimension(130, 30));
        adminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminBtnActionPerformed(evt);
            }
        });

        enterpriseBtn.setBackground(new java.awt.Color(153, 153, 153));
        enterpriseBtn.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        enterpriseBtn.setText("Enterprise");
        enterpriseBtn.setMaximumSize(new java.awt.Dimension(130, 30));
        enterpriseBtn.setMinimumSize(new java.awt.Dimension(130, 30));
        enterpriseBtn.setPreferredSize(new java.awt.Dimension(130, 30));
        enterpriseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout manageJpanelLayout = new javax.swing.GroupLayout(manageJpanel);
        manageJpanel.setLayout(manageJpanelLayout);
        manageJpanelLayout.setHorizontalGroup(
            manageJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(networkBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(manageJpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(enterpriseBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
            .addComponent(adminBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        manageJpanelLayout.setVerticalGroup(
            manageJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageJpanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(networkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159)
                .addComponent(enterpriseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173)
                .addComponent(adminBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(843, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(manageJpanel);

        structureJpanel.setBackground(new java.awt.Color(102, 102, 102));
        structureJpanel.setPreferredSize(new java.awt.Dimension(370, 460));

        structureTree.setFont(new java.awt.Font("Futura", 0, 12)); // NOI18N
        structureTree.setPreferredSize(new java.awt.Dimension(290, 300));
        structureTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                structureTreeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(structureTree);

        selectedJlabel.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        selectedJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selectedJlabel.setText("Selected:");
        selectedJlabel.setMaximumSize(new java.awt.Dimension(90, 30));
        selectedJlabel.setMinimumSize(new java.awt.Dimension(90, 30));
        selectedJlabel.setPreferredSize(new java.awt.Dimension(90, 30));

        nodeJlabel.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        nodeJlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nodeJlabel.setMaximumSize(new java.awt.Dimension(200, 30));
        nodeJlabel.setMinimumSize(new java.awt.Dimension(90, 30));
        nodeJlabel.setPreferredSize(new java.awt.Dimension(200, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/1612bc5353364737fbaa2f94eac9bcd0.gif"))); // NOI18N

        javax.swing.GroupLayout structureJpanelLayout = new javax.swing.GroupLayout(structureJpanel);
        structureJpanel.setLayout(structureJpanelLayout);
        structureJpanelLayout.setHorizontalGroup(
            structureJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(structureJpanelLayout.createSequentialGroup()
                .addGroup(structureJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(structureJpanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1))
                    .addGroup(structureJpanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(structureJpanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(structureJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(structureJpanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(selectedJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(structureJpanelLayout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(nodeJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        structureJpanelLayout.setVerticalGroup(
            structureJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(structureJpanelLayout.createSequentialGroup()
                .addGroup(structureJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(structureJpanelLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(selectedJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nodeJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(structureJpanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addContainerGap(696, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(structureJpanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 893, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void networkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkBtnActionPerformed
        ManageNetworkJPanel mngNetworkJpanel = new ManageNetworkJPanel(userContainer, ecosystem);
        userContainer.add("mngNetworkJPanel", mngNetworkJpanel);
        CardLayout layout = (CardLayout) userContainer.getLayout();
        layout.next(userContainer);
    }//GEN-LAST:event_networkBtnActionPerformed

    private void enterpriseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseBtnActionPerformed
        ManageEnterpriseJPanel mngEnterpriseJpanel = new ManageEnterpriseJPanel(userContainer, ecosystem);
        userContainer.add("mngEnterpriseJPanel", mngEnterpriseJpanel);
        CardLayout layout = (CardLayout) userContainer.getLayout();
        layout.next(userContainer);
    }//GEN-LAST:event_enterpriseBtnActionPerformed

    private void adminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminBtnActionPerformed
        ManageEnterpriseAdminJPanel mngAdminJPanel = new ManageEnterpriseAdminJPanel(userContainer, ecosystem);
        userContainer.add("mngAdminJPanel", mngAdminJPanel);
        CardLayout layout = (CardLayout) userContainer.getLayout();
        layout.next(userContainer);
    }//GEN-LAST:event_adminBtnActionPerformed

    private void structureTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_structureTreeValueChanged
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) structureTree.getLastSelectedPathComponent();
        if (selectedNode != null) {
            nodeJlabel.setText(selectedNode.toString());
        }
    }//GEN-LAST:event_structureTreeValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminBtn;
    private javax.swing.JButton enterpriseBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel manageJpanel;
    private javax.swing.JButton networkBtn;
    private javax.swing.JLabel nodeJlabel;
    private javax.swing.JLabel selectedJlabel;
    private javax.swing.JPanel structureJpanel;
    private javax.swing.JTree structureTree;
    // End of variables declaration//GEN-END:variables
}
