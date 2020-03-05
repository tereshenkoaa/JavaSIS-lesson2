public class Target {

    String name;
    Immunity immunity;
    int damageTaken;

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

    public int getDamageTaken() {
        return damageTaken;
    }

    public void setDamageTaken(int damageTaken) {
        this.damageTaken = damageTaken;
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
