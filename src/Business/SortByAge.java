package Business;

import Business.Employee.Employee;

import java.util.Comparator;
import java.util.Map;

/**
 *
 * @author Shijun
 */
public class SortByAge implements Comparator<Employee>{
    public SortByAge() {
        super();
    }
    @Override
    public int compare(Employee o1,Employee o2) {
          return (int) (o1.getAge()-o2.getAge());
    }
     
}
