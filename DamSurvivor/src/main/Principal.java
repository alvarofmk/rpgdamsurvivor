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
		
		int claseJugador;
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
		data.getEleccionesMapa();
		
		System.out.println("Bienvenido a RPG DAM SURVIVOR!");
		System.out.println("Cómo deberia llamarte ?");
		j1.setNombre(Leer.dato());
		System.out.println("Qué clase eres ?");
		System.out.println("1. Guerrero");
		System.out.println("2. Asesino");
		System.out.println("3. Hechicero");
		claseJugador=Leer.datoInt();
		switch (claseJugador) {
		case 1:
			crudJugador.crearGuerrero(j1);
			j1.setClaseJugador("Guerrero");
			break;
		case 2:
			crudJugador.crearAsesino(j1);
			j1.setClaseJugador("Asesino");
			break;
		default:
			crudJugador.crearHechicero(j1);
			j1.setClaseJugador("Hechicero");
			break;
		}
		

		crudJugador.consultarStats(j1);

		
	}

}
