package Testes;

import java.util.Scanner;

public class OperadoresLogicos {
		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			
			double media, freq;
			
			System.out.printf("Digite sua m�dia: \n");
				media = ler.nextDouble();
				
			System.out.printf("Digite sua frequencia: \n");
				freq = ler.nextDouble();
				ler.close();
				
				
			if (freq >= 75. && media >= 6.0){
				System.out.println("Voc� Passou!");
			} else {
				System.out.println("Voc� Reprovou!");
			}
				
		}
}
