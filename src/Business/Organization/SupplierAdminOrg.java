package Business.Organization;

import Business.Role.Role;
import Business.Role.SupplierAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Shijun
 */
public class SupplierAdminOrg extends Organization {

    public SupplierAdminOrg(Type orgType /*, int enterpriseID, int orgID*/) {
        super(orgType.getValue(), orgType /*, enterpriseID, orgID*/);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
//        int orgID = this.getOrganizationID();
//        int enterpriseID = this.getEnterpriseID();
        
        return new ArrayList<Role>() {
            {
                add(new SupplierAdminRole(Role.RoleType.SupplierAdmin.getValue() /*, orgID, enterpriseID)*/));
            }
        };
    }

}
