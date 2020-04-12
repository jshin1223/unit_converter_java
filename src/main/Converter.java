package main;

import java.util.Scanner;

public class Converter {
	
	public static void main(String[] args) {
		
		int menuSelection = 0;
		
				
		while (menuSelection != 5) {
			
			System.out.println("Please select a number option: \n1. Fahrenheit to Celsius \n2. Meter to Centimeters \n3. Dollar to Pound \n4. Miles to Kilometers \n5. Quit");
				
			Scanner in = new Scanner(System.in);
			menuSelection = in.nextInt();
			//System.out.print(menuSelection);
			
			switch(menuSelection) {
			case 1:
				double temp;
				System.out.println("Please enter degrees Fahrenheit:");
				temp = in.nextDouble();
				double c;
				c = ((temp - 32) * 5 /9);
				System.out.println("The temperature is " + c + " celsius.");
				break;
				
				
			case 2:
				double length;
				System.out.println("Please enter the length in Meter:");
				length = in.nextDouble();
				double centimeter;
				centimeter = length * 100; 
				System.out.println("The length is " + centimeter + " centimeters.");
				break;
				
				
			case 3:
				double currency;
				System.out.println("Please enter the currenty value in Dollar:");
				currency = in.nextDouble();
				double pound;
				pound = currency * 0.8; 
				System.out.println("The currency value is " + pound + " pound.");
				break;
			
			case 4:
				double distance;
				System.out.println("Please enter the distance in Mile:");
				distance = in.nextDouble();
				double kilometer;
				kilometer = distance * 1.60934; 
				System.out.println("The distance is " + kilometer + " kilometers.");
				break;
				
			
				
				
			}
		}
	}
}