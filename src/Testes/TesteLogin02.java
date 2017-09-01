package Testes;

import java.util.Scanner;

public class TesteLogin02 {
		public static void main(String[] args) {
			
			int senha = 123;
			int senhaDigitada;
			
			
			Scanner scan = new Scanner(System.in);			
			
			do {
				System.out.print("Informe a senha: ");
				senhaDigitada = scan.nextInt();
			} while(senha != senhaDigitada);
			
			scan.close();
			System.out.println("Está logado!");
		}
}
