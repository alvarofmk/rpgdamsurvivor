package controller;

import model.Jugador;

public class ControllerJugador {
	
	public double atacar (Jugador j1, double coeficiente) {
		double resultado = 0.0;
		resultado = (j1.getPtsATK() + j1.getArmaActiva().getAtaque()) * coeficiente;
		return resultado;
	}
	
	public double defender (Jugador j1, double coeficiente) {
		double resultado = 0.0;
		resultado = (j1.getPtsDEF() + j1.getArmaActiva().getDefensa()) * coeficiente;
		return resultado;
	}

}
