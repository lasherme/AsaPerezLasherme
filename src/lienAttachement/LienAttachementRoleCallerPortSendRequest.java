package lienAttachement;

import intf.InterfacePort;
import intf.InterfaceRole;
import port.PortFourniSendRequest;
import role.RoleRequisCaller;

public class LienAttachementRoleCallerPortSendRequest {

    private InterfaceRole roleRequis = new RoleRequisCaller();
    private InterfacePort portFourni = new PortFourniSendRequest();

    public LienAttachementRoleCallerPortSendRequest(){}

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
