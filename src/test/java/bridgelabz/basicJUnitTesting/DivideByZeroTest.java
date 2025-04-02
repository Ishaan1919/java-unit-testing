package bridgelabz.basicJUnitTesting;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class DivideByZeroTest {
    static DivideByZero obj;

    @BeforeAll
    public static void instantiate(){
        obj = new DivideByZero();
    }

    @Test
    public void divideTest(){
        assertThrows(ArithmeticException.class , () -> obj.divide(2,0));
    }
}
