package varargs;

public class Main {

	public static void main(String[] args) {
	Aluno aluno = new Aluno();
	try {
	aluno.setNome("Jose");
	aluno.setNota1(9.);
	aluno.setNota2(-1.);
	aluno.obterMedia();
	System.out.println(aluno.getMedia());
	}catch(Exception ex) {
	System.out.println("Error " + ex.getMessage());	
	}
	System.out.println("continua......o programa");
	}

}
