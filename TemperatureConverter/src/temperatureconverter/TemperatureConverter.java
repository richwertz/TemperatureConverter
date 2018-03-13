/*
 * Create a console application that converts temperature values for fahrenheit to celsius, and celsius to fahrenheit.
 * 
 */
package temperatureconverter;
import java.util.Scanner;

/**
 *
 * @author Rich Wertz
 */
public class TemperatureConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		
	Scanner tempF = new Scanner(System.in);
	System.out.println("Enter fahrenheit temperature to convert: ");
	double fahrenheit = tempF.nextDouble();
	double convCelsius = (fahrenheit - 32) * (5/9.0);
	
	System.out.println();
	System.out.println(fahrenheit + " degrees Fahrenheit is " + convCelsius + " degrees Celsius.");
	
	System.out.println();
	Scanner tempC = new Scanner(System.in);
	System.out.println("Enter celsius temperature to convert: ");
	double celsius = tempC.nextDouble();
	double convFahrenheit = (celsius * (9/5.0) + 32);

	System.out.println();
	System.out.println(celsius + " degrees Celsius is " + convFahrenheit + " degrees Fahrenheit.");
    }
    
}
