package Interface2;

import java.text.NumberFormat;

public class Aluno {
		
	private String nome;
	private EstrategiaMedia estrategiaMedia;
	
	public Aluno(String nome, EstrategiaMedia estrategiaMedia) {
		super();
		this.nome = nome;
		this.estrategiaMedia = estrategiaMedia;
	}
	
	public void obterMedia(Double nota1, Double nota2, Double trabalho) {
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(2);
		nf.setMinimumFractionDigits(2);
		
		
		
		System.out.println("Nome;" + nome);
		System.out.println("media:" + nf.format(this.estrategiaMedia.media(nota1, nota2, trabalho)));
			
		
	}
}
