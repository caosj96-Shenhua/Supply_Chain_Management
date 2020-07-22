package Business.Network;

import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author Shijun
 */
public class NetworkDirectory {

    private ArrayList<Network> networkList;

    public NetworkDirectory() {
        networkList = new ArrayList<Network>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    
    public Network createAndAddNetwork(String name){
        Network network=new Network(name);
        networkList.add(network);
        return network;
    }    

    public void deleteNetwork(Network network) {
        this.networkList.remove(network);
    }
}
