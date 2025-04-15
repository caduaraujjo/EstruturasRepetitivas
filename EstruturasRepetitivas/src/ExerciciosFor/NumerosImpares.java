package ExerciciosFor;

import java.util.Scanner;

public class NumerosImpares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int produto = 0;
		
		if(x>=0 && x<=1000) {
			for(int i=0; i<=x; i++) {
				if(i%2==1) {
					produto = i;
					System.out.println(produto);
				}
			}
		}
		sc.close();
	}

}
