package ExerciciosFor;

import java.util.Scanner;

public class Dvisores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int div = 0;
		
		for(int i=n;i>0;i--) {
			if (n%i==0) {
				div = i;
				System.out.println(div);
			}
		}
			
		sc.close();
	}

}
