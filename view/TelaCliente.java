package br.projetoproo20161.view;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.projetoproo20161.bo.ControlerClienteSocio;

public class TelaCliente {
	
	public void TelaPrincipalCliente() throws ClassNotFoundException, SQLException {
		
		String opc ="";
		String opc2 = "";
		 do {
		opc = JOptionPane.showInputDialog("O que gostaria de fazer?\n"
				+ "1 - Verificar os Ingressos dos jogos dispon�veis\n"
				+ "2 - Comprar outros produtos exclusivos para s�cios\n\n"
				+ "3 - Sair deste menu e voltar para o principal ?");
                

       if(opc.equals("1")){
    	   
    	   ControlerClienteSocio cs = new ControlerClienteSocio ();
    	   cs.mostrandoPartidas();
       }
	            
	            
	        }while(!opc.equals("0"));
                
		
	}

}
