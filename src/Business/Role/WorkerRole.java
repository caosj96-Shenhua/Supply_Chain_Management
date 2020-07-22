package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.SupplierRole.WorkerJPanel;

/**
 *
 * @author Shijun
 */
public class WorkerRole extends Role {

    public WorkerRole(String roleType){
        super(roleType);
    }
    
    @Override
    public JPanel createWorkArea(JPanel userJpanel, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new WorkerJPanel(userJpanel, account);
    }
    
}
