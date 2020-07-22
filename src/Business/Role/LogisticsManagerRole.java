package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.SupplierRole.LogisticsManagerJPanel;

/**
 *
 * @author Kiksuya
 */
public class LogisticsManagerRole extends Role {

    public LogisticsManagerRole(String roleType) {
        super(roleType);
    }

    @Override
    public JPanel createWorkArea(JPanel userJpanel, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new LogisticsManagerJPanel(userJpanel,account);
    }
}
