package main;

import crud.Crudjugador;
import model.Jugador;
import utilidad.Leer;
import controller.Dados;
import datos.Basedatos;
import crud.Crudarma;
import model.Arma;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Crudjugador crudJugador = new Crudjugador();
		Crudarma crudArma = new Crudarma ();
		String nombre;
		Dados tirada = new Dados ();
		int opcion = 0, puntosPS = 0, puntosATK = 0, puntosDEF = 0, clase = 0;
		System.out.println("Bienvenido a DAM Survivor");
		System.out.println("Pulse 1 para crear personaje");
		System.out.println("Introduzca el nombre del personaje");
		nombre = Leer.dato();
		System.out.println("Introduzca una clase");
		System.out.println("Pulse 1 para el pícaro");
		System.out.println("Pulse 2 para el guerrero");
		System.out.println("Pulse 3 para el mago");
		clase = Leer.datoInt();
		switch (clase) {
			case 1:
				crudJugador.crearPicaro(nombre, puntosATK, puntosDEF, clase, null, null)
		}
		
		crudJugador.crearJugador(nombre, puntosPS, puntosATK, puntosDEF, null, null);
		System.out.println(tirada.tirarDados());
		

	}

}
