package main;

import controller.ControllerJugador;
import controller.Dados;
import crud.CrudJugador;
import datos.BaseDatos;
import model.Arma;
import model.Jugador;
import model.Objeto;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numJ = 5;
		Dados dados = new Dados ();
		ControllerJugador controllerJ1 = new ControllerJugador();
		CrudJugador crudJugador = new CrudJugador(numJ);
		Jugador j1 = new Jugador ("loquete", 10, 5, 30, 30, null, null, null);
		BaseDatos data = new BaseDatos();
		String playerName = "Durbán";
		int contadorJ = 0;
		
		data.setListaJugadores(crudJugador.addJugador(j1, data.getListaJugadores()));
		data.pintarJugadores();
		
		
		

		
		crudJugador.pintarJugadores(data.getListaJugadores());
		
		System.out.println(controllerJ1.atacar(j1.getPtsATK(), 12, dados.tirarDados()));
		
		

	}

}
