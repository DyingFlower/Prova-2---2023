package Grafico;

import java.util.Random;

public class Alunog extends Botão{
	int posicaox;
	int posicaoy;
	public Alunog(){
		Random random = new Random();
		posicaox=random.nextInt(8);
		posicaoy=random.nextInt(8);
		tipo="Aluno";
	}
}
