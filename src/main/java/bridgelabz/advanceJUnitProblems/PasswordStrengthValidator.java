package bridgelabz.advanceJUnitProblems;

public class PasswordStrengthValidator {
    boolean passwordStrengthValidator(String str){
        String regex = "^(?=.*[A-Z])(?=.*\\d)[\\w!@#$%^&*]{8,}$"; // Ishaan19
        if(str.matches(regex)){
            return true;
        }
        return false;
    }
}
