package main;

import controller.Combate;
import controller.ControllerEnemigo;
import controller.ControllerJugador;
import controller.Dados;
import crud.CrudJugador;
import datos.BaseDatos;
import model.Arma;
import model.Jugador;
import model.Objeto;
import utilidad.Leer;
import crud.CrudArma;
import crud.CrudEnemigo;
import crud.CrudObjeto;
import controller.Dados;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean hit;
		double puntATK = 0.0, puntDEF = 0.0;
		String nombreJ = "Durbán";
		CrudEnemigo crudEnemigo = new CrudEnemigo ();
		CrudJugador crudJugador = new CrudJugador ();
		CrudArma crudWeapons = new CrudArma ();
		CrudObjeto crudItems = new CrudObjeto ();
		BaseDatos data = new BaseDatos();
		ControllerJugador controlJug = new ControllerJugador ();
		ControllerEnemigo controlEne = new ControllerEnemigo ();
		Dados dados = new Dados();
		Jugador j1 = new Jugador();
		Combate combate = new Combate ();
		data.setItems(crudItems.generarObjetos(data));	
		data.setWeapons(crudWeapons.generarArmas(data));
		data.setEnemigos(crudEnemigo.generarEnemigos(data));
		
		
		
		crudJugador.addJugador(j1, data.getListaJugadores());
		crudJugador.crearGuerrero(j1);
		crudJugador.pintarJugadores(data.getListaJugadores());
		crudJugador.consultarStats(j1);
		crudEnemigo.pintarEnemigos(data.getEnemigos());
		j1.setNombre(nombreJ);
		
		
		// Prueba de combate
		
		puntATK = controlJug.atacar(j1.getPtsATK(), data.getArmaATK()[0], dados.tirarDados());
		puntDEF = controlEne.defender(data.getDefEnemigos()[3], dados.tirarDados());
		System.out.println(puntATK);
		System.out.println(puntDEF);
		
		hit = combate.acertarGolpe(puntATK, puntDEF);
		System.out.println(hit);
		
		
		
	}

}
