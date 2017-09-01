package Lista01;

import java.util.Scanner;

public class Questao09 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int A,B,div,qd1,cb2;
		
		
		System.out.printf("Digite o primeiro número: \n");
		A = ler.nextInt();
		ler.close();
		
		System.out.printf("Digite o segundo número: \n");
		B = ler.nextInt();
		ler.close();
		
		div = (A/B);
		qd1 = (A*A);
		cb2 = (B*B*B);
			
			System.out.println("A Divisão do primeiro pelo segundo: \n"+div);
			System.out.println("Quadrado do primeiro: \n"+qd1);
			System.out.println("Cubo do segundo: \n"+cb2);
	}
}
