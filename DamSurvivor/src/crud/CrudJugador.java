package crud;

import model.Jugador;
import model.Objeto;
import datos.BaseDatos;
import model.Arma;

public class CrudJugador {
	
	
	private Jugador j1;
	
	// Constructor
	
	public CrudJugador (Jugador j1) {
		this.j1=j1;
	}
	
	// Métodos
	
	public void crearGuerrero () {
		j1.setPtsATK(45);
		j1.setPtsDEF(45);
		j1.setPtsHP(80);
		j1.setPtsMaxHP(80);
	}
	public void crearAsesino () {
		j1.setPtsATK(75);
		j1.setPtsDEF(25);
		j1.setPtsHP(50);
		j1.setPtsMaxHP(50);
	}
	
	public void crearHechicero () {
		j1.setPtsATK(60);
		j1.setPtsDEF(20);
		j1.setPtsHP(40);
		j1.setPtsMaxHP(40);
	}
	
	public void consultarStats () {
		System.out.println(j1);
	}
	
	public void herirJugador (int atk) {
		int hpNueva = 0;
		hpNueva = j1.getPtsHP() - atk;
		j1.setPtsHP(hpNueva);
	}
	
	public void cambiarArma (int index) {
		j1.setArmaActiva(j1.getArmas()[index-1]);
	}
	
	public void eliminarObjeto (int index) {
		Objeto [] nuevoInventario = j1.getInventario();
		nuevoInventario[index-1] = null;
		j1.setInventario(nuevoInventario);
	}
	
	public void aplicarObjeto (int index) {
		j1.setPtsATK(j1.getPtsATK()+j1.getInventario()[index-1].getAtk());
		j1.setPtsDEF(j1.getPtsDEF()+j1.getInventario()[index-1].getDef());
		j1.setPtsHP(j1.getPtsHP()+j1.getInventario()[index-1].getHp());
		j1.setPtsMaxHP(j1.getPtsMaxHP()+j1.getInventario()[index-1].getHpMax());
		eliminarObjeto(index-1);
		checkVidaMax();
	}
	
	public void checkVidaMax () {
		if(j1.getPtsHP()>j1.getPtsMaxHP()) {
			j1.setPtsHP(j1.getPtsMaxHP());
		}
	}

	public void obtenerArma (int index, BaseDatos data) {
		Arma[] nuevasArmas = j1.getArmas();
		int contador = 0;
		boolean encontrado = false;
		
		while(contador < nuevasArmas.length && !encontrado) {
			if(j1.getArmas()[contador] == null) {
				nuevasArmas[contador]= data.getWeapons()[index];
				encontrado=true;
			}
			contador++;
		}
		
		j1.setArmas(nuevasArmas);
	}
	
	public void obtenerObjeto (int index, BaseDatos data) {
		Objeto[] nuevoInventario = j1.getInventario();
		int contador = 0;
		boolean encontrado = false;
		
		while(contador < nuevoInventario.length && !encontrado) {
			if(j1.getInventario()[contador] == null) {
				nuevoInventario[contador]= data.getItems()[index];
				encontrado=true;
			}
			contador++;
		}
		
		j1.setInventario(nuevoInventario);
	}
	
	
}
