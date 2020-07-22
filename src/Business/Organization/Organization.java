package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author Shijun
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private Type orgType;
    private String description;


    
    public enum Type{
        FactoryAdminOrg("FactoryAdmin Org"), Agent("Agent Org"), StoreOrg("Store Org"),
        SupplierAdminOrg("SupplierAdmin Org"), OrderOrg("Order Org"), FinancialOrg("Financial Org"),
        AssignWorkerOrg("AssignWorker Org"), WorkerOrg("Worker Org"), SystemOrg("System Org"), LogisticsOrg("Logistics Org");

        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name, Type orgType) {
        this.name = name;
        workQueue = new WorkQueue();
        this.orgType = orgType;
//        this.enterpriseID = enterpriseID;
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
//        organizationID = counter;
//        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public Type getOrgType() {
        return orgType;
    }

    public void setOrgType(Type orgType) {
        this.orgType = orgType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }
    
    

    @Override
    public String toString() {
        return name;
    }
    
    
}
