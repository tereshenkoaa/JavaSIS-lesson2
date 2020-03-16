import lombok.*;

@Data
public class Target {

    private String name;
    private Immunity immunity;
    private int damageTaken;

    public Target(String name, Immunity immunity) {
        this.name = name;
        this.immunity = immunity;
        this.damageTaken = 0;
    }

    public void setDamageTaken(int Damage) {
        this.damageTaken += Damage;
    }

    public void hit(Weapon weapon) {

        int altDamage = 0;

        Damage currentDamage = weapon.getDamage();
        Immunity currentImmunity = getImmunity();


        if (currentImmunity == Immunity.ICE) {
            altDamage = altDamage + currentDamage.getFireDamage();
        }

        if (currentImmunity == Immunity.FIRE) {
            altDamage = altDamage + currentDamage.getIceDamage();
        }

        setDamageTaken(currentDamage.getPhysicalDamage() + altDamage);
    }

}
