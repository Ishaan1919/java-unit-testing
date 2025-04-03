package bridgelabz.advanceJUnitProblems;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DateFormatingTest {
    DateFormating df = new DateFormating();

    @Test
    public void shouldConvertDateIntoDifferentFormat(){
//        2003-06-08    08-06-2003
        String expectedDate = "08-06-2003";
        String getDate = df.dateFormatConverter("2003-06-08");
        assertEquals(expectedDate,getDate);
    }
}
