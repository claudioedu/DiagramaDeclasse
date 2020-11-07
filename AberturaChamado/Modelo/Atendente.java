package Modelo;

public class Atendente {
private int MatriculaAt;
private int MatriculaCLI;
private String  nomeAT;
private String  nomeCli;
public Atendente() {
	super();
}
public Atendente(int matriculaAt, int matriculaCLI, String nomeAT, String nomeCli) {
	super();
	MatriculaAt = matriculaAt;
	MatriculaCLI = matriculaCLI;
	this.nomeAT = nomeAT;
	this.nomeCli = nomeCli;
}
public int getMatriculaAt() {
	return MatriculaAt;
}
public void setMatriculaAt(int matriculaAt) {
	MatriculaAt = matriculaAt;
}
public int getMatriculaCLI() {
	return MatriculaCLI;
}
public void setMatriculaCLI(int matriculaCLI) {
	MatriculaCLI = matriculaCLI;
}
public String getNomeAT() {
	return nomeAT;
}
public void setNomeAT(String nomeAT) {
	this.nomeAT = nomeAT;
}
public String getNomeCli() {
	return nomeCli;
}
public void setNomeCli(String nomeCli) {
	this.nomeCli = nomeCli;
}
public void abrirChamados() {
	
}
public void consultarChamados() {
	
}
public void cancelarChamados() {
	
}
public void priorizarChamados() {
	
}
public void AlteraSeveridadeChamados() {
	
}
	
}

