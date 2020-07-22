package Business.Organization;

import Business.Role.LogisticsManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Shijun
 */
public class LogisticsOrg extends Organization {

    public LogisticsOrg(Type orgType/*, int enterpriseID, int orgID*/) {
        super(orgType.getValue(), orgType /*, enterpriseID, orgID*/);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
    //    int orgID = this.getOrganizationID();
    //    int enterpriseID = this.getEnterpriseID();
        return new ArrayList<Role>() {
            {
                add(new LogisticsManagerRole(Role.RoleType.LogisticsManager.getValue()/*, orgID, enterpriseID)*/));
            }
        };
    }

}
