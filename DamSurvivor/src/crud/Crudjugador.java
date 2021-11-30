package crud;
import model.Jugador;
import model.Arma;
import model.Objeto;

public class Crudjugador {
	
		
	
	public Jugador crearPicaro (String nombre,  int salud, int ataque, int defensa, Arma [] armas, Objeto [] inventario) {
		Jugador p1 = new Jugador(nombre, 40, 25, 5, armas, inventario);
		return p1;
	}
	
	public void consultarStats () {
	}

}
