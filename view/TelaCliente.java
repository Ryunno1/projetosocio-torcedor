package br.projetoproo20161.view;

import javax.swing.JOptionPane;

public class TelaCliente {
	
	public void TelaPrincipalCliente() {
		
		String opc ="";
		
		opc = JOptionPane.showInputDialog("O que gostaria de fazer?\n"
				+ "1 - Verificar os Ingressos dos jogos dispon�veis\n"
				+ "2 - Verificar combos com ingresso mais caravana\n"
				+ "3 - Comprar outros produtos exclusivos para s�cios\n"
				+ "4 - Sair");
		
	}

}
