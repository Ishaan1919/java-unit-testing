package bridgelabz.basicJUnitTesting;


public class StringMethods {
    StringBuilder s;

    public StringMethods(String s){
        this.s = new StringBuilder(s);
//        System.out.println(s);
    }

    public String reversE(){
//        System.out.println(s);
        return this.s.reverse().toString();
    }

    public String toUpperCase(){
        return this.s.toString().toUpperCase();
    }

    public boolean isPalindrome(){
        int n = s.length();
        int i=0;
        int j=n-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
