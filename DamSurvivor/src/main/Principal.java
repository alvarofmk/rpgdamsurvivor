package main;

import crud.Crudjugador;
import model.Jugador;
import utilidad.Leer;
import controller.Dados;
import datos.Basedatos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Crudjugador crudJugador = new Crudjugador();
		String nombreJugador;
		Dados tirada = new Dados ();
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
			Jugador j1 = crudJugador.crearJugador(nombreJugador, puntosPS, puntosATK, puntosDEF);
			System.out.println(j1.getNombre());
			
		}
		System.out.println(tirada.tirarDados());
		

	}

}
