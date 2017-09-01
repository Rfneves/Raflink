package testesSlide;

public class EstruturaDeDecisao02 {
	public static void main(String [] args) {
		String materia = "Java";
		
		if(materia == "PHP") {
			System.out.println("Disciplina do 4° módulo");
		} else if(materia == "Banco de dados") {
			System.out.println("Disciplina do 3° módulo");
		} else if(materia == "Java") {
			System.out.println("Disciplina do 5° módulo");
		} else {
			System.out.println("Disciplina não é dos módulos de programação");
		}
	}
}
