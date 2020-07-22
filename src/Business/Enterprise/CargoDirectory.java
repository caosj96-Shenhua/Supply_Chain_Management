package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author Shijun
 */
public class CargoDirectory {
    
    private ArrayList<Cargo> cargoList;
    
    public CargoDirectory(){
        this.cargoList = new ArrayList<Cargo> ();
    }

    public ArrayList<Cargo> getCargoList() {
        return cargoList;
    }

    public void setCargoList(ArrayList<Cargo> cargoList) {
        this.cargoList = cargoList;
    }  
    public Cargo createCargo(String name){
        Cargo cargo = new Cargo(name);
        cargoList.add(cargo);
        return cargo;
    }
    
}
