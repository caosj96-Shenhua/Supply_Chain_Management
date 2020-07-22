package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.FactoryRole.PurchaseManagerJPanel;

/**
 *
 * @author Shijun
 */
public class Agent extends Role{

    public Agent(String roleType){
        super(roleType);
    }
    
    @Override
    public JPanel createWorkArea(JPanel userJpanel, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new PurchaseManagerJPanel(userJpanel, enterprise, organization, account, business.getNetworkDirectory());
    }
    
}
