package ExerciciosFor;

import java.util.Scanner;

public class SomaContagem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int soma = 0;
		
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			soma = soma + x;
		}
		sc.close();
		System.out.println(soma);
	}

}
