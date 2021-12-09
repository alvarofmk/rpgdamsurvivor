package controller;

public class ControllerEnemigo {
	
	public double atacar (int ptsATK, double coeficiente) {
		double resultado = 0.0;
		resultado = ptsATK * coeficiente;
		return resultado;
	}
	
	public double defender (int ptsDEF, double coeficiente) {
		double resultado = 0.0;
		resultado = ptsDEF * coeficiente;
		return resultado;
	}


}
