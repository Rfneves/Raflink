package Lista00;

import java.util.Scanner;

public class Questao05 {
	private static Scanner ler;
	
	public static void main(String[] args) {
		
	ler = new Scanner(System.in);	
		
		double brancos, nulos, validos;
		double total, percBrancos, percNulos, percValidos;
		
		System.out.printf("Escreva o n�mero de votos Brancos:\n");
			brancos = ler.nextDouble();
			
		System.out.printf("Escreva o n�mero de votos v�lidos:\n");
			validos = ler.nextDouble();
			
		System.out.printf("Escreva o n�mero de votos Nulos:\n");
			nulos = ler.nextDouble();	
			
		total = (brancos + validos + nulos);	
		percBrancos = (brancos*total)/100.;
		percNulos = (nulos*total)/100.;
		percValidos = (validos*total)/100.;
	
		System.out.println("O percentual de brancos � de:"+percBrancos);
		System.out.println("O percentual de Nulos � de:"+percNulos);
		System.out.println("O percentual de Validos � de:"+percValidos);		
	}
}
