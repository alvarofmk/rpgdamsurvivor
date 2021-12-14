package controller;

import java.util.Random;

import model.Enemigo;

public class ControllerEnemigo {
	
	public double atacar (Enemigo e, double coeficiente) {
		double resultado = 0.0;
		resultado = e.getAtk() * coeficiente;
		return resultado;
	}
	
	public double defender (Enemigo e, double coeficiente) {
		double resultado = 0.0;
		resultado = e.getDef() * coeficiente;
		return resultado;
	}
	
	public int tirarDadosATK () {
		int max = 20, min = 1, aleatorio = 0, ataque = 0;
		Random num = new Random (System.nanoTime());
		aleatorio = num.nextInt(max - min + 1) + min;
		if (aleatorio <= 12) {
			ataque = 1;
		}else if (aleatorio <= 18) {
			ataque = 2;
		}else {
			ataque = 3;
		}
		return ataque;
	}

}
