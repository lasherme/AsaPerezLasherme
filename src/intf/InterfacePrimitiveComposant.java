package intf;

public abstract class InterfacePrimitiveComposant {

    private InterfacePort portFourni;
    private InterfacePort portRequis;

    public InterfacePrimitiveComposant(InterfacePort pR, InterfacePort pF){
        this.portFourni = pF;
        this.portRequis = pR;
    }

    public InterfacePort getPortFourni() {
        return portFourni;
    }

    public void setPortFourni(InterfacePort portFourni) {
        this.portFourni = portFourni;
    }

    public InterfacePort getPortRequis() {
        return portRequis;
    }

    public void setPortRequis(InterfacePort portRequis) {
        this.portRequis = portRequis;
    }
}
