package intf;

public abstract class InterfaceConfiguration {
    private InterfacePort portRequis;
    private InterfacePort portFournis;

    public InterfaceConfiguration(InterfacePort portR,InterfacePort portF){
        this.portRequis = portR;
        this.portFournis = portF;
    }

    public InterfacePort getPortRequis() {
        return portRequis;
    }

    public InterfacePort getPortFournis() {
        return portFournis;
    }

    public void setPortRequis(InterfacePort portRequis) {
        this.portRequis = portRequis;
    }

    public void setPortFournis(InterfacePort portFournis) {
        this.portFournis = portFournis;
    }
}
