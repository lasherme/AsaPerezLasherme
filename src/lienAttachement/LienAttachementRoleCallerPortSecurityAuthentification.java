package lienAttachement;

import intf.InterfacePort;
import intf.InterfaceRole;
import port.PortFourniSecurityAuthentification;
import role.RoleRequisCaller;

public class LienAttachementRoleCallerPortSecurityAuthentification {

    private InterfaceRole roleRequis;
    private InterfacePort portFourni;

    public LienAttachementRoleCallerPortSecurityAuthentification(InterfaceRole rR,InterfacePort pF) {
        this.roleRequis = rR;
        this.portFourni = pF;
    }

    public InterfaceRole getRoleRequis() {
        return roleRequis;
    }

    public void setRoleRequis(InterfaceRole roleRequis) {
        this.roleRequis = roleRequis;
    }

    public InterfacePort getPortFournis() {
        return portFourni;
    }

    public void setPortFournis(InterfacePort portFournis) {
        this.portFourni = portFournis;
    }
}
