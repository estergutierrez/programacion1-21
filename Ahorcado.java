import javax.swing.JOptionPane;
public class Ahorcado{
	// Una palabra secreta hola
	// Una palabra usuario ???? -> h??? -> z
	// Una cantidad de intentos 6 -> 6 -> 5
	// Atributos
	private String palabraSecreta; // hola
	private String estadoPalabra; // ????
	private int intentos;
	private Interfaz interfaz;

	public Ahorcado(String palabra){
		palabraSecreta = palabra;
		interfaz = new Interfaz();
		intentos = 6;
		estadoPalabra = "";
		for(int i =0; i < palabraSecreta.length(); i++){
			estadoPalabra += "?";
		}
	}

	public boolean buscarLetra(String busqueda){
		boolean encontrada = false;
		StringBuilder palabra = new StringBuilder(estadoPalabra);
		for(int i = 0 ; i< palabraSecreta.length(); i++){
			if(palabraSecreta.charAt(i) == busqueda.charAt(0)){
				encontrada = true;
				palabra.replace(i, i+1, ""+busqueda.charAt(0));
			}
		}
		estadoPalabra = palabra.toString();
		return encontrada;
	}

	public void jugar(){
		// intentos
		// (ciclo) si tiene intentos para jugar o si no ha ganado queremos:
			// pedir una letra al usuario
			// vamos a ver si está en la palabraSecreta (buscarLetra)
			// si está, reemplazamos el patrón (estadoPalabra)
			// si no está, restamos un intento
		// ganó? o perdió?
		while(intentos > 0 && estadoPalabra.indexOf("?") != -1){
			String letra = interfaz.solicitarUnaHilera(this.toString() + "\nDigite una letra:");
			boolean encontrado = buscarLetra(letra);
			if (!encontrado){
				intentos--;
			}
		}
		if(estadoPalabra.indexOf("?") != -1){
			// Perdió :(
			JOptionPane.showMessageDialog(null, "Perdió :(");
		}
		else{
			// Ganó :)
			JOptionPane.showMessageDialog(null, "Ganó :)");
		}
	}

	public String toString(){
		String contenido = "Intentos restantes: "+intentos+"\n"+palabraSecreta + "\n" + estadoPalabra;
		return contenido;
	}


	public static void main(String [] args){
		Ahorcado ahorcado = new Ahorcado("paralelepipedo");
		ahorcado.jugar();
		
		/*
		System.out.println(ahorcado);
		ahorcado.buscarLetra("p");
		System.out.println(ahorcado);

		StringBuilder palabra = new StringBuilder("HOLA");
		palabra.replace(1,3,"hoy es viernes");
		System.out.println(palabra);

		String prueba = "hola";
		System.out.println(prueba.indexOf("?"));
		*/	
	}
}