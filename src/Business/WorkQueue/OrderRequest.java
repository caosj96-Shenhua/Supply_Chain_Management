package Business.WorkQueue;

import Business.Enterprise.Order;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Shijun
 */
public class OrderRequest extends WorkRequest {


   private String name;
   private int quantity;
   private int price;
   
    private Order order;
    private String result;
    private boolean isStoreProcess;
    private boolean isSellerProcess;
    private UserAccount purchasingAgentRecevier;

    public OrderRequest(UserAccount userAccount) {
        super(userAccount);
        this.order = new Order(userAccount);
    }

    
    
    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public UserAccount getPurchasingAgentRecevier() {
        return purchasingAgentRecevier;
    }

    public void setPurchasingAgentRecevier(UserAccount purchasingAgentRecevier) {
        this.purchasingAgentRecevier = purchasingAgentRecevier;
    }

    public boolean isIsStoreProcess() {
        return isStoreProcess;
    }

    public void setIsStoreProcess(boolean isStoreProcess) {
        this.isStoreProcess = isStoreProcess;
    }

    public boolean isIsSellerProcess() {
        return isSellerProcess;
    }

    public void setIsSellerProcess(boolean isSellerProcess) {
        this.isSellerProcess = isSellerProcess;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return this.order.toString();
    }
}
