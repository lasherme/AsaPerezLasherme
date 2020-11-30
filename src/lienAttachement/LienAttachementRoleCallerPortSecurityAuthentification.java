package lienAttachement;

import intf.InterfacePort;
import intf.InterfaceRole;
import port.PortFourniSecurityAuthentification;
import role.RoleRequisCaller;

public class LienAttachementRoleCallerPortSecurityAuthentification {

    private InterfaceRole roleRequis = new RoleRequisCaller();
    private InterfacePort portFournis = new PortFourniSecurityAuthentification();

    public LienAttachementRoleCallerPortSecurityAuthentification() {}

    public InterfaceRole getRoleRequis() {
        return roleRequis;
    }

    public void setRoleRequis(InterfaceRole roleRequis) {
        this.roleRequis = roleRequis;
    }

    public InterfacePort getPortFournis() {
        return portFournis;
    }

    public void setPortFournis(InterfacePort portFournis) {
        this.portFournis = portFournis;
    }
}
