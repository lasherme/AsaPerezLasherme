package intf;

public abstract class InterfaceConfiguration {
    private InterfacePort portRequis;
    private InterfacePort portFourni;

    public InterfaceConfiguration(InterfacePort portR,InterfacePort portF){
        this.portRequis = portR;
        this.portFourni = portF;
    }

    public InterfacePort getPortRequis() {
        return portRequis;
    }

    public InterfacePort getPortFournis() {
        return portFourni;
    }

    public void setPortRequis(InterfacePort portRequis) {
        this.portRequis = portRequis;
    }

    public void setPortFournis(InterfacePort portFournis) {
        this.portFourni = portFournis;
    }
}
