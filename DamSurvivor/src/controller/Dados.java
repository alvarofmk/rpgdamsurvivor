package controller;

import java.util.Random;

public class Dados {
	
	public int tirarDados () {
		Random num = new Random (System.nanoTime());
		int max = 20, min = 1, resultado = 0;
		resultado = num.nextInt(max - min + 1 + min);
		return resultado;
				
	}

}
