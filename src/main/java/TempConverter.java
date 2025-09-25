import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        System.out.print("Enter celcius: ");
        double celcius = sc.nextDouble();
        System.out.print("Enter kelvin: ");
        double kelvin = sc.nextDouble();

        TempConverter converter = new TempConverter();
        System.out.println("Fahrenheit to Celsius: " + converter.fahrenheitToCelsius(fahrenheit));
        System.out.println("Celsius to Fahrenheit: " + converter.celsiusToFahrenheit(celcius));
        System.out.println("Kelvin to Celsius: " + converter.kelvinToCelsius(kelvin));

    }

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public double kelvinToCelsius(double kelvin) {return kelvin - 273.15;}

    public boolean isExtremeTemperature(double celsius) {
        return celsius < -40 || celsius > 50;
    }
}
