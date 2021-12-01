package datos;

import model.Objeto;

public class BaseDatos {
	
	private Objeto [] items = new Objeto [5];
	private String [] objetoNombre = {"Cafelito","Bendición de Don Bosco","Curso de Udemy","25.000 boletines de BBDD","VideoTutorial de POJO"};
	private int [] objetoATK = {0,5,2,0,5};
	private int [] objetoDEF = {0,5,0,3,-2};
	private int [] objetoHP = {15,0,-10,-10,0};
	private int [] objetoHpMax = {0,20,0,15,0};
	private String [] objetoDescripcion = {"Cafelito",
			"Bendición de Don Bosco",
			"Curso de Udemy",
			"25.000 boletines de BBDD",
			"VideoTutorial de POJO"};
	
	public Objeto[] getItems() {
		return items;
	}
	public void setItems(Objeto[] items) {
		this.items = items;
	}
	public String[] getObjetoNombre() {
		return objetoNombre;
	}
	public void setObjetoNombre(String[] objetoNombre) {
		this.objetoNombre = objetoNombre;
	}
	public int[] getObjetoATK() {
		return objetoATK;
	}
	public void setObjetoATK(int[] objetoATK) {
		this.objetoATK = objetoATK;
	}
	public int[] getObjetoDEF() {
		return objetoDEF;
	}
	public void setObjetoDEF(int[] objetoDEF) {
		this.objetoDEF = objetoDEF;
	}
	public int[] getObjetoHP() {
		return objetoHP;
	}
	public void setObjetoHP(int[] objetoHP) {
		this.objetoHP = objetoHP;
	}
	public int[] getObjetoHpMax() {
		return objetoHpMax;
	}
	public void setObjetoHpMax(int[] objetoHpMax) {
		this.objetoHpMax = objetoHpMax;
	}
	public String[] getObjetoDescripcion() {
		return objetoDescripcion;
	}
	public void setObjetoDescripcion(String[] objetoDescripcion) {
		this.objetoDescripcion = objetoDescripcion;
	}
	
}
