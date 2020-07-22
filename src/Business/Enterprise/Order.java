package Business.Enterprise;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author Shijun
 */
public class Order {

    private int orderID;
    private Date startTime;
    private Date requireTime;
    private UserAccount creator;
    private CargoDirectory cargoDirectory;
    private static int counter = 0;
  
    private int price;
    private int quantity;
    private String name;
    
    public Order(UserAccount creator) {
        this.creator = creator;
        this.cargoDirectory = new CargoDirectory();
        this.orderID = ++counter;
        this.startTime = new Date();
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getRequireTime() {
        return requireTime;
    }

    public void setRequireTime(Date requireTime) {
        this.requireTime = requireTime;
    }

    public UserAccount getCreator() {
        return creator;
    }

    public void setCreator(UserAccount creator) {
        this.creator = creator;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    
    public CargoDirectory getCargoDirectory() {
        return cargoDirectory;
    }

    public void setCargoDirectory(CargoDirectory cargoDirectory) {
        this.cargoDirectory = cargoDirectory;
    }

    @Override
    public String toString() {
        return this.orderID + "(" + this.creator + ")";
    }
}
