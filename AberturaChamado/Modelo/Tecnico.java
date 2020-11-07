package Modelo;

public class Tecnico {
private int Matricula;
private int contato;
private String Nome;
public Tecnico() {
	super();
}
public Tecnico(int matricula, int contato, String nome) {
	super();
	Matricula = matricula;
	this.contato = contato;
	Nome = nome;
}
public int getMatricula() {
	return Matricula;
}
public void setMatricula(int matricula) {
	Matricula = matricula;
}
public int getContato() {
	return contato;
}
public void setContato(int contato) {
	this.contato = contato;
}
public String getNome() {
	return Nome;
}
public void setNome(String nome) {
	Nome = nome;
}
public void resolverChamado() {
	
}
public void cancelarChamados() {
	
}
}
