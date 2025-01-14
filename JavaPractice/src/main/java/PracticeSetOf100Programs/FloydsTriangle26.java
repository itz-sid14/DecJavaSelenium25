package PracticeSetOf100Programs;

import java.util.Scanner;

public class FloydsTriangle26 {

	public static void main(String[] args) {

		int n, num = 1, c, d;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of rows floyd's triangle you wants:");

		n = sc.nextInt();

		for (c = 1; c <= n; c++) {
			for (d = 1; d <= c; d++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
	}

}
