package crud;
import model.Jugador;

public class Crudjugador {
	
		
	
	public Jugador crearJugador (String nombre,  int salud, int ataque, int defensa, Arma [] armas, Objeto [] inventario) {
		Jugador p1 = new Jugador(nombre, salud, ataque, defensa, armas, inventario);
		return p1;
	}
	
	public void consultarStats () {
	}

}
