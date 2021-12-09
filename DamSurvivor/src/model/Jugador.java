package model;

import java.util.Arrays;

public class Jugador {
	
	// Atributos
	
	private String nombre;
	private String claseJugador;
	private int ptsATK;
	private int ptsDEF;
	private int ptsHP;
	private int ptsMaxHP;
	private Objeto [] inventario;
	private Arma armaActiva;
	private Arma [] armas;
	
	// Constructor
	
	public Jugador (String nombre, int ptsATK, int ptsDEF, int ptsHP, int ptsMaxHP, 
			Objeto [] inventario, Arma armaActiva, Arma [] armas, String claseJugador) {
		this.nombre = nombre;
		this.ptsATK = ptsATK;
		this.ptsDEF = ptsDEF;
		this.ptsHP = ptsHP;
		this.ptsMaxHP = ptsMaxHP;
		this.inventario = inventario;
		this.armaActiva = armaActiva;
		this.armas = armas;
		this.claseJugador = claseJugador;
	}
	
	// Constructor de nombre
	
	public Jugador (String nombre) {
		this.nombre = nombre;
	}

	
	// Constructor vacío
	
	public Jugador () {
		
	}
	
	// Getters & Setters

	public String getNombre() {
		return nombre;
	}

	public String getClaseJugador() {
		return claseJugador;
	}

	public void setClaseJugador(String claseJugador) {
		this.claseJugador = claseJugador;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPtsATK() {
		return ptsATK;
	}

	public void setPtsATK(int ptsATK) {
		this.ptsATK = ptsATK;
	}

	public int getPtsDEF() {
		return ptsDEF;
	}

	public void setPtsDEF(int ptsDEF) {
		this.ptsDEF = ptsDEF;
	}

	public int getPtsHP() {
		return ptsHP;
	}

	public void setPtsHP(int ptsHP) {
		this.ptsHP = ptsHP;
	}

	public int getPtsMaxHP() {
		return ptsMaxHP;
	}

	public void setPtsMaxHP(int ptsMaxHP) {
		this.ptsMaxHP = ptsMaxHP;
	}

	public Objeto[] getInventario() {
		return inventario;
	}

	public void setInventario(Objeto[] inventario) {
		this.inventario = inventario;
	}

	public Arma getArmaActiva() {
		return armaActiva;
	}

	public void setArmaActiva(Arma armaActiva) {
		this.armaActiva = armaActiva;
	}

	public Arma[] getArmas() {
		return armas;
	}

	public void setArmas(Arma[] armas) {
		this.armas = armas;
	}


 
	
	//toString
	
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + " clase= " + claseJugador + ", ptsATK=" + ptsATK + ", ptsDEF=" + ptsDEF + ", ptsHP=" + ptsHP
				+ ", ptsMaxHP=" + ptsMaxHP + ", inventario=" + Arrays.toString(inventario) + ", armaActiva="
				+ armaActiva + ", armas=" + Arrays.toString(armas) + "]";
	}
	
	
	
	
	
	
	
}
