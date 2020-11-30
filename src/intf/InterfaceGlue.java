package intf;

public abstract class InterfaceGlue {

    private String name;

    public InterfaceGlue(String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
