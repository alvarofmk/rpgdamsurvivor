package crud;

import datos.BaseDatos;
import model.Arma;

public class CrudArma {

	
	public Arma [] generarArmas (BaseDatos data) {
		Arma [] weapons = new Arma [4];
		
		for (int i = 0; i < data.getWeapons().length; i++) {
			weapons[i] = new Arma (data.getArmaNombre()[i], data.getArmaATK()[i], data.getArmaDEF()[i], data.getArmaDAM()[i],data.getArmaDescripcion()[i]);
		}
		
		return weapons;
	}

}

