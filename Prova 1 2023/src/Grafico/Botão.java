package Grafico;

import java.util.ArrayList;

import javax.swing.JButton;

public class Botão extends JButton{
	protected String tipo;
	protected Boolean temAluno;
	protected Boolean temBug;
	protected Boolean passada;
	protected ArrayList<Alunog> LAluno;
	protected ArrayList<Bug> Lbugs;
	public Botão() {
		passada=false;
		tipo="";
		temAluno=false;
		temBug=false;
		LAluno= new ArrayList<>();
		Lbugs= new ArrayList<>();
		setVisible(true);
	}
}
