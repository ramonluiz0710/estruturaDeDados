package entities;

public class Aluno {
	
	private String nome;
	private String matricula;
	
	public Aluno() {
		this.nome = null;
		this.matricula = null;
	}
	
	public Aluno(String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String toString() {
		return "Nome: " + nome +
				", Matricula: " + matricula;
	}
	
	
	

}
