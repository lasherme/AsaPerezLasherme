package intf;

public abstract class InterfaceConnecteur {

    private InterfaceRole roleRequis;
    private InterfaceRole roleFourni;

    public InterfaceConnecteur(InterfaceRole rR, InterfaceRole rF) {
        this.roleRequis = rR;
        this.roleFourni = rF;
    }

    public InterfaceRole getRoleRequis() {
        return roleRequis;
    }

    public void setRoleRequis(InterfaceRole roleRequis) {
        this.roleRequis = roleRequis;
    }

    public InterfaceRole getRoleFourni() {
        return roleFourni;
    }

    public void setRoleFourni(InterfaceRole roleFourni) {
        this.roleFourni = roleFourni;
    }
}
