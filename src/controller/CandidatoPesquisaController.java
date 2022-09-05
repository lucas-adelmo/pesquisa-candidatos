package controller;

import java.util.List;

import dao.CandidatoPesquisaDao;
import projetoAplicado.CandidatoPesquisa;

public class CandidatoPesquisaController {
	
	public void salvar(CandidatoPesquisa candidatoPesquisa) {
		CandidatoPesquisaDao.getInstance().salvar(candidatoPesquisa);
	}
	
	public void atualizar(CandidatoPesquisa candidatoPesquisa) {
		CandidatoPesquisaDao.getInstance().atualizar(candidatoPesquisa);
	}
	
	public void excluir(int idCandidatoPesquisa) {
		CandidatoPesquisaDao.getInstance().excluir(idCandidatoPesquisa);
	}
	
	public List<CandidatoPesquisa> listar(){
		return null;
	}

}
