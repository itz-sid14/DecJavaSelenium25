package PracticeSetOf100Programs;

import java.util.Scanner;

public class StringComparision15 {
	
	public static void main(String[] args) {
		
		String first, second;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter you first String= ");
		first = sc.nextLine();
		
		System.out.println("Enter your second String= ");
		second = sc.nextLine();
		
		if(first.compareTo(second) < 0)
		
			System.out.println("First string is greater than second");
			
			else if(first.compareTo(second) > 0)
				System.out.println("Fisrt String is smaller than Second");		
		
		else
			System.out.println("Both Strings are equal..");
	}

}
