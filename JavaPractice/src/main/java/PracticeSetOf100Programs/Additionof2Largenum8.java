package PracticeSetOf100Programs;

import java.math.BigInteger;
import java.util.Scanner;

public class Additionof2Largenum8 {
	
	public static void main(String[] args) {
		
		String num1 , num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your first large number ");
		num1 = sc.nextLine();
		
		System.out.println("Enter your second large number ");
		num2 = sc.nextLine();
		
		BigInteger first = new BigInteger(num1);
		BigInteger second = new BigInteger(num2);
		
		BigInteger sum;
		
		sum = first.add(second);
		
		System.out.println("The sum of TWO big Integer number is = " + sum);
		
	}

}
