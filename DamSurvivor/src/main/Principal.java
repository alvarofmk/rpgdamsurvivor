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
		do {
			//turno del jugador
			switch(menu) {
				case 1:
					puntATK = controlJug.atacar(j1.getPtsATK(), data.getArmaATK()[0], dados.tirarDados());
					puntDEF = controlEne.defender(data.getDefEnemigos()[2], dados.tirarDados());
					System.out.println(puntATK);
					System.out.println(puntDEF);
					
					hit = combate.acertarGolpe(puntATK, puntDEF);
					System.out.println(hit);
					if (hit) {
						crudEnemigo.herirEnemigo(data.getEnemigos() [2], j1.getPtsATK());
					}
					crudEnemigo.pintarEnemigos(data.getEnemigos());
					crudJugador.consultarStats(j1);
				case 2:
					//aplicar objeto
				case 3:
					//cambiar arma
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
				crudJugador.herirJugador(j1, data.getAtkEnemigos() [2]);
			}
			crudEnemigo.pintarEnemigos(data.getEnemigos());
			crudJugador.consultarStats(j1);
			System.out.println((data.getEnemigos() [2]).getHp());

		}while ((data.getEnemigos() [2]).getHp() > 0 && j1.getPtsHP() > 0);
		
	}

}
