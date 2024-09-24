package Interface2;

public class Main {

	public static void main(String[] args) {
	EstrategiaMedia estrategiasimples=new MediaSimples();
	Aluno aluno=new Aluno("joao",estrategiasimples);
		aluno.obterMedia(8., 9., null);
		EstrategiaMedia estrategiaTrabalho=new MediaTrabalho();
	Aluno aluno2=new Aluno("miguel",estrategiaTrabalho);
		aluno2.obterMedia(8., 7., 10.);	
	}
}
