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
		
		CrudObjeto crudItems = new CrudObjeto ();
		BaseDatos data = new BaseDatos();
		data.setItems(crudItems.generarObjetos(data));


		CrudArma crudWeapons = new CrudArma ();
		data.setWeapons(crudWeapons.generarArmas(data));
		
	}

}
