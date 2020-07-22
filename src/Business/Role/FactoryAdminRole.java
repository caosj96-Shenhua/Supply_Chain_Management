package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.AdministrativeRole.Factory_AdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Shijun
 */
public class FactoryAdminRole extends Role{

    public FactoryAdminRole(String roleType) {
        super(roleType);
    }

    @Override
    public JPanel createWorkArea(JPanel userJpanel, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new Factory_AdminWorkAreaJPanel(userJpanel, enterprise, business);
    }
    
}
