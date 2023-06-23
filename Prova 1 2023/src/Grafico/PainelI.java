package Grafico;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PainelI extends JPanel{
	protected Botaotorre robo1;
	protected Botaocavalo robo2;
	protected Botaobispo robo3;
	protected Tabuleiro tabuleiro;
	public PainelI(Tabuleiro tabuleiro) {
		this.tabuleiro=tabuleiro;
		robo1= new Botaotorre();
		robo1.setBackground(Color.white);
		robo1.addActionListener(marcarrobo1);
		robo2= new Botaocavalo();
		robo2.setBackground(Color.white);
		robo2.addActionListener(marcarrobo2);
		robo3= new Botaobispo();
		robo3.setBackground(Color.white);
		robo3.addActionListener(marcarrobo3);
		setLayout(new GridLayout(1,3));
		add(robo1);
		add(robo2);
		add(robo3);
		setVisible(true);
	}
	 ActionListener marcarrobo1 = new ActionListener() {

         public void actionPerformed(ActionEvent e) {
        	 if(robo1.escolhaturno==false) {
        		 robo1.selecionado=true;
        		 robo2.selecionado=false;
        		 robo3.selecionado=false;
        		 robo1.escolhaturno=true;
        	 }
        	 else {
        		 int escolha= JOptionPane.showOptionDialog(
     	                null,
     	                "Escolha uma opção",
     	                "Aviso",
     	                JOptionPane.YES_NO_OPTION,
     	                JOptionPane.WARNING_MESSAGE,
     	                null,
     	                new String[]{"Mudar posição da peça", "Cancelar"},
     	                "Opção A");
        		 	if(escolha==JOptionPane.YES_OPTION) {
        		 		 robo1.escolhaturno=false;
        		 		 for(int i=0;i<tabuleiro.painel2.botoes.size();i++) {
        		 			 if(tabuleiro.painel2.botoes.get(i).tipo==robo1.tipo){
        		 				 tabuleiro.painel2.botoes.get(i).passada=false;
        		 				 tabuleiro.painel2.botoes.get(i).setIcon(null);
        		 				 tabuleiro.painel2.botoes.get(i).tipo="";
        		 				 robo1.limitabotao=true;
        		 			 }
        		 		 }
         			}
         			else {
         			
         			}
        	 }
         }
     };
     
     ActionListener marcarrobo2 = new ActionListener() {

         public void actionPerformed(ActionEvent e) {
        	 if(robo2.escolhaturno==false) {
        		 robo1.selecionado=false;
        		 robo2.selecionado=true;
        		 robo3.selecionado=false;
        		 robo2.escolhaturno=true;
        	 }
        	 else {
        		int escolha= JOptionPane.showOptionDialog(
        	                null,
        	                "Escolha uma opção",
        	                "Aviso",
        	                JOptionPane.YES_NO_OPTION,
        	                JOptionPane.WARNING_MESSAGE,
        	                null,
        	                new String[]{"Mudar posição da peça", "Cancelar"},
        	                "Opção A"); 
        				
        		if(escolha==JOptionPane.YES_OPTION) {
        			 robo2.escolhaturno=false;
    		 		 for(int i=0;i<tabuleiro.painel2.botoes.size();i++) {
    		 			 if(tabuleiro.painel2.botoes.get(i).tipo==robo2.tipo){
    		 				 tabuleiro.painel2.botoes.get(i).passada=false;
    		 				 tabuleiro.painel2.botoes.get(i).setIcon(null);
    		 				 tabuleiro.painel2.botoes.get(i).tipo="";
    		 				 robo2.limitabotao=true;
    		 			 }
    		 		 }
        		}
        		else {
        			
        		}
        	 }
         }
     };
     
     ActionListener marcarrobo3 = new ActionListener() {

         public void actionPerformed(ActionEvent e) {
        	 if(robo3.escolhaturno==false) {
        		 robo1.selecionado=false;
            	 robo2.selecionado=false;
            	 robo3.selecionado=true;
            	 robo3.escolhaturno=true;
        	 }
        	 else {
        		int escolha = JOptionPane.showOptionDialog(
     	                null,
     	                "Escolha uma opção",
     	                "Aviso",
     	                JOptionPane.YES_NO_OPTION,
     	                JOptionPane.WARNING_MESSAGE,
     	                null,
     	                new String[]{"Mudar posição da peça", "Cancelar"},
     	                "Opção A"); 
        		if(escolha==JOptionPane.YES_OPTION) {
        			 robo3.escolhaturno=false;
    		 		 for(int i=0;i<tabuleiro.painel2.botoes.size();i++) {
    		 			 if(tabuleiro.painel2.botoes.get(i).tipo==robo3.tipo){
    		 				 tabuleiro.painel2.botoes.get(i).passada=false;
    		 				 tabuleiro.painel2.botoes.get(i).setIcon(null);
    		 				 tabuleiro.painel2.botoes.get(i).tipo="";
    		 				 robo3.limitabotao=true;
    		 			 }
    		 		 }
        		}
        		else {
        			
        		}
        		
        	 }
         }
     };
     ActionListener pensar = new ActionListener() {

         public void actionPerformed(ActionEvent e) {
        	 JButton clickedButton = (JButton) e.getSource();
        	
         }
     };
}
