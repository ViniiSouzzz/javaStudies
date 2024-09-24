package Interface1;

public class Main {

	public static void main(String[] args) {
		EstrategiaApresentacao apresentacao = new Aluno();
		System.out.print(apresentacao.estrategia() + "\n");
		EstrategiaApresentacao apresentacao2 = new Professor();
		System.out.print(apresentacao2.estrategia());
	}
}
