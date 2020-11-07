package Modelo;

public class Usuario {
private  int Matricula;
	private int CPF;
	private String Nome;
	public Usuario() {
		super();
	}
	public Usuario(int matricula, int cPF, String nome) {
		super();
		Matricula = matricula;
		CPF = cPF;
		Nome = nome;
	}
	public int getMatricula() {
		return Matricula;
	}
	public void setMatricula(int matricula) {
		Matricula = matricula;
	}
	public int getCPF() {
		return CPF;
	}
	public void setCPF(int cPF) {
		CPF = cPF;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	
public void  abrirChamado() {
	
}
public void consultarChamado() {
	
}
public void cancelarChamados() {
}
}
