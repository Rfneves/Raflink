/* 2.	Implemente um programa para determinar o consumo médio de um automóvel através da fórmula: Consumo Médio = Distância / Litros de Combustível consumido.*/
package Lista00;

import java.util.Scanner;

public class Questao02 {
	private static Scanner ler;
	
	public static void main(String[] args) {
		
		
		ler = new Scanner(System.in);
		
		double distancia, ltrsCons, consMed;

		System.out.printf("Informe o valor da Distância:\n");
	      distancia = ler.nextDouble();
		
	    System.out.printf("Informe o valor de litros consumidos:\n");
	      ltrsCons = ler.nextDouble();
		
		consMed = distancia/ltrsCons;	
		System.out.println("R$"+consMed);			
	}
}
