package datos;

import model.Arma;
import model.Enemigo;
import model.Objeto;
import model.Jugador;
import crud.CrudJugador;

public class BaseDatos {
	
	// Atributos
	
	private Objeto [] items = new Objeto [5];
	private String [] objetoNombre = {"Cafelito","Bendición de Don Bosco",
			"Curso de Udemy","25.000 boletines de BBDD","VideoTutorial de POJO"};
	private int [] objetoATK = {0,15,10,-5,5};
	private int [] objetoDEF = {0,15,0,5,5};
	private int [] objetoHP = {25,0,-10,0,-5};
	private int [] objetoHpMax = {0,20,0,0,0};
	private String [] objetoDescripcion = {"Aumenta en 25 tus puntos de salud",
			"Aumenta en 15 tus puntos de ataque y defensa.\r\n"
			+ "\t\tAumenta en 20 puntos tu salud máxima",
			"Aumenta en 10 tus puntos de ataque y defensa.\r\n"
			+ "\t\tDisminuye en 10 tus puntos de salud",
			"Aumenta en 5 tus puntos de defensa.\r\n"
			+ "\t\tDisminuye en 5 tus puntos de ataque",
			"Aumenta en 5 tus puntos de ataque y defensa.\r\n"
			+ "\t\tDisminuye en 5 tus puntos de salud"};
	private Arma [] weapons = new Arma [4];
	private String [] armaNombre = {"Bolígrafo permanente inexistente", 
			"Bastón de Don Bosco", "Monitor microscópico", "Silla rígida"};
	private int [] armaATK = {5,10,20,30};
	private int [] armaDEF = {5,10,15,20};
	private int [] armaDAM = {10,20,50,80};
	private String [] armaDescripcion = {
			"\t\t                             "
			+ "\t\t.-*##%+.\r\n"
			+ "\t\t                                     ::.-:=##*=\r\n"
			+ "\t\t                                    ===+=-..=*.\r\n"
			+ "\t\t                                 =+==+=+- .    \r\n"
			+ "\t\t                              .==-:++::.       \r\n"
			+ "\t\t                             ==:-++-....       \r\n"
			+ "\t\t                          .-=-:==--.:..        \r\n"
			+ "\t\t                        .=*-:==-----           \r\n"
			+ "\t\t                      .=+-=#+-----.            \r\n"
			+ "\t\t                    .=+-.----:--.              \r\n"
			+ "\t\t                   --:.*+----=.                \r\n"
			+ "\t\t                 :+::==---==.                  \r\n"
			+ "\t\t               =*::=+----=.                    \r\n"
			+ "\t\t             =+-:==---==.                      \r\n"
			+ "\t\t           =-++=+-...=.                        \r\n"
			+ "\t\t        ..=+*+-:..                             \r\n"
			+ "\t\t      .=**+-=:..                               \r\n"
			+ "\t\t     =**#%%%+.                                 \r\n"
			+ "\t\t    -**#%%###*             .                   \r\n"
			+ "\t\t   .*#%###**:        .:-=+***.                 \r\n"
			+ "\t\t  =*###+=:.    :-=+******####*                 \r\n"
			+ "\t\t *%#*-         ****####%%%%##*-                \r\n"
			+ "\t\t-=:            .#%%%###****+=-.                \r\n"
			+ "\t\t                :#*+*+=-:.                    \r\n"
			+ "\t\t                                               \r\n"
			+ "\t\tArma que nunca está cuando la necesitas"
			
			
	
	         ,"\t\t                               =.    =@#  .-*#%%%%%%#+:   +#\r\n"
			+ "\t\t                               =.    @@@::%*-.      :=#@+   \r\n"
			+ "\t\t                         -#%*:    .-+@=@%-:            .#@- \r\n"
			+ "\t\t                        .@#.%%   %@@%= :#@@@: :+#%%#*:   +@-\r\n"
			+ "\t\t                         -#%*:    :-*@=@%=:. #@=.  .=@#   %%\r\n"
			+ "\t\t                        =-      +#   @@@-   +@:      .@*  *@\r\n"
			+ "\t\t                        -:    -+%@++ =@%    *@-      :@+  @#\r\n"
			+ "\t\t                              .-%@-:  @#    *@@+:..:+@#  #@.\r\n"
			+ "\t\t                                -+    @#    *@-=*##*+#@+@#. \r\n"
			+ "\t\t                                    :+@+    *@.    += ++:   \r\n"
			+ "\t\t                              .-+*%%#+:     %@    +@@-  :   \r\n"
			+ "\t\t                             -@#=:      .+#@*.    %%@% :+.  \r\n"
			+ "\t\t                             %%   -+#@+  -.   -#%@#:-#@%*:  \r\n"
			+ "\t\t                            #@. *@*-.         :*#@%-=%%#+:  \r\n"
			+ "\t\t                          :%%. #@.      +#%*.     %@@#      \r\n"
			+ "\t\t                        .*@+ .*@=      =@+:@*     =@@:      \r\n"
			+ "\t\t                        %*..+@*.        =##+.      -:       \r\n"
			+ "\t\t                    .++  .+@*.        .+:                   \r\n"
			+ "\t\t                  .+@*..+@*.           -.                   \r\n"
			+ "\t\t                .+@*..+@*.                                  \r\n"
			+ "\t\t              .+@*..+@*.                                    \r\n"
			+ "\t\t             +@*..+@*.                                      \r\n"
			+ "\t\t           +@#..+@*.                                        \r\n"
			+ "\t\t         +@#: +@*.                                          \r\n"
			+ "\t\t       +@#: +@*.                                            \r\n"
			+ "\t\t     +@#: +@#:                                              \r\n"
			+ "\t\t   +@#: +@#:                                                \r\n"
			+ "\t\t +@#: +@#:                                                  \r\n"
			+ "\t\t%@: +@#:                          \r\n"
			+ "\t\t=%%%*.\r\n"
			+"\t\tBastón caído de los cielos. Se dice que proviene de un antiguo santo\r\n"
			+ "\t\tque defendía a las almas jóvenes"
	
			
	         ,"                       ....                       \r\n"
			+ "                  -+#%#****#%%+-                  \r\n"
			+ "               .*%+-.-=+**+=-.:+%*:               \r\n"
			+ "              +@= =#%+-:..:-+#%= -@*              \r\n"
			+ "             ##.:@*.          .*@- #%             \r\n"
			+ "     -======#% :@-         =%%%:-@- %#======-     \r\n"
			+ "   :@+-::::-@= %*     .###-+@:@: +@ -@=::::-+@-   \r\n"
			+ "   ## +@###%@: @= =++=:@-@++@:@: -@.:@%###@* *%   \r\n"
			+ "   ## *%    @= %# @*#%:@:@++@:@: *@ =@.   ## *%   \r\n"
			+ "   ## *%    +@ :@=###*.###==###.=@- %*    ## *%   \r\n"
			+ "   ## *%     #%.:%#:          :#%:.%#     ## *%   \r\n"
			+ "   ## *%      =@= -*%*=-::-=*%#- =@+      ## *%   \r\n"
			+ "   ## *%        +%*-.:-=++=-:.-*@%.       ## *%   \r\n"
			+ "   ## *%          :=*%##**#%%%@=.%*       ## *%   \r\n"
			+ "   ## *%   *#* .####.         +@-.@%%*    ## *%   \r\n"
			+ "   ## *%   :--  ------------: .#@%+:.%#   ## *%   \r\n"
			+ "   ## *%   -=-  ============- .%%     #%. ## *%   \r\n"
			+ "   ## *%   *## .############*   #%.    *@:## *%   \r\n"
			+ "   ## *@:::::::::::::::::::::::::%%:    =@@# *%   \r\n"
			+ "   *% -+++++++++++++++++++++++++++*@-    =@+ ##   \r\n"
			+ " :*#@@#****************************@@=   *@#@@#*: \r\n"
			+ " -@:                *@:....:%#      .+#%#+.   .@= \r\n"
			+ " -@-                 =******+.                :@= \r\n"
			+ "  =@*++++++++++++++++++++++++++++++++++++++++*@+  \r\n"
			+ " Equipo mítico de los alumnos de DAM, aumenta la visión "
			+ "ya que te hace forzarla!  "
			
			, "                                                                                                      \r\n"
			+ "     %/(((***************/////(/(                 \r\n"
			+ "     (//(/,****************#////(                 \r\n"
			+ "     (/(//*/.              (////(                 \r\n"
			+ "     /(/((/                #//(/(                 \r\n"
			+ "     /,//// ,//(/(//////***////(                 \r\n"
			+ "     ////((///*/****/**/*/**/////                 \r\n"
			+ "     ((////*****/*.         (///(                 \r\n"
			+ "     (///((                 (((/(                 \r\n"
			+ "      */////        ./,/(((((/(/((.               \r\n"
			+ "     (////*****/////*///(((((((##                 \r\n"
			+ "     /////**/*/*/////((*   (((((#                 \r\n"
			+ "     (//((                 (((((#                 \r\n"
			+ "     (/(((                 /(((/(                 \r\n"
			+ "     (((((/                .(((((                 \r\n"
			+ "     (((((# *//////////////(((/((///////*               \r\n"
			+ "     ((##(/****************//////*************///*      \r\n"
			+ "     (##((((##/************/(*/********/((/****//       \r\n"
			+ "     (#(##(((((((#(/////(***************/*****///       \r\n"
			+ "     (####% .((((/******************,      /**///       \r\n"
			+ "     (#####     ./**///     #((((          (/////       \r\n"
			+ "     (####*      /****/     #((((,         (/(///       \r\n"
			+ "     (####.      /***//     #((##////////////////       \r\n"
			+ "     (####       /***//**///*(///(*        (/////       \r\n"
			+ "     (####       //**//     (((#%%%(/      #/////       \r\n"
			+ "     (##((       /***//     (##### (%%%%%##(/////       \r\n"
			+ "     (##(#&#     /***//     /%%###       *%#////(       \r\n"
			+ "     (%(((((((&# /***//     (%##((         (////(       \r\n"
			+ "     (####      /((/****/                    #/////     \r\n"
			+ "     (#((&       /****/.                   #/////       \r\n"
			+ "                                           /****/       \r\n"
			+ " Tan rígida que puede usarse como arma, en las antiguas leyendas"
			+ "comparan su rígidez con la mítica espada Excalibur. Quizás el"
			+ " peor trono pero sin duda la mejor arma. "
			};
	
	private Enemigo [] enemigos = new Enemigo [4];
	private String [] nombreEnemigos = {"Rafa", "Miguel", "Ángel", "Luismi"};
	private int [] atkEnemigos = {25, 35, 45, 60};
	private int [] defEnemigos = {20, 35, 50, 90};
	private int [] hpEnemigos = {25, 45, 70, 120};
	private int [] [] ataquesEnemigos = {{0, 0, 30}, {15, 25, 35}, {20, 35, 50}, {45, 70, 90}};

	private String [] [] fraseAtaqueEnemigo = {{"Rafa se va a poner a explicar CSS"
		, "Rafa va a dar los buenos días"
		, "Rafa va a mandar a un compañero a corregir tu boletín"}
		, {"Miguel va a pegarse una carrerita dejándose caer de la tarima", 
			"Miguel va a llamar tu atención con la palabra 'Señores!'", 
			"Miguel te va a pedir dinero para una campaña de salvar a las iguanas"}
		, {"Ángel va a comenzar a acariciar a su gato", 
			"Ángel ha descubierto que estás copiando código y te va a mandar deberes", 
			"Ángel va a ejercer la violencia física contra ti"}
		, {"Luismi ha visto que estabas ocioso y va a mandar tarea de entornos de desarrollo para mañana", 
			"Luismi se acaba de acordar de Úbeda y se va a poner a divagar sobre carreteras de Jaén", 
			"Luismi va a empezar a programar en Java y no vas a entender nada"}};
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
	
	private String [] fraseEnemigoDerrotado = {"Me has vencido, pero jamás sabrás hacer en condiciones una web de Dragon Ball", 
			"Me has vencido, pero si hubiera usado una máquina de Turing...",
			"Me has vencido, te has ganado copiar código hasta en los métodos", 
			"Me has vencido, pero que sepas que saltará una tareita a las 14:30 para mañana"
	};
			
	
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


	public String[] getFraseEnemigoDerrotado() {
		return fraseEnemigoDerrotado;
	}


	public void setFraseEnemigoDerrotado(String[] fraseEnemigoDerrotado) {
		this.fraseEnemigoDerrotado = fraseEnemigoDerrotado;
	}
	
	
}
			

