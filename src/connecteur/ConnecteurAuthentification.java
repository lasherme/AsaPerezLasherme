package connecteur;

import glue.GlueAuthentification;
import intf.InterfaceConnecteur;
import intf.InterfaceGlue;
import role.RoleFourniCalled;
import role.RoleRequisCaller;

public class ConnecteurAuthentification extends InterfaceConnecteur {

    private String name;
    private InterfaceGlue glue;

    public ConnecteurAuthentification(String n,InterfaceGlue g) {
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
