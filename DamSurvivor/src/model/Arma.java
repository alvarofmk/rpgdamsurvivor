package model;

public class Arma {
		
	private String nombre;
	private int ataque;
	private int defensa;
	private int daño;
	private String descripcion;
	
	
	public Arma(String nombre, int ataque, int defensa, int daño, String descripcion) {
		super();
		this.nombre = nombre;
		this.ataque = ataque;
		this.defensa = defensa;
		this.daño = daño;
		this.descripcion = descripcion;
	}



	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getAtaque() {
		return ataque;
	}


	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}


	public int getDefensa() {
		return defensa;
	}


	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}


	public int getDaño() {
		return daño;
	}


	public void setDaño(int daño) {
		this.daño = daño;
	}
	

	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	@Override
	public String toString() {
		return "Arma [nombre=" + nombre + ", ataque=" + ataque + ", defensa=" + defensa + ", daño=" + daño + "]";
	}
	
	
	
	
	
	
	
 
	
	
	
	
	
	
	
	
	
	
	
	
	
}
