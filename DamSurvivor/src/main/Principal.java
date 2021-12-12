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
		int menu=0, eleccion = 0, enemigo = 0, posicion=0;
		String nombreJ = "DurbÃ¡n";
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
		
		
		//pantalla inicio
		//sustituir por vista pantalla inicio
		System.out.println("Pantalla principal, pulse intro para seguir. /n/n");
		Leer.dato();
		
		//menu inicio
		if (posicion==0) {
			//sustituir por vista menu principal
			System.out.println("RPG DAM SURVIVOR");
			System.out.println("1. New game");
			System.out.println("2. Créditos");
			System.out.println("/n");
			menu=Leer.datoInt();
			do {
				switch(menu) {
					case 1:
						posicion=1;
						break;
					case 2:
						//vista créditos
					default:
						//sustituir por vista opcion inválida
						System.out.println("Opcion inválida");
				}
			}while(menu!=1 || menu!=2);
		}
		
		if(posicion==1) {
			do {
				//sustituir por vista escena 1
				System.out.println("Escoge tu destino");
				menu=Leer.datoInt();
				switch(menu) {
					case 1:
						crudJugador.crearAsesino();
						crudJugador.obtenerArma(0, data); 
						break;
					case 2:
						crudJugador.crearGuerrero();
						crudJugador.obtenerArma(1, data); 
						break;
					case 3:
						crudJugador.crearHechicero();
						crudJugador.obtenerArma(2, data); 
						break;
					default:
						//sustituir por vista opcion inválida
						System.out.println("Opcion inválida");
				}
			}while(menu>3 || menu <1);
			
			//Vista de escena y eleccion
			//ejemplo de eleccion
			do {
				System.out.println("Blabla elige");
				menu=Leer.datoInt();
				switch(menu) {
					case 1:
						posicion=2;
						break;
					case 2:
						posicion=3;
						break;
					default:
						//sustituir por vista opcion inválida
						System.out.println("Opcion inválida");
				}
			}while(menu!=1 || menu!=2);
		}
		
		if(posicion==2) {
			crudJugador.obtenerObjeto(0, data);
			//Vista de escena y eleccion
			do {
				System.out.println("Blabla elige");
				menu=Leer.datoInt();
				switch(menu) {
					case 1:
						posicion=4;
						break;
					case 2:
						posicion=5;
						break;
					default:
						//sustituir por vista opcion inválida
						System.out.println("Opcion inválida");
				}
			}while(menu!=1 || menu!=2);
		}
		
		if(posicion==3) {
			crudJugador.obtenerArma(3, data);
			//Vista de escena y eleccion
			do {
				System.out.println("Blabla elige");
				menu=Leer.datoInt();
				switch(menu) {
					case 1:
						posicion=5;
						break;
					case 2:
						posicion=6;
						break;
					default:
						//sustituir por vista opcion inválida
						System.out.println("Opcion inválida");
				}
			}while(menu!=1 || menu!=2);
		}
		
		if(posicion==5) {
			enemigo = 0;
			do {
				//turno del jugador
				//sustituir por vista menu combate
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
				if(data.getEnemigos()[enemigo].getHp() > 0) {
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
				}
	
			}while ((data.getEnemigos() [enemigo]).getHp() > 0 && j1.getPtsHP() > 0);
			
			if(j1.getPtsHP()<=0) {
				//cambiar por vista game over
				System.out.println("Game over");
				posicion=0;
			}else if(data.getEnemigos() [enemigo].getHp() <= 0){
				//vista enemigo derrotado
				posicion=7;
			}
			
		}
		
	}

}
