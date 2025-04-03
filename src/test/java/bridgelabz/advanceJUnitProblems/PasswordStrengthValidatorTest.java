package bridgelabz.advanceJUnitProblems;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordStrengthValidatorTest {
    PasswordStrengthValidator psv = new PasswordStrengthValidator();

    @ParameterizedTest
    @ValueSource(strings = {"Hiuhgihi3_","HhutifH232","1hhgihiI"})
    public void passwordStrengthValidatorTest(String s){
        assertTrue(psv.passwordStrengthValidator(s));
    }
}
