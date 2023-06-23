package Grafico;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Painel3 extends JPanel{
	protected Botão botao1;
	protected Botão botao2;
	protected Botão botao3;
	protected PainelI Probo;
	protected JLabel label1;
	protected JLabel label2;
	protected JLabel label3;
	protected Tabuleiro tabuleiro;
	public Painel3(Tabuleiro tabuleiro) {
		tabuleiro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.tabuleiro=tabuleiro;
		label1 = new JLabel();
		label1.setText("Pontuação: 0");
		label1.setBackground(Color.gray);
		setLayout(new GridLayout(7,1));
		add(label1);
		label2 = new JLabel();
		label2.setText("Total: Alunos: "+tabuleiro.painel2.numeroalunos+" Bugs: "+tabuleiro.painel2.numerobugs);
		label2.setBackground(Color.gray);
		add(label2);
		label3 = new JLabel();
		Probo = new PainelI(tabuleiro);
		label3.setText("Pontos: "+"Torre: "+Probo.robo1.pontuação+" Cavalo: "+Probo.robo2.pontuação +" Bispo: "+Probo.robo3.pontuação);
		label3.setBackground(Color.gray);
		add(label3);
		add(Probo);
		botao1=new Botão();
		botao1.setText("Verificar");
		botao1.setBackground(Color.green);
		botao1.addActionListener(verificar);
		botao2= new Botão();
		botao2.setText("Próxima Jogada");
		botao2.addActionListener(proxjogada);
		botao2.setBackground(Color.green);
		botao3= new Botão();
		botao3.setText("Sair do Jogo");
		botao3.addActionListener(fecharjogo);
		botao3.setBackground(Color.green);
		add(botao1);
		add(botao2);
		add(botao3);
	}
	 ActionListener fecharjogo = new ActionListener() {

         public void actionPerformed(ActionEvent e) {
             tabuleiro.dispose();
         }
     };
     
     ActionListener verificar = new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        	 for(int i=0;i<tabuleiro.painel2.botoes.size();i++) {
        		if(tabuleiro.painel2.botoes.get(i).temAluno && tabuleiro.painel2.botoes.get(i).tipo.equals("Torre")&& tabuleiro.painel2.botoes.get(i).passada) {
        			Probo.robo1.pontuação+=10*tabuleiro.painel2.botoes.get(i).LAluno.size();
        			label3.setText("Pontos: "+"Torre: "+Probo.robo1.pontuação+" Cavalo: "+Probo.robo2.pontuação +" Bispo: "+Probo.robo3.pontuação);
        			tabuleiro.painel2.numeroalunos-=tabuleiro.painel2.botoes.get(i).LAluno.size();
        			label2.setText("Total: Alunos: "+tabuleiro.painel2.numeroalunos+" Bugs: "+tabuleiro.painel2.numerobugs);
        			tabuleiro.usuario.pontuação+=10*tabuleiro.painel2.botoes.get(i).LAluno.size();
        			label1.setText("Pontuação: "+ tabuleiro.usuario.pontuação);
        			tabuleiro.painel2.botoes.get(i).passada=false;
        		}
        		else if(tabuleiro.painel2.botoes.get(i).temAluno && tabuleiro.painel2.botoes.get(i).tipo.equals("Cavalo")&& tabuleiro.painel2.botoes.get(i).passada) {
        			Probo.robo2.pontuação+=10*tabuleiro.painel2.botoes.get(i).LAluno.size();
        			label3.setText("Pontos: "+"Torre: "+Probo.robo1.pontuação+" Cavalo: "+Probo.robo2.pontuação +" Bispo: "+Probo.robo3.pontuação);
        			tabuleiro.painel2.numeroalunos-=tabuleiro.painel2.botoes.get(i).LAluno.size();
        			label2.setText("Total: Alunos: "+tabuleiro.painel2.numeroalunos+" Bugs: "+tabuleiro.painel2.numerobugs);
        			tabuleiro.usuario.pontuação+=10*tabuleiro.painel2.botoes.get(i).LAluno.size();
        			label1.setText("Pontuação: "+ tabuleiro.usuario.pontuação);
        			tabuleiro.painel2.botoes.get(i).passada=false;
        		}
        		else if(tabuleiro.painel2.botoes.get(i).temAluno && tabuleiro.painel2.botoes.get(i).tipo.equals("bispo") && tabuleiro.painel2.botoes.get(i).passada) {
        			Probo.robo3.pontuação+=10*tabuleiro.painel2.botoes.get(i).LAluno.size();
        			label3.setText("Pontos: "+"Torre: "+Probo.robo1.pontuação+" Cavalo: "+Probo.robo2.pontuação +" Bispo: "+Probo.robo3.pontuação);
        			tabuleiro.painel2.numeroalunos-=tabuleiro.painel2.botoes.get(i).LAluno.size();
        			label2.setText("Total: Alunos: "+tabuleiro.painel2.numeroalunos+" Bugs: "+tabuleiro.painel2.numerobugs);
        			tabuleiro.usuario.pontuação+=10*tabuleiro.painel2.botoes.get(i).LAluno.size();
        			label1.setText("Pontuação: "+ tabuleiro.usuario.pontuação);
        			tabuleiro.painel2.botoes.get(i).passada=false;
        		}
        		if(tabuleiro.painel2.botoes.get(i).temBug && tabuleiro.painel2.botoes.get(i).tipo.equals("Torre") && tabuleiro.painel2.botoes.get(i).passada) {
        			Probo.robo1.pontuação-=15*tabuleiro.painel2.botoes.get(i).Lbugs.size();
        			label3.setText("Pontos: "+"Torre: "+Probo.robo1.pontuação+" Cavalo: "+Probo.robo2.pontuação +" Bispo: "+Probo.robo3.pontuação);
        			tabuleiro.painel2.numerobugs-=tabuleiro.painel2.botoes.get(i).Lbugs.size();
        			label2.setText("Total: Alunos: "+tabuleiro.painel2.numeroalunos+" Bugs: "+tabuleiro.painel2.numerobugs);
        			tabuleiro.usuario.pontuação-=15*tabuleiro.painel2.botoes.get(i).Lbugs.size();
        			label1.setText("Pontuação: "+ tabuleiro.usuario.pontuação);
        			tabuleiro.painel2.botoes.get(i).passada=false;
        		}
        		else if(tabuleiro.painel2.botoes.get(i).temBug && tabuleiro.painel2.botoes.get(i).tipo.equals("Cavalo") && tabuleiro.painel2.botoes.get(i).passada) {
        			Probo.robo2.pontuação-=15*tabuleiro.painel2.botoes.get(i).Lbugs.size();
        			label3.setText("Pontos: "+"Torre: "+Probo.robo1.pontuação+" Cavalo: "+Probo.robo2.pontuação +" Bispo: "+Probo.robo3.pontuação);
        			tabuleiro.painel2.numerobugs-=tabuleiro.painel2.botoes.get(i).Lbugs.size();
        			label2.setText("Total: Alunos: "+tabuleiro.painel2.numeroalunos+" Bugs: "+tabuleiro.painel2.numerobugs);
        			tabuleiro.usuario.pontuação-=15*tabuleiro.painel2.botoes.get(i).Lbugs.size();
        			label1.setText("Pontuação: "+ tabuleiro.usuario.pontuação);
        			tabuleiro.painel2.botoes.get(i).passada=false;
        		}
        		else if(tabuleiro.painel2.botoes.get(i).temBug && tabuleiro.painel2.botoes.get(i).tipo.equals("bispo") && tabuleiro.painel2.botoes.get(i).passada) {
        			Probo.robo3.pontuação-=15*tabuleiro.painel2.botoes.get(i).Lbugs.size();
        			label3.setText("Pontos: "+"Torre: "+Probo.robo1.pontuação+" Cavalo: "+Probo.robo2.pontuação +" Bispo: "+Probo.robo3.pontuação);
        			tabuleiro.painel2.numerobugs-=tabuleiro.painel2.botoes.get(i).Lbugs.size();
        			label2.setText("Total: Alunos: "+tabuleiro.painel2.numeroalunos+" Bugs: "+tabuleiro.painel2.numerobugs);
        			tabuleiro.usuario.pontuação-=15*tabuleiro.painel2.botoes.get(i).Lbugs.size();
        			label1.setText("Pontuação: "+ tabuleiro.usuario.pontuação);
        			tabuleiro.painel2.botoes.get(i).passada=false;
        		}
        	 }
        	
         }
     };
     
     ActionListener proxjogada = new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        	 for(int i=0;i<tabuleiro.painel2.botoes.size();i++) {
        		if(tabuleiro.painel2.botoes.get(i).tipo!="") {
        			if(tabuleiro.painel2.botoes.get(i).temAluno) {
        				tabuleiro.painel2.botoes.get(i).setBackground(Color.magenta);
        				tabuleiro.usuario.quantalunos+=tabuleiro.painel2.botoes.get(i).LAluno.size();
        				tabuleiro.usuario.listabotoes.add(tabuleiro.painel2.botoes.get(i));
        			}
        			else if(tabuleiro.painel2.botoes.get(i).temBug) {
        				tabuleiro.painel2.botoes.get(i).setBackground(Color.blue);
        				tabuleiro.usuario.quantbugs+=tabuleiro.painel2.botoes.get(i).Lbugs.size();
        				tabuleiro.usuario.listabotoes.add(tabuleiro.painel2.botoes.get(i));
        			}
        			else {
        				tabuleiro.painel2.botoes.get(i).setBackground(Color.RED);
        			}
        			if(tabuleiro.painel2.botoes.get(i).passada) {
        				tabuleiro.usuario.listabotoes.add(tabuleiro.painel2.botoes.get(i));
        				HashSet<Botão> hashSet = new HashSet<>(tabuleiro.usuario.listabotoes);
        				tabuleiro.usuario.listabotoes.clear();
        				tabuleiro.usuario.listabotoes.addAll(hashSet);

        			}
        			tabuleiro.painel2.botoes.get(i).setIcon(null);
        			tabuleiro.painel3.Probo.robo1.escolhaturno=false;
        			tabuleiro.painel3.Probo.robo2.escolhaturno=false;
        			tabuleiro.painel3.Probo.robo3.escolhaturno=false;
        			tabuleiro.painel3.Probo.robo1.limitabotao=true;
        			tabuleiro.painel3.Probo.robo2.limitabotao=true;
        			tabuleiro.painel3.Probo.robo3.limitabotao=true;
        		}
        	 }
        	 tabuleiro.usuario.turnos++;
        	
         }
     };
     
     
     
}
