package lienAttachement;

import intf.InterfacePort;
import intf.InterfaceRole;

public class LienAttachementRoleCalledPortReceiveRequest {

    private InterfaceRole roleFourni;
    private InterfacePort portRequis;

    public LienAttachementRoleCalledPortReceiveRequest(InterfaceRole rF,InterfacePort pR) {
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
