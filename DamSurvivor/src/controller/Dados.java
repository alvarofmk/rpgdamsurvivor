package controller;

import java.util.Random;

public class Dados {
	public double tirarDados () {
		double resultado = 0.0;
		Random num = new Random(System.nanoTime());
		resultado = num.nextDouble();
		return resultado;
	}
}
