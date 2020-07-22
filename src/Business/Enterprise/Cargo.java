package Business.Enterprise;

/**
 *
 * @author Shijun
 */
public class Cargo {

    private String cargoName;
    private int quantity;
    private int price;
    private double rate;
    boolean Rateble;
    private int rateCount = 1;
    
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

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    

    public boolean isRateble() {
        return Rateble;
    }

    public void setRateble(boolean Rateble) {
        this.Rateble = Rateble;
    }

    public int getRateCount() {
        return rateCount;
    }

    public void setRateCount(int rateCount) {
        this.rateCount = rateCount;
    }

    
    
    @Override
    public String toString() {
        return this.cargoName;
    }
}
