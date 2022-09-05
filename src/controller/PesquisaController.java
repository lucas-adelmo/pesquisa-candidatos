package controller;

import java.util.List;

import dao.PesquisaDao;

import projetoAplicado.Pesquisa;

public class PesquisaController {
	
	public void salvar(Pesquisa pesquisa) {
		PesquisaDao.getInstance().salvar(pesquisa);
	}
	
	public void atualizar(Pesquisa pesquisa) {
		PesquisaDao.getInstance().atualizar(pesquisa);
	}
	
	public void excluir(int idPesquisa) {
		PesquisaDao.getInstance().excluir(idPesquisa);
	}
	
	public List<Pesquisa> listar(){
		return null;
	}

}

