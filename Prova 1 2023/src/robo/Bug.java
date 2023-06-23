package robo;

import java.util.Random;

public class Bug extends Criatura{

	public Bug( Plano plano) {
		super( plano);
		Random random = new Random();
		posicaox=random.nextInt(8);
		posicaoy=random.nextInt(8);
		tipo="Bug";
	}

}
