package Lista01;

import java.util.Scanner;

public class Questao06 {
	private static Scanner ler;
	
	public static void main(String[] args) {
		
		ler = new Scanner(System.in);
		
		double A,B,adc,sub,div,mult;
		
		
		System.out.printf("Digite o primeiro n�mero: \n");
		A = ler.nextDouble();
		
		System.out.printf("Digite o segundo n�mero: \n");
		B = ler.nextDouble();
		
		
		adc = (A+B);
		sub = (A-B);
		div = (A/B);
		mult = (A*B);
		System.out.println("Adi��o: \n"+adc);
		System.out.println("Subtra��o: \n"+sub);
		System.out.println("Divis�o: \n"+div);
		System.out.println("Multiplica��o: \n"+mult);
	}
}
