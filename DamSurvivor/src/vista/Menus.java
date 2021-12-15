package vista;

import model.Arma;
import model.Enemigo;
import model.Jugador;

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
				+ "                                    Pulsa intro para continuar.\n");
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
		System.out.println("\t\tLead Game Designer \t-\t Luis Miguel serón");
		System.out.println("\t\tGameplay Programming \t-\t Álvaro Franco Martínez");
		System.out.println("\t\tVisual Effects Design \t-\t Nadie");
		System.out.println("\t\tAnimation \t\t-\t Nadie tambien");
		System.out.println("\t\tCharacter Modeling \t-\t No hay presupuesto");
		System.out.println();
	}
	
	public void invalid () {
		System.out.println("\t\t\t  -  Elige bien");
	}
	
	public void dado (double tirada) {
		System.out.println("                                                                                          \r\n"
				+ "                                        .:----.                                           \r\n"
				+ "                                   :-===-. -+=**=:                                        \r\n"
				+ "                             .-=+*#%#%%-   #+==-:--=-.                                    \r\n"
				+ "                        .-+#@*#%@@**#@#.   @+-:=*@@=.*#+-.                                \r\n"
				+ "                   .---=-=+-  *+++==:     :#*+=:::+@@@*#@#+-                              \r\n"
				+ "               :---.  ...::::-------+==-=+- *+=:.   +@# @@@+#*-                           \r\n"
				+ "            =-==-----::..           .... -* .-*:.-:: .. +%@@%%%%=.                        \r\n"
				+ "           *...                           :-    ++****=+===++=.:+%#=.                     \r\n"
				+ "          =:.-      .*%@@#:             ..       ++++++-=-+*+##**+*#@+                    \r\n"
				+ "         .*  -:    +@@%@@@@#%#:        -+:        **=+++----+-++--+*+##:                  \r\n"
				+ "         +=   =.  +@@%=@@@#@@@+      :=*.          **-=--.-:-=##*:-==--#=                 \r\n"
				+ "        .%     +  :@@@@@#:*@@@:    :*+:             *-. :@@%+-+@@#=:---+#:                \r\n"
				+ "        -=     .+   .%@@@@@#=     -*+:               *-==%@@@@%+#@%*###+=+                \r\n"
				+ "        +:      .=    :==:.     .*+=.:::              %=+-@@@#@@@@@++**-++                \r\n"
				+ "        # =**-   ::            -*#*@@@@@@=      :.    .%==-@@#=%%@*+-:.-%:                \r\n"
				+ "       :*:@%@@.   =          .*#+.*%#*%@@@.  :*@@@@#-  +*::+%@%+-+#=-.*%%                 \r\n"
				+ "       +-*@#@@.    +        +%*.    =#@@@#  #@@%++@@@:  %+*+**==++*::%##*                 \r\n"
				+ "       *%%%@@=.    :-     .##*   :#@@@@@*  =@@%   +@@-  :@+*+++*:==.##+@@%*-              \r\n"
				+ "       ++@@@=+@+    -:   =++-   #@@@@@*:.  *@@%::=@@%    :@**++++..%**=@@@@@@#-           \r\n"
				+ "       - -=.#@#      +  =+=.   .#%@@@@@@@@:=@@@@@@@%.     +#-+++ .%*==*@@@@@@@@@*.        \r\n"
				+ "      ::   =@#        ..+=--=--::.    .:--. =#@@@@*.       %=+:.+**=-=%@@@@@@@@@@@*:      \r\n"
				+ "      +:   %*    .-:-+:=        .:-========--::.-:.       :@ +:=+++*#@@@@@@@@@@@@@@@+     \r\n"
				+ "      *.              -:                              :----- =.=+*=@@%@@@@@@@@@@@@@@@=    \r\n"
				+ "      *. :-:.         --                                   --+*%==+@@@@@@@@@@@@@@@@@%-    \r\n"
				+ "      -+.              =:           :                      *#++#+:-%*@@@@@@@@@@@@@@%-     \r\n"
				+ "       .=.          %%. #         -@@=                   :+=***%@==##@@@@@@@@@@@@@*.      \r\n"
				+ "         ==:   -+-  =*: :+.    =##@@@%#*+=:  *@+       :*++=+*+#***+#@@@@@@@@@@@@=        \r\n"
				+ "           :== .%@=%@@@* .*    =%@@@*#@@@@# *@@-     :+#+#%+++**%%**@@@@@@@@@@@#.         \r\n"
				+ "             #@+:+@@@=@@* :=    -@@*=%@@*- :@@%    .+*+*#@@@*+*+#@-@@@@@@@@@@@=           \r\n"
				+ "             :*@@%=-+#%%=  *.   =@@@@%=.   *@@-   +#*@@@@@#@@=%=**#@@@@@@@@@#.            \r\n"
				+ "               .-#@%=       #.   =*=:      *%=  =**++#@@@%@%*=++#@@@@@@@@@@*              \r\n"
				+ "                  .+#@*-    .*                -*+**++##***###%@@@@@@@@@@%*-               \r\n"
				+ "                      :+%+.  .*             =#=+*+*++##%@@@@@@@@@@%*+=-                   \r\n"
				+ "                         :+*- :           =##*-=+#%@@@@%##*+=-:                           \r\n"
				+ "                            :==:        =++*###*+=-:.                                     \r\n"
				+ "                                :-:::-+*==-.                                              \r\n"
				+ "                                                                                          \r\n"
				+ "                                                                                      ");
		if(tirada <= 0.05) {
			System.out.println("\t\t\t  -  Has sacado un 1 \n");
		}else if(tirada <= 0.10) {
			System.out.println("\t\t\t  -  Has sacado un 2 \n");
		}else if(tirada <= 0.15) {
			System.out.println("\t\t\t  -  Has sacado un 3 \n");
		}else if(tirada <= 0.20) {
			System.out.println("\t\t\t  -  Has sacado un 4 \n");
		}else if(tirada <= 0.25) {
			System.out.println("\t\t\t  -  Has sacado un 5 \n");
		}else if(tirada <= 0.30) {
			System.out.println("\t\t\t  -  Has sacado un 6 \n");
		}else if(tirada <= 0.35) {
			System.out.println("\t\t\t  -  Has sacado un 7 \n");
		}else if(tirada <= 0.40) {
			System.out.println("\t\t\t  -  Has sacado un 8 \n");
		}else if(tirada <= 0.45) {
			System.out.println("\t\t\t  -  Has sacado un 9 \n");
		}else if(tirada <= 0.50) {
			System.out.println("\t\t\t  -  Has sacado un 10 \n");
		}else if(tirada <= 0.55) {
			System.out.println("\t\t\t  -  Has sacado un 11 \n");
		}else if(tirada <= 0.60) {
			System.out.println("\t\t\t  -  Has sacado un 12 \n");
		}else if(tirada <= 0.65) {
			System.out.println("\t\t\t  -  Has sacado un 13 \n");
		}else if(tirada <= 0.70) {
			System.out.println("\t\t\t  -  Has sacado un 14 \n");
		}else if(tirada <= 0.75) {
			System.out.println("\t\t\t  -  Has sacado un 15 \n");
		}else if(tirada <= 0.80) {
			System.out.println("\t\t\t  -  Has sacado un 16 \n");
		}else if(tirada <= 0.85) {
			System.out.println("\t\t\t  -  Has sacado un 17 \n");
		}else if(tirada <= 0.90) {
			System.out.println("\t\t\t  -  Has sacado un 18 \n");
		}else if(tirada <= 0.95) {
			System.out.println("\t\t\t  -  Has sacado un 19 \n");
		}else if(tirada <= 1) {
			System.out.println("\t\t\t  -  Has sacado un 20 \n");
		}
	}
	
	public void lanzaDados () {
		System.out.println("\t\t\t  -  Lanza el dado\n");
	}
	
	public void ataqueAcertado (int dmg, Enemigo boss) {
		System.out.println("\t\t\t  -  Tu ataque acierta");
		System.out.println("\t\t\t  -  "+boss.getNombre()+" recibe "+dmg+" de daño\n");
	}
	
	public void imprimirString (String frase) {
		System.out.println("\t\t\t  -  " +frase+ " \n");
	}
	
	public void cambiarArma (Arma armaEquipada) {
		System.out.println("\t\t\t  -  Ahora estas equipado con " +armaEquipada.getNombre());
	}
	
	public void menuArmas (Jugador j1) {
		int elecc= 1;
		if(j1.getArmas()[2] == null) {
		
		};
	}
	
	public void menuCombate (String pepe) {
		System.out.println(pepe);
	}
}

//objetivo mostrar las armas y crear una interfaz para el menú
//objetivo 2 crear un atributo de ascis y generar el array en base de datos
// si arma 1 no es nulo , lo imprimo
// si arma 2 no es nulo, lo imprimo
// etc