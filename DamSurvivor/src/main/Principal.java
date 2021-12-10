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
		int menu=0, eleccion = 0, enemigo = 0;
		String nombreJ = "Durbán";
		Jugador j1 = new Jugador();
		CrudEnemigo crudEnemigo = new CrudEnemigo ();
		CrudJugador crudJugador = new CrudJugador (j1);
		CrudArma crudWeapons = new CrudArma ();
		CrudObjeto crudItems = new CrudObjeto ();
		BaseDatos data = new BaseDatos();
		ControllerJugador controlJug = new ControllerJugador ();
		ControllerEnemigo controlEne = new ControllerEnemigo ();
		Dados dados = new Dados();
		Combate combate = new Combate ();
		data.setItems(crudItems.generarObjetos(data));	
		data.setWeapons(crudWeapons.generarArmas(data));
		data.setEnemigos(crudEnemigo.generarEnemigos(data));
		
		
		
		crudJugador.crearGuerrero();
		crudJugador.consultarStats();
		crudEnemigo.pintarEnemigos(data.getEnemigos());
		j1.setNombre(nombreJ);
		
		enemigo = 0;
		do {
			//turno del jugador
			System.out.println("Escoge lo que hacer: 1. Atacar, 2. Usar objeto, 3.Cambiar arma");
			//menu de combate
			menu=Leer.datoInt();
			switch(menu) {
				case 1:
					hit = combate.acertarGolpe(controlJug.atacar(j1, dados.tirarDados()), 
							controlEne.defender(data.getDefEnemigos()[enemigo], dados.tirarDados()));
					if (hit) {
						crudEnemigo.herirEnemigo(data.getEnemigos() [enemigo], j1.getArmaActiva().getdanio());
						//vista: frase enemigo acertado
					}else {
						//vista: frase enemigo fallado
					}
					break;
				case 2:
					//aplicar objeto
					System.out.println(j1.getInventario());
					eleccion=Leer.datoInt();
					crudJugador.aplicarObjeto(eleccion);
					break;
				case 3:
					//cambiar arma
					System.out.println(j1.getArmas());
					eleccion=Leer.datoInt();
					crudJugador.cambiarArma(eleccion);
					break;
				default:
					System.out.println("Te has equivocado, el enemigo aprovecha para atacar");
			}
			//turno enemigo
			
			puntATK = controlEne.atacar(data.getAtkEnemigos() [2], dados.tirarDados());
			puntDEF = controlJug.defender(j1.getPtsDEF(), data.getArmaDEF() [0], dados.tirarDados());
			System.out.println(puntATK);
			System.out.println(puntDEF);
			
			hit = combate.acertarGolpe(puntATK, puntDEF);
			System.out.println(hit);
			
			if (hit) {
				crudJugador.herirJugador(j1, data.getAtaquesEnemigos()[2][1]);
			}
			crudEnemigo.pintarEnemigos(data.getEnemigos());
			crudJugador.consultarStats(j1);
			System.out.println((data.getEnemigos() [2]).getHp());

		}while ((data.getEnemigos() [2]).getHp() > 0 && j1.getPtsHP() > 0);
		
		
		System.out.println(data.getWeapons()[1]);
	}

}
