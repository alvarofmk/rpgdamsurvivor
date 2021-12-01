package controller;

public class ControllerJugador {
	
	public double atacar (int ptsATK, int ptsATKarma, double coeficiente) {
		double resultado = 0.0;
		resultado = ptsATK + ptsATKarma * coeficiente;
		return resultado;
	}

}
