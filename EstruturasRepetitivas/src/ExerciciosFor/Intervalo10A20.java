package ExerciciosFor;

import java.util.Scanner;

public class Intervalo10A20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = 0;
		int in = 0,out = 0;
		
		for(int i=0;i<n;i++) {
			x = sc.nextInt();
			if(x>=10 && x <=20) {
				in = in + 1;
			}
			else {
				out = out + 1;
			}
		}
		System.out.println(in + " in");
		System.out.println(out + " out");
		sc.close();
	}

}
