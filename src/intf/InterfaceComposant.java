package intf;

public abstract class InterfaceComposant {

    private InterfacePort portFourni;
    private InterfacePort portRequis;

    public InterfaceComposant(InterfacePort pR,InterfacePort pF){
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
