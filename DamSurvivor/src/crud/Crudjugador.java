package crud;

public class Crudjugador {
	
		
	
	public model.Jugador crearJugador (String nombre,  int salud, int ataque, int defensa) {
		model.Jugador p1 = new model.Jugador(nombre, salud, ataque, defensa);
		System.out.println("Su nombre es: " + p1.getNombre());
		return p1;
	}
	
	public void consultarStats () {
	}

}
