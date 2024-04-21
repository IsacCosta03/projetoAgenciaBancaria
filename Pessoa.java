package Programa;

public class Pessoa {
	
	private static int counter = 1;

	private String nome;
	private String sobrenome;
	private String cpf;

	public Pessoa(String nome, String sobrenome, String cpf) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		counter += 1;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String toString( ) {
		return "nNome: " + this.getNome() +
				"/nSobrenome: " + this.getSobrenome() +
				"/nCPF: " + this.getCpf();
	}
	
}
