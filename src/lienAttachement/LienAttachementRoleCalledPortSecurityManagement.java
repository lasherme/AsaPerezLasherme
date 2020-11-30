package lienAttachement;

import intf.InterfacePort;
import intf.InterfaceRole;
import port.PortRequisSecurityManagement;
import role.RoleFourniCalled;

public class LienAttachementRoleCalledPortSecurityManagement {

    private InterfaceRole roleFourni = new RoleFourniCalled();
    private InterfacePort portRequis = new PortRequisSecurityManagement();

    public LienAttachementRoleCalledPortSecurityManagement() {}

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
