package configuration;

import CompositeComposant.CompositeComposantServer;
import intf.InterfaceConfiguration;
import port.PortFourniExternalSocketConfiguration;
import port.PortRequisReceiveRequest;

public class ConfigurationServeur extends InterfaceConfiguration {

    private String name = "serveur";
    private InterfaceConfiguration configurationClientServeur;
    private CompositeComposantServer compositeComposantServer;

    public ConfigurationServeur(String compositeComposantServerConnecteurName,String compositeComposantServerGlueName,String compositeComposantServerDataBaseConnectionConnecteurName,String compositeComposantServerDataBaseConnectionConnecteurGlueName) {
        super(new PortRequisReceiveRequest(), new PortFourniExternalSocketConfiguration());
        this.configurationClientServeur = new ConfigurationClientServeur(this.getPortFournis(),this.getPortRequis());
        this.compositeComposantServer = new CompositeComposantServer(compositeComposantServerConnecteurName,compositeComposantServerGlueName,compositeComposantServerDataBaseConnectionConnecteurName,compositeComposantServerDataBaseConnectionConnecteurGlueName);
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

    public CompositeComposantServer getCompositeComposantServer() {
        return compositeComposantServer;
    }

    public void setCompositeComposantServer(CompositeComposantServer compositeComposantServer) {
        this.compositeComposantServer = compositeComposantServer;
    }
}
