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
		System.out.println("Is the current temperature you're converting in Fahrenheit or Celsius?");
		System.out.println("Type 'F' for fahrenheit or 'C' for celsius:" + "");
		String isItForC = takeInTheTemp.nextLine();

		if (isItForC.equalsIgnoreCase("f")) {
			System.out.println("\n" + "You chose Fahrenheit, so let's convert your temperature to Celsius. Enter that number below:");
			String enteredNumberF = takeInTheTemp.nextLine();

			double convertToDoubleC = Double.parseDouble(enteredNumberF);
			double finalNumberC = ((convertToDoubleC * 9 / 5) + 32);
			BigDecimal convertToDoubleCBigDecimal = new BigDecimal(finalNumberC).setScale(2, RoundingMode.HALF_UP);

			System.out.println("\n" + "You entered " + convertToDoubleC + ", which converts to " + convertToDoubleCBigDecimal + " degrees Celsius!");
	
			
		} else if (isItForC.equalsIgnoreCase("c")) {
			System.out.println("You chose Celsius, so let's convert your temperature to Fahrenheit. Enter that number below:");
			String enteredNumberC = takeInTheTemp.nextLine();

			double convertToDoubleF = Double.parseDouble(enteredNumberC);
			double finalNumberF = ((convertToDoubleF - 32) * 5 / 9);
			BigDecimal convertToDoubleFBigDecimal = new BigDecimal(finalNumberF).setScale(2, RoundingMode.HALF_UP);
			System.out.println("You entered " + enteredNumberC + ", which converts to " + convertToDoubleFBigDecimal + " degrees Fahrenheit!");

		} else {
			System.out.println("This is not a valid selection. Please try again!");
		}
		}
	}

