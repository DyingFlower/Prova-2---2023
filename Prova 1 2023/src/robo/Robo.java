package robo;

import java.util.ArrayList;

public abstract class Robo extends Criatura{
	public Passadas passadas;
	public Robo( Plano plano) {
		super(plano);
		pontos=0;
		this.posicaox =0;
		this.posicaoy =0;
		Celula aux = null;
		for (int i = 0; i < plano.listaCelulas.length; i++) {
			for (int j = 0; j < plano.listaCelulas[i].length; j++) {
				aux=plano.listaCelulas[i][j];
				if (aux.posicaoX == posicaox && aux.posicaoY == posicaoy) {
					aux.criaturas.add(this);
	    		}
	        }
	    }
	}

	public void Avançar() {

	}

	public void Retroceder() {
		
	}
	
}