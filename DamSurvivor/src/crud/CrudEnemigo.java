package crud;

import model.Enemigo;

public class CrudEnemigo {
	//AddEnemy
	//checkVidaMax
	//atacar
	//defender
	
	public int rafaAtaque1 (Enemigo Rafa) {
		int ataqueTotal;
		ataqueTotal = Rafa.getAtk()+10+5; //el 5 debe cambiarse por el valor del dado
		return ataqueTotal;
	}
	
	public int rafaAtaque2 (Enemigo Rafa) {
	 	 int ataqueTotal = Rafa.getAtk()+10+20; //el 20 es equivalente al ataque fuerte con el dado.
	 	 return ataqueTotal;
	}
	
	public int rafaDefensa (Enemigo Rafa) {
		int defensa = Rafa.getDef(); 
		return defensa;
	}
	
	public int rafaCheckVida (Enemigo Rafa) {
		int checkVida = Rafa.getHp();
		return checkVida;		
	}
}

