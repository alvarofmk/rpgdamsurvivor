package controller;

import java.util.Random;

import model.Arma;

public class ControllerArma {
	
	public int damageRandomizado (Arma a) {
		int max = 5, min = -5, damage = 0, aleatorio = 0;
		Random num = new Random (System.nanoTime());
		aleatorio = num.nextInt(max - min + 1) + min;
		damage = a.getdanio() + aleatorio;
		return damage;
	}

}
