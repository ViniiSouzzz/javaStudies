package varargs;

public class Aluno {
	
	private String nome;
	private Double nota1;
	private Double nota2;
	private Double media;
	
	public Aluno() {		
	}
		
	public Aluno(String nome, Double nota1, Double nota2, Double media) {
		super();
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.media = media;
	}
	
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", nota1=" + nota1 + ", nota2=" + nota2 + ", media=" + media + "]";
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getNota1() {
		return nota1;
	}
	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}
	public Double getNota2() {
		return nota2;
	}
	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}
	public Double getMedia() {
		return media;
	}
	public void setMedia(Double media) {
		this.media = media;
	}
	
	public void obterMedia()throws Exception {
		if(this.getNota1()<0. || this.getNota2()<0.) {
			throw new Exception("A nota do aluno não pode ser negativa");
		}
		this.media = (this.nota1 + this.nota2)/2;
	}
	
	
}