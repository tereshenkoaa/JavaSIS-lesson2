public class Damage {

    private int physicalDamage;
    private int fireDamage;
    private int iceDamage;

    public Damage(int physicalDamage, int fireDamage, int iceDamage) {
        this.physicalDamage = physicalDamage;
        this.fireDamage = fireDamage;
        this.iceDamage = iceDamage;
    }

    public int getPhysicalDamage() {
        return physicalDamage;
    }

    public void setPhysicalDamage(int physicalDamage) {
        this.physicalDamage = physicalDamage;
    }

    public int getFireDamage() {
        return fireDamage;
    }

    public void setFireDamage(int fireDamage) {
        this.fireDamage = fireDamage;
    }

    public int getIceDamage() {
        return iceDamage;
    }

    public void setIceDamage(int iceDamage) {
        this.iceDamage = iceDamage;
    }
}
