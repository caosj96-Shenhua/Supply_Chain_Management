package Business;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;


public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();

        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account




        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("sysadmin", Organization.Type.SystemOrg);
        Organization orgSystem = system.getOrganizationDirectory().createOrganization(Organization.Type.SystemOrg);
       
        UserAccount ua = system.getUserAccountDirectory().createUserAccount(
                "sysadmin", "sysadmin", employee, new SystemAdminRole(Role.RoleType.Admin.getValue()),orgSystem );
        
        return system;
    }
    
}
