package composant;

import configuration.ConfigurationClientServeur;
import intf.InterfacePrimitiveComposant;
import intf.InterfaceConfiguration;
import intf.InterfacePort;
import intf.InterfaceService;
import port.PortFourniSendRequest;

public class PrimitiveComposantClient extends InterfacePrimitiveComposant {

    private String name = "client";
    private InterfaceService serviceRequis;
    private InterfaceService serviceFournis;
    private InterfaceConfiguration configurationClientServeur;

    public PrimitiveComposantClient(InterfaceService sR, InterfaceService sF, InterfacePort pR) {
        super(pR,new PortFourniSendRequest());
        this.serviceFournis = sF;
        this.serviceRequis = sR;
        this.configurationClientServeur = new ConfigurationClientServeur(this.getPortFourni(),pR);
    }

    public InterfaceService getServiceRequis() {
        return serviceRequis;
    }

    public void setServiceRequis(InterfaceService serviceRequis) {
        this.serviceRequis = serviceRequis;
    }

    public InterfaceService getServiceFournis() {
        return serviceFournis;
    }

    public void setServiceFournis(InterfaceService serviceFournis) {
        this.serviceFournis = serviceFournis;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InterfaceConfiguration getConfigurationClientServeur() {
        return configurationClientServeur;
    }

    public void setConfigurationClientServeur(InterfaceConfiguration configurationClientServeur) {
        this.configurationClientServeur = configurationClientServeur;
    }
}
