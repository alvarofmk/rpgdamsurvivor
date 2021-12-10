package model;

import java.util.Arrays;

public class Enemigo {
	
	private String nombre;
	private int atk;
	private int def;
	private int hp;
	private int [] ataques;
	
	public Enemigo(String nombre, int atk, int def, int hp, int [] ataques) {
		super();
		this.nombre = nombre;
		this.atk = atk;
		this.def = def;
		this.hp = hp;
		this.ataques = ataques;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}

	public int[] getAtaques() {
		return ataques;
	}
	public void setAtaques(int[] ataques) {
		this.ataques = ataques;
	}
	@Override
	public String toString() {
		return "Enemigo [nombre=" + nombre + ", atk=" + atk + ", def=" + def + ", hp=" + hp + ", ataques="
				+ Arrays.toString(ataques) + "]";
	}
	
	
	
}