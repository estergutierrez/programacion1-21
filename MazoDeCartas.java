public class MazoDeCartas{

	private Carta [] cartas;

	public MazoDeCartas(){
		cartas = new Carta[52];
		// un ciclo for (sabemos cuantas veces vamos a iterar)
		// Sabemos que: un mazo tiene: 4 palos
		// Cada palo tiene 13

		// Ir en orden por cada palo y cambiar de palo cada vez que 
		// Creamos 13 instancias
		int contador = 0;
		for(int j = 0 ; j < 4 ; j++){
			for (int i = 1; i <= 13; i++){
				// Repetimos 13 veces
				// Crear instancia de carta
				// Obtener datos e imprimirlos
				Carta carta = new Carta(i, this.obtenerPalo(j));
				cartas[contador] = carta;
				contador++;
			}
		}
	}

	public void imprimirMazo(){
		//for (int i = 0; i < cartas.length; i++){
		//	System.out.println(cartas[i].retornarDatos());
		//}
		for (Carta carta : cartas){
			System.out.println(carta.retornarDatos());
		}
	}

	public void revolver(){
		for (int i = 0; i < cartas.length; i++){
			int celda = (int)(Math.random()*52);
			Carta temporal = cartas[i];
			cartas[i] = cartas[celda];
			cartas[celda] = temporal;
		}
	}

	public String obtenerPalo(int iterador){
		String palo = "";
		if(iterador == 0){
			palo = "Corazones";
		}
		else if(iterador == 1){
			palo = "Tréboles";
		}
		else if (iterador == 2){
			palo = "Espadas";
		}
		else{
			palo = "Diamantes";
		}
		return palo;
	}

	public static void main (String[] args){
		MazoDeCartas mazo = new MazoDeCartas();
		mazo.imprimirMazo();
		mazo.revolver();
		System.out.println("- - - - - - -");
		mazo.imprimirMazo();
	}
}