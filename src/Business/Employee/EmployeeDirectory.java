package Business.Employee;

import Business.Organization.Organization;
import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author Kiksuya
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name, Organization.Type orgType){
        Employee employee = new Employee(name, orgType);
        employee.setName(name);
        employeeList.add(employee);
        return employee;
    }
    
}