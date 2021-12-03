package main;

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
