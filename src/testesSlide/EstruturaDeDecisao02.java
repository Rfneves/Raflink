package testesSlide;

public class EstruturaDeDecisao02 {
	public static void main(String [] args) {
		String materia = "Java";
		
		if(materia == "PHP") {
			System.out.println("Disciplina do 4� m�dulo");
		} else if(materia == "Banco de dados") {
			System.out.println("Disciplina do 3� m�dulo");
		} else if(materia == "Java") {
			System.out.println("Disciplina do 5� m�dulo");
		} else {
			System.out.println("Disciplina n�o � dos m�dulos de programa��o");
		}
	}
}
