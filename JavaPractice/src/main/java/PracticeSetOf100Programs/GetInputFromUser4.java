package PracticeSetOf100Programs;

import java.util.Scanner;

public class GetInputFromUser4 {
	
	public static void main(String[] args) {
		
		int i;
		float f;
		String s;
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println(" Enter your String");
		s =sc.nextLine();
		System.out.println("You entered String " + s);
		
		System.out.println();
		
		System.out.println(" Enter your Integer value");
		i= sc.nextInt();
		System.out.println("You entered Integer : " + i);
		
		System.out.println();
		
		System.out.println(" Enter your float value");
		f= sc.nextFloat();
		System.out.println("You entered Float " + f);
	}

}
