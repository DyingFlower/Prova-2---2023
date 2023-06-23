package Grafico;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import robo.Aluno;
import robo.Criatura;

public class Painel2 extends JPanel{
	Random random = new Random();
	public int numeroalunos=random.nextInt(1,16);
	public int numerobugs=random.nextInt(1,16);
	public ArrayList<Alunog> alunos=new ArrayList<Alunog>();
	public ArrayList<Botão> botoes = new ArrayList<Botão>();
	public ArrayList<Bug> bugs = new ArrayList<Bug>();
	public Tabuleiro tabuleiro;
	public Painel2(Tabuleiro tabuleiro) {
		this.tabuleiro=tabuleiro;
		for(int i=0;i<numeroalunos;i++) {
			Alunog aluno = new Alunog();
			alunos.add(aluno);
		}
		for(int i=0;i<numerobugs;i++) {
			Bug bug = new Bug();
			bugs.add(bug);
		}
		setLayout(new GridLayout(8,8));
		for(int j = 0;j<8;j++) {
			if(j%2==0) {
				for(int i = 0;i<8;i++) {
					if(i%2==0) {
						Botão botao= new Botão();
						for(int w = 0;w<alunos.size();w++) {
							if(alunos.get(w).posicaox==j && alunos.get(w).posicaoy==i) {
								botao.temAluno=true;
								botao.LAluno.add(alunos.get(w));
							}
						}
						for(int w = 0;w<bugs.size();w++) {
							if(bugs.get(w).posicaox==j && bugs.get(w).posicaoy==i) {
								botao.temBug=true;
								botao.Lbugs.add(bugs.get(w));
							}
						}
						botao.setBackground(Color.white);
						botao.addActionListener(funcao);
						add(botao);
						botoes.add(botao);
					}
					else {
						Botão botao= new Botão();
						for(int w = 0;w<alunos.size();w++) {
							if(alunos.get(w).posicaox==j && alunos.get(w).posicaoy==i) {
								botao.temAluno=true;
								botao.LAluno.add(alunos.get(w));
							}
						}
						for(int w = 0;w<bugs.size();w++) {
							if(bugs.get(w).posicaox==j && bugs.get(w).posicaoy==i) {
								botao.temBug=true;
								botao.Lbugs.add(bugs.get(w));
							}
						}
						botao.setBackground(Color.darkGray);
						botao.addActionListener(funcao);
						add(botao);
						botoes.add(botao);
					}
				}
			}
			else {
				for(int i = 0;i<8;i++) {
					if(i%2!=0) {
						Botão botao= new Botão();
						for(int w = 0;w<alunos.size();w++) {
							if(alunos.get(w).posicaox==j && alunos.get(w).posicaoy==i) {
								botao.temAluno=true;
								botao.LAluno.add(alunos.get(w));
							}
						}
						for(int w = 0;w<bugs.size();w++) {
							if(bugs.get(w).posicaox==j && bugs.get(w).posicaoy==i) {
								botao.temBug=true;
								botao.Lbugs.add(bugs.get(w));
							}
						}
						botao.setBackground(Color.white);
						botao.addActionListener(funcao);
						add(botao);
						botoes.add(botao);
					}
					else {
						Botão botao= new Botão();
						for(int w = 0;w<alunos.size();w++) {
							if(alunos.get(w).posicaox==j && alunos.get(w).posicaoy==i) {
								botao.temAluno=true;
								botao.LAluno.add(alunos.get(w));
							}
						}
						for(int w = 0;w<bugs.size();w++) {
							if(bugs.get(w).posicaox==j && bugs.get(w).posicaoy==i) {
								botao.temBug=true;
								botao.Lbugs.add(bugs.get(w));
							}
						}
						botao.setBackground(Color.darkGray);
						botao.addActionListener(funcao);
						add(botao);
						botoes.add(botao);
					}
				}
			}
		}
		setVisible(true);
	}
	 ActionListener funcao = new ActionListener() {
        	 public void actionPerformed(ActionEvent e) {
             	 Botão clickedButton = (Botão) e.getSource();
             		 try {
             			 if( tabuleiro.painel3.Probo.robo1.selecionado==true && tabuleiro.painel3.Probo.robo1.limitabotao) {
             				 clickedButton.tipo=tabuleiro.painel3.Probo.robo1.tipo;
             				 clickedButton.setIcon(tabuleiro.painel3.Probo.robo1.getIcon());
             				 clickedButton.passada=true;
             				 tabuleiro.painel3.Probo.robo1.limitabotao=false;
             			 }
             			 else if( tabuleiro.painel3.Probo.robo2.selecionado==true && tabuleiro.painel3.Probo.robo2.limitabotao) {
             				 clickedButton.tipo=tabuleiro.painel3.Probo.robo2.tipo;
             				 clickedButton.setIcon(tabuleiro.painel3.Probo.robo2.getIcon());
             				 clickedButton.passada=true;
             				 tabuleiro.painel3.Probo.robo2.limitabotao=false;
             			 }
             			 else if( tabuleiro.painel3.Probo.robo3.selecionado==true && tabuleiro.painel3.Probo.robo3.limitabotao) {
             				 clickedButton.tipo=tabuleiro.painel3.Probo.robo3.tipo;
             				 clickedButton.setIcon(tabuleiro.painel3.Probo.robo3.getIcon());
             				 clickedButton.passada=true;
             				 tabuleiro.painel3.Probo.robo3.limitabotao=false;
             			 }
             		 }catch (Exception e1) {
             			 JOptionPane.showMessageDialog(null, "Escolha uma peça", "Aviso", JOptionPane.WARNING_MESSAGE);
             		 }
              }      
     };
}
