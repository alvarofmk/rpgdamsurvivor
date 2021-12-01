package crud;

import datos.BaseDatos;
import model.Objeto;

public class CrudObjeto {
	
	public Objeto[] generarObjetos (BaseDatos data) {
		Objeto [] items = new Objeto[5];
		
		for (int i = 0; i < data.getItems().length; i++) {
			items[i] = new Objeto (data.getObjetoNombre()[i], data.getObjetoATK()[i], data.getObjetoDEF()[i], data.getObjetoHP()[i], data.getObjetoHpMax()[i], data.getObjetoDescripcion()[i]);
		}
		
		return items;
	}

}
