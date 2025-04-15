package ExerciciosWhile;

import java.util.Scanner;

public class RelatorioCombustivel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cod = 0;
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		while (cod != 4) {
			cod = sc.nextInt();
			if (cod == 1) {
				alcool += 1;
			} else if (cod == 2) {
				gasolina += 1;
			} else if (cod == 3) {
				diesel += 1;
			}
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		sc.close();

	}

}
