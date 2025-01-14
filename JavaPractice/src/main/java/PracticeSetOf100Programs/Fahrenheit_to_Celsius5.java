package PracticeSetOf100Programs;

import java.util.Scanner;

public class Fahrenheit_to_Celsius5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float temprature;
		
		System.out.println(" Enter you temprature Fahrenheit");
		 temprature = sc.nextInt();
		 
		 temprature = ((temprature -32)*5)/9;
		 
		 System.out.println("Temprature in Clesius is = " + temprature);
		
		
		
		
	}

}
