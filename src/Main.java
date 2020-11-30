import composant.*;
import compositeComposant.CompositeComposantServer;
import connecteur.*;
import configuration.*;
import glue.*;
import intf.*;
import lienAttachement.*;
import lienBinding.LienBindingExternalSocketComposantExternalSocketConfiguration;
import port.*;
import service.*;


public class Main {
    public static void main(String args[]) {

        // Port
        InterfacePort PortRequisClient = new Port("portRequisComposantClient");

        // Glue
        InterfaceGlue GlueAuthentification = new GlueAuthentification("auhtentification");
        InterfaceGlue GlueDatabaseConnection = new GlueDatabaseConnection("dataBaseConnection");
        InterfaceGlue GlueSerialiseCommunication = new GlueSerialiseCommunication("serialise and communication");
        InterfaceGlue Glue = new Glue("glueConnecteur");

        // Service
        InterfaceService ServiceRequis = new Service("serviceRequis");
        InterfaceService ServiceFourni = new Service("serviceFourni");

        //Composant
        InterfacePrimitiveComposant ComposantClient = new PrimitiveComposantClient(ServiceRequis,ServiceFourni,PortRequisClient);
        InterfacePrimitiveComposant ComposantDataBase = new PrimitiveComposantDataBase();
        InterfacePrimitiveComposant ComposantConnectionManager = new PrimitiveComposantConnectionManager();
        InterfacePrimitiveComposant ComposantSecurityManager = new PrimitiveComposantSecurityManager();

        // Connecteur
        InterfaceConnecteur ConnecteurAuthentification = new ConnecteurAuthentification("connecteurAuthentification",GlueAuthentification);
        InterfaceConnecteur ConnecteurDataBaseConnection = new ConnecteurDataBaseConnection("connecteurDataBaseConnection",GlueDatabaseConnection);
        InterfaceConnecteur ConnecteurRPC = new ConnecteurRPC(GlueSerialiseCommunication);
        InterfaceConnecteur Connecteur = new Connecteur("connecteurCompositeComposant",Glue);

        // Configuration
        InterfaceConfiguration ConfigurationServeur = new ConfigurationServeur();

        // Composite Composant
        CompositeComposantServer compositeComposantServer= new CompositeComposantServer(Connecteur,ConnecteurDataBaseConnection,ConfigurationServeur);

        // Lien Attachement
        LienAttachementRoleCalledPortDbQuery lienAttachementRoleCalledPortDbQuery = new LienAttachementRoleCalledPortDbQuery(Connecteur.getRoleFourni(),ComposantConnectionManager.getPortRequis());
        LienAttachementRoleCalledPortReceiveRequest LienAttachementRoleCalledPortReceiveRequest = new LienAttachementRoleCalledPortReceiveRequest(ConnecteurRPC.getRoleFourni(),ConfigurationServeur.getPortRequis());
        LienAttachementRoleCalledPortSecurityCheck LienAttachementRoleCalledPortSecurityCheck = new LienAttachementRoleCalledPortSecurityCheck(ConnecteurAuthentification.getRoleFourni(),ComposantConnectionManager.getPortRequis());
        LienAttachementRoleCalledPortSecurityManagement LienAttachementRoleCalledPortSecurityManagement = new LienAttachementRoleCalledPortSecurityManagement(ConnecteurDataBaseConnection.getRoleFourni(),ComposantDataBase.getPortRequis());
        LienAttachementRoleCallerPortCheckQuery LienAttachementRoleCallerPortCheckQuery = new LienAttachementRoleCallerPortCheckQuery(ConnecteurDataBaseConnection.getRoleRequis(),ComposantSecurityManager.getPortFourni());
        LienAttachementRoleCallerPortQueryInterrogation LienAttachementRoleCallerPortQueryInterrogation = new LienAttachementRoleCallerPortQueryInterrogation(Connecteur.getRoleRequis(),ComposantDataBase.getPortFourni());
        LienAttachementRoleCallerPortSecurityAuthentification LienAttachementRoleCallerPortSecurityAuthentification = new LienAttachementRoleCallerPortSecurityAuthentification(ConnecteurAuthentification.getRoleRequis(),ComposantSecurityManager.getPortFourni());
        LienAttachementRoleCallerPortSendRequest LienAttachementRoleCallerPortSendRequest = new LienAttachementRoleCallerPortSendRequest(ConnecteurRPC.getRoleRequis(),ComposantClient.getPortFourni());

        // Lien Binding
        LienBindingExternalSocketComposantExternalSocketConfiguration LienBindingExternalSocketComposantExternalSocketConfiguration = new LienBindingExternalSocketComposantExternalSocketConfiguration(compositeComposantServer.getConfigurationServeur().getPortFournis(),ComposantConnectionManager.getPortFourni());

    }
}
