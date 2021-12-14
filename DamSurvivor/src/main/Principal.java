package main;

import controller.Combate;
import controller.ControllerArma;
import controller.ControllerEnemigo;
import controller.ControllerJugador;
import controller.Dados;
import crud.CrudJugador;
import datos.BaseDatos;
import datos.BaseDatosAscis;
import model.Arma;
import model.Jugador;
import model.Objeto;
import utilidad.Leer;
import vista.Escenas;
import vista.Menus;
import crud.CrudArma;
import crud.CrudEnemigo;
import crud.CrudObjeto;
import controller.Dados;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean hit;
		double puntATK = 0.0, puntDEF = 0.0;
		int menu = 0, eleccion = 0, enemigo = 0, posicion=0;
		String nombreJ;
		Jugador j1 = null;
		CrudJugador crudJugador = null;
		CrudEnemigo crudEnemigo = new CrudEnemigo ();
		CrudArma crudWeapons = new CrudArma ();
		CrudObjeto crudItems = new CrudObjeto ();
		BaseDatos data = new BaseDatos();
		BaseDatosAscis dataAscis = new BaseDatosAscis ();
		ControllerJugador controlJug = new ControllerJugador ();
		ControllerEnemigo controlEne = new ControllerEnemigo ();
		ControllerArma controlArma = new ControllerArma ();
		Dados dados = new Dados();
		Combate combate = new Combate ();
		Escenas escenas = new Escenas();
		Menus menus = new Menus ();
		data.setItems(crudItems.generarObjetos(data));	
		data.setWeapons(crudWeapons.generarArmas(data));
		
		//pantalla inicio
		menus.pantallaInicio();
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
						break;
				}
			}while(menu != 1 || menu != 2);
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
			
			//Vista de escena y elección
			//ejemplo de elección
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
			
			//Vista de escena y elección
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
								controlEne.defender(data.getEnemigos()[enemigo], dados.tirarDados()));
						if (hit) {
							crudEnemigo.herirEnemigo(data.getEnemigos() [enemigo], controlArma.damageRandomizado(j1.getArmaActiva()));
							//vista: frase enemigo acertado
						}else {
							// Vista: frase el enemigo falló su ataque
						}
				}
				//turno enemigo
				if(data.getEnemigos()[enemigo].getHp() > 0) {
					puntATK = controlEne.atacar(data.getEnemigos() [2], dados.tirarDados());
					puntDEF = controlJug.defender(j1, dados.tirarDados());
					System.out.println(puntATK);
					System.out.println(puntDEF);
					
					hit = combate.acertarGolpe(puntATK, puntDEF);
					System.out.println(hit);
					
					if (hit) {
						crudJugador.herirJugador(data.getAtaquesEnemigos() [enemigo] [controlEne.tirarDadosATK()]);
						// Vista frase el enemigo acertó su ataque
					}else {
						// Vista: frase el enemigo falló su ataque
					}
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
			
		}while(posicion!=99);
		
	}

}
