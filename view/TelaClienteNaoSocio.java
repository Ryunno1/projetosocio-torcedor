package br.projetoproo20161.view;

import javax.swing.JOptionPane;

public class TelaClienteNaoSocio {
	
	public TelaClienteNaoSocio() {
		
		String opc = "";
		JOptionPane.showInputDialog("O que deseja fazer?\n"
				+ "1 - Verificar ingressos de jogos dispon�veis"
				+ "2 - Quero me tornar s�cio e aproveitar os descontos e produtos exclusivos"
				+ "3 - Voltar ao menu principal");
	}

}
