package bridgelabz.basicJUnitTesting;

public class PerformanceTesting {
    public static boolean performance(){
        try{
            Thread.sleep(3000);
        }
        catch (Exception e){
            System.out.println("Some error occurred");
        }
        return true;
    }
}
