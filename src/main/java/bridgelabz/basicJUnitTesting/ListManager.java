package bridgelabz.basicJUnitTesting;

import java.util.ArrayList;
import java.util.List;

public class ListManager {

    public List<Integer> addElement(List<Integer> arr, int ele){
        arr.add(ele);
        return arr;
    }

    public List<Integer> removeElement(List<Integer> arr, int ele){
        int n = arr.size();

        for(int i=n-1;i>=0;i--){
            if(arr.get(i)==ele){
                arr.remove(i);
            }
        }
        return arr;
    }

    public int getSize(List<Integer> arr){
        return arr.size();
    }
}
