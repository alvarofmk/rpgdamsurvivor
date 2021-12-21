package controller;

import java.util.Random;

public class Dados {
	public double tirarDados (int tipoataque) {
		double resultado = 0.0, atkRapido = 1.60, atkFuerte = 0.70;
		Random num = new Random(System.nanoTime());
		resultado = num.nextDouble();
		switch (tipoataque) {
			case 1:
				resultado= resultado * atkRapido;
				break;
			case 2:
				break;
			case 3:
				resultado= resultado * atkFuerte;
				break;
		}
		return resultado;
	}
	
	public double tirarDados () {
		double resultado = 0.0;
		Random num = new Random(System.nanoTime());
		resultado = num.nextDouble();
		return resultado;
	}
}
