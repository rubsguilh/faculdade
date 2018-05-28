package servico;

import dao.PacienteDao;
import model.Paciente;

public class PacienteServico {
	
	private PacienteDao dao;
	
	public void inserir(Paciente paciente) {
		dao = new PacienteDao();
		
		dao.inserir(paciente);
		
	}

}
