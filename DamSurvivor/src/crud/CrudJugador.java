package crud;

import model.Jugador;
import model.Objeto;
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
	
	public void addJugador (Jugador jugador, int posicion) {
		listaJugadores [posicion] = jugador;
		
	}
	
	public void pintarJugadores () {
		for (int i = 0; i < listaJugadores.length; i++) {
			System.out.println(listaJugadores[i]);
		}
	}
	

	
	
	
}
