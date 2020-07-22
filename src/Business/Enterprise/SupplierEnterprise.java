package Business.Enterprise;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import java.util.ArrayList;


/**
 *
 * @author shijun
 */
public class SupplierEnterprise extends Enterprise {
    public SupplierEnterprise(String name){
        super(name, Enterprise.EnterpriseType.Supplier);
    }

    @Override
    public ArrayList<Organization.Type> getSupportedOrganization() {
        return new ArrayList<Organization.Type>() {
            {
                add(Organization.Type.AssignWorkerOrg);
                add(Organization.Type.WorkerOrg);
                add(Organization.Type.LogisticsOrg);
            }
        };
    }

}
