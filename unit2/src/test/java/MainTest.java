import junit.framework.TestCase;
import org.junit.Test;

public class MainTest extends TestCase {

    @Test
    public void testIceDamage() {

        Damage fireDamage50 = new Damage(0,50,0);
        Weapon blazingAsphalt = new Weapon("пылающий асфальт",fireDamage50);
        IceMan target1 = new IceMan("ледяной великан",Immunity.ICE);

        int expected = 50;

        target1.hit(blazingAsphalt);
        assertEquals(expected,target1.getDamageTaken());
    }

    @Test
    public void testFireDamage() {

        Damage iceDamage50 = new Damage(0,0,50);
        Weapon nightSword = new Weapon("меч ночи в якутске",iceDamage50);
        FireMan target2 = new FireMan("эфрит",Immunity.FIRE);

        int expected = 50;

        target2.hit(nightSword);
        assertEquals(expected,target2.getDamageTaken());
    }

    //тест для проверки накопления урона
    @Test
    public void testTwoIceDamage() {

        Damage fireDamage20 = new Damage(0,20,0);
        Weapon blazingAsphalt = new Weapon("пылающий асфальт",fireDamage20);
        IceMan target1 = new IceMan("ледяной великан",Immunity.ICE);

        int expected = 40;

        target1.hit(blazingAsphalt);
        target1.hit(blazingAsphalt);
        assertEquals(expected,target1.getDamageTaken());
    }


}
