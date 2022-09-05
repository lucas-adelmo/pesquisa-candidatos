package controller;

import java.util.List;

import dao.CandidatoDao;
import projetoAplicado.Candidato;

public class CandidatoController {
	
	public void salvar(Candidato candidato) {
		CandidatoDao.getInstance().salvar(candidato);
	}
	
	public void atualizar(Candidato candidato) {
		CandidatoDao.getInstance().atualizar(candidato);
	}
	
	public void excluir(int idCandidato) {
		CandidatoDao.getInstance().excluir(idCandidato);
	}
	
	public List<Candidato> listar(){
		return CandidatoDao.getInstance().listar();
	}
	
	

}
