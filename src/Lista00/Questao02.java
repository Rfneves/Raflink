/* 2.	Implemente um programa para determinar o consumo m�dio de um autom�vel atrav�s da f�rmula: Consumo M�dio = Dist�ncia / Litros de Combust�vel consumido.*/
package Lista00;

import java.util.Scanner;

public class Questao02 {
	private static Scanner ler;
	
	public static void main(String[] args) {
		
		
		ler = new Scanner(System.in);
		
		double distancia, ltrsCons, consMed;

		System.out.printf("Informe o valor da Dist�ncia:\n");
	      distancia = ler.nextDouble();
		
	    System.out.printf("Informe o valor de litros consumidos:\n");
	      ltrsCons = ler.nextDouble();
		
		consMed = distancia/ltrsCons;	
		System.out.println("R$"+consMed);			
	}
}
