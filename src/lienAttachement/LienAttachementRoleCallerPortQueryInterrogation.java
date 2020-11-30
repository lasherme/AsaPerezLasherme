package lienAttachement;

import intf.InterfacePort;
import intf.InterfaceRole;
import port.PortFourniQueryInterogation;
import role.RoleRequisCaller;

public class LienAttachementRoleCallerPortQueryInterrogation {

    private InterfaceRole roleRequis = new RoleRequisCaller();
    private InterfacePort portFourni = new PortFourniQueryInterogation();

    public LienAttachementRoleCallerPortQueryInterrogation() {}

    public InterfaceRole getRoleRequis() {
        return roleRequis;
    }

    public void setRoleRequis(InterfaceRole roleRequis) {
        this.roleRequis = roleRequis;
    }

    public InterfacePort getPortFourni() {
        return portFourni;
    }

    public void setPortFourni(InterfacePort portFourni) {
        this.portFourni = portFourni;
    }
}
