package Lista01;

import java.util.Scanner;

public class Questao08 {
		private static Scanner ler;
	
		public static void main (String[] args) {
			
			ler = new Scanner(System.in);
			
			int n1;
			
			System.out.printf("Digite um numero inteiro:\n");
		      n1 = ler.nextInt();
			
			double qd = (n1 * n1 * n1);	
		    System.out.println(qd);
		      
		}
}