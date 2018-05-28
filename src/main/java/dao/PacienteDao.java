package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Util.Conexao;
import model.Paciente;

public class PacienteDao {

	
	public void inserir(Paciente paciente) {
	String sql="INSERT INTO paciente (nome,datanasc,endereco,cep,bairro,estado,cidade,sexo,foto) VALUES (?,?,?,?,?,?,?,?,?)";
	
	try {
		Connection conn = Conexao.getConexao();
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setString(1, paciente.getNome());
		pst.setDate(2,(Date) paciente.getDatanasc());
		pst.setString(3, paciente.getEndereco());
		pst.setString(4, paciente.getCep());
		pst.setString(5, paciente.getBairro());
		pst.setString(6,paciente.getEstado());
		pst.setString(7, paciente.getCidade());
		pst.setString(8, paciente.getSexo());
		pst.setByte(9, paciente.getFoto());
		pst.executeUpdate();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
		
	}
	
}
