package lienAttachement;

import intf.InterfacePort;
import intf.InterfaceRole;
import port.PortRequisSecurityCheck;
import role.RoleFourniCalled;

public class LienAttachementRoleCalledPortSecurityCheck {

    private InterfaceRole roleFourni;
    private InterfacePort portRequis;

    public LienAttachementRoleCalledPortSecurityCheck(InterfaceRole rF,InterfacePort pR) {
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
