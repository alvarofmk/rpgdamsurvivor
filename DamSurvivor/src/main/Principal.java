package main;

import crud.CrudJugador;
import model.Arma;
import model.Jugador;
import model.Objeto;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numJ = 5;
		CrudJugador crudJugador = new CrudJugador(numJ);
		String playerName = "Durbán";
		int contadorJ = 0;

		Jugador p1 = new Jugador(playerName, 20, 10, 65, 65, null, null, null);
		Jugador p2 = new Jugador(playerName, 25, 10, 65, 65, null, null, null);
		
		
		crudJugador.addJugador (p1, contadorJ);
		contadorJ++;
		crudJugador.addJugador(p1, contadorJ);
		contadorJ++;
		crudJugador.addJugador(p2, contadorJ);
		contadorJ++;
		
		crudJugador.pintarJugadores();
		

	}

}
