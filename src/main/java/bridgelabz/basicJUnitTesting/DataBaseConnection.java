package bridgelabz.basicJUnitTesting;

import static java.lang.String.valueOf;

public class DataBaseConnection {
    String s;
    static int i=0;

    public DataBaseConnection(String s){
        i++;
        this.s = s + " " + valueOf(i);
    }

    void connect(){
        System.out.println("Connected Succefully: " + s);
    }

    void disconnect(){
        System.out.println("Disconnected Succefull: " + s);
    }
}
