package bridgelabz.basicJUnitTesting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.Assert.assertTrue;

public class PerformanceTestingTest {

    @Test
    @Timeout(2)
    public void performanceTest(){
        assertTrue(PerformanceTesting.performance());
    }
}
