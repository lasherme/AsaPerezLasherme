package lienAttachement;

import intf.InterfacePort;
import intf.InterfaceRole;
import port.PortRequisSecurityManagement;
import role.RoleFourniCalled;

public class LienAttachementRoleCalledPortSecurityManagement {

    private InterfaceRole roleFourni;
    private InterfacePort portRequis;

    public LienAttachementRoleCalledPortSecurityManagement(InterfaceRole rF,InterfacePort pR) {
        this.roleFourni = rF;
        this.portRequis = pR;
    }

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
