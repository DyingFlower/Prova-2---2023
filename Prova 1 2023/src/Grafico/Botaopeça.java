package Grafico;

import javax.swing.JButton;

public class Botaopeça extends JButton{
	protected String tipo;
	protected Boolean escolhaturno;
	public Boolean selecionado;
	public int pontuação;
	public Boolean limitabotao;
	public Botaopeça(){
		pontuação=0;
		limitabotao=true;
		escolhaturno=false;
	}
}
