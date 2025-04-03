package bridgelabz.advanceJUnitProblems;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.Assert.assertTrue;

public class UserRegistrationTest {
    UserRegistration ur;
    @ParameterizedTest
    @CsvSource({" Ishaan gupta, ishaan@gmail.com,H1Elllo@@ ", " ishaan, ishaan.be21@gmail.com, HHF@2jhfh"})
    public void shouldRegisterUser(String name, String email, String password){
        ur = new UserRegistration(name,email,password);
        assertTrue(ur.registerUser());
    }
}
