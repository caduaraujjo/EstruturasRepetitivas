package ExerciciosFor;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int f = 1;

		for (int i = n - 1; i > 0; i--) {
				f = n * i;
				n = f;
		
		}
		System.out.println(f);
		sc.close();
	}

}
