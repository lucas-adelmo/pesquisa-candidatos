package dao;

import java.util.ArrayList;
import java.util.List;

import projetoAplicado.Pesquisa;

public class PesquisaDao {
	
	private static PesquisaDao instance;
	private List<Pesquisa> listaPesquisas = new ArrayList<>();
	
	public static PesquisaDao getInstance() {
		if (instance == null) {
			instance = new PesquisaDao();
		}
		return instance;
	}

	public void salvar(Pesquisa pesquisa) {
		listaPesquisas.add(pesquisa);
	}
	
	public void atualizar(Pesquisa pesquisa) {
		listaPesquisas.set(pesquisa.getIdPesquisa(), pesquisa);
	}
	
	public void excluir(int idPesquisa) {
		listaPesquisas.remove(idPesquisa);
	}
	
	public List<Pesquisa> listar(){
		return listaPesquisas;
	}
	
}
