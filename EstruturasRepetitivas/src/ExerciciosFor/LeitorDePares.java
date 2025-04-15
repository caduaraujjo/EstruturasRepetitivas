package ExerciciosFor;

import java.util.Scanner;

public class LeitorDePares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			double a = sc.nextInt();
			double b = sc.nextInt();
			double produto = 0;
			if (a != 0 && b != 0) {
				produto = a / b;
				System.out.printf("%.1f", produto);
			} else {
				System.out.println("divisao impossivel");
			}
		}
		sc.close();
	}

}
