package crud;

import datos.BaseDatos;
import model.Enemigo;

public class CrudEnemigo {
	
	public Enemigo [] generarEnemigos (BaseDatos data){
		Enemigo [] enemigos = new Enemigo [4];
		for (int i = 0; i < enemigos.length; i++) {
			enemigos [i] = new Enemigo (data.getNombreEnemigos()[i], data.getAtkEnemigos()[i], 
					data.getDefEnemigos()[i], data.getHpEnemigos()[i],data.getAtaquesEnemigos()[i]);
		}
		return enemigos;
	}
	
	public void pintarEnemigos (Enemigo [] enemigos) {
		for (int i = 0; i < enemigos.length; i++) {
			System.out.println(enemigos[i]);
		}
	}
	
	public void herirEnemigo (Enemigo e, int atk) {
		int hpNueva = 0;
		hpNueva = e.getHp() - atk;
		e.setHp(hpNueva);
	}
	
	public void consultarEnemigo (Enemigo e) {
		System.out.println(e);
	}

}
