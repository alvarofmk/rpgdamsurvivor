package vista;

import datos.BaseDatos;
import model.Arma;
import model.Enemigo;
import model.Jugador;
import model.Objeto;

public class Menus {
	
	public void pantallaInicio () {
		System.out.println("                                     ______   _______  _______ \r\n"
				+ "                                    (  __  \\ (  ___  )(       )\r\n"
				+ "                                    | (  \\  )| (   ) || () () |\r\n"
				+ "                                    | |   ) || (___) || || || |\r\n"
				+ "                                    | |   | ||  ___  || |(_)| |\r\n"
				+ "                                    | |   ) || (   ) || |   | |\r\n"
				+ "                                    | (__/  )| )   ( || )   ( |\r\n"
				+ "                                    (______/ |/     \\||/     \\|\r\n"
				+ "                                                               \r\n"
				+ "               _______           _______          _________          _______  _______ \r\n"
				+ "              (  ____ \\|\\     /|(  ____ )|\\     /|\\__   __/|\\     /|(  ___  )(  ____ )\r\n"
				+ "              | (    \\/| )   ( || (    )|| )   ( |   ) (   | )   ( || (   ) || (    )|\r\n"
				+ "              | (_____ | |   | || (____)|| |   | |   | |   | |   | || |   | || (____)|\r\n"
				+ "              (_____  )| |   | ||     __)( (   ) )   | |   ( (   ) )| |   | ||     __)\r\n"
				+ "                    ) || |   | || (\\ (    \\ \\_/ /    | |    \\ \\_/ / | |   | || (\\ (   \r\n"
				+ "              /\\____) || (___) || ) \\ \\__  \\   /  ___) (___  \\   /  | (___) || ) \\ \\__\r\n"
				+ "              \\_______)(_______)|/   \\__/   \\_/   \\_______/   \\_/   (_______)|/   \\__/\r\n"
				+ "                                                                                      \r\n"
				+ "                                    Pulsa intro para continuar. \n");
		
	}
	
	public void menuPrincipal () {
		System.out.println("               ____  _________  ____  ____  ____  _________  ____  ____  ____  ____ \r\n"
				+ "              ||1 ||||       ||||N ||||e ||||w ||||       ||||g ||||a ||||m ||||e ||\r\n"
				+ "              ||__||||_______||||__||||__||||__||||_______||||__||||__||||__||||__||\r\n"
				+ "              |/__\\||/_______\\||/__\\||/__\\||/__\\||/_______\\||/__\\||/__\\||/__\\||/__\\|\r\n"
				+ "               ____  _________  ____  ____  ____  ____  ____  ____  ____  ____ \r\n"
				+ "              ||2 ||||       ||||C ||||r ||||e ||||d ||||i ||||t ||||o ||||s ||\r\n"
				+ "              ||__||||_______||||__||||__||||__||||__||||__||||__||||__||||__||\r\n"
				+ "              |/__\\||/_______\\||/__\\||/__\\||/__\\||/__\\||/__\\||/__\\||/__\\||/__\\|\r\n"
				+ "               ____  _________  ____  ____  ____  ____  ____ \r\n"
				+ "              ||3 ||||       ||||S ||||a ||||l ||||i ||||r ||\r\n"
				+ "              ||__||||_______||||__||||__||||__||||__||||__||\r\n"
				+ "              |/__\\||/_______\\||/__\\||/__\\||/__\\||/__\\||/__\\|");
	}
	
	public void creditos () {
		System.out.println();
		System.out.println("\t\tDirector \t\t-\t Carlos Jesús Durbán Viloca");
		System.out.println("\t\tProducer \t\t-\t Nicolás Fernández de la Fuente Bursón");
		System.out.println("\t\tLead Game Designer \t-\t Luis Miguel Serón Delgado");
		System.out.println("\t\tGameplay Programming \t-\t Álvaro Franco Martínez");
		System.out.println("\t\tVisual Effects Design \t-\t Nadie");
		System.out.println("\t\tAnimation \t\t-\t Nadie también");
		System.out.println("\t\tCharacter Modeling \t-\t No hay presupuesto");
		System.out.println();
	}
	
	public void invalid () {
		System.out.println("\t\t\t  -  Elige bien");
	}
	
	public void menuCombate (Jugador j1) {
		System.out.println("     _________________________________________________________________________\r\n"
						+ "\t\r\n"
						+ "           -*%@@%*-      \t\r\n"
						+ "          *@@@@@@@@#     \t1. Atacar\r\n"
						+ "         :@@@@@@@@@@:    \t2. Usar objeto\r\n"
						+ "          %@@@@@@@@%     \t3. Cambiar arma\r\n"
						+ "           +@@@@@@*.     \t4. Consultar estadísticas\r\n"
						+ "             :--:        \t\r\n"
						+ "         =#@@@@@@@@#=    \t\r\n"
						+ "       -@@@@@@@@@@@@@@=  \t\r\n"
						+ "      -@@@@@@@@@@@@@@@@- \t\r\n"
						+ "      __________________ \t\r\n"
						+ "                    \t\r\n"
						+ "         HP: "+j1.getPtsHP()+ " / "+j1.getPtsMaxHP()+"\t\r\n"
						+ "     __________________________________________________________________________");
	}
	
	public void menuAtaque (Jugador j1) {
		System.out.println("     _________________________________________________________________________\r\n"
						+ "\t\r\n"
						+ "           -*%@@%*-      \t\r\n"
						+ "          *@@@@@@@@#     \t1. Ataque rápido (Mayor precisión)\r\n"
						+ "         :@@@@@@@@@@:    \t2. Ataque normal (Balanceado)\r\n"
						+ "          %@@@@@@@@%     \t3. Ataque fuerte (Mayor daño)\r\n"
						+ "           +@@@@@@*.     \t\r\n"
						+ "             :--:        \t\r\n"
						+ "         =#@@@@@@@@#=    \t\r\n"
						+ "       -@@@@@@@@@@@@@@=  \t\r\n"
						+ "      -@@@@@@@@@@@@@@@@- \t\r\n"
						+ "      __________________ \t\r\n"
						+ "                    \t\r\n"
						+ "         HP: "+j1.getPtsHP()+ " / "+j1.getPtsMaxHP()+"\t\r\n"
						+ "     __________________________________________________________________________");
	}
	
	public void menuStats (Jugador j1) {
		System.out.println("     _________________________________________________________________________\r\n"
						+ "\t\r\n"
						+ "           -*%@@%*-      \t\r\n"
						+ "          *@@@@@@@@#     \tHP \t\t - "+j1.getPtsHP()+"\r\n"
						+ "         :@@@@@@@@@@:    \tHP maxima \t - "+j1.getPtsMaxHP()+"\r\n"
						+ "          %@@@@@@@@%     \tAtaque \t\t - "+j1.getPtsATK()+"\r\n"
						+ "           +@@@@@@*.     \tDefensa \t - "+j1.getPtsDEF()+"\r\n"
						+ "             :--:        \tArma actual \t - "+j1.getArmaActiva().getNombre()+"\r\n"
						+ "         =#@@@@@@@@#=    \t\r\n"
						+ "       -@@@@@@@@@@@@@@=  \t\r\n"
						+ "      -@@@@@@@@@@@@@@@@- \t\r\n"
						+ "      __________________ \t\r\n"
						+ "                    \t\r\n"
						+ "         HP: "+j1.getPtsHP()+ " / "+j1.getPtsMaxHP()+"\t\r\n"
						+ "     __________________________________________________________________________");
	}
	
	public void menuArmas (Jugador j1) {
		System.out.println("     _________________________________________________________________________\r\n"
				+ "\t\r\n"
				+ "           -*%@@%*-      \t");
		if(j1.getArmas()[0]!=null) {
			System.out.println("          *@@@@@@@@#     \t1. "+j1.getArmas()[0].getNombre());
		}else {
			System.out.println("          *@@@@@@@@#     \t1. -");
		}
		if(j1.getArmas()[1]!=null) {
			System.out.println("         :@@@@@@@@@@:    \t2. "+j1.getArmas()[1].getNombre());
		}else {
			System.out.println("         :@@@@@@@@@@:    \t2. -");
		}
		if(j1.getArmas()[2]!=null) {
			System.out.println("          %@@@@@@@@%     \t3. "+j1.getArmas()[2].getNombre());
		}else {
			System.out.println("          %@@@@@@@@%     \t3. -");
		}
		if(j1.getArmas()[3]!=null) {
			System.out.println("           +@@@@@@*.     \t4. "+j1.getArmas()[3].getNombre());
		}else {
			System.out.println("           +@@@@@@*.     \t4. -");
		}
		System.out.println("             :--:        \t\r\n"
				+ "         =#@@@@@@@@#=    \t\r\n"
				+ "       -@@@@@@@@@@@@@@=  \t\r\n"
				+ "      -@@@@@@@@@@@@@@@@- \t\r\n"
				+ "      __________________ \t\r\n"
				+ "                    \t\r\n"
				+ "         HP: "+j1.getPtsHP()+ " / "+j1.getPtsMaxHP()+"\t\r\n"
				+ "     __________________________________________________________________________");
	}
	
	public void menuObjetos (Jugador j1) {
		System.out.println("     _________________________________________________________________________\r\n"
				+ "\t\r\n"
				+ "           -*%@@%*-      \t");
		if(j1.getInventario()[0]!=null) {
			System.out.println("          *@@@@@@@@#     \t1. "+j1.getInventario()[0].getNombre());
		}else {
			System.out.println("          *@@@@@@@@#     \t1. -");
		}
		if(j1.getInventario()[1]!=null) {
			System.out.println("         :@@@@@@@@@@:    \t2. "+j1.getInventario()[1].getNombre());
		}else {
			System.out.println("         :@@@@@@@@@@:    \t2. -");
		}
		if(j1.getInventario()[2]!=null) {
			System.out.println("          %@@@@@@@@%     \t3. "+j1.getInventario()[2].getNombre());
		}else {
			System.out.println("          %@@@@@@@@%     \t3. -");
		}
		if(j1.getInventario()[3]!=null) {
			System.out.println("           +@@@@@@*.     \t4. "+j1.getInventario()[3].getNombre());
		}else {
			System.out.println("           +@@@@@@*.     \t4. -");
		}
		if(j1.getInventario()[4]!=null) {
			System.out.println("             :--:        \t5. "+j1.getInventario()[4].getNombre());
		}else {
			System.out.println("             :--:        \t5. -");
		}
		System.out.println("         =#@@@@@@@@#=    \t\r\n"
				+ "       -@@@@@@@@@@@@@@=  \t\r\n"
				+ "      -@@@@@@@@@@@@@@@@- \t\r\n"
				+ "      __________________ \t\r\n"
				+ "                    \t\r\n"
				+ "         HP: "+j1.getPtsHP()+ " / "+j1.getPtsMaxHP()+"\t\r\n"
				+ "     __________________________________________________________________________");
	}
	
	public void menuEnemigo (Enemigo boss, int enemigo, String [] s) {
		if (enemigo == 0) {
			System.out.println(s [5]);
		}else if (enemigo == 1) {
			System.out.println(s [7]);
		}else if (enemigo == 2) {
			System.out.println(s [10]);
		}else if (enemigo == 3) {
			System.out.println(s [17]);
		}
	}
	
	public String vidaEnemigo (Enemigo boss) {
		String frase;
		frase="HP: " + boss.getHp();
		return frase;
	}
	
	public void box1 (String frase1) {
		System.out.println("      _______________________________________________________________________");
		System.out.println("");
		System.out.println("        -"+frase1);
		System.out.println("      _______________________________________________________________________");
		System.out.println("");
	}
	
	public void box2 (String frase1, String frase2) {
		System.out.println("      _______________________________________________________________________");
		System.out.println("");
		System.out.println("        -"+frase1);
		System.out.println("        -"+frase2);
		System.out.println("      _______________________________________________________________________");
		System.out.println("");
	}
	
	public void box3 (String frase1, String frase2, String frase3) {
		System.out.println("      _______________________________________________________________________");
		System.out.println("");
		System.out.println("        -"+frase1);
		System.out.println("        -"+frase2);
		System.out.println("        -"+frase3);
		System.out.println("      _______________________________________________________________________");
		System.out.println("");
	}
	
	public void dado (double tirada) {
		System.out.println("                                                            \r\n"
				+ "                              .:-+#%#. .#=++=-:                        \r\n"
				+ "                          :=##+%@@##+  -#=-+@+#%*-                     \r\n"
				+ "                     :::-:..:.:-:::--:=-**=. =@=#@#*-                  \r\n"
				+ "                  :==-:::..        .. .=.:--==-:-+#**#+.               \r\n"
				+ "                  +-     =**:         ..   -***+**#**=*%#:             \r\n"
				+ "                 +. =  -@%%@@%%:    .+:     :#++=-=+++=+*#+            \r\n"
				+ "                 *   = +@@@#*@@:  .==.       -+-:**+*@*===+#           \r\n"
				+ "                -:   :: .*@@%+.  :*-          -++%@@@#@%%%*#           \r\n"
				+ "                +.=-  :.        =#####=    .   *+=%@*@@#=--#           \r\n"
				+ "                **%@=  =      -#=:++%@@ .+@@@#. #=+%%++*==%+           \r\n"
				+ "               .##@@:   -   .*#. :*@@@= %@+ =@+ :#****===#%%=.         \r\n"
				+ "               -=@#+@:  .: :+=  *@@@%+-.@@*+%@:  =%***:+#+@@@@%+.      \r\n"
				+ "               =  :@-    ..*-::::----=+.=%@@#.    *==-+*++@@@@@@@#:    \r\n"
				+ "               *  --   :::=      ::----::..:.  :::#.=+**%@@@@@@@@@@*   \r\n"
				+ "               * .:       +                       :-+#+*@@@@@@@@@@@@   \r\n"
				+ "               --       ..::      -=              +%*%=*#@@@@@@@@@%.   \r\n"
				+ "                .=:  :: =* =.   ++@@+=-. ++     =#=#*%#*%@@@@@@@@+     \r\n"
				+ "                  .==:%#@%%.+.  +@@+@@@-+@+   =**%%**#@*@@@@@@@%:      \r\n"
				+ "                   .#@*+*#@- +  -@@@#-  @@  :##%@@@##+%#@@@@@@+        \r\n"
				+ "                     .=%#-   :=  --.   .+::**#*@@%%**#@@@@@@@-         \r\n"
				+ "                        .=*+. :-        :**#**#%%%@@@@@%#*=:           \r\n"
				+ "                            -=-:      :*##+%%%#*+=-:.                  \r\n"
				+ "                               ::::.-+==-:.                            \r\n"
				+ "                                                            ");
		if(tirada <= 0.05) {
			System.out.println("\t\t\t  -  Has sacado un 1");
		}else if(tirada <= 0.10) {
			System.out.println("\t\t\t  -  Has sacado un 2");
		}else if(tirada <= 0.15) {
			System.out.println("\t\t\t  -  Has sacado un 3");
		}else if(tirada <= 0.20) {
			System.out.println("\t\t\t  -  Has sacado un 4");
		}else if(tirada <= 0.25) {
			System.out.println("\t\t\t  -  Has sacado un 5");
		}else if(tirada <= 0.30) {
			System.out.println("\t\t\t  -  Has sacado un 6");
		}else if(tirada <= 0.35) {
			System.out.println("\t\t\t  -  Has sacado un 7");
		}else if(tirada <= 0.40) {
			System.out.println("\t\t\t  -  Has sacado un 8");
		}else if(tirada <= 0.45) {
			System.out.println("\t\t\t  -  Has sacado un 9");
		}else if(tirada <= 0.50) {
			System.out.println("\t\t\t  -  Has sacado un 10");
		}else if(tirada <= 0.55) {
			System.out.println("\t\t\t  -  Has sacado un 11");
		}else if(tirada <= 0.60) {
			System.out.println("\t\t\t  -  Has sacado un 12");
		}else if(tirada <= 0.65) {
			System.out.println("\t\t\t  -  Has sacado un 13");
		}else if(tirada <= 0.70) {
			System.out.println("\t\t\t  -  Has sacado un 14");
		}else if(tirada <= 0.75) {
			System.out.println("\t\t\t  -  Has sacado un 15");
		}else if(tirada <= 0.80) {
			System.out.println("\t\t\t  -  Has sacado un 16");
		}else if(tirada <= 0.85) {
			System.out.println("\t\t\t  -  Has sacado un 17");
		}else if(tirada <= 0.90) {
			System.out.println("\t\t\t  -  Has sacado un 18");
		}else if(tirada <= 0.95) {
			System.out.println("\t\t\t  -  Has sacado un 19");
		}else if(tirada <= 1) {
			System.out.println("\t\t\t  -  Has sacado un 20");
		}
	}
	
	public void lanzaDados () {
		System.out.println("\t\t\t  -  Pulsa intro para lanzar el dado");
	}
	
	public String ataqueAcertado (int dmg, Enemigo boss) {
		String frase;
		frase=boss.getNombre()+" recibe "+dmg+" de daño";
		return frase;
	}
	
	public String ataqueEnemigoAcertado (Enemigo boss) {
		String frase;
		frase=boss.getNombre() + " acierta su ataque!";
		return frase;
	}
	
	public String danioRecibido (int dmg) {
		String frase;
		frase="Recibes " + dmg + " de daño";
		return frase;
	}
	
	public String ataqueEnemigoFallado (Enemigo boss) {
		String frase;
		frase=boss.getNombre() + " falla su ataque!";
		return frase;
	}
	
	public void imprimirString (String frase) {
		System.out.println("\t\t\t  -  " +frase+ " \n");
	}
	
	public void cambiarArma (Arma armaEquipada) {
		System.out.println("\t\t  -  Ahora estás equipado con " +armaEquipada.getNombre()+ "\n");
	}
	
	public void objetoUsado (Objeto item) {
		System.out.println("\t\t\t  -  Has usado " +item.getNombre()+ "\n");
	}
	
	public void turnoPerdido () {
		System.out.println("\t\t  -  Te equivocas al programar y pierdes tu turno\n");
	}
	
	public void gameOver (String s) {
		System.out.println(s);
		System.out.println("              _______  _______  _______  _______    _______           _______  _______ \r\n"
				+ "             (  ____ \\(  ___  )(       )(  ____ \\  (  ___  )|\\     /|(  ____ \\(  ____ )\r\n"
				+ "             | (    \\/| (   ) || () () || (    \\/  | (   ) || )   ( || (    \\/| (    )|\r\n"
				+ "             | |      | (___) || || || || (__      | |   | || |   | || (__    | (____)|\r\n"
				+ "             | | ____ |  ___  || |(_)| ||  __)     | |   | |( (   ) )|  __)   |     __)\r\n"
				+ "             | | \\_  )| (   ) || |   | || (        | |   | | \\ \\_/ / | (      | (\\ (   \r\n"
				+ "             | (___) || )   ( || )   ( || (____/\\  | (___) |  \\   /  | (____/\\| ) \\ \\__\r\n"
				+ "             (_______)|/     \\||/     \\|(_______/  (_______)   \\_/   (_______/|/   \\__/\r\n"
				+ "\r\n"
				+ "                         -  Pulsa intro para volver al menú principal  -");
	}
	
	public void end () {
		System.out.println("             _________          _______    _______  _        ______  \r\n"
				+ "             \\__   __/|\\     /|(  ____ \\  (  ____ \\( (    /|(  __  \\ \r\n"
				+ "                ) (   | )   ( || (    \\/  | (    \\/|  \\  ( || (  \\  )\r\n"
				+ "                | |   | (___) || (__      | (__    |   \\ | || |   ) |\r\n"
				+ "                | |   |  ___  ||  __)     |  __)   | (\\ \\) || |   | |\r\n"
				+ "                | |   | (   ) || (        | (      | | \\   || |   ) |\r\n"
				+ "                | |   | )   ( || (____/\\  | (____/\\| )  \\  || (__/  )\r\n"
				+ "                )_(   |/     \\|(_______/  (_______/|/    )_)(______/ \r\n"
				+ "\r\n"
				+ "                    - Tu viaje en DAM ha terminado. Ayesa ha llamado\r\n"
				+ "                    - para ofrecerte un contrato de prácticas. Suerte");
	}
	
	public void pintarMenuNombre () {
		System.out.println("*********************************\n*\t\t\t\t*\n*\tIntroduce tu nombre"
				+ "\t*\n*\t\t\t\t*\n*********************************");
	}
	
	public void pintarMenu0(String s) {
		System.out.println("     Buenas " + s + "! Cuéntame un poco más sobre ti..");
		System.out.println("     Si estuvieses llegando tarde a clases... Qué harías ?");
		System.out.println("     1.- Me enfado con el portero, pienso como eliminarlo sigilosamente y colarme por la iglesia.");
		System.out.println("     2.- Que no me deja entrar ? No pasa nada, tumbo la puerta mientras grito: Por la Horda!");
		System.out.println("     3.- No pasa nada, me voy a la cafetería a meditar en mi siguiente estrategia.");
	}
	
	public void pintarMenuClases (int num) {
		if (num == 1) {
			System.out.println("     Enhorabuena! Eres un/a Asesino/a. Seguro que pusheas en git y los demás ni se enteran.\n\n");
		} else if (num == 2){
			System.out.println("     Enhorabuena! Eres un/a Guerrero/a, una bestia parda, "
					+ "haces subconsultas con una calculadora casio, un/a auténtico/a animal.\n\n");
		}else if (num == 3) {
			System.out.println("     Enhorabuena! Eres un/a Hechicero/a, usas tu intelecto para hacer proezas como domotizar"
					+ " tu casa con unas placas arduino.\n\n");
		}else {
			
		}
	}
	
	public void pintarMenu1 () {
		System.out.println("     Te levantas.. es jodidamente temprano, hace frío y pones rumbo a la escuela. Te montas\r\n"
				+ "     en tu medio de transporte y te das cuenta que el atasco de hoy es mayor de lo normal. De ahí\r\n"
				+ "     piensas: mierda, no voy a llegar.. Cuando al fin te encuentras cerca del colegio miras la hora \r\n"
				+ "     y tienes que tomar una decision importante... estás llegando tarde. ¿ Qué harás ?");
		System.out.println("     1.- Te vas a tomar un café. Sabes que aunque sean las 8:00 ya te han dejado fuera a esa hora\r\n"
				+ "	    otras veces. ");
		System.out.println("     2.- No te importan las normas, ni la hora, eres muy ninja y te cuelas por la iglesia ");
	}
	
	public void pintarMenu2() {
		System.out.println("     Está bien no pasa nada, a veces ocurren accidentes que no podemos controlar (como el atasco de la mañana)\r\n"
				+ "     asi que te diriges tranquilamente a la cafetería de Carlos. Llegas te pides un café calentito y mientras te \r\n"
				+ "     pone la estufa y te estas tomando el café piensas respecto al horario..\r\n");
	}
	
	public void pintarMenuDecision2 () {
		System.out.println("     Ahora que no entraste a los buenos dias, ¿ Vas a la segunda clase ? ¿ O no ? Es con el mismo profesor que primera hora, \r\n"
				+ "     sabrá que no entraste y cualquier cosa que le digas sonará a excusa tonta...");
		System.out.println("     1.- Así que.. ¿  decides saltarte las clases ? Vaya golfo/a.");
		System.out.println("     2.- Vas a intentar ir a clase de Rafa y que te deje hacer el examen.");
	}
	
	public void pintarMenu3() {
		System.out.println("     Demostrando tus habilidades de ninja, vistiendo todo de negro, teniendo conocimientos sobre armas y las sombras\r\n"
				+ "     de la mañana te cuelas por la iglesia, nadie te ve y encuentras el bastón de Don Bosco. Un bastón ancestral que fue \r\n"
				+ "     pasado de generación en generación por todos los salesianos.");
	}
	
	public void pintarMenuDecisiones3() {
		System.out.println("     ¿ Qué opción tomarías ?");
		System.out.println("     1.- Vas directo a clase y le dices que fuiste al servicio antes");
		System.out.println("     2.- Decides buscar a un sacerdote y ofrecer tu ayuda solidaria.");
	}
	
	public void pintarMenu4() {
		System.out.println("     Te pasas la hora mirando el estúpido móvil y no has hecho nada productivo, te dirijes a entrar a la siguiente hora\r\n"
				+ "     pero aparece alguien que vé que te estás saltando las clases.. Es Miguel y se acerca a preguntarte que te pasó.\r\n"
				+ "     Tu disimulas como puedes pero aunque creas que saliste victorioso tu conciencia no te deja en paz y eso te drena\r\n"
				+ "     algo de vida.");
		System.out.println("");
		System.out.println("\t\t  -  Oh no, has perdido 10 puntos de vida.");
		System.out.println("");
		System.out.println("     Peeeero, sin que se de cuenta Miguel, consigues llevarte un monitor del aula de ordenadores de primaria.");
	}
	
	public void pintarMenuDecisiones4() {
		System.out.println("     O eso creías, Miguel no va a dejar que te lleves ese monitor tan facilmente. Enfréntate a él.");
	}
	
	public void pintarMenu5() {
		System.out.println("     Rafa está explicando cómo hacer una página web de Dragon Ball, pero le interrumpes\r\n"
				+ "     al entrar en clase y te quiere mandar boletines extra como castigo. Prepárate para pelear.");
	}
	
	public void pintarMenuDecisiones5() {
		System.out.println("     En DAM no hay descanso, Miguel viene a hablar contigo de la reunión de padres online. \r\n"
				+ "     Se te ha olvidado avisarles... prepárate para luchar.");
	}
	
	public void pintarMenu6() {
		System.out.println("     Con el fin de espabilarte y no dar la primera hora.. puesto que eres delegado de solidaridad ofreces tu ayuda y\r\n"
				+ "     te pasas toda la hora cargando juguetes, comida para donar, repartiendo panfletos por las clases...Gracias a que ayudaste a \r\n"
				+ "     cargar todos los regalos de reyes y la comida, te sube el ataque (un poco).");
	}
	
	public void pintarMenuDecisiones6() {
		System.out.println("     Miguel aprecia tu ayuda, pero sabe que te has saltado clases y viene a pedirte un justificante. Enfréntate a él.");
	}
	
	public void pintarMenu7() {
		System.out.println("     Después de la pelea hay recreo. ¿ Te vas a la cafetería con tus compañeros ? ¿ o te vas a la biblioteca a estudiar ?");
	}
	
	public void pintarMenuDecisiones7() {
		System.out.println("     1.- Soy un tio sociable, me voy con la gente a ver cuál es el topic del dia.");
		System.out.println("     2.- Nah yo paso, en la biblioteca se está calentito y puedo aumentar mis recursos.");
	}
	
	public void pintarMenu8() {
		System.out.println("     La cafetería está llena, tu café llegó el primero, pero la tostada... parece que no te va a dar tiempo a comértela.");
	}
	
	public void pintarMenuDecisiones8() {
		System.out.println("     ¿ Qué decides ?");
		System.out.println("     1.- Te vas a la biblioteca porque ya sabes lo que van a dar y quieres avanzar con un videotutorial que envió Ángel.");
		System.out.println("     2.- Decides ir a clase porque tienes muchas faltas acumuladas");
	}
	
	public void pintarMenu9() {
		System.out.println("     En la biblioteca te ofrecen hacer un curso Udemy express. Increíble, justo lo que querías. Esto aumentará tus stats\n");
	}
	
	public void pintarMenuDecisiones9() {
		System.out.println("     ¿ Qué deberías hacer ahora ?");
		System.out.println("     1.- Estudiar en la biblioteca lo que Ángel tiene que explicar");
		System.out.println("     2.- Explicárselo tú a Ángel");
	}
	
	public void pintarMenu10() {
		System.out.println("     El video tutorial es un tostón y pasas de él. Te pones música para pasar el rato pero te pillan y te sacan fuera.\r\n"
				+ "     Ahora tienes que esperar en la calle hasta que puedas volver a entrar en la siguiente hora pero está lloviendo.\n");		
	}

	public void pintarMenu11() {
		System.out.println("     Pelea con Ángel, suerte.");
	}
	
	public void pintarMenuDecisiones11() {
		System.out.println("     Y ahora que has vencido a Ángel, ¿ Qué harías ?");
		System.out.println("     1.-¿ Te sales a fuera para relajarte a fumarte un cigarrito ? ");
		System.out.println("     2.-¿ Te vas a la iglesia a meditar y prepararte para el siguiente examen.");
	}
	public void pintarMenu12() {
		System.out.println("     Este videotutorial era la polla, salía el Ángel vestido de mátrix explicándonos la orientación a objetos con Java.\r\n"
				+ "     Así si que te está quedando todo claro. Con esto apruebas fijo.");
	}
	public void pintarMenu13() {
		System.out.println("     Con la que está cayendo, te mojas hasta los calcetines, y notas como te empiezas a resfriar.\n\n");
		System.out.println("\t\t  -  Oh no, has perdido 10 puntos de vida.\n");
	}
	public void pintarMenu141() {
		System.out.println("     Enhorabuena, en la iglesia están repartiendo la bendición de Don Bosco");
	}
	
	public void pintarMenu15() {
		System.out.println("     No sabes ni cómo pero aquí estás, has pasado por muchas cosas para llegar a este punto, parece que fue ayer\r\n"
				+ "     cuando te acostabas a las tantas y te despertabas sin tarea, pero de repente te dá por mirar el móvil para ver la hora\r\n"
				+ "     y.... te encuentras con 25000 Boletines de BBDD para mañana.. Crees que es una putada, pero puedes con ello, gracias a \r\n"
				+ "     todo lo que hiciste anteriormente...");
		System.out.println();
		System.out.println("     Pasa la noche y al dia siguiente te das cuenta de que eres un Titán de BBDD, ya no tienes miedo de enfrentarte a Luismi.\r\n"
				+ "     Suben tus stats por la sabiduría adquirida en BBDD.");
	}
	
	public void pintarMenuDecisiones15() {
		System.out.println("     ¿ Ahora cómo te sientes ? ¿ Preparado ?");
		System.out.println("     1.-Si crees que puedes aumentar tus stats un poco más, te saltas la primera hora para ir directo al examen con \r\n"
				+ "     todo estudiado al 100%");
		System.out.println("     2.-Si crees que eres tan titán como piensas vas directo a clase.");
	}
	public void pintarMenu16() {
		System.out.println("     ¡¡NOOOOOooooooo!! ¿¡Cómo se te ocurre saltarte más clases!? Los profesores te han visto entrar tarde y ahora no te dejan hacer el examen final.");
		System.out.println("     YOU... SHALL... NOT PASS!!!!");
	}
	public void pintarMenu17() {
		System.out.println("     A pesar de todo lo aprendido en Base de datos: todos los join, las subconsultas escalares\r\n"
				+ "     y las claves primarias, coges una silla de clase por si acaso, para ir más preparado para el examen");
	}
	public void pintarMenu18() {
		System.out.println("     Ha llegado la hora. Las decisiones que has ido tomando durante la aventura\r\n"
				+ "     te han llevado hasta aquí. Demuéstrale a Luismi si finalmente eres digno de DAM. Enfréntate a tu destino.\r\n"
				+ "     Que Don Bosco te acompañe.");

	}
	
	public void obtencionObjeto (Objeto o) {
		System.out.printf("\n\t\t\tEnhorabuena!\n\t\t\tHas obtenido el objeto %s!\n\n", o.getNombre());
		System.out.printf("\t\t%s\n\n", o.getDescripcion());
		System.out.println("\t\tRecuerda utilizarlo en combate\n\n");
	}
	
	public void obtencionArma (Arma a) {
		System.out.printf("\n\t\t\tEnhorabuena!\n\t\t\tHas obtenido el arma %s!\n\n", a.getNombre());
		System.out.println("\t\tNo olvides equipártela en combate\n\n");
	}
	
	public void enemigoDerrotado (String s) {
		System.out.println(s + "\n");
		System.out.println("\t\tEnhorabuena, has vencido, escoge tu recompensa:");
		System.out.println("\t\t - 1. Aumentar ataque");
		System.out.println("\t\t - 2. Aumentar defensa");
		System.out.println("\t\t - 3. Aumentar HP máxima");
		System.out.println("\t\t - 4. Cura");
	}
		
	public void menuSalir () {
		System.out.println("     Gracias por jugar a DAM Survivor v0.0.2.45.1.1021");
	}
	
	public void pulsaTecla () {
		System.out.println("\t\t  -  Pulsa cualquier tecla para continuar");
	}
	
	
}