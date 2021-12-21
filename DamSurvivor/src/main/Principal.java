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
		double roll = 0.0;
		int menu = 0, eleccion = 0, enemigo = 0, posicion = 0, dmg = 0, rollEnemigo = 0;
		String nombreJ = "";
		Jugador j1 = null;
		CrudJugador crudJugador = null;
		CrudEnemigo crudEnemigo = new CrudEnemigo();
		CrudArma crudWeapons = new CrudArma();
		CrudObjeto crudItems = new CrudObjeto();
		BaseDatos data = new BaseDatos();
		BaseDatosAscis dataAscis = new BaseDatosAscis();
		ControllerJugador controlJug = new ControllerJugador();
		ControllerEnemigo controlEne = new ControllerEnemigo();
		ControllerArma controlArma = new ControllerArma();
		Dados dados = new Dados();
		Combate combate = new Combate();
		Escenas escenas = new Escenas();
		Menus menus = new Menus();
		data.setItems(crudItems.generarObjetos(data));
		data.setWeapons(crudWeapons.generarArmas(data));

		// pantalla inicio
		menus.pantallaInicio();
		Leer.dato();

		// menu inicio
		do {
			if (posicion == 0) {
				do {
					menus.menuPrincipal();
					menu = Leer.datoInt();
					switch (menu) {
						case 1:
							posicion = 1;
							menus.pintarMenuNombre();
							// reiniciando valores
							nombreJ = Leer.dato();
							j1 = new Jugador(nombreJ);
							crudJugador = new CrudJugador(j1);
							data.setEnemigos(crudEnemigo.generarEnemigos(data));
							break;
						case 2:
							menus.creditos();
							break;
						case 3:
							posicion = 99;
							break;
						default:
							menus.invalid();
					}
				} while (posicion == 0);
			}

			if (posicion == 1) {
				do {
					menus.pintarMenu0(nombreJ);
					menu = Leer.datoInt();
					switch (menu) {
						case 1:
							crudJugador.crearAsesino();
							crudJugador.obtenerArma(0, data);
							j1.setArmaActiva(j1.getArmas()[0]);
							
							break;
						case 2:
							crudJugador.crearGuerrero();
							crudJugador.obtenerArma(0, data);
							j1.setArmaActiva(j1.getArmas()[0]);
							break;
						case 3:
							crudJugador.crearHechicero();
							crudJugador.obtenerArma(0, data);
							j1.setArmaActiva(j1.getArmas()[0]);
							break;
						default:
							menus.invalid();
					}
				} while (menu > 3 || menu < 1);

				// ejemplo de elección
				do {
				//Historia para posicion 2 o 3
					menus.pintarMenuClases(menu);
					menus.pintarMenu1();
					menu = Leer.datoInt();
					switch (menu) {
						case 1:
							posicion = 2;
							break;
						case 2:
							posicion = 3;
							break;
						default:
							menus.invalid();
					}
				} while (menu != 1 && menu != 2);
			}

			if (posicion == 2) {
				crudJugador.obtenerObjeto(0, data);
				menus.pintarMenu2();
				escenas.pintar(dataAscis.getAscisEscenas()[2]);
				menus.obtencionObjeto(data.getItems()[0]);
				menus.pintarMenuDecision2();
				// Vista de escena y elección
				do {
					menu = Leer.datoInt();
					switch (menu) {
						case 1:
							posicion = 4;
							break;
						case 2:
							posicion = 5;
							break;
						default:
							menus.invalid();
					}
				} while (menu != 1 && menu != 2);
			}

			if (posicion == 3) {
				crudJugador.obtenerArma(1, data);
				escenas.pintar(dataAscis.getAscisEscenas()[3]);
				menus.obtencionArma(data.getWeapons()[1]);
				menus.pintarMenu3();
				menus.pintarMenuDecisiones3();// Vista de escena y eleccion
				do {
					menu = Leer.datoInt();
					switch (menu) {
						case 1:
							posicion = 5;
							break;
						case 2:
							// Esta posicion no funciona. Algo está mal.
							posicion = 6;
							break;
						default:
							menus.invalid();
					}
				} while (menu != 1 && menu != 2);
			}
			
			if (posicion == 4) {
				escenas.pintar(dataAscis.getAscisEscenas()[18]);
				menus.pintarMenu4();
				crudJugador.bajarHP(j1);
				menus.pintarMenuDecisiones4();
				posicion = 7; // Hay que seguir haciendo principal
			}

			if (posicion == 5) {
				enemigo = 0;
				menus.pintarMenu5();
				do {
					// turno del jugador
					menus.menuCombate(j1);
					menu = Leer.datoInt();
					switch (menu) {
						case 1:
							menus.lanzaDados();
							Leer.dato();
							roll = dados.tirarDados();
							menus.dado(roll);
							hit = combate.acertarGolpe(controlJug.atacar(j1, roll),
									controlEne.defender(data.getEnemigos()[enemigo], dados.tirarDados()));
							if (hit) {
								dmg = controlArma.damageRandomizado(j1.getArmaActiva());
								crudEnemigo.herirEnemigo(data.getEnemigos()[enemigo], dmg);
								menus.box3(data.getFraseAuxiliar()[0], menus.ataqueAcertado(dmg, data.getEnemigos()[enemigo]), data.getFraseAtaqueAcertado()[enemigo]);
							} else {
								menus.box1(data.getFraseAtaqueFallido()[enemigo]);
							}
							Leer.dato();
							break;
						case 2:
							// aplicar objeto
							menus.menuObjetos(j1);
							eleccion = Leer.datoInt();
							if(crudJugador.comprobarObjeto(eleccion)) {
								menus.objetoUsado(j1.getInventario()[eleccion-1]);
								crudJugador.aplicarObjeto(eleccion);
							}else {
								menus.turnoPerdido();
							}
							break;
						case 3:
							// cambiar arma
							menus.menuArmas(j1);
							eleccion = Leer.datoInt();
							if(crudJugador.comprobarArma(eleccion)) {
								crudJugador.cambiarArma(eleccion);
								menus.cambiarArma(j1.getArmaActiva());
							}else {
								menus.turnoPerdido();
							}
							break;
						default:
							menus.turnoPerdido();
					}
					// turno enemigo
					if (data.getEnemigos()[enemigo].getHp() > 0) {
						roll = dados.tirarDados();
						rollEnemigo = controlEne.tirarDadosATK();
						menus.menuEnemigo(data.getEnemigos() [enemigo], enemigo, dataAscis.getAscisEscenas());
						menus.box3(menus.vidaEnemigo(data.getEnemigos()[enemigo]), data.getFraseAtaqueEnemigo()[enemigo][rollEnemigo-1], data.getFraseAuxiliar()[1]);
						menus.lanzaDados();
						Leer.dato();
						menus.dado(roll);
						hit = combate.acertarGolpe(controlEne.atacar(data.getEnemigos() [enemigo], dados.tirarDados()),
								controlJug.defender(j1, roll));
						if (hit) {
							crudJugador.herirJugador(data.getEnemigos()[enemigo].getAtaques()[rollEnemigo - 1]);
							menus.box2(menus.ataqueEnemigoAcertado(data.getEnemigos()[enemigo]), menus.danioRecibido(data.getEnemigos()[enemigo].getAtaques()[rollEnemigo - 1]));
						} else {
							menus.box1(menus.ataqueEnemigoFallado(data.getEnemigos() [enemigo]));
						}
						Leer.dato();
					}
				} while ((data.getEnemigos()[enemigo]).getHp() > 0 && j1.getPtsHP() > 0);

				if (j1.getPtsHP() <= 0) {
					menus.gameOver();
					Leer.dato();
					posicion = 0;
				}else if (data.getEnemigos()[enemigo].getHp() <= 0) {
					escenas.pintar(dataAscis.getAscisEscenas() [5]);
					menus.box1(data.getFraseEnemigoDerrotado()[enemigo]);
					menus.enemigoDerrotado();
					eleccion=Leer.datoInt();
					crudJugador.derrotarJefe(eleccion);
					posicion = 7;
				}
			}
			if (posicion == 6) {
				menus.pintarMenu6();
				crudJugador.subirAtaque(j1);
				escenas.pintar(dataAscis.getAscisEscenas()[12]);
				menus.pintarMenuDecisiones6();
				Leer.dato();
				posicion = 7; // 
			}
			if (posicion == 7) {	
				enemigo = 1;
				do {
					// turno del jugador
					menus.menuCombate(j1);
					menu = Leer.datoInt();
					switch (menu) {
						case 1:
							menus.lanzaDados();
							Leer.dato();
							roll = dados.tirarDados();
							menus.dado(roll);
							hit = combate.acertarGolpe(controlJug.atacar(j1, roll),
									controlEne.defender(data.getEnemigos()[enemigo], dados.tirarDados()));
							if (hit) {
								dmg = controlArma.damageRandomizado(j1.getArmaActiva());
								crudEnemigo.herirEnemigo(data.getEnemigos()[enemigo], dmg);
								menus.box3(data.getFraseAuxiliar()[0], menus.ataqueAcertado(dmg, data.getEnemigos()[enemigo]), data.getFraseAtaqueAcertado()[enemigo]);
							} else {
								menus.box1(data.getFraseAtaqueFallido()[enemigo]);
							}
							Leer.dato();
							break;
						case 2:
							// aplicar objeto
							menus.menuObjetos(j1);
							eleccion = Leer.datoInt();
							if(crudJugador.comprobarObjeto(eleccion)) {
								menus.objetoUsado(j1.getInventario()[eleccion-1]);
								crudJugador.aplicarObjeto(eleccion);
							}else {
								menus.turnoPerdido();
							}
							break;
						case 3:
							// cambiar arma
							menus.menuArmas(j1);
							eleccion = Leer.datoInt();
							if(crudJugador.comprobarArma(eleccion)) {
								crudJugador.cambiarArma(eleccion);
								menus.cambiarArma(j1.getArmaActiva());
							}else {
								menus.turnoPerdido();
							}
							break;
						default:
							menus.turnoPerdido();
					}
					// turno enemigo
					if (data.getEnemigos()[enemigo].getHp() > 0) {
						roll = dados.tirarDados();
						rollEnemigo = controlEne.tirarDadosATK();
						menus.menuEnemigo(data.getEnemigos() [enemigo], enemigo, dataAscis.getAscisEscenas());
						menus.box3(menus.vidaEnemigo(data.getEnemigos()[enemigo]), data.getFraseAtaqueEnemigo()[enemigo][rollEnemigo-1], data.getFraseAuxiliar()[1]);
						menus.lanzaDados();
						Leer.dato();
						menus.dado(roll);
						hit = combate.acertarGolpe(controlEne.atacar(data.getEnemigos() [enemigo], dados.tirarDados()),
								controlJug.defender(j1, roll));
						if (hit) {
							crudJugador.herirJugador(data.getEnemigos()[enemigo].getAtaques()[rollEnemigo - 1]);
							menus.box2(menus.ataqueEnemigoAcertado(data.getEnemigos()[enemigo]), menus.danioRecibido(data.getEnemigos()[enemigo].getAtaques()[rollEnemigo - 1]));
						} else {
							menus.box1(menus.ataqueEnemigoFallado(data.getEnemigos() [enemigo]));
						}
						Leer.dato();
					}
				} while ((data.getEnemigos()[enemigo]).getHp() > 0 && j1.getPtsHP() > 0);

					if (j1.getPtsHP() <= 0) {
						menus.gameOver();
						Leer.dato();
						posicion = 0;
					}else if (data.getEnemigos()[enemigo].getHp() <= 0) {
						escenas.pintar(dataAscis.getAscisEscenas() [7]);
						menus.box1(data.getFraseEnemigoDerrotado()[enemigo]);
						menus.enemigoDerrotado();
						eleccion=Leer.datoInt();
						crudJugador.derrotarJefe(eleccion);
						menus.pintarMenu7();
						menus.pintarMenuDecisiones7();
						menu=Leer.datoInt();
						switch (menu) {
						case 1:
							posicion = 8;
							break;
						case 2:
							posicion = 9;
							break;
						default:
							menus.invalid();
							break;
						}
					}
			}
			if (posicion == 8) {
				menus.pintarMenu8();
				crudJugador.obtenerObjeto(0, data);
				escenas.pintar(dataAscis.getAscisEscenas() [2]);
				menus.obtencionObjeto(data.getItems() [0]);
				menus.pintarMenuDecisiones8();
				menu=Leer.datoInt();
				switch (menu) {
				case 1:
					posicion = 10;
					break;
				case 2:
					posicion = 11;
					break;
				default:
					menus.invalid();
					break;
				}
			}
			if (posicion == 9) {
				menus.pintarMenu9();
				crudJugador.obtenerObjeto(2, data);
				escenas.pintar(dataAscis.getAscisEscenas() [9]);
				menus.obtencionObjeto(data.getItems() [2]);
				menus.pintarMenuDecisiones9();
				menu=Leer.datoInt();
				switch (menu) {
				case 1:
					posicion = 12;
					break;
				case 2:
					posicion = 11;
					break;
				default:
					menus.invalid();
					break;
				}
			}
			if (posicion == 10) {
				//Videotutorial POJO
				menus.pintarMenu10();
				posicion = 13;
			}
			if (posicion == 11) {
				menus.pintarMenu11();
				enemigo = 2;
				do {
					// turno del jugador
					menus.menuCombate(j1);
					menu = Leer.datoInt();
					switch (menu) {
						case 1:
							menus.lanzaDados();
							Leer.dato();
							roll = dados.tirarDados();
							menus.dado(roll);
							hit = combate.acertarGolpe(controlJug.atacar(j1, roll),
									controlEne.defender(data.getEnemigos()[enemigo], dados.tirarDados()));
							if (hit) {
								dmg = controlArma.damageRandomizado(j1.getArmaActiva());
								crudEnemigo.herirEnemigo(data.getEnemigos()[enemigo], dmg);
								menus.box3(data.getFraseAuxiliar()[0], menus.ataqueAcertado(dmg, data.getEnemigos()[enemigo]), data.getFraseAtaqueAcertado()[enemigo]);
							} else {
								menus.box1(data.getFraseAtaqueFallido()[enemigo]);
							}
							Leer.dato();
							break;
						case 2:
							// aplicar objeto
							menus.menuObjetos(j1);
							eleccion = Leer.datoInt();
							if(crudJugador.comprobarObjeto(eleccion)) {
								menus.objetoUsado(j1.getInventario()[eleccion-1]);
								crudJugador.aplicarObjeto(eleccion);
							}else {
								menus.turnoPerdido();
							}
							break;
						case 3:
							// cambiar arma
							menus.menuArmas(j1);
							eleccion = Leer.datoInt();
							if(crudJugador.comprobarArma(eleccion)) {
								crudJugador.cambiarArma(eleccion);
								menus.cambiarArma(j1.getArmaActiva());
							}else {
								menus.turnoPerdido();
							}
							break;
						default:
							menus.turnoPerdido();
					}
					// turno enemigo
					if (data.getEnemigos()[enemigo].getHp() > 0) {
						roll = dados.tirarDados();
						rollEnemigo = controlEne.tirarDadosATK();
						menus.menuEnemigo(data.getEnemigos() [enemigo], enemigo, dataAscis.getAscisEscenas());
						menus.box3(menus.vidaEnemigo(data.getEnemigos()[enemigo]), data.getFraseAtaqueEnemigo()[enemigo][rollEnemigo-1], data.getFraseAuxiliar()[1]);
						menus.lanzaDados();
						Leer.dato();
						menus.dado(roll);
						hit = combate.acertarGolpe(controlEne.atacar(data.getEnemigos() [enemigo], dados.tirarDados()),
								controlJug.defender(j1, roll));
						if (hit) {
							crudJugador.herirJugador(data.getEnemigos()[enemigo].getAtaques()[rollEnemigo - 1]);
							menus.box2(menus.ataqueEnemigoAcertado(data.getEnemigos()[enemigo]), menus.danioRecibido(data.getEnemigos()[enemigo].getAtaques()[rollEnemigo - 1]));
						} else {
							menus.box1(menus.ataqueEnemigoFallado(data.getEnemigos() [enemigo]));
						}
						Leer.dato();
					}
				} while ((data.getEnemigos()[enemigo]).getHp() > 0 && j1.getPtsHP() > 0);

				if (j1.getPtsHP() <= 0) {
					menus.gameOver();
					Leer.dato();
					posicion = 0;
				}else if (data.getEnemigos()[enemigo].getHp() <= 0) {
					escenas.pintar(dataAscis.getAscisEscenas() [10]);
					menus.box1(data.getFraseEnemigoDerrotado()[enemigo]);
					menus.enemigoDerrotado();
					eleccion=Leer.datoInt();
					crudJugador.derrotarJefe(eleccion);
					menus.pintarMenuDecisiones11();
					menu=Leer.datoInt();
					switch (menu) {
					case 1:
						posicion = 13;
						break;
					case 2:
						posicion = 14;
						break;
					default:
						menus.invalid();
						break;
					}
				}
		}
			if (posicion == 12) {
				menus.pintarMenu12();
				posicion = 14;
			}	
			if (posicion == 13) {
				menus.pintarMenu13();
				escenas.pintar(dataAscis.getAscisEscenas() [18]);
				crudJugador.bajarHP(j1);
				posicion = 15;
			}
			if (posicion == 14) {
				
				menus.pintarMenu14B();
				posicion = 15;
			}
			if (posicion == 15) {
				menus.pintarMenu15();
				menus.pintarMenuDecisiones15();
				menu=Leer.datoInt();
				switch (menu) {
				case 1:
					posicion = 16;
					break;
				case 2:
					posicion = 17;
					break;
				default:
					menus.invalid();
					break;
				}
			}
			if (posicion == 16) {
				menus.pintarMenu16();
				escenas.pintar(dataAscis.getAscisEscenas() [14]);
				posicion = 0;
			}
			if (posicion == 17) {
				menus.pintarMenu17();
				posicion = 18;
			}
			if (posicion == 18) {
				enemigo = 3;
				menus.pintarMenu18();
				do {
					// turno del jugador
					menus.menuCombate(j1);
					menu = Leer.datoInt();
					switch (menu) {
						case 1:
							menus.lanzaDados();
							Leer.dato();
							roll = dados.tirarDados();
							menus.dado(roll);
							hit = combate.acertarGolpe(controlJug.atacar(j1, roll),
									controlEne.defender(data.getEnemigos()[enemigo], dados.tirarDados()));
							if (hit) {
								dmg = controlArma.damageRandomizado(j1.getArmaActiva());
								crudEnemigo.herirEnemigo(data.getEnemigos()[enemigo], dmg);
								menus.box3(data.getFraseAuxiliar()[0], menus.ataqueAcertado(dmg, data.getEnemigos()[enemigo]), data.getFraseAtaqueAcertado()[enemigo]);
							} else {
								menus.box1(data.getFraseAtaqueFallido()[enemigo]);
							}
							Leer.dato();
							break;
						case 2:
							// aplicar objeto
							menus.menuObjetos(j1);
							eleccion = Leer.datoInt();
							if(crudJugador.comprobarObjeto(eleccion)) {
								menus.objetoUsado(j1.getInventario()[eleccion-1]);
								crudJugador.aplicarObjeto(eleccion);
							}else {
								menus.turnoPerdido();
							}
							break;
						case 3:
							// cambiar arma
							menus.menuArmas(j1);
							eleccion = Leer.datoInt();
							if(crudJugador.comprobarArma(eleccion)) {
								crudJugador.cambiarArma(eleccion);
								menus.cambiarArma(j1.getArmaActiva());
							}else {
								menus.turnoPerdido();
							}
							break;
						default:
							menus.turnoPerdido();
					}
					// turno enemigo
					if (data.getEnemigos()[enemigo].getHp() > 0) {
						roll = dados.tirarDados();
						rollEnemigo = controlEne.tirarDadosATK();
						menus.menuEnemigo(data.getEnemigos() [enemigo], enemigo, dataAscis.getAscisEscenas());
						menus.box3(menus.vidaEnemigo(data.getEnemigos()[enemigo]), data.getFraseAtaqueEnemigo()[enemigo][rollEnemigo-1], data.getFraseAuxiliar()[1]);
						menus.lanzaDados();
						Leer.dato();
						menus.dado(roll);
						hit = combate.acertarGolpe(controlEne.atacar(data.getEnemigos() [enemigo], dados.tirarDados()),
								controlJug.defender(j1, roll));
						if (hit) {
							crudJugador.herirJugador(data.getEnemigos()[enemigo].getAtaques()[rollEnemigo - 1]);
							menus.box2(menus.ataqueEnemigoAcertado(data.getEnemigos()[enemigo]), menus.danioRecibido(data.getEnemigos()[enemigo].getAtaques()[rollEnemigo - 1]));
						} else {
							menus.box1(menus.ataqueEnemigoFallado(data.getEnemigos() [enemigo]));
						}
						Leer.dato();
					}
				} while ((data.getEnemigos()[enemigo]).getHp() > 0 && j1.getPtsHP() > 0);

				if (j1.getPtsHP() <= 0) {
					menus.gameOver();
					Leer.dato();
					posicion = 0;
				}else if (data.getEnemigos()[enemigo].getHp() <= 0) {
					escenas.pintar(dataAscis.getAscisEscenas() [17]);
					menus.box1(data.getFraseEnemigoDerrotado()[enemigo]);
					//cambiar por vista
					System.out.println("THE END");
					menus.creditos();
				}
				
		}				
		} while (posicion != 99);

	}
}
	
