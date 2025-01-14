package PracticeSetOf100Programs;

import java.util.Scanner;

public class Swap2noUsing3rdVariable6 {
	
	public static void main(String[] args) {
		
		int x, y, swappednum;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the x & y");
		x= sc.nextInt();
		y= sc.nextInt();
		
		System.out.println("Before swapping x = "+ x + " y = " + y);
		
		swappednum = x;
		
		x = y;
		y = swappednum;
		
		System.err.println("After swapping x = "+ x + " y = "+ y);
	}

}
