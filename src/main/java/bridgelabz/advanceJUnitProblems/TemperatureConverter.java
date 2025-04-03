package bridgelabz.advanceJUnitProblems;

public class TemperatureConverter {
    public double celsiusToFahrenheit(double celsius) {
//        double fahrenheit = celsius*((double)(9/5)) + 32.0;
        double fahrenheit =  (celsius *9.0)/5.0+ 32.0;
        return fahrenheit;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit-32) / 1.8;
        return celsius;
    }
}
