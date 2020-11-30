package lienBinding;

import intf.InterfacePort;
import port.PortFourniExternalSocketComposant;
import port.PortFourniExternalSocketConfiguration;

public class LienBindingExternalSocketComposantExternalSocketConfiguration {

    private InterfacePort portFourniComposant = new PortFourniExternalSocketComposant();
    private InterfacePort getPortFourniConfiguration = new PortFourniExternalSocketConfiguration();

    public LienBindingExternalSocketComposantExternalSocketConfiguration() {}

    public InterfacePort getPortFourniComposant() {
        return portFourniComposant;
    }

    public void setPortFourniComposant(InterfacePort portFourniComposant) {
        this.portFourniComposant = portFourniComposant;
    }

    public InterfacePort getGetPortFourniConfiguration() {
        return getPortFourniConfiguration;
    }

    public void setGetPortFourniConfiguration(InterfacePort getPortFourniConfiguration) {
        this.getPortFourniConfiguration = getPortFourniConfiguration;
    }
}
