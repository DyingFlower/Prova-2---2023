package Grafico;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Botaotorre extends Botaopeça{
	public Botaotorre() {
		tipo="Torre";
		porimagem();
	}
	public void porimagem() {
		ImageIcon imagem = new ImageIcon("C:\\Users\\arthu\\Downloads/37869.png");
		 ImageIcon imagemRedimensionada = new ImageIcon(
		            imagem.getImage().getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH)
		        );
		 setIcon(imagemRedimensionada);
	}
}
