public class MazoDeCartas{
	public MazoDeCartas(){
		// un ciclo for (sabemos cuantas veces vamos a iterar)
		// Sabemos que: un mazo tiene: 4 palos
		// Cada palo tiene 13

		// Ir en orden por cada palo y cambiar de palo cada vez que 
		// Creamos 13 instancias
		for(int j = 0 ; j < 4 ; j++){
			for (int i = 1; i <= 13; i++){
				// Repetimos 13 veces
				// Crear instancia de carta
				// Obtener datos e imprimirlos
				Carta carta = new Carta(i, this.obtenerPalo(j) );
				System.out.println(carta.retornarDatos());
			}
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
	}
}