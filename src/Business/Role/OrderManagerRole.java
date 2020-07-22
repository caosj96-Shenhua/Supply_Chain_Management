package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.FactoryRole.OrderManagerJPanel;

/**
 *
 * @author Kiksuya
 */
public class OrderManagerRole extends Role {

    public OrderManagerRole(String roleType) {
        super(roleType);
    }

    @Override
    public JPanel createWorkArea(JPanel userJpanel, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new OrderManagerJPanel(userJpanel, enterprise, organization, account);
    }
}
