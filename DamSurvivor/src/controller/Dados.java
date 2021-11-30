package controller;

import java.util.Random;

public class Dados {
	
	public double tirarDados () {
		Random num = new Random (System.nanoTime());
		double resultado = 0.0;
		resultado = num.nextDouble();
		return resultado;
				
	}

}
