package Grafico;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Botaocavalo extends Botaopeça{
	public Botaocavalo() {
		tipo="Cavalo";
		porimagem();
	}
	public void porimagem() {
		ImageIcon imagem = new ImageIcon("C:\\Users\\arthu\\Downloads/png-clipart-chess-piece-knight-computer-icons-chess-horse-cat-like-mammal.png");
		 ImageIcon imagemRedimensionada = new ImageIcon(
		            imagem.getImage().getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH)
		        );
		 setIcon(imagemRedimensionada);
	}
}
