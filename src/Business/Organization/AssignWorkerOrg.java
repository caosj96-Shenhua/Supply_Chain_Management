package Business.Organization;

import Business.Role.Role;
import Business.Role.AssignWorkerManagerRole;
import java.util.ArrayList;

/**
 *
 * @author Shijun
 */
public class AssignWorkerOrg extends Organization {

    public AssignWorkerOrg(Type orgType/*, int enterpriseID, int orgID*/) {
        super(orgType.getValue(), orgType/*, enterpriseID, orgID*/);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
//        int orgID = this.getOrganizationID();
//        int enterpriseID = this.getEnterpriseID();
        return new ArrayList<Role>() {
            {
                add(new AssignWorkerManagerRole(Role.RoleType.AssignWorkerManager.getValue() /*, orgID, enterpriseID)*/));
            }
        };
    }

}
