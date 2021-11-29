package model;

public class Jugador {
	private String nombre;
	private int puntosSalud;
	private int puntosAtaque;
	private int puntosDefensa;
	private Arma [] armas;
	private Objeto [] inventario;
	
	// Constructor con todos los atributos
	
	public Jugador (String nombre, int puntosSalud, int puntosAtaque, int puntosDefensa, Arma [] armas, Objeto [] inventario) {
		this.nombre = nombre;
		this.puntosSalud = puntosSalud;
		this.puntosAtaque = puntosAtaque;
		this.puntosDefensa = puntosDefensa;
		this.armas = armas;
		this.inventario = inventario;
	}
	// Constructor vacío
	
	public Jugador () {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntosSalud() {
		return puntosSalud;
	}

	public void setPuntosSalud(int puntosSalud) {
		this.puntosSalud = puntosSalud;
	}

	public int getPuntosAtaque() {
		return puntosAtaque;
	}

	public void setPuntosAtaque(int puntosAtaque) {
		this.puntosAtaque = puntosAtaque;
	}

	public int getPuntosDefensa() {
		return puntosDefensa;
	}

	public void setPuntosDefensa(int puntosDefensa) {
		this.puntosDefensa = puntosDefensa;
	}
	
	
	

}
