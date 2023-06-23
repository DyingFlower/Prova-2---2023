package Grafico;

import java.util.ArrayList;

public class Usuario {
	protected String nome;
	protected Tabuleiro tabuleiro;
	protected ArrayList<Botão> listabotoes;
	protected int turnos;
	protected int quantalunos;
	protected int quantbugs;
	protected int pontuação;
	public Usuario(Tabuleiro tabuleiro){
		listabotoes = new ArrayList<>();
		nome="";
		pontuação=0;
		this.tabuleiro=tabuleiro;
	}
}
