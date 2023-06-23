package Grafico;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Painel1 extends JPanel{
	private Label label;
	private Botão botao1;
	private Botão botao2;
	private JTextField texto1;
	protected Tabuleiro tabuleiro;
	public Painel1(Tabuleiro tabuleiro) {
		this.tabuleiro=tabuleiro;
		label=new Label("Nome do Jogador: ");
		label.setBackground(Color.lightGray);
		botao1=new Botão();
		botao1.setText("Jogar");
		botao1.addActionListener(Jogar);
		botao2 = new Botão();
		botao2.addActionListener(Relatorio);
		botao2.setText("Relatório de Jogo");
		setLayout(new GridLayout(1,3));
		texto1 = new JTextField();
		add(label);
		add(texto1);
		add(botao1);
		add(botao2);
		setBackground(Color.lightGray);
		setVisible(true);
	}
	
	 ActionListener Jogar = new ActionListener() {

         public void actionPerformed(ActionEvent e) {
        	 tabuleiro.usuario.nome=texto1.getText();
             JOptionPane.showMessageDialog(null, "Boa Sorte "+ tabuleiro.usuario.nome, "Inicio do Jogo", JOptionPane.WARNING_MESSAGE);
         }
     };
     
     ActionListener Relatorio = new ActionListener() {

         public void actionPerformed(ActionEvent e) {
        	 String filePath = "C:\\Users\\arthu\\Downloads\\realatorio.txt";
        	 String nome = "\nJogador: "+texto1.getText()+"\n";
        	 String pontuacao = "Pontuação: " + tabuleiro.usuario.pontuação+"\n";
        	 String Turnosjogados ="Turnos Jogados: " + tabuleiro.usuario.turnos+"\n";
        	 String celulasclicadas = "Quantidade de celulas clicadas: "+ tabuleiro.usuario.listabotoes.size()+"\n";
        	 String AlunosAchados = "Quantidade de Alunos encontrados: " + tabuleiro.usuario.quantalunos+"\n";
        	 String BugsAchados = "Quantidade de Bugs encontrados: " + tabuleiro.usuario.quantbugs+"\n";
        	 String pontostorre = "Pontos da peça: Torre -> "+ tabuleiro.painel3.Probo.robo1.pontuação+"\n";
        	 String pontoscavalo = "Pontos da peça: Cavalo -> "+ tabuleiro.painel3.Probo.robo2.pontuação+"\n";
        	 String pontosbispo = "Pontos da peça: Bispo -> "+ tabuleiro.painel3.Probo.robo3.pontuação+"\n";
        	   try {
                   BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true));
                   writer.write(nome);
                   writer.write(pontuacao);
                   writer.write(Turnosjogados);
                   writer.write(celulasclicadas);
                   writer.write(AlunosAchados);
                   writer.write(BugsAchados);
                   writer.write(pontostorre);
                   writer.write(pontoscavalo);
                   writer.write(pontosbispo);
                   writer.close();
               } catch (Exception i) {
                   i.printStackTrace();
               }
        	   JOptionPane.showMessageDialog(null, "Relatório gerado com sucesso!");
         }
     };
	
}
