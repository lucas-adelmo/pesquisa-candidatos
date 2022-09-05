package dao;

import java.util.ArrayList;
import java.util.List;

import projetoAplicado.CandidatoPesquisa;

public class CandidatoPesquisaDao {
	
	private static CandidatoPesquisaDao instance;
	private List<CandidatoPesquisa> listaCandidatoPesquisa = new ArrayList<>();
	
	public static CandidatoPesquisaDao getInstance() {
		if (instance == null) {
			instance = new CandidatoPesquisaDao();
		}
		return instance;
	}

	public void salvar(CandidatoPesquisa candidatoPesquisa) {
		listaCandidatoPesquisa.add(candidatoPesquisa);
	}
	
	public void atualizar(CandidatoPesquisa candidatoPesquisa) {
		listaCandidatoPesquisa.set(CandidatoPesquisa.getIdCandidatoPesquisa(), candidatoPesquisa);
	}
	
	public void excluir(int idCandidatoPesquisa) {
		listaCandidatoPesquisa.remove(idCandidatoPesquisa);
	}
	
	public List<CandidatoPesquisa> listar(){
		return listaCandidatoPesquisa;
	}
	
}
