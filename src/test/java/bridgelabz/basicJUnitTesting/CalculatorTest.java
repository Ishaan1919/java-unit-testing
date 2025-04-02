package bridgelabz.basicJUnitTesting;

import org.junit.jupiter.api.*;

import static org.junit.Assert.*;

public class CalculatorTest {

    static Calculator cal;
    @BeforeAll
    static void instanceing(){
        cal = new Calculator();
    }

    @Test
    public void addOperation(){
        assertEquals(7,cal.add(3,4));
    }

    @Test
    public void subtractOperation(){
        assertEquals(-1,cal.subtract(3,4));
    }

    @Test
    public void multiplyOperation(){
        assertEquals(12,cal.multiply(3,4));
    }

    @Test
    public void divideOperation(){
        Assertions.assertEquals(0, Calculator.divide(3,4));
        assertThrows(ArithmeticException.class, () -> Calculator.divide(4,0));
    }

}
