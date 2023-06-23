package Grafico;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Botaobispo extends Botaopeça implements ActionListener{
	public String foto;
	public Botaobispo() {
		tipo="bispo";
		porimagem();
	}
	public void porimagem() {
		foto="C:\\Users\\arthu\\Downloads/44903.png";
		ImageIcon imagem = new ImageIcon(foto);
		 ImageIcon imagemRedimensionada = new ImageIcon(
		            imagem.getImage().getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH)
		        );
		 setIcon(imagemRedimensionada);
	}

	public void actionPerformed(ActionEvent e) {
		
		
	}
}
