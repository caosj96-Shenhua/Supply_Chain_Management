package Business.Organization;

import Business.Role.Role;
import Business.Role.WorkerRole;
import java.util.ArrayList;

/**
 *
 * @author Shijun
 */
public class WorkerOrg extends Organization {

    public WorkerOrg(Type orgType) {
        super(orgType.getValue(), orgType);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return new ArrayList<Role>() {
            {
                add(new WorkerRole(Role.RoleType.WorkerManager.getValue()));
            }
        };
    }
}
