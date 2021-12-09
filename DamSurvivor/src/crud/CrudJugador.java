package crud;

import model.Jugador;
import model.Objeto;
import datos.BaseDatos;
import model.Arma;

public class CrudJugador {
	
	
	// Constructor vacío
	
	public CrudJugador () {
		
	}
	
	// Métodos
	
	public Jugador [] addJugador (Jugador jugador, Jugador [] array) {
		array[0] = jugador;
		return array;
	}
	
	public void pintarJugadores (Jugador [] lista) {
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);	
		}
	
	}
	
	public void crearGuerrero (Jugador j1) {
		j1.setPtsATK(45);
		j1.setPtsDEF(45);
		j1.setPtsHP(80);
		j1.setPtsMaxHP(80);
	}
	public void crearAsesino (Jugador j1) {
		j1.setPtsATK(75);
		j1.setPtsDEF(25);
		j1.setPtsHP(50);
		j1.setPtsMaxHP(50);
	}
	
	public void crearHechicero (Jugador j1) {
		j1.setPtsATK(60);
		j1.setPtsDEF(20);
		j1.setPtsHP(40);
		j1.setPtsMaxHP(40);
	}
	
	public void consultarStats (Jugador j1) {
		System.out.println(j1);
	}
	
	public void herirJugador (Jugador j1, int atk) {
		int hpNueva = 0;
		hpNueva = j1.getPtsHP() - atk;
		j1.setPtsHP(hpNueva);
	}
	
	public void cambiarArma (Jugador j1, int index) {
		j1.setArmaActiva(j1.getArmas()[index-1]);
	}
	
	public void aplicarObjeto (Jugador j1, int index) {
		j1.setPtsATK(j1.getPtsATK()+j1.getInventario()[index].getAtk());
		j1.setPtsDEF(j1.getPtsDEF()+j1.getInventario()[index].getDef());
		j1.setPtsHP(j1.getPtsHP()+j1.getInventario()[index].getHp());
		j1.setPtsMaxHP(j1.getPtsMaxHP()+j1.getInventario()[index].getHpMax());
	}
	
	public void checkVidaMax (Jugador j1) {
		if(j1.getPtsHP()>j1.getPtsMaxHP()) {
			j1.setPtsHP(j1.getPtsMaxHP());
		}
	}

	
	
	
}
