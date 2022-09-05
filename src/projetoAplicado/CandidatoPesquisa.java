package projetoAplicado;

public class CandidatoPesquisa {
	private static int idCandidatoPesquisa;
	private int idCandidato;
	private int idPesquisa;
	private int votos;
	
	public CandidatoPesquisa(int idCandidato, int idPesquisa, int votos ) {
		this.idCandidato = idCandidato;
		this.idPesquisa = idPesquisa;
		this.votos = votos;
	}	
	
	public CandidatoPesquisa() {
	}
	
	public static int getIdCandidatoPesquisa() {
		return idCandidatoPesquisa;
	}
	public void setIdCandidatoPesquisa(int idCandidatoPesquisa) {
		CandidatoPesquisa.idCandidatoPesquisa = idCandidatoPesquisa;
	}
	public int getIdCandidato() {
		return idCandidato;
	}
	public void setIdCandidato(int idCandidato) {
		this.idCandidato = idCandidato;
	}
	public int getIdPesquisa() {
		return idPesquisa;
	}
	public void setIdPesquisa(int idPesquisa) {
		this.idPesquisa = idPesquisa;
	}
	public int getVotos() {
		return votos;
	}
	public void setVotos(int votos) {
		this.votos = votos;
	}
	
	

}
