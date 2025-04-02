package bridgelabz.basicJUnitTesting;

import org.junit.Before;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ListManagerTest {
    List<Integer> arr = new ArrayList<>();
    static ListManager obj;

    @BeforeAll
    public static void instantiate(){
        obj = new ListManager();
    }

    @Test
    public void addElementTest(){

        List<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        arr = new ArrayList<>(list);
        list.add(4);
        assertEquals(list.toArray() , obj.addElement(arr,4).toArray());
    }

    @Test
    public void removeElementTest(){

        List<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        arr = list;
        list.remove(3);
        assertEquals(list.toArray() , obj.removeElement(arr,4).toArray());
    }

    @Test
    public void getSizeTest(){

        List<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        assertEquals(list.size() , obj.getSize(list));
    }


}
