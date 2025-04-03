package bridgelabz.advanceJUnitProblems;

public class UserRegistration {
    String userName;
    String email;
    String password;

    public UserRegistration(String userName, String email, String password) {
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    public boolean registerUser(){

        String regexName = "^(?=\\s)[a-zA-Z]{3,}$";
        String regexEmail = "^[a-zA-Z0-9][\\w.]*@[a-z]+\\.[a-z]{2,}$";
        String regexPassword = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[\\d])(?=.*[!@#$%])[\\w]{8,}$";

        boolean name = this.userName.matches(regexName);
        boolean email = this.email.matches(regexEmail);
        boolean password = this.password.matches(regexPassword);
        return name && email && password;
    }
}
