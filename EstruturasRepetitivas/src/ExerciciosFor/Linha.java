package ExerciciosFor;

import java.util.Scanner;

public class Linha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double quad = 0;
		double cubo = 0;

		for (int i = 1; i <= n; i++) {
			System.out.print(" " + i + " ");
			quad = Math.pow(i, 2);
			System.out.printf(" %.0f ", quad);
			cubo = Math.pow(i, 3);
			System.out.printf(" %.0f ", cubo);
		}
		sc.close();
	}

}
