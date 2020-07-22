package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.FactoryRole.HRManager;

/**
 *
 * @author Kiksuya
 */
public class HR_Role extends Role {

    public HR_Role(String roleType) {
        super(roleType);
    }

    @Override
    public JPanel createWorkArea(JPanel userJpanel, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new HRManager(userJpanel, enterprise, organization, account);
    }
}
