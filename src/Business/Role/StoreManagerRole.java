package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.CargoDirectory;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.FactoryRole.StoreManagerJPanel;

/**
 *
 * @author Kiksuya
 */
public class StoreManagerRole extends Role {

    private CargoDirectory storeCargoDirectory;

    public StoreManagerRole(String roleType ) {
        super(roleType );
        this.storeCargoDirectory = new CargoDirectory();
    }

    public CargoDirectory getStoreCargoDirectory() {
        return storeCargoDirectory;
    }

    public void setStoreCargoDirectory(CargoDirectory storeCargoDirectory) {
        this.storeCargoDirectory = storeCargoDirectory;
    }

    @Override
    public JPanel createWorkArea(JPanel userJpanel, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new StoreManagerJPanel(userJpanel, enterprise, organization, account);
    }
}
