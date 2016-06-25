package br.projetoproo20161.bo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.projetoproo20161.dao.CadastroDao;
import br.projetoproo20161.dao.ConexaoMySQL;
import br.projetoproo20161.dao.IConexao;

public class Cadastro {
	IConexao banco;
	Connection conexao;
	
	 Connection con = null;
	 PreparedStatement pstmt = null;
	
	public void Cadastrando() throws SQLException{
		
		 try {

	            Class.forName("com.mysql.jdbc.Driver");
	            conexao = DriverManager.getConnection("jdbc:mysql:///sociotorcedor", "root", "");
	            pstmt = conexao.prepareStatement("INSERT INTO cadastrandonosistema (nome, cpf, idade, telefone, email, sexo, senha) VALUES (?,?,?,?,?,?,?) ");

	            String nome = JOptionPane.showInputDialog("digite seu nome: ");
	            pstmt.setString(1, nome);
	            Integer cpf = Integer.parseInt(JOptionPane.showInputDialog("digite seu cpf: "));
	            pstmt.setInt(2, cpf);
	            Integer idade = Integer.parseInt(JOptionPane.showInputDialog("digite seu idade: "));
	            pstmt.setInt(3, idade);
	            Integer telefone = Integer.parseInt(JOptionPane.showInputDialog("digite seu telefone: "));
	            pstmt.setInt(4, telefone);
	            String email = JOptionPane.showInputDialog("digite seu email: ");
	            pstmt.setString(5, email);
	            String sexo = JOptionPane.showInputDialog("digite seu sexo: ");
	            pstmt.setString(6, sexo);
	            String senha = JOptionPane.showInputDialog("digite sua senha: ");
	            pstmt.setString(7, senha);

	            int i = pstmt.executeUpdate();
	            if (i > 0) {
	                JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso");
	            } else {
	                JOptionPane.showMessageDialog(null, "nenhum dado inserido");
	            }

	        } catch (ClassNotFoundException | SQLException e) {
	            JOptionPane.showMessageDialog(null, e);
	        } finally {
	            pstmt.close();
	        }

	    }
		
	}


