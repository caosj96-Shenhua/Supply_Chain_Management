package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.AdministrativeRole.Supplier_AdminWorkAreaInterfaceJPanel;

/**
 *
 * @author Kiksuya
 */
public class SupplierAdminRole extends Role{

    public SupplierAdminRole(String roleType) {
        super(roleType);
    }

    @Override
    public JPanel createWorkArea(JPanel userJpanel, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new Supplier_AdminWorkAreaInterfaceJPanel(userJpanel, enterprise, business);
    }
    
    
}
