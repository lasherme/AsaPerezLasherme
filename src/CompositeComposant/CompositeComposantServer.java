package CompositeComposant;

import composant.ComposantDataBase;
import connecteur.Connecteur;
import connecteur.ConnecteurDataBaseConnection;
import glue.Glue;
import intf.InterfaceComposant;
import intf.InterfaceConnecteur;

public class CompositeComposantServer {

    private String name = "Serveur";
    private InterfaceConnecteur connecteur;
    private InterfaceComposant dataBaseComposant;
    private InterfaceConnecteur dataBaseConnectionConnecteur;

    public CompositeComposantServer(String connecteurName,String glueName,String dataBaseConnectionConnecteurName,String dataBaseConnectionConnecteurGlueName) {
        this.connecteur = new Connecteur(connecteurName,new Glue(glueName));
        this.dataBaseComposant = new ComposantDataBase();
        this.dataBaseConnectionConnecteur = new ConnecteurDataBaseConnection(dataBaseConnectionConnecteurName,dataBaseConnectionConnecteurGlueName);
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

    public InterfaceComposant getDataBaseComposant() {
        return dataBaseComposant;
    }

    public void setDataBaseComposant(InterfaceComposant dataBaseComposant) {
        this.dataBaseComposant = dataBaseComposant;
    }

    public InterfaceConnecteur getDataBaseConnectionConnecteur() {
        return dataBaseConnectionConnecteur;
    }

    public void setDataBaseConnectionConnecteur(InterfaceConnecteur dataBaseConnectionConnecteur) {
        this.dataBaseConnectionConnecteur = dataBaseConnectionConnecteur;
    }
}
