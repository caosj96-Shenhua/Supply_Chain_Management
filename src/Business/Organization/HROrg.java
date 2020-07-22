package Business.Organization;

import Business.Role.HR_Role;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Shijun
 */
public class HROrg extends Organization {

    public HROrg(Type orgType ) {
        super(orgType.getValue(), orgType );
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return new ArrayList<Role>() {
            {
                add(new HR_Role(Role.RoleType.HR.getValue()));
            }
        };
    }
}
