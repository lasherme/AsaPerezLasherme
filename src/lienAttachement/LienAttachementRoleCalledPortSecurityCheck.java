package lienAttachement;

import intf.InterfacePort;
import intf.InterfaceRole;
import port.PortRequisSecurityCheck;
import role.RoleFourniCalled;

public class LienAttachementRoleCalledPortSecurityCheck {

    private InterfaceRole roleFourni = new RoleFourniCalled();
    private InterfacePort portRequis = new PortRequisSecurityCheck();

    public LienAttachementRoleCalledPortSecurityCheck() {}

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
