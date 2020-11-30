package lienAttachement;

import intf.InterfacePort;
import intf.InterfaceRole;
import port.PortRequisDbQuery;
import role.RoleFourniCalled;

public class LienAttachementRoleCalledPortDbQuery {

    private InterfaceRole roleFourni = new RoleFourniCalled();
    private InterfacePort portRequis = new PortRequisDbQuery();

    public LienAttachementRoleCalledPortDbQuery() {}

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
