package lienAttachement;

import intf.InterfacePort;
import intf.InterfaceRole;
import port.PortRequisReceiveRequest;
import role.RoleFourniCalled;

public class LienAttachementRoleCalledPortReceiveRequest {

    private InterfaceRole roleFourni = new RoleFourniCalled();
    private InterfacePort portRequis = new PortRequisReceiveRequest();

    public LienAttachementRoleCalledPortReceiveRequest() {}

    public InterfaceRole getRoleFourni() {
        return roleFourni;
    }

    public void setRoleFourni(InterfaceRole roleFourni) {
        this.roleFourni = roleFourni;
    }

    public InterfacePort getPortRequis() {
        return portRequis;
    }

    public void setPortRequis(InterfacePort portRequis) {
        this.portRequis = portRequis;
    }
}
