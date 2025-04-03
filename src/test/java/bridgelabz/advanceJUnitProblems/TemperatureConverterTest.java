package bridgelabz.advanceJUnitProblems;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class TemperatureConverterTest {
    double DELTA = 0.01;
    TemperatureConverter tc = new TemperatureConverter();

    @ParameterizedTest
    @CsvSource({"23.4, 74.12",
            "32.4, 90.32",
            "18.2, 64.76"})
    public void shouldConvertCelsiusToFahrenheit(double celsius, double ans){
        celsius = tc.celsiusToFahrenheit(celsius);
        assertEquals(ans,celsius,DELTA);
    }

    @ParameterizedTest
    @CsvSource({"113, 45",
            "116,46.6667",
            "119,48.3333"})
    public void shouldConvertFahrenheitToCelsius(double farhenhiet, double ans){
        farhenhiet = tc.fahrenheitToCelsius(farhenhiet);
        assertEquals(ans,farhenhiet,DELTA);
    }

}
