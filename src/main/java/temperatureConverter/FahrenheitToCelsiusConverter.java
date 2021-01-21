package temperatureConverter;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class FahrenheitToCelsiusConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner takeInTheTemp = new Scanner(System.in);

		System.out.println("Welcome to Kacie's Temperature Converter Tool!");
		System.out.println(
				"With this tool, you will be able to convert your current temperature to either Fahrenheit or Celsius."
						+ "\n");
		System.out.println("Do you want to convert to Fahrenheit or Celsius");
		System.out.println("Type 'F' for fahrenheit or 'C' for celsius:" + "");
		String isItForC = takeInTheTemp.nextLine();

		if (isItForC.equalsIgnoreCase("f")) {
			System.out.println("\n" + "You chose Fahrenheit! Enter the number that you would like to convert to Fahrenheit:");
			String enteredNumberF = takeInTheTemp.nextLine();

			double convertToFahrenheit = Double.parseDouble(enteredNumberF);
			double finalFahrenheit = ((convertToFahrenheit * 9 / 5) + 32);
			BigDecimal fahrenheitBigDecimal = new BigDecimal(finalFahrenheit).setScale(2, RoundingMode.HALF_UP);
			

			System.out.println("\n" + "You entered " + enteredNumberF + ", which converts to " + fahrenheitBigDecimal + " degrees Fahrenheit!");
	
			
		} else if (isItForC.equalsIgnoreCase("c")) {
			System.out.println("\n" + "You chose Celsius! Enter the number that you would like to convert to Fahrenheit:");
			String enteredNumberC = takeInTheTemp.nextLine();

			double convertToCelsius = Double.parseDouble(enteredNumberC);
			double finalCelsius = ((convertToCelsius - 32) * 5 / 9);
			
			BigDecimal celsiusBigDecimal = new BigDecimal(finalCelsius).setScale(2, RoundingMode.HALF_UP);
			System.out.println("You entered " + enteredNumberC + ", which converts to " + celsiusBigDecimal + " degrees Fahrenheit!");

		} else {
			System.out.println("This is not a valid selection. Please try again!");
		}
		}
	}

