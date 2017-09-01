package Testes;

import java.util.Scanner;

public class TesteLogin {
		public static void main(String[] args) {
			
			int senha = 123;
			int senhaDigitada;
			
			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("Informe a senha: ");
			senhaDigitada = scan.nextInt();
			
			while(senha != senhaDigitada) {
				System.out.print("Informe a senha: ");
				senhaDigitada = scan.nextInt();
			}
			
			scan.close();
			System.out.println("Está logado!");
		}
}
