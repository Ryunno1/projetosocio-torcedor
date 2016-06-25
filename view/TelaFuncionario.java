package br.projetoproo20161.view;

import javax.swing.JOptionPane;

public class TelaFuncionario {
	
	public void telaFuncionario() {
		String opc = "";
		
		opc = JOptionPane.showInputDialog("O que deseja fazer?"
				+ "1 - Visualizar todos os clientes cadastrados"
				+ "2 - Cadastrar uma partida"
				+ "3 - Cadastrar uma partida mais caravana"
				+ "4 - Visualizar relatório de ações dos clientes"
				+ "5 - Sair");
	}

}
