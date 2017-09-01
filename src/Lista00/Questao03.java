package Lista00;

import java.util.Scanner;

public class Questao03 {
	private static Scanner ler;

	public static void main(String[] args) {
		
		/*3.	Escreva um programa que dados os litros gastos, os quilômetros percorridos por um automóvel e o
		 *  valor do litro de combustível, calcule os gastos de combustível em reais/km. */
		
		ler = new Scanner(System.in);

	      double litros, kms, vlrLitro, vlrKm, vlrTotal;

	      System.out.printf("Informe o valor do litro de combustivel:\n");
	      vlrLitro = ler.nextDouble();

	      System.out.printf("\nInforme a qtde de litros gastos:\n");
	      litros = ler.nextDouble();

	      System.out.printf("\nInforme os quilometros percorridos:\n");
	      kms = ler.nextDouble();

	      vlrTotal = litros * vlrLitro;
	      vlrKm = vlrTotal / kms;
	      System.out.printf("\n\nValor total gasto = R$ %8.2f", vlrTotal);
	      System.out.printf("\nValor gasto / km  = R$ %8.2f\n", vlrKm);
	    }
}
