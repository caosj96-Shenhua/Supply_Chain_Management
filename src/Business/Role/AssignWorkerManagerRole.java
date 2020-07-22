package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.SupplierRole.AssignWorkerManagerJPanel;

/**
 *
 * @author Shijun
 */
public class AssignWorkerManagerRole extends Role {

    public AssignWorkerManagerRole(String roleType){
        super(roleType);
    }
    
    @Override
    public JPanel createWorkArea(JPanel userJpanel, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new AssignWorkerManagerJPanel(userJpanel, account, enterprise, organization);
    }
    
}
