import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CalculatriceTest extends TestCase{

    @Test
    public void testAdd() {
        assertEquals(Calculatrice.add(1, 2), 3.0);
        assertEquals(Calculatrice.add(-10, 5), -5.0);
        assertEquals(Calculatrice.add(10, -5), 5.0);
//        assertEquals(Calculatrice.add(-10, -5), -15.0);
    }
    @Test
    public void testSub() {
        assertEquals(Calculatrice.sub(2, 1), 1.0);
        assertEquals(Calculatrice.sub(-10, 5), -15.0);
        assertEquals(Calculatrice.sub(10, -5), 15.0);
        assertEquals(Calculatrice.sub(5, 5), 0.0);
    }
    @Test
    public void testMul() {
        assertEquals(Calculatrice.mul(2, 2), 4.0);
        assertEquals(Calculatrice.mul(-10, 5), -50.0);
        assertEquals(Calculatrice.mul(10, 5), 50.0);
    }
    @Test
    public void testDiv() {
        assertEquals(Calculatrice.div(4, 2), 2.0);
        assertEquals(Calculatrice.div(-10, 5), -2.0);
        assertEquals(Calculatrice.div(10, 5), 2.0);
    }
    @Test
    public void testAvg() {
        List<Double> tab = new ArrayList<>(){{add(1.0); add(2.0); add(3.0);}};
        assertEquals(Calculatrice.avg(tab), 2.0);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivByZero() {
        Calculatrice.div(4, 0);
    }
}



