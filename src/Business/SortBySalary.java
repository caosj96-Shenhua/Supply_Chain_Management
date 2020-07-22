package Business;

import Business.Employee.Employee;
import Business.Enterprise.FactoryEnterprise.Cargo;
import java.util.Comparator;
import java.util.Map;

/**
 *
 * @author Kiksuya
 */
public class SortBySalary implements Comparator<Employee>{
    public SortBySalary() {
        super();
    }
    @Override
    public int compare(Employee o1,Employee o2) {
          return (int) (o1.getAge()-o2.getAge());
    }
     
}
