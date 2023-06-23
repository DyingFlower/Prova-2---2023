package Grafico;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Tabuleiro extends JFrame{
	protected JButton previousButton;
	protected Painel1 painel1=new Painel1(this);
	protected Painel2 painel2=new Painel2(this);
	protected Painel3 painel3=new Painel3(this);
	protected Usuario usuario= new Usuario(this);
	public Tabuleiro() {
		setTitle("Jogo que nada tem a ver com Xadrez");
		setLayout(new BorderLayout());
		add(painel1,BorderLayout.NORTH);
		add(painel2,BorderLayout.CENTER);
		add(painel3,BorderLayout.EAST);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1000,800);
		setVisible(true);
	}
}
