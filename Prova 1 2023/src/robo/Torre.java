package robo;

public class Torre extends Robo{

	public Torre( Plano plano) {
		super( plano);
		tipo="Torre";
	}
	public void Avançar(int z) {
		for(int i=0;i<plano.listaCelulas[posicaox][posicaoy].criaturas.size();i++) {
			if(plano.listaCelulas[posicaox][posicaoy].criaturas.get(i)==this) {
				plano.listaCelulas[posicaox][posicaoy].criaturas.remove(i);
				plano.listaCelulas[posicaox][posicaoy].criaturas.add(plano.passadas);
			}
		}
		try {
			if(z<=2 && z>0) {
				posicaoy+=z;
				plano.listaCelulas[posicaox][posicaoy].criaturas.add(this);
				plano.mostrartab();
				System.out.println(pontos);
			}
			else {
				throw new excecao();
			}
		}catch(excecao e) {
			System.out.println("A torre só avança de 1 a 2, redigite o comando");
		}
	}

	public void Retroceder(int z) {
		for(int i=0;i<plano.listaCelulas[posicaox][posicaoy].criaturas.size();i++) {
			if(plano.listaCelulas[posicaox][posicaoy].criaturas.get(i)==this) {
				plano.listaCelulas[posicaox][posicaoy].criaturas.remove(i);
				plano.listaCelulas[posicaox][posicaoy].criaturas.add(plano.passadas);
			}
		}
		try {
			if(z<=2 && z>0) {
				posicaoy-=z;	
				plano.listaCelulas[posicaox][posicaoy].criaturas.add(this);
				plano.mostrartab();
				System.out.println(pontos);
			}
			else {
				throw new excecao();
			}
		}catch(excecao e) {
			System.out.println("A torre só retrocede de 1 a 2, redigite o comando");
		}
	}

}
