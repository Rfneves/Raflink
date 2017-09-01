package Lista00;

import java.util.Scanner;

public class Questao01 {
	private static Scanner ler;
	
	public static void main(String[] args) {
		
		/*1.	Desenvolva um programa para dado o preço de um produto, calcular o novo preço com desconto de 9%. */
		
		ler = new Scanner(System.in);
		
		double porcentagem = 9;		
		double resultado, valor;

		System.out.printf("Informe o valor do produto:\n");
	      valor = ler.nextDouble();
		
		resultado = (valor * porcentagem)/100;	
		System.out.println(resultado);
	}
}
