package bridgelabz.basicJUnitTesting;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.*;


import static org.junit.Assert.assertEquals;

public class EvenNumberTest {
    EvenNumber e = new EvenNumber();

    @ParameterizedTest
//    @ValueSource(ints = {12,2,32,4,52,6})
    @CsvSource({
            "2","4","3"
    })
    void isEvenTest(int num){
        assertTrue(e.isEven(num));
    }

}
