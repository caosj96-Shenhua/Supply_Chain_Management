package Business.Organization;

import Business.Role.Role;
import Business.Role.Agent;
import java.util.ArrayList;

/**
 *
 * @author Shijun
 */
public class AgentOrg extends Organization {

    public AgentOrg(Type orgType/*, int enterpriseID*/) {
        super(orgType.getValue(), orgType/*, enterpriseID, orgID*/);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
         return new ArrayList<Role>() {
            {
                add(new Agent(Role.RoleType.Agent.getValue()));
            }
        };
    }
}
