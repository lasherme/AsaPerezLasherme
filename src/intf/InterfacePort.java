package intf;

public abstract class InterfacePort {

    private String name;

    public InterfacePort(String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
