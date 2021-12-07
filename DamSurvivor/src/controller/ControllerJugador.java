package controller;

public class ControllerJugador {
	
	public double atacar (int ptsATK, int ptsATKArma, double coeficiente) {
		double resultado = 0.0;
		resultado = (ptsATK + ptsATKArma) * coeficiente;
		return resultado;
	}
	
	public double defender (int ptsDEF, int ptsDEFArma, double coeficiente) {
		double resultado = 0.0;
		resultado = (ptsDEF + ptsDEFArma) * coeficiente;
		return resultado;
	}

}
