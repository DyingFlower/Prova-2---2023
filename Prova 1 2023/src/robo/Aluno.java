package robo;

import java.util.Random;

public class Aluno extends Criatura{

	protected Aluno(Plano plano) {
		super(plano);
		Random random = new Random();
		posicaox=random.nextInt(8);
		posicaoy=random.nextInt(8);
		tipo="Aluno";
	}
	
}
