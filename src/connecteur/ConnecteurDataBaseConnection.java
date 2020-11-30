package connecteur;

import glue.GlueDatabaseConnection;
import intf.InterfaceConnecteur;
import intf.InterfaceGlue;
import role.RoleFourniCalled;
import role.RoleRequisCaller;

public class ConnecteurDataBaseConnection extends InterfaceConnecteur {

    private String name;
    private InterfaceGlue glue;

    public ConnecteurDataBaseConnection(String n,InterfaceGlue g) {
        super(new RoleRequisCaller(),new RoleFourniCalled());
        this.name = n;
        this.glue = g;
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
