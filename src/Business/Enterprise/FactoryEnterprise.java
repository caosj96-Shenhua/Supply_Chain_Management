package Business.Enterprise;

import Business.Employee.Employee;
import Business.Role.Role;
import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author Shijun
 */
public class FactoryEnterprise extends Enterprise {
    
    
    public class Cargo {

    private String cargoName;
    private int quantity;
    private int price;

    public Cargo(String name) {
        this.cargoName = name;
    }

    public String getCargoName() {
        return cargoName;
    }

    public void setCargoName(String cargoName) {
        this.cargoName = cargoName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return this.cargoName;
    }
}
    
    public class CargoDictionary{
        private ArrayList<Cargo> CargoList;

        public ArrayList<Cargo> getCargoList() {
            return CargoList;
        }

        public void setCargoList(ArrayList<Cargo> CargoList) {
            this.CargoList = CargoList;
        }
    }
    public FactoryEnterprise(String name){
        super(name,EnterpriseType.Factory);
    }
    @Override
    public ArrayList<Organization.Type> getSupportedOrganization() {
        return new ArrayList<Organization.Type>() {
            {
                add(Type.FinancialOrg);
                add(Type.OrderOrg);
                add(Type.Agent);
                add(Type.StoreOrg);
            }
        };
    }
    
}
