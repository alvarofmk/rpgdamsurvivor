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
	private int [] objetoATK = {0,25,15,-5,15};
	private int [] objetoDEF = {0,25,15,15,-5};
	private int [] objetoHP = {35,999,-10,0,0};
	private int [] objetoHpMax = {0,30,0,0,0};
	private String [] objetoDescripcion = {"Aumenta en 35 tus puntos de salud",
			"Aumenta en 25 tus puntos de ataque y defensa.\r\n"
			+ "\t\tAumenta en 30 puntos tu salud máxima\r\n"
			+ "\t\tRecupera tus puntos de vida al máximo",
			"Aumenta en 15 tus puntos de ataque y defensa.\r\n"
			+ "\t\tDisminuye en 10 tus puntos de salud",
			"Aumenta en 15 tus puntos de defensa.\r\n"
			+ "\t\tDisminuye en 5 tus puntos de ataque",
			"Aumenta en 15 tus puntos de ataque.\r\n"
			+ "\t\tDisminuye en 5 tus puntos de defensa"};
	private Arma [] weapons = new Arma [4];
	private String [] armaNombre = {"Bolígrafo inexistente", 
			"Bastón de Don Bosco", "Monitor microscópico", "Silla rígida"};
	private int [] armaATK = {5,10,20,30};
	private int [] armaDEF = {5,20,10,20};
	private int [] armaDAM = {10,20,30,70};
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
			+ "\t\tLas viejas lenguas hablan que este rotulador antaño\r\n"
			+ "\t\tposeía tinta en su interior"
			
			
	
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
			+ "\r\n"
			+"\t\tBastón caído de los cielos. Se dice que proviene de un antiguo santo\r\n"
			+ "\t\tque defendía a las almas jóvenes"
	
			
	         ,"\t\t                       ....                       \r\n"
			+ "\t\t                  -+#%#****#%%+-                  \r\n"
			+ "\t\t               .*%+-.-=+**+=-.:+%*:               \r\n"
			+ "\t\t              +@= =#%+-:..:-+#%= -@*              \r\n"
			+ "\t\t             ##.:@*.          .*@- #%             \r\n"
			+ "\t\t     -======#% :@-         =%%%:-@- %#======-     \r\n"
			+ "\t\t   :@+-::::-@= %*     .###-+@:@: +@ -@=::::-+@-   \r\n"
			+ "\t\t   ## +@###%@: @= =++=:@-@++@:@: -@.:@%###@* *%   \r\n"
			+ "\t\t   ## *%    @= %# @*#%:@:@++@:@: *@ =@.   ## *%   \r\n"
			+ "\t\t   ## *%    +@ :@=###*.###==###.=@- %*    ## *%   \r\n"
			+ "\t\t   ## *%     #%.:%#:          :#%:.%#     ## *%   \r\n"
			+ "\t\t   ## *%      =@= -*%*=-::-=*%#- =@+      ## *%   \r\n"
			+ "\t\t   ## *%        +%*-.:-=++=-:.-*@%.       ## *%   \r\n"
			+ "\t\t   ## *%          :=*%##**#%%%@=.%*       ## *%   \r\n"
			+ "\t\t   ## *%   *#* .####.         +@-.@%%*    ## *%   \r\n"
			+ "\t\t   ## *%   :--  ------------: .#@%+:.%#   ## *%   \r\n"
			+ "\t\t   ## *%   -=-  ============- .%%     #%. ## *%   \r\n"
			+ "\t\t   ## *%   *## .############*   #%.    *@:## *%   \r\n"
			+ "\t\t   ## *@:::::::::::::::::::::::::%%:    =@@# *%   \r\n"
			+ "\t\t   *% -+++++++++++++++++++++++++++*@-    =@+ ##   \r\n"
			+ "\t\t :*#@@#****************************@@=   *@#@@#*: \r\n"
			+ "\t\t -@:                *@:....:%#      .+#%#+.   .@= \r\n"
			+ "\t\t -@-                 =******+.                :@= \r\n"
			+ "\t\t  =@*++++++++++++++++++++++++++++++++++++++++*@+  \r\n"
			+ "\r\n"
			+ "\t\t Equipo mítico de los alumnos de DAM, aumenta la visión\r\n"
			+ "\t\t ya que te hace forzarla!  "
			
			, "                                                                                                      \r\n"
			+ "\t\t     %/(((***************/////(/(                 \r\n"
			+ "\t\t     (//(/,****************#////(                 \r\n"
			+ "\t\t     (/(//*/.              (////(                 \r\n"
			+ "\t\t     /(/((/                #//(/(                 \r\n"
			+ "\t\t     /,//// ,//(/(//////***////(                 \r\n"
			+ "\t\t     ////((///*/****/**/*/**/////                 \r\n"
			+ "\t\t     ((////*****/*.         (///(                 \r\n"
			+ "\t\t     (///((                 (((/(                 \r\n"
			+ "\t\t      */////        ./,/(((((/(/((.               \r\n"
			+ "\t\t     (////*****/////*///(((((((##                 \r\n"
			+ "\t\t     /////**/*/*/////((*   (((((#                 \r\n"
			+ "\t\t     (//((                 (((((#                 \r\n"
			+ "\t\t     (/(((                 /(((/(                 \r\n"
			+ "\t\t     (((((/                .(((((                 \r\n"
			+ "\t\t     (((((# *//////////////(((/((///////*               \r\n"
			+ "\t\t     ((##(/****************//////*************///*      \r\n"
			+ "\t\t     (##((((##/************/(*/********/((/****//       \r\n"
			+ "\t\t     (#(##(((((((#(/////(***************/*****///       \r\n"
			+ "\t\t     (####% .((((/******************,      /**///       \r\n"
			+ "\t\t     (#####     ./**///     #((((          (/////       \r\n"
			+ "\t\t     (####*      /****/     #((((,         (/(///       \r\n"
			+ "\t\t     (####.      /***//     #((##////////////////       \r\n"
			+ "\t\t     (####       /***//**///*(///(*        (/////       \r\n"
			+ "\t\t     (####       //**//     (((#%%%(/      #/////       \r\n"
			+ "\t\t     (##((       /***//     (##### (%%%%%##(/////       \r\n"
			+ "\t\t     (##(#&#     /***//     /%%###       *%#////(       \r\n"
			+ "\t\t     (%(((((((&# /***//     (%##((         (////(       \r\n"
			+ "\t\t     (####      /((/****/                    #/////     \r\n"
			+ "\t\t     (#((&       /****/.                   #/////       \r\n"
			+ "                                           /****/       \r\n"
			+ "\t\tTan rígida que puede usarse como arma, en las antiguas leyendas\r\n"
			+ "\t\tcomparan su rígidez con la mítica espada Excalibur. Quizás el\r\n"
			+ "\t\tpeor trono pero sin duda la mejor arma. "
			};
	
	private Enemigo [] enemigos = new Enemigo [4];
	private String [] nombreEnemigos = {"Rafa", "Miguel", "Ángel", "Luismi"};
	private int [] atkEnemigos = {25, 45, 60, 80};
	private int [] defEnemigos = {20, 55, 70, 105};
	private int [] hpEnemigos = {25, 55, 80, 150};
	private int [] [] ataquesEnemigos = {{0, 0, 30}, {15, 25, 35}, {20, 35, 50}, {45, 70, 90}};

	private String [] [] fraseAtaqueEnemigo = {{"Rafa se va a poner a explicar CSS"
		, "Rafa va a dar los buenos días"
		, "Rafa va a mandar a un compañero a corregir tu boletín"}
		, {"Miguel va a pegarse una carrerita dejándose caer de la tarima", 
			"Miguel va a llamar tu atención con la palabra 'Señores!'", 
			"Miguel te va a pedir dinero para una campaña de salvar a las iguanas"}
		, {"Ángel va a comenzar a acariciar a su gato", 
			"Ángel ha descubierto que estás copiando código y te va a mandar\r\n\t deberes", 
			"Ángel va a ejercer la violencia física contra ti"}
		, {"Luismi ha visto que estabas ocioso y va a mandar tarea de entornos\r\n\t para mañana", 
			"Luismi se acaba de acordar de Úbeda y se pone a divagar sobre\r\n\t carreteras de Jaén", 
			"Luismi va a empezar a programar en Java y no vas a entender nada"}};
	private String [] fraseAtaqueFallido = {"Rafa te bloquea con una etiqueta div que ocupa toda la página."
			,"Miguel cambia de tema de conversación le das a un compañero."
			,"Angel te dice que es el peor día de su vida, te sientes mal y\r\n\t no le pegas."
			,"Luismi explica tanto sobre SQL que te olvidas de que estabas\r\n\t atacando."
	};
	private String [] fraseAtaqueAcertado = {"A Rafa no parece importarle y sigue corrigiendo."
			,"Miguel se da cuenta de que no vas a participar en la campaña\r\n\t euro y le duele"
			,"Angel le ha echado un vistazo al código de este juego y ahora\r\n\t le duele la cabeza"
			,"Luismi se da cuenta de que llevas 2 meses intentando instalar\r\n\t git y se ofusca mucho"
	};
	
	private String [] fraseEnemigoDerrotado = {"Me has vencido, pero jamás sabrás hacer en condiciones una\r\n\t web de Dragon Ball", 
			"Me has vencido, pero si hubiera usado una máquina de Turing...",
			"Me has vencido, te has ganado copiar código hasta en los métodos", 
			"Me has vencido, pero que sepas que saltará una tareita a las\r\n\t 14:30 para mañana"
	};
	private String [] fraseAuxiliar = {"Tu ataque acierta","Prepárate para defenderte", "Introduce tu nombre",
			"Vaya, parece que esa última tarea de Luismi te baja 10 puntos de vida"};
			
	
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


	public String[] getFraseAuxiliar() {
		return fraseAuxiliar;
	}


	public void setFraseAuxiliar(String[] fraseAuxiliar) {
		this.fraseAuxiliar = fraseAuxiliar;
	}
	
	
}
			

