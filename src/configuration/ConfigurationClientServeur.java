package configuration;

import intf.InterfaceConfiguration;
import intf.InterfacePort;

public class ConfigurationClientServeur extends InterfaceConfiguration {
    private String name = "clientServeur";

    public ConfigurationClientServeur(InterfacePort portFournis, InterfacePort portRequis){
        super(portFournis,portRequis);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
