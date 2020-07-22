package Business.Employee;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization.Type;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.util.Date;

/**
 *
 * @author Kiksuya
 */
public class Employee {
    
        private EcoSystem ecoSystem;

    
    private String name;
    private Type orgType;
    private int id;
    private int age;
    private String location;
    private Date registerTime;
    private double salary;
    private static int count = 0;

    private UserAccountDirectory userAccountDirectory;

    public Employee(String name,Type org) {
        this.name = name;
        this.orgType = org;
        this.registerTime = new Date();
        id = count;
        count++;
            if (orgType == Type.FinancialOrg) {
            this.salary = 1000;
        }
        if (orgType == Type.AssignWorkerOrg) {
            this.salary = 1200;
            this.age = 25;
            
        }
        if (orgType == Type.OrderOrg) {
            this.salary = 1300;
        }
        if (orgType == Type.FactoryAdminOrg) {
            this.salary = 1500;
        }
        if (orgType == Type.Agent) {
            this.salary = 1800;
        }
        if (orgType == Type.StoreOrg) {
            this.salary = 1900;
        }
        if (orgType == Type.SupplierAdminOrg) {
            this.salary = 2000;
        }
        if (orgType == Type.WorkerOrg) {
            this.salary = 1800;
            this.age = 25;
            
        }
        if (orgType == Type.LogisticsOrg) {
            this.salary = 2100;
        }        
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    public Type getOrgType() {
        return orgType;
    }

    public void setOrgType(Type orgType) {
        this.orgType = orgType;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Employee.count = count;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }
    
    

    @Override
    public String toString() {
        return name + " " + orgType;
    }
    
    
}
