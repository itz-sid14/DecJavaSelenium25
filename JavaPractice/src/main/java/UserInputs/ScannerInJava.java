package UserInputs;

import java.util.Scanner;

public class ScannerInJava {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the first number");
		int i = sc.nextInt();
		
		System.out.println("Enter the second number");
		int j =sc.nextInt();
		
		
		
		System.out.println("Result = "+ (i+j));
	}

}
