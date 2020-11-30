package composant;

import intf.InterfaceComposant;
import port.PortFourniCheckQuery;
import port.PortFourniSecurityAuthentification;

public class ComposantSecurityManager extends InterfaceComposant {

    private String name = "securityManager";

    public ComposantSecurityManager() {
        super(new PortFourniCheckQuery(),new PortFourniSecurityAuthentification());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
