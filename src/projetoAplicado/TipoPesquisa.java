package projetoAplicado;

public class TipoPesquisa {
	private String descricao;
	private int idPesquisa;
	
	public TipoPesquisa(String descricao) {
		this.descricao = descricao;
	}
	
	public TipoPesquisa() {
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getIdPesquisa() {
		return idPesquisa;
	}
	public void setIdPesquisa(int idPesquisa) {
		this.idPesquisa = idPesquisa;
	}
	
	
}
