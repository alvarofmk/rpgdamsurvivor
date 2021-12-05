package datos;

import model.Arma;
import model.Objeto;
<<<<<<< HEAD
import model.Jugador;
import crud.CrudJugador;

public class BaseDatos {
	
	// Atributos
	
	private Jugador [] listaJugadores = new Jugador [5];
	
	//Constructor
	
	public BaseDatos (Jugador [] listaJugadores) {
		this.listaJugadores = listaJugadores;
	}
	
	// Constructor vacío
	
	public BaseDatos () {
		
	}
	
	
	// Getters & Setters
	
	public Jugador[] getListaJugadores() {
		return listaJugadores;
	}

	public void setListaJugadores(Jugador[] listaJugadores) {
		this.listaJugadores = listaJugadores;
	}
	
	// Métodos
	
	public void pintarJugadores () {
		for (int i = 0; i < listaJugadores.length; i++) {
			System.out.println(listaJugadores[i]);
		}
	}
	
=======

public class BaseDatos {
	
	private Objeto [] items = new Objeto [5];
	private String [] objetoNombre = {"Cafelito","Bendici�n de Don Bosco","Curso de Udemy","25.000 boletines de BBDD","VideoTutorial de POJO"};
	private int [] objetoATK = {0,5,2,0,5};
	private int [] objetoDEF = {0,5,0,3,-2};
	private int [] objetoHP = {15,0,-10,-10,0};
	private int [] objetoHpMax = {0,20,0,15,0};
	private String [] objetoDescripcion = {"Cafelito",
			"Bendici�n de Don Bosco",
			"Curso de Udemy",
			"25.000 boletines de BBDD",
			"VideoTutorial de POJO"};
	
	
	private Arma [] weapons = new Arma [4];
	private String [] armaNombre = {"Permanente inexistente", "Silla rígida", "Monitor microscópico", "DAM"};
	private int [] armaATK = {5,10,20,30};
	private int [] armaDEF = {5,10,15,20};
	private int [] armaDAM = {10,20,50,80};
	private String [] armaDescripcion = {
			"Arma que nunca está cuando la necesitas",
			"Tan rígida que puede usarse como arma",
			"El equipo básico de un alumno de DAM",
			"Desesperación Aleatoriaramente Miserable (DAM) o desesperación de DAM es una espada a dos manos"
			+ " que transmite la desesperación de un alumno de DAM en exámenes a sus enemigos "};
>>>>>>> master

	
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
	
	
	
	public Arma[] getWeapons() {
		return weapons;
	}
	public void setWeapons(Arma[] weapons) {
		this.weapons = weapons;
	}
	public String[] getArmaNombre() {
		return armaNombre;
	}
	public void setArmaNombre(String[] armaNombre) {
		this.armaNombre = armaNombre;
	}
	public int[] getArmaATK() {
		return armaATK;
	}
	public void setArmaATK(int[] armaATK) {
		this.armaATK = armaATK;
	}
	public int[] getArmaDEF() {
		return armaDEF;
	}
	public void setArmaDEF(int[] armaDEF) {
		this.armaDEF = armaDEF;
	}
	public int[] getArmaDAM() {
		return armaDAM;
	}
	public void setArmaDAM(int[] armaDAM) {
		this.armaDAM = armaDAM;
	}
	public String[] getArmaDescripcion() {
		return armaDescripcion;
	}
	public void setArmaDescripcion(String[] armaDescripcion) {
		this.armaDescripcion = armaDescripcion;
	}
			
}
