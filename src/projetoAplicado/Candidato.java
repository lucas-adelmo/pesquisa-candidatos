package projetoAplicado;

public class Candidato {
	private int idCandidato;
	private String nome;
	private String partido;
	private boolean fichaLimpa;
	
	public Candidato(String nome, String partido, boolean fichaLimpa ) 
	{
		this.nome = nome;
		this.partido = partido;
		this.fichaLimpa = fichaLimpa;
	}
	
	public Candidato() {
		
	}
	
	public int getIdCandidato() {
		return idCandidato;
	}
	public void setIdCandidato(int idCandidato) {
		this.idCandidato = idCandidato;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPartido() {
		return partido;
	}
	public void setPartido(String partido) {
		this.partido = partido;
	}
	public boolean isFichaLimpa() {
		return fichaLimpa;
	}
	public void setFichaLimpa(boolean fichaLimpa) {
		this.fichaLimpa = fichaLimpa;
	}
	
	
}
