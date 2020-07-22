package Business.Organization;

import Business.Role.OrderManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Shijun
 */
public class OrderOrg extends Organization {

    public OrderOrg(Type orgType/*, int enterpriseID, int orgID*/) {
        super(orgType.getValue(), orgType /*, enterpriseID, orgID*/);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
 //       int orgID = this.getOrganizationID();
//        int enterpriseID = this.getEnterpriseID();

        return new ArrayList<Role>() {
            {
                add(new OrderManagerRole(Role.RoleType.OrderManager.getValue()/*, orgID, enterpriseID)*/));
            }
        };
    }

}
