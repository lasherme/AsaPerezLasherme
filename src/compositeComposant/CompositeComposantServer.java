package compositeComposant;

import composant.PrimitiveComposantDataBase;
import intf.InterfaceConfiguration;
import intf.InterfacePrimitiveComposant;
import intf.InterfaceConnecteur;

public class CompositeComposantServer {

    private String name = "Serveur";
    private InterfaceConnecteur connecteur;
    private InterfacePrimitiveComposant dataBaseComposant;
    private InterfaceConnecteur dataBaseConnectionConnecteur;
    private InterfaceConfiguration configurationServeur;

    public CompositeComposantServer(InterfaceConnecteur c,InterfaceConnecteur dataBase,InterfaceConfiguration confServ) {
        this.connecteur = c;
        this.dataBaseComposant = new PrimitiveComposantDataBase();
        this.dataBaseConnectionConnecteur = dataBase;
        this.configurationServeur = confServ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InterfaceConnecteur getConnecteur() {
        return connecteur;
    }

    public void setConnecteur(InterfaceConnecteur connecteur) {
        this.connecteur = connecteur;
    }

    public InterfacePrimitiveComposant getDataBaseComposant() {
        return dataBaseComposant;
    }

    public void setDataBaseComposant(InterfacePrimitiveComposant dataBaseComposant) {
        this.dataBaseComposant = dataBaseComposant;
    }

    public InterfaceConnecteur getDataBaseConnectionConnecteur() {
        return dataBaseConnectionConnecteur;
    }

    public void setDataBaseConnectionConnecteur(InterfaceConnecteur dataBaseConnectionConnecteur) {
        this.dataBaseConnectionConnecteur = dataBaseConnectionConnecteur;
    }

    public InterfaceConfiguration getConfigurationServeur() {
        return configurationServeur;
    }

    public void setConfigurationServeur(InterfaceConfiguration configurationServeur) {
        this.configurationServeur = configurationServeur;
    }
}
