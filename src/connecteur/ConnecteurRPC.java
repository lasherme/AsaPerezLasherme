package connecteur;

import glue.GlueSerialiseCommunication;
import intf.InterfaceConnecteur;
import intf.InterfaceGlue;
import role.RoleFourniCalled;
import role.RoleRequisCaller;

public class ConnecteurRPC extends InterfaceConnecteur {

    private String name = "RPC";
    private InterfaceGlue glue;

    public ConnecteurRPC(String name) {
        super(new RoleRequisCaller(),new RoleFourniCalled());
        this.glue = new GlueSerialiseCommunication(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InterfaceGlue getGlue() {
        return glue;
    }

    public void setGlue(InterfaceGlue glue) {
        this.glue = glue;
    }
}
