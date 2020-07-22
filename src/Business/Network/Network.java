package Business.Network;

import Business.Enterprise.EnterpriseDirectory;

/**
 *
 * @author Shijun
 */
public class Network {
    private String name;
    private int id;    
    private EnterpriseDirectory enterpriseDirectory;

    private static int count = 1;
    
    public Network(String name){
        this.name = name;
        this.id = count++;
        enterpriseDirectory=new EnterpriseDirectory();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
}
