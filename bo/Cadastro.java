package br.projetoproo20161.bo;

import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.projetoproo20161.dao.CadastroDao;
import br.projetoproo20161.dao.ConexaoMySQL;
import br.projetoproo20161.dao.IConexao;

public class Cadastro {
	IConexao banco;
	Connection conexao;
	
	public void Cadastrando() throws SQLException{
		
		 IConexao banco = new ConexaoMySQL();
		 banco.getConexao("jdbc:mysql", "localhost", "sociotorcedor", "root", "");
		 CadastroDao c = new CadastroDao (this.conexao);
		 
		 String nome = JOptionPane.showInputDialog("digite seu nome: ");
		 Integer cpf  = Integer.parseInt(JOptionPane.showInputDialog("digite seu cpf: "));
		 Integer idade =Integer.parseInt(JOptionPane.showInputDialog("digite seu idade: "));
		 Integer telefone =Integer.parseInt(JOptionPane.showInputDialog("digite seu telefone: "));
		 String email =JOptionPane.showInputDialog("digite seu email: ");
		 String sexo = JOptionPane.showInputDialog("digite seu sexo: ");
		 String senha =JOptionPane.showInputDialog("digite sua senha: ");
		 
		
		 c.inserir(nome, cpf, idade, telefone, email, sexo, senha);
		
		
		
	}

}
