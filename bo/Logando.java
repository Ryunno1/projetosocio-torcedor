package br.projetoproo20161.bo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.projetoproo20161.dao.IConexao;
import br.projetoproo20161.dao.ILogin;

public class Logando implements ILogin {
	
	IConexao banco;
	Connection conexao;
	Connection conn = null;
	PreparedStatement pstmt = null;
	
	public void Logando() throws ClassCastException,SQLException {
		
		Integer cpf;
		String pass;
		String vetor = " ";
		try {
			cpf = Integer.parseInt(JOptionPane.showInputDialog("Digite seu cpf"));
			pass = JOptionPane.showInputDialog("Digite sua senha");
			Class.forName("com.mysql.jdbc.Driver");
			conexao = DriverManager.getConnection("jdbc:mysql:///sociotorcedor", "root", "");
			pstmt = conexao.prepareStatement("SELECT cpf,senha FROM cadastrandonosistema WHERE cpf = '"+cpf+"' and senha = '"+pass+"' ");
			ResultSet result = pstmt.executeQuery();
			ArrayList<String> array = new ArrayList<>();
			while (result.next()) {
				vetor += "cpf:" + result.getString("cpf") + result.getString("senha") + "\n";
			}
			if (vetor.length() > 1) {
				
				JOptionPane.showMessageDialog(null, "Logado no sistema");
			}
			else {
				
				JOptionPane.showMessageDialog(null, "Usuário ou senha não confere");
			}
				vetor = "";
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		} finally {
			pstmt.close();
		}
		
		
	}

	@Override
	public Connection getConexao(Integer cpf, String senha) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
