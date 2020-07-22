package Business;

import Business.Enterprise.Cargo;
import java.util.Comparator;

/**
 *
 * @author Kiksuya
 */
public class SortByQuantity implements  Comparator<Cargo>{
      public SortByQuantity() {
        super();
    }
    @Override
    public int compare(Cargo o1, Cargo o2) {
        
        return (int) (o1.getPrice()-o2.getPrice());
        
    } 
}
