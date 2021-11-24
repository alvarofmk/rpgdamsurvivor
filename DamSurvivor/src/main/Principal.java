package main;

import crud.Crudjugador;
import utilidad.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		crud.Crudjugador jugador1 = new Crudjugador();
		String nombreJugador;
		int opcion = 0, puntosPS = 0, puntosATK = 0, puntosDEF = 0;
		System.out.println("Bienvenido a DAM Survivor");
		System.out.println("Pulse 1 para crear personaje");
		opcion = Leer.datoInt();
		if (opcion == 1) {
			System.out.println("Introduzca un nombre");
			nombreJugador = Leer.dato();
			System.out.println("Introduzca puntos de salud");
			puntosPS = Leer.datoInt();
			System.out.println("Introduzca puntos de ataque");
			puntosATK = Leer.datoInt();
			System.out.println("Introduzca puntos de defensa");
			puntosDEF = Leer.datoInt();
			jugador1.crearJugador(nombreJugador, puntosPS, puntosATK, puntosDEF);
			
			
			
		}
		

	}

}
