package composant;

import intf.InterfacePrimitiveComposant;
import intf.InterfacePort;
import port.PortFourniExternalSocketComposant;
import port.PortRequisDbQuery;
import port.PortRequisSecurityCheck;

public class PrimitiveComposantConnectionManager extends InterfacePrimitiveComposant {

    private String name = "connectionManager";

    private InterfacePort portRequis = new PortRequisSecurityCheck();

    public PrimitiveComposantConnectionManager() {
        super(new PortRequisDbQuery(),new PortFourniExternalSocketComposant());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InterfacePort getPortRequis() {
        return portRequis;
    }

    public void setPortRequis(InterfacePort portRequis) {
        this.portRequis = portRequis;
    }
}
