package configuration;

import intf.InterfaceConfiguration;
import port.PortFourniExternalSocketConfiguration;
import port.PortRequisReceiveRequest;

public class ConfigurationServeur extends InterfaceConfiguration {

    private String name = "serveur";
    private InterfaceConfiguration configurationClientServeur;

    public ConfigurationServeur() {
        super(new PortRequisReceiveRequest(), new PortFourniExternalSocketConfiguration());
        this.configurationClientServeur = new ConfigurationClientServeur(this.getPortFournis(),this.getPortRequis());
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
