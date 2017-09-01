package Testes;

import java.util.Scanner;

public class TestaLeitura {
		public static void main(String[] args) {
			String nomeCompleto;
			Integer idade;
			Double peso;
			String sexo;
			Boolean maiorIdade = false;
			
			Scanner teclado = new Scanner(System.in);
			
			System.out.print("Informe o nome completo: ");
			nomeCompleto = teclado.nextLine();
			System.out.print("Informe a idade: ");
			idade = teclado.nextInt();
			System.out.print("Informe o peso: ");
			peso = teclado.nextDouble();
			System.out.print("Informe o sexo: ");
			sexo = teclado.next();
			teclado.close();
			
			if(idade >= 18);
				maiorIdade = true;
				
			System.out.println("O nome informado foi: "+ nomeCompleto +
					"\nAidade informada foi: " + idade +
					"\nO peso informado foi: " + peso +
					"\nO sexo informado foi: " + sexo +
					"\n Com os dados informados foi definido que a pessoa é" +
					(maiorIdade ? "maior" : "menor") + " de idade");
			
		}
}
