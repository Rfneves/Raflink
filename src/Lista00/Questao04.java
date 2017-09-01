package Lista00;

import java.util.Scanner;

public class Questao04 {
	private static Scanner ler;
	
	public static void main(String[] args) {
		
	ler = new Scanner(System.in) ;
		
		double carVend, sal, comissao;
		
		System.out.printf("Informe quantos carros foram vendidos:\n");
			carVend = ler.nextDouble();
		
		comissao = 300. * carVend;
		sal = 800. + comissao;
		System.out.println("Seu salário é de "+sal+" reais");	
	}
}
