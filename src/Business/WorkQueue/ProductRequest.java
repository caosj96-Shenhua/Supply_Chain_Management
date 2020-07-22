package Business.WorkQueue;

import Business.Enterprise.Enterprise;
import Business.Enterprise.CargoDirectory;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Shijun
 */
public class ProductRequest extends WorkRequest{
    
    private Enterprise senderEnterprise;
    private Enterprise receiveEnterprise;
    private CargoDirectory cargoDirectory;
    private String orderRequireTime;
    
    public ProductRequest(UserAccount sender, String message, String date) {
        super(sender);
        this.orderRequireTime = date;
    }

    public Enterprise getSenderEnterprise() {
        return senderEnterprise;
    }

    public void setSenderEnterprise(Enterprise senderEnterprise) {
        this.senderEnterprise = senderEnterprise;
    }

    public Enterprise getReceiveEnterprise() {
        return receiveEnterprise;
    }

    public void setReceiveEnterprise(Enterprise receiveEnterprise) {
        this.receiveEnterprise = receiveEnterprise;
    }

    public CargoDirectory getCargoDirectory() {
        return cargoDirectory;
    }

    public void setCargoDirectory(CargoDirectory cargoDirectory) {
        this.cargoDirectory = cargoDirectory;
    }

    public String getOrderRequireTime() {
        return orderRequireTime;
    }

    public void setOrderRequireTime(String orderRequireTime) {
        this.orderRequireTime = orderRequireTime;
    }
    
}
