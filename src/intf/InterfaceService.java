package intf;

public abstract class InterfaceService {

    private String name;

    public InterfaceService(String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
