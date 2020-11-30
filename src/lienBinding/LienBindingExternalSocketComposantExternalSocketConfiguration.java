package lienBinding;

import intf.InterfacePort;
import port.PortFourniExternalSocketComposant;
import port.PortFourniExternalSocketConfiguration;

public class LienBindingExternalSocketComposantExternalSocketConfiguration {

    private InterfacePort portFourniComposant;
    private InterfacePort getPortFourniConfiguration;

    public LienBindingExternalSocketComposantExternalSocketConfiguration(InterfacePort portFC,InterfacePort portFConf) {
        this.portFourniComposant = portFC;
        this.getPortFourniConfiguration = portFConf;
    }

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
