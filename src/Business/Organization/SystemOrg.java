package Business.Organization;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Shijun
 */
public class SystemOrg extends Organization{

   public SystemOrg(Type orgType) {
        super(orgType.getValue(), orgType);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
