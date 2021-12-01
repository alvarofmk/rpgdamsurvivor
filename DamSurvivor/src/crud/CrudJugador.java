package crud;

import model.Jugador;
import model.Objeto;
import datos.BaseDatos;
import model.Arma;

public class CrudJugador {
	
	// Atributos
	
	private Jugador [] listaJugadores;
	
	// Constructor
	
	public CrudJugador (Jugador [] listaJugadores) {
		this.listaJugadores = listaJugadores;
	}
	
	// Constructor vacío
	
	public CrudJugador (int numJ) {
		listaJugadores = new Jugador [numJ];
	}
	
	// Getters & Setters

	public Jugador[] getlistaJugadores() {
		return listaJugadores;
	}

	public void setlistaJugadores(Jugador[] listaJugadores) {
		this.listaJugadores = listaJugadores;
	}
	
	public Jugador [] addJugador (Jugador jugador, Jugador [] array) {
		//data.listaJugadores [posicion] = jugador;
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
	

	
	
	
}
