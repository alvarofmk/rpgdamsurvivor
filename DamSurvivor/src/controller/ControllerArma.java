package controller;

import java.util.Random;

import model.Arma;

public class ControllerArma {
	
	public int damageRandomizado (Arma a, int tipoAtaque) {
		int max = 5, min = -5, damage = 0, aleatorio = 0, modificador = 25;
		Random num = new Random (System.nanoTime());
		aleatorio = num.nextInt(max - min + 1) + min;
		damage = a.getdanio() + aleatorio;
		switch(tipoAtaque) {
			case 1:
				damage= damage - (damage/modificador);
				break;
			case 2:
				break;
			case 3:
				damage= damage + (damage/modificador);
				break;
		}
		return damage;
	}

}
