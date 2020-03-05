public class Main {

    public static void main(String[] args) {

        Damage fireDamage50 = new Damage(0,50,0);
        Damage iceDamage50 = new Damage(0,0,50);

        Weapon nightSword = new Weapon("меч ночи в якутске",iceDamage50);
        Weapon blazingAsphalt = new Weapon("пылающий асфальт",fireDamage50);

        IceMan target1 = new IceMan("ледяной великан",Immunity.ICE);
        FireMan target2 = new FireMan("эфрит",Immunity.FIRE);

        System.out.println("Work");
        target1.hit(nightSword);

    }

}
