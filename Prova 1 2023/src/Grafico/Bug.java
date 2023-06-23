package Grafico;

import java.util.Random;

public class Bug extends Botão{
	int posicaox;
	int posicaoy;
	public Bug(){
		Random random = new Random();
		posicaox=random.nextInt(8);
		posicaoy=random.nextInt(8);
		tipo="Bug";
	}
}
