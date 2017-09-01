package Lista01;

import java.util.Scanner;

public class Questao06 {
	private static Scanner ler;
	
	public static void main(String[] args) {
		
		ler = new Scanner(System.in);
		
		double A,B,adc,sub,div,mult;
		
		
		System.out.printf("Digite o primeiro número: \n");
		A = ler.nextDouble();
		
		System.out.printf("Digite o segundo número: \n");
		B = ler.nextDouble();
		
		
		adc = (A+B);
		sub = (A-B);
		div = (A/B);
		mult = (A*B);
		System.out.println("Adição: \n"+adc);
		System.out.println("Subtração: \n"+sub);
		System.out.println("Divisão: \n"+div);
		System.out.println("Multiplicação: \n"+mult);
	}
}
