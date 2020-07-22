package Business.Organization;

import Business.Role.FactoryAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Shijun
 */
public class FactoryAdminOrg extends Organization {

    public FactoryAdminOrg(Type orgType) {
        super(orgType.getValue(), orgType);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
      
        
        return new ArrayList<Role>() {
            {
                add(new FactoryAdminRole(Role.RoleType.FactoryAdmin.getValue()));
            }
        };
    }

}
