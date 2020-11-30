package composant;

import intf.InterfacePrimitiveComposant;
import port.PortFourniCheckQuery;
import port.PortFourniSecurityAuthentification;

public class PrimitiveComposantSecurityManager extends InterfacePrimitiveComposant {

    private String name = "securityManager";

    public PrimitiveComposantSecurityManager() {
        super(new PortFourniCheckQuery(),new PortFourniSecurityAuthentification());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
