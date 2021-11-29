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
		int opcion = 0, puntosPS = 0, puntosATK = 0, puntosDEF = 0;
		System.out.println("Bienvenido a DAM Survivor");
		System.out.println("Pulse 1 para crear personaje");

		System.out.println(tirada.tirarDados());
		

	}

}
