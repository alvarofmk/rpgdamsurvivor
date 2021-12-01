package datos;

import model.Arma;
import model.Objeto;
import model.Jugador;
import crud.CrudJugador;

public class BaseDatos {
	
	// Atributos
	
	private Jugador [] listaJugadores = new Jugador [5];
	
	//Constructor
	
	public BaseDatos (Jugador [] listaJugadores) {
		this.listaJugadores = listaJugadores;
	}
	
	// Constructor vacío
	
	public BaseDatos () {
		
	}
	
	
	// Getters & Setters
	
	public Jugador[] getListaJugadores() {
		return listaJugadores;
	}

	public void setListaJugadores(Jugador[] listaJugadores) {
		this.listaJugadores = listaJugadores;
	}
	
	// Métodos
	
	public void pintarJugadores () {
		for (int i = 0; i < listaJugadores.length; i++) {
			System.out.println(listaJugadores[i]);
		}
	}
	

}
