public class Weapon {

    private String name;
    private Damage damage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Damage getDamage() {
        return damage;
    }

    public void setDamage(Damage damage) {
        this.damage = damage;
    }

    public Weapon(String name, Damage damage) {
        this.name = name;
        this.damage = damage;
    }

}
