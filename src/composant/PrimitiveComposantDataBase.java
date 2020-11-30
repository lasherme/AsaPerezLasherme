package composant;

import intf.InterfacePrimitiveComposant;
import port.PortFourniQueryInterogation;
import port.PortRequisSecurityManagement;

public class PrimitiveComposantDataBase extends InterfacePrimitiveComposant {

    private String name = "dataBase";

    public PrimitiveComposantDataBase() {
        super(new PortRequisSecurityManagement(),new PortFourniQueryInterogation());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
