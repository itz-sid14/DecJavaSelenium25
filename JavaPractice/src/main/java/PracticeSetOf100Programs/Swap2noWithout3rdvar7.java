package PracticeSetOf100Programs;

import java.util.Scanner;

public class Swap2noWithout3rdvar7 {
	
	public static void main(String[] args) {
		
		int x, y;
		
		System.out.println(" Enter x & y ");
		
		Scanner sc = new Scanner(System.in);
		
		x= sc.nextInt();
		y= sc.nextInt();
		
		System.out.println(" Before swapping x = " + x +" and y = " + y);
		
		x= x + y;
		y= x - y;
		x= x - y;
		
		System.out.println(" After swapping the x = " + x + " And y = " + y);
	}

}
