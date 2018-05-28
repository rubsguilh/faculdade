package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	static final String url="jdbc:postgresql://localhost:5432/prontuario";
	static final String usuario="postgres";
	static final String senha="doidera";
	
	public static Connection getConexao() throws  SQLException{
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return DriverManager.getConnection(url, usuario, senha);
	}
}
