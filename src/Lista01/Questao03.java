package Lista01;

public class Questao03 {
		public static void main(String[] args) {
			
			double assinatura = 32.;
			double impulsos = .09;
			double chamadasCelular = 0.35;
			
			double valorDaConta = assinatura + ((254-90) * impulsos) + 23 * chamadasCelular;
			
			System.out.println("O valor da conta seá: " + valorDaConta);
			
		}
}
