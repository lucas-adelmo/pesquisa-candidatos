package projetoAplicado;

public class Pesquisa {
	private int idPesquisa;
	private String instituto;
	private String dataPublicacao;
	private String local;
	private float idadeMedia;
	private String formato;
	private int idTipoPesquisa;
	
	public Pesquisa(String instituto, String dataPublicacao, String local, float idadeMedia, String formato, int idTipoPesquisa) 
	{
		this.instituto = instituto;
		this.dataPublicacao = dataPublicacao;
		this.local = local;
		this.idadeMedia = idadeMedia;
		this.formato = formato;
		this.idTipoPesquisa = idTipoPesquisa;
	}
	
	public Pesquisa() {
	}
	
	public int getIdPesquisa() {
		return idPesquisa;
	}
	public void setIdPesquisa(int idPesquisa) {
		this.idPesquisa = idPesquisa;
	}
	public String getInstituto() {
		return instituto;
	}
	public void setInstituto(String instituto) {
		this.instituto = instituto;
	}
	public String getDataPublicacao() {
		return dataPublicacao;
	}
	public void setDataPublicacao(String dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public float getIdadeMedia() {
		return idadeMedia;
	}
	public void setIdadeMedia(float idadeMedia) {
		this.idadeMedia = idadeMedia;
	}
	public int getIdTipoPesquisa() {
		return idTipoPesquisa;
	}
	public void setIdTipoPesquisa(int idTipoPesquisa) {
		this.idTipoPesquisa = idTipoPesquisa;
	}
	
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
}
