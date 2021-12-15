package datos;

import model.Arma;
import model.Enemigo;
import model.Objeto;
import model.Jugador;
import crud.CrudJugador;

public class BaseDatos {
	
	// Atributos
	
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
	private Arma [] weapons = new Arma [4];
	private String [] armaNombre = {"Permanente inexistente", "Silla rígida", "Monitor microscópico", "DAM"};
	private int [] armaATK = {5,10,20,30};
	private int [] armaDEF = {5,10,15,20};
	private int [] armaDAM = {10,20,50,80};
	private String [] armaDescripcion = {
			"                                                                         ,  *                    \r\n"
			+ "                                                                        .    ,,/(*                  \r\n"
			+ "                                                                       **/(.,,,,,* .                \r\n"
			+ "                                                                     **/##%##,.....                 \r\n"
			+ "                                                                  ///,/(%##*#(...                   \r\n"
			+ "                                                              . *.  .###....,/                      \r\n"
			+ "                                                             ////##%#%...  .                        \r\n"
			+ "                                                         . */, ,.%#,.* (.                           \r\n"
			+ "                                                        /*/ #.%#%...*..                             \r\n"
			+ "                                                      */. /.%#,.,  .                                \r\n"
			+ "                                                   /*/ /.#%#..( ..                                  \r\n"
			+ "                                                 */*#..##*..*#.                                     \r\n"
			+ "                                               ,/(../%#../ ..                                       \r\n"
			+ "                                          . */ %%.#%/..((..                                         \r\n"
			+ "                                            ,#%%%%......                                            \r\n"
			+ "                                         ...,,%#......                                              \r\n"
			+ "                                   &#/(&,,,,,......                                                 \r\n"
			+ "                                (%/(#@@@@@/.....                                                    \r\n"
			+ "                              &#/(%@@@@@@%#(%.                                                      \r\n"
			+ "                           .&(((@@@@@@%##(&@                                                        \r\n"
			+ "                         #&((#@@@@@@@#(%@                                                           \r\n"
			+ "                      .@@@/@@@@@@@#(#&,                                                             \r\n"
			+ "                    #@@&(@@@@@@##(%#                                                                \r\n"
			+ "                  @@@/@@@@@@&#&@@                                                                   \r\n"
			+ "                 @%(&@@@@@#@@@#                                                                     \r\n"
			+ "                   @@@@&(@@@                                                                        \r\n"
			+ "                      @@@                Arma que nunca está cuando la necesitas",
			"                                                                                                      \r\n"
			+ "                            %/(((***************/////(/(                                            \r\n"
			+ "                            (//(/,****************#////(                                            \r\n"
			+ "                            (/(//*/.              (////(                                            \r\n"
			+ "                            /(/((/                #//(/(                                            \r\n"
			+ "                            /,////  ,//(/(//////***////(                                            \r\n"
			+ "                            ////((///*/****/**/*/**/////                                            \r\n"
			+ "                            ((////*****/*.         (///(                                            \r\n"
			+ "                            (///((                 (((/(                                            \r\n"
			+ "                            */////        ./,/(((((/(/((.                                           \r\n"
			+ "                             (////*****/////*///(((((((##                                           \r\n"
			+ "                             /////**/*/*/////((*   (((((#                                           \r\n"
			+ "                             (//((                 (((((#                                           \r\n"
			+ "                             (/(((                 /(((/(                                           \r\n"
			+ "                             (((((/                .(((((                                           \r\n"
			+ "                             (((((# *//////////////(((/((///////*                                   \r\n"
			+ "                             ((##(/****************//////*************///*                          \r\n"
			+ "                             (##((((##/************/(*/********/((/****//                           \r\n"
			+ "                             (#(##(((((((#(/////(***************/*****///                           \r\n"
			+ "                             (####% .((((/******************,      /**///                           \r\n"
			+ "                             (#####     ./**///     #((((          (/////                           \r\n"
			+ "                             (####*      /****/     #((((,         (/(///                           \r\n"
			+ "                             (####.      /***//     #((##////////////////                           \r\n"
			+ "                             (####       /***//**///*(///(*        (/////                           \r\n"
			+ "                             (####       //**//     (((#%%%(/      #/////                           \r\n"
			+ "                             (##((       /***//     (##### (%%%%%##(/////                           \r\n"
			+ "                             (##(#&#     /***//     /%%###       *%#////(                           \r\n"
			+ "                             (%(((((((&# /***//     (%##((         (////(                           \r\n"
			+ "                             (####    /((/****/                    #/////                           \r\n"
			+ "                             (#((&       /****/.                   #/////                           \r\n"
			+ "                                         /****/                    #(///(                           \r\n"                                                  
			+ "                               Tan rígida que puede usarse como arma",
			"El equipo básico de un alumno de DAM",
			"Desesperación Aleatoriaramente Miserable (DAM) o desesperación de DAM es una espada a dos manos"
			+ " que transmite la desesperación de un alumno de DAM en exámenes a sus enemigos "};
	private Enemigo [] enemigos = new Enemigo [4];
	private String [] nombreEnemigos = {"Rafa", "Miguel", "Ángel", "Luismi"};
	private int [] atkEnemigos = {0, 10, 25, 60};
	private int [] defEnemigos = {0, 15, 35, 90};
	private int [] hpEnemigos = {25, 45, 70, 120};
	private int [] [] ataquesEnemigos = {{0, 0, 30}, {15, 25, 35}, {20, 35, 50}, {45, 70, 90}};

	private String [] [] fraseAtaqueEnemigo = {{"Rafa se pone a explicar CSS"
		, "Rafa está dando los buenos días"
		, "Rafa ha mandado a un compañero a corregir tu boletín"}
		, {"", "", ""}
		, {"", "", ""}
		, {"", "", ""}};
	private String [] fraseAtaqueFallido = {"Rafa bloquea tu ataque con una etiqueta div que ocupa toda la página."
			,"Miguel cambia de tema de conversación y tu ataque le da a un compañero."
			,"Angel te dice que es el peor día de su vida, te sientes mal y no le pegas."
			,"E̷̬͓̓̈́R̷̢̜͕͓͊͒͗̾A̴͇͎͆S̵̫̹̓͗̄͘Ȩ̴̪̍̉̉͑ ̵͎̃͝a̷̯̱͔͙̓̒́ţ̵͘ȁ̸̝͖̬q̸̭͕̥͓̃ù̶͙̘͜e̸̛͍̒̿ ̷͕͖̎͂̇F̸̳͎̓̅̐̄R̵͚̫̬͗͊͛Ŏ̷̧͓̮͕̐̇M̴̢̜̂̀̂ ̸͕̂̀̾j̸̗͓̤̒u̴̻͙̹̰͑́͊̕g̶̥̀̿a̶̰̥͇͆͑d̶̝̱͒̏͋o̴̠̖͉͑r̴̛͈̲̩̈̆͆"
	};
	private String [] fraseAtaqueAcertado = {"A Rafa no parece importarle y sigue corrigiendo."
			,"Miguel se da cuenta de que no vas a participar en la campaña euro y le duele"
			,"Angel le ha echado un vistazo al código de este juego y ahora le duele la cabeza"
			,"P̸̟͚͉͓͋̽̋̂R̴̺̘͈̀̾̋͜Ȅ̸̝̩̠̖̇̓͘P̸̢͕̞̞̃̊̄Ã̴̙̳̲̳͗̆̕R̵̞̋͆E̸̖͛ ̸̺̬̗͓͋͘v̷̼͍͗̎̎̅e̸͍̬̽̈́͠n̴̡̰̺͚͒̀͠g̶̘̈́́͝͝ė̸͚ạ̶̝͗́̒̄͜n̸͔̲̮͛̒c̷͉̥͈̈́̍͜e̷̩͑ ̶͉̲̽̈́̈́̏T̴̽͜͠Ó̶̡͓̙̃W̴̢͚̅͊͘Å̷̰͛̊͑R̵̘̣̒͆̂D̸̙͕͑̌͐S̶̡̮͔͖̚ ̶̝͙̱̐̍̋͝j̴̮̠͆ͅư̷͖̱̲̫̓̀g̴̦̥͊å̵̺̘̾̆d̸̘̪͛͑́̈ǫ̷͈̾̑̈́r̸̩̺̪̯̅̍̐̚"
	};

	
	private int [] eleccionesMapa = new int[9];
			
	
	// Constructor vacío
	
	public BaseDatos () {
		
	}
	
	
	// Getters & Setters
	
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
	
	public Enemigo [] getEnemigos () {
		return enemigos;
	}
	
	public void setEnemigos (Enemigo [] enemigos) {
		this.enemigos = enemigos;
	}

	public String[] getNombreEnemigos() {
		return nombreEnemigos;
	}

	public void setNombreEnemigos(String[] nombreEnemigos) {
		this.nombreEnemigos = nombreEnemigos;
	}

	public int[] getAtkEnemigos() {
		return atkEnemigos;
	}

	public void setAtkEnemigos(int[] atkEnemigos) {
		this.atkEnemigos = atkEnemigos;
	}

	public int[] getDefEnemigos() {
		return defEnemigos;
	}

	public void setDefEnemigos(int[] defEnemigos) {
		this.defEnemigos = defEnemigos;
	}
	
	public int[] getHpEnemigos() {
		return hpEnemigos;
	}
	
	public void setHpEnemigos(int[] hpEnemigos) {
		this.hpEnemigos = hpEnemigos;
	}
	
	public int[][] getAtaquesEnemigos() {
		return ataquesEnemigos;
	}
	
	public void setAtaquesEnemigos(int[][] ataquesEnemigos) {
		this.ataquesEnemigos = ataquesEnemigos;
	}
	
	public String[] getFraseAtaqueFallido() {
		return fraseAtaqueFallido;
	}
	
	public void setFraseAtaqueFallido(String[] fraseAtaqueFallido) {
		this.fraseAtaqueFallido = fraseAtaqueFallido;
	}

	public String[] getFraseAtaqueAcertado() {
		return fraseAtaqueAcertado;
	}

	public void setFraseAtaqueAcertado(String[] fraseAtaqueAcertado) {
		this.fraseAtaqueAcertado = fraseAtaqueAcertado;
	}

	public String[][] getFraseAtaqueEnemigo() {
		return fraseAtaqueEnemigo;
	}
	
	public void setFraseAtaqueEnemigo(String[][] fraseAtaqueEnemigo) {
		this.fraseAtaqueEnemigo = fraseAtaqueEnemigo;
	}
	
	
}
			

