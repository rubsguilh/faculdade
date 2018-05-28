import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Util.Conexao;

public class teste {

	public static void main(String[] args) {
	
			try {
				Connection conn = Conexao.getConexao();
				
				if(conn != null ) {
					JOptionPane.showMessageDialog(null,"Conexao feita com suscesso");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

	}

}
