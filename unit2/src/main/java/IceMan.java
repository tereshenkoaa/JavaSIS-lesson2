public class IceMan extends Target {

    private String name;
    private Immunity immunity;

    public IceMan(String name, Immunity immunity) {
        this.name = name;
        this.immunity = immunity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Immunity getImmunity() {
        return immunity;
    }

    public void setImmunity(Immunity immunity) {
        this.immunity = immunity;
    }
}
