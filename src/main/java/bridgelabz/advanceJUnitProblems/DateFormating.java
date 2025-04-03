package bridgelabz.advanceJUnitProblems;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormating {

    public String dateFormatConverter(String date) {
        DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.parse(date,inputFormat);

        DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//        System.out.println("Hello");
//        System.out.println(localDate.toString());
//        System.out.println(localDate);
//        String ansDate = LocalDate.parse(localDate.toString(),outputFormat).toString();
//        System.out.println(ansDate);
        String ansDate = localDate.format(outputFormat);
        return ansDate;
    }
}
