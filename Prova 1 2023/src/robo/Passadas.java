package robo;

import java.util.ArrayList;

public class Passadas extends Robo{
	

	public Passadas( Plano plano) {
		super( plano);
		tipo="Celula passada";
	}

	public ArrayList<Celula[][]>passadas;

	public void add(Celula[][] listaCelulas) {
		passadas.add(listaCelulas);
	}
}
