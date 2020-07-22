package Business;

import Business.Enterprise.Cargo;
import java.util.Comparator;

/**
 *
 * @author Shijun
 */
public class SortByPrice implements  Comparator<Cargo>{
      public SortByPrice() {
        super();
    }
    @Override
    public int compare(Cargo o1, Cargo o2) {
        
        return (int) (o1.getPrice()-o2.getPrice());
        
    } 
}
