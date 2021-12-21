package controller;

import java.util.Random;

public class Dados {
	public double tirarDados (int tipoataque) {
		double resultado = 0.0, atkRapido = 1.50, atkFuerte = 0.75;
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
		double resultado = 0.0, atkRapido = 1.15, atkFuerte = 0.85;
		Random num = new Random(System.nanoTime());
		resultado = num.nextDouble();
		return resultado;
	}
}
