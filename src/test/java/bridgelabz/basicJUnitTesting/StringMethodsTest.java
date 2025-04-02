package bridgelabz.basicJUnitTesting;

import org.junit.Before;
import org.junit.jupiter.api.*;

import static org.junit.Assert.*;

public class StringMethodsTest {
    static StringMethods s;

    @BeforeAll
    public static void instanctiate(){
        s = new StringMethods("Hello_olleH");
    }

    @Test
    public void reverseTest(){
        assertEquals("Hello_olleH", s.reversE());
    }

    @Test
    public void  toUpperCaseTest(){
        assertEquals("HELLO_OLLEH",s.toUpperCase());
    }

    @Test
    public void isPalindromeTest(){
        assertFalse(s.isPalindrome()==false);
    }
}
