import javax.swing.JOptionPane;

public class Perro{
	
	// Atributos

	// Para definir un tipo de dato:
	// Declarar el valor privado (private) -> no accesible desde instancia
	// Definir qué tipo de dato es (E.g int, Carta, primitivo o no primitivo)
	// Definir un nombre
	// ;
	
	// Sustantivos
	private String nombre;
	private String estado;

	// Constructor de clase
	// Se invoca sólo una vez cuando se crea la instancia
	// public
	// nombreDeLaClase
	// parámetros requeridos
	public Perro(String nombre, String estado){
		this.nombre = nombre;
		this.estado = estado;
	}

	public Perro (String nombre){
		this.nombre = nombre;
		sentarse();
	}

	public Perro(){
		this.nombre = "";
		this.estado = "";
	}

	// Métodos

	// Acciones (verbos)
	// Declarar accesibilidad -> publico o privado
	// El valor de retorno (no retorno -> void) - retorno (tipo de dato)
	// Definimos el nombre del método
	// Agregamos parámetros entre () -> lo que necesitamos recibir para que el método funcione
	public void bautizar (String nombre){
		this.nombre = nombre;
	}

	public void correr(){
		String correr = "              .--~~,__\n"+ 
	    " :-....,-------`~~'._.'\n"+ 
	    "  `-,,,  ,_      ;'~U'\n"+ 
	    "   _,-' ,'`-__; '--.\n"+ 
	    "  (_/'~~      ''''(;\n";

		this.estado = "corriendo\n" + correr;
	}

	public void sentarse(){
	
	  	String sentado = "                                           /\\ /\\\n";
      	sentado += "                                          /  \\---._\n";
      	sentado += "                                         / / `     `\\\n";
      	sentado += "                                         \\ \\   `'<@)@)      \n";
      	sentado += "                                         /`         ~ ~._ \n";
      	sentado += "                                        /                `() \n";
      	sentado += "                                       /    \\   (` ,_.:.  /\n";
      	sentado += "                                      / ~    `\\   (vVvvvvV\n";
      	sentado += "                                     /       |`\\_ `^^^/\n";
      	sentado += "                                 ___/________|_  `---'\n";
      	sentado += "                                (______________) _\n";
      	sentado += "                                _/~          | `(_)\n";
      	sentado += "                              _/~             \\  \n";
      	sentado += "                            _/~               |\n";
      	sentado += "                          _/~                 |\n";
      	sentado += "                        _/~                   |\n";
      	sentado += "                      _/~         ~.          |\n";
      	sentado += "                    _/~             \\        /\\\n";
      	sentado += "                 __/~               /`\\     `||\n";
      	sentado += "               _/~      ~~-._     /~   \\     ||\n";
      	sentado += "              /~             ~./~'      \\    |)\n";
      	sentado += "             /                 ~.        \\   )|\n";
      	sentado += "            /                    :       |   ||\n";
      	sentado += "            |                    :       |   ||\n";
      	sentado += "            |                   .'       |   ||\n";
      	sentado += "       __.-`                __.'--.      |   |`---. \n";
      	sentado += "    .-~  ___.         __.--~`--.))))     |   `---.)))\n";
     	sentado += "   `---~~     `-...--.________)))))      \\_____)))))\n"; 

		this.estado = "sentado\n" + sentado;
	}

	public String getEstado(){
		return this.estado;
	}

	public String saludar(){
		String saludo = "";
		saludo = saludo + "Hola me llamo " + nombre; 
		saludo += " y estoy ";
		saludo += estado;
		return saludo;
	}

	public static void main (String [] args){
		// NombreDeLaClase nombreInstancia = new NombreDeLaClase();
		Perro perro1 = new Perro();
		// nombreInstancia.nombreMetodo(parametros)
		perro1.bautizar("Milu");
		perro1.correr();
		String saludoPerro1 = perro1.saludar();
		System.out.println(saludoPerro1);

		Perro perro2 = new Perro();
		perro2.bautizar("Jack");
		perro2.sentarse();
		JOptionPane.showMessageDialog(null, perro2.saludar());

		Perro perro3 = new Perro("Ponchi", "corriendo");
		System.out.println(perro3.saludar());

		Interfaz interfaz = new Interfaz ();
		String nombrePerro = interfaz.solicitarUnaHilera("Digite el nombre de su perro");
		Perro perro4 = new Perro(nombrePerro);
		System.out.println(perro4.saludar());
	}
}