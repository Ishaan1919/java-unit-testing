package bridgelabz.basicJUnitTesting;

import org.junit.jupiter.api.*;

public class DataBaseConnectionTest {
    DataBaseConnection db;


    @BeforeEach
    public void BeforeEachTesting(){
        db = new DataBaseConnection("MySql");
    }

    @AfterEach
    public void afterEachTesting(){
        db.disconnect();
    }

    @Test
    public void connectTest1(){
        db.connect();
    }

    @Test
    public void connectTest2(){
        db.connect();
    }
    @Test
    public void connectTest3(){
        db.connect();
    }

}
