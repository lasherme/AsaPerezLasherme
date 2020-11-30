package lienAttachement;

import intf.InterfacePort;
import intf.InterfaceRole;
import port.PortFourniCheckQuery;
import role.RoleRequisCaller;

public class LienAttachementRoleCallerPortCheckQuery {

    private InterfaceRole roleRequis = new RoleRequisCaller();
    private InterfacePort portFourni = new PortFourniCheckQuery();

    public LienAttachementRoleCallerPortCheckQuery() {}

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
