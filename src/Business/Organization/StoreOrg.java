package Business.Organization;

import Business.Role.Role;
import Business.Role.StoreManagerRole;
import java.util.ArrayList;

/**
 *
 * @author Shijun
 */
public class StoreOrg extends Organization {

    public StoreOrg(Type orgType ) {
        super(orgType.getValue(), orgType );
    }

    @Override
    public ArrayList<Role> getSupportedRole() {

        
        return new ArrayList<Role>() {
            {
                add(new StoreManagerRole(Role.RoleType.StoreManager.getValue()) );
            }
        };
    }

}
