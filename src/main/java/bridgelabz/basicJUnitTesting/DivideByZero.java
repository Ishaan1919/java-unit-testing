package bridgelabz.basicJUnitTesting;

public class DivideByZero {

    public int divide(int a, int b){
        if(b==0){
            throw new ArithmeticException("You can not divide by zero");
        }
        return a/b;
    }
}
