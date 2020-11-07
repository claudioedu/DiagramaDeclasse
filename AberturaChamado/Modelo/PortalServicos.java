package Modelo;

public class PortalServicos {
public int Matricula;
public  int Senha;
public Usuario usuario;
public Tecnico tecnico;
public Atendente atendente;
public SisAbeturaChamados ars;

public PortalServicos() {
	super();
}
public PortalServicos(int matricula, int senha, Usuario usuario, Tecnico tecnico, Atendente atendente,
		SisAbeturaChamados ars) {
	super();
	Matricula = matricula;
	Senha = senha;
	this.usuario = usuario;
	this.tecnico = tecnico;
	this.atendente = atendente;
	this.ars = ars;
}
public int getMatricula() {
	return Matricula;
}
public void setMatricula(int matricula) {
	Matricula = matricula;
}
public int getSenha() {
	return Senha;
}
public void setSenha(int senha) {
	Senha = senha;
}
public Usuario getUsuario() {
	return usuario;
}
public void setUsuario(Usuario usuario) {
	this.usuario = usuario;
}
public Tecnico getTecnico() {
	return tecnico;
}
public void setTecnico(Tecnico tecnico) {
	this.tecnico = tecnico;
}
public Atendente getAtendente() {
	return atendente;
}
public void setAtendente(Atendente atendente) {
	this.atendente = atendente;
}
public SisAbeturaChamados getArs() {
	return ars;
}
public void setArs(SisAbeturaChamados ars) {
	this.ars = ars;
}


}
