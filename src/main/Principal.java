package main;
import controller.CandidatoController;
import projetoAplicado.Candidato;

public class Principal {
	
	public static void main(String[] args) {
		
		Candidato c1 = new Candidato();
		c1.setIdCandidato(1);
		c1.setNome("Bolsonaro");
		c1.setPartido("PL");
		c1.setFichaLimpa(true);
		
		Candidato c2 = new Candidato();
		c2.setIdCandidato(2);
		c2.setNome("Lula");
		c2.setPartido("PT");
		c2.setFichaLimpa(true);
		
		CandidatoController controller = new CandidatoController();
		try {
			controller.salvar(c1);
			controller.salvar(c2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		for (Candidato c : controller.listar()) {
			System.out.println(c.toString());
		}
	}
}
