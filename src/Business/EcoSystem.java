package Business;

import Business.Employee.EmployeeDirectory;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Network.NetworkDirectory;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;


public class EcoSystem /*extends Organization*/{
    
    private static EcoSystem business;
    
    private Enterprise.EnterpriseType enterpriseType;    
    private NetworkDirectory networkDirectory;
    private OrganizationDirectory organizationDirectory;

    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
//    private ArrayList<Network> networkList;
  
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    private EcoSystem() {
        networkDirectory = new NetworkDirectory();
        organizationDirectory = new OrganizationDirectory();
        userAccountDirectory = new UserAccountDirectory();
        employeeDirectory = new EmployeeDirectory();
//        super(null);
  //      networkList=new ArrayList<Network>();        
    }    
/*    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
 */   
    /*
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

*/

/*
    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
 */   
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Network network: /*networkList*/networkDirectory.getNetworkList()){
            for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                if (!enterprise.getUserAccountDirectory().checkIfUsernameIsUnique(userName)) {
                        return false;
                    }
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if (!organization.getUserAccountDirectory().checkIfUsernameIsUnique(userName)) {
                        return false;
                    }
                }                
            }
        }
        return true;
    }

    public Enterprise.EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(Enterprise.EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public NetworkDirectory getNetworkDirectory() {
        return networkDirectory;
    }

    public void setNetworkDirectory(NetworkDirectory networkDirectory) {
        this.networkDirectory = networkDirectory;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }
    
    
    
}
