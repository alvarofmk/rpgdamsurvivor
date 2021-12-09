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
		j1.setInventario(null);
		j1.setArmaActiva(null);
		j1.setArmas(null);
	}
	public void crearAsesino (Jugador j1) {
		j1.setPtsATK(75);
		j1.setPtsDEF(25);
		j1.setPtsHP(50);
		j1.setPtsMaxHP(50);
		j1.setInventario(null);
		j1.setArmaActiva(null);
		j1.setArmas(null);
	}
	
	public void crearHechicero (Jugador j1) {
		j1.setPtsATK(60);
		j1.setPtsDEF(20);
		j1.setPtsHP(40);
		j1.setPtsMaxHP(40);
		j1.setInventario(null);
		j1.setArmaActiva(null);
		j1.setArmas(null);
	}
	
	public void consultarStats (Jugador j1) {
		System.out.println(j1);
	}
	
	public void herirJugador (Jugador j1, int atk) {
		int hpNueva = 0;
		hpNueva = j1.getPtsHP() - atk;
		j1.setPtsHP(hpNueva);
	}
	

	
	
	
}
