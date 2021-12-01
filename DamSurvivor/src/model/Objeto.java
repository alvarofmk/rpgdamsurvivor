package model;

public class Objeto {
	
	private String nombre;
	private int atk;
	private int def;
	private int hp;
	private int hpMax;
	private String descripcion;
	
	public Objeto(String nombre, int atk, int def, int hp, int hpMax, String descripcion) {
		super();
		this.nombre = nombre;
		this.atk = atk;
		this.def = def;
		this.hp = hp;
		this.hpMax = hpMax;
		this.descripcion = descripcion;
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
	
	public int getHpMax() {
		return hpMax;
	}

	public void setHpMax(int hpMax) {
		this.hpMax = hpMax;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Objeto [nombre=" + nombre + ", atk=" + atk + ", def=" + def + ", hp=" + hp + ", descripcion="
				+ descripcion + "]";
	}

}
