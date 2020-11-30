package intf;

public abstract class InterfaceRole {

    private String name;

    public InterfaceRole(String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
