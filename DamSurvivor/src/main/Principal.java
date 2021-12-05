package main;

import controller.ControllerJugador;
import controller.Dados;
import crud.CrudJugador;
import datos.BaseDatos;
import model.Arma;
import model.Jugador;
import model.Objeto;
import utilidad.Leer;
import crud.CrudArma;
import crud.CrudObjeto;
import datos.BaseDatos;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CrudJugador crudJugador = new CrudJugador ();
		CrudArma crudWeapons = new CrudArma ();
		CrudObjeto crudItems = new CrudObjeto ();
		BaseDatos data = new BaseDatos();
		Jugador j1 = new Jugador();
		data.setItems(crudItems.generarObjetos(data));	
		data.setWeapons(crudWeapons.generarArmas(data));
		
		crudJugador.addJugador(j1, data.getListaJugadores());
		crudJugador.crearGuerrero(j1);
		crudJugador.pintarJugadores(data.getListaJugadores());
		
		
	}

}
