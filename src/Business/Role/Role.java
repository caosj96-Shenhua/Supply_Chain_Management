package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Kiksuya
 */
public abstract class Role {
    
    
    private String roleType;
    
    public enum RoleType{
        Admin("Admin"),
        FactoryAdmin("FactoryAdmin"),
        SupplierAdmin("SupplierAdmin"),
        OrderManager("OrderManager"),
        StoreManager("StoreManager"),
        Agent("Agent"),
        HR("HR"),
        WorkerManager("WorkerManager"),
        AssignWorkerManager("AssignWorkerManager"),
        LogisticsManager("LogisticsManager");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public Role(String roleType) {
        this.roleType = roleType;

    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business);

    @Override
    public String toString() {
      //  return this.getClass().getName();
      return this.roleType;
    }
    
    
}