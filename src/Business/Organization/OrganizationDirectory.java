package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author Shijun
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.SupplierAdminOrg.getValue())){
            organization = new SupplierAdminOrg(Type.SupplierAdminOrg);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.FactoryAdminOrg.getValue())){
            organization = new FactoryAdminOrg(Type.FactoryAdminOrg);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Agent.getValue())){
            organization = new AgentOrg(Type.Agent);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.StoreOrg.getValue())){
            organization = new StoreOrg(Type.StoreOrg);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.OrderOrg.getValue())){
            organization = new OrderOrg(Type.OrderOrg);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.FinancialOrg.getValue())){
            organization = new HROrg(Type.FinancialOrg);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.LogisticsOrg.getValue())){
            organization = new LogisticsOrg(Type.LogisticsOrg);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.WorkerOrg.getValue())){
            organization = new WorkerOrg(Type.WorkerOrg);
            organizationList.add(organization);
        }        
        else if (type.getValue().equals(Type.AssignWorkerOrg.getValue())){
            organization = new AssignWorkerOrg(Type.AssignWorkerOrg);
            organizationList.add(organization);
        }        
        else if (type.getValue().equals(Type.SystemOrg.getValue())){
            organization = new SystemOrg(Type.SystemOrg);
            organizationList.add(organization);
        }        
        return organization;
    }
}