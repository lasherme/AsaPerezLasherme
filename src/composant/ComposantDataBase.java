package composant;

import intf.InterfaceComposant;
import port.PortFourniQueryInterogation;
import port.PortRequisSecurityManagement;

public class ComposantDataBase extends InterfaceComposant {

    private String name = "dataBase";

    public ComposantDataBase() {
        super(new PortRequisSecurityManagement(),new PortFourniQueryInterogation());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
