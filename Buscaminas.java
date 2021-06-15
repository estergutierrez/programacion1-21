public class Buscaminas{
	
	private int [][] tablero;
	private int minas;

	public Buscaminas(int filas, int cols, int minas){
		tablero = new int[filas][cols];
		this.minas = minas;
	}


	public void colocarMinas(){
		//sacar un número aleatorio para las filas
		//sacar un número aleatorio para las columnas
		//ver si en la celda ya hay una mina?
		// Si no hay mina coloco la mina
		// Si hay mina, debo hacer el proceso de nuevo y no coloco la mina
		int minasColocadas = 0;
		while(minasColocadas < minas && minas < tablero.length * tablero[0].length){
			int filaAleatoria = (int)(Math.random() * tablero.length);
			int colAleatoria  = (int)(Math.random() * tablero[filaAleatoria].length);
			if (tablero[filaAleatoria][colAleatoria] == 0){
				tablero[filaAleatoria][colAleatoria] = -1;
				minasColocadas++;
			}
		}
	}

	public void colocarNumeros(){
		int [] corrimientoFilas    = {-1,0,1, 0,-1,1, 1,-1};
		int [] corrimientoColumnas = { 0,1,0,-1, 1,1,-1,-1};
		for(int f = 0; f < tablero.length; f++){
			for (int c = 0; c<tablero[f].length; c++){
				if (tablero[f][c] == -1){
					int contador = 0;
					while(contador < 8){
						int nuevaFila = f + corrimientoFilas[contador];
						int nuevaColumna = c + corrimientoColumnas[contador];
						if (nuevaFila >= 0 && nuevaFila < tablero.length && 
							nuevaColumna >=0 && nuevaColumna < tablero[nuevaFila].length && 
							tablero[nuevaFila][nuevaColumna] != -1){

							tablero[nuevaFila][nuevaColumna] += 1;
						}
						contador++;
					}
				}
			}
		}
	}



	public void imprimir(){
		System.out.println("Cantidad de minas: "+ this.minas);
		for(int f = 0 ; f < tablero.length; f++){
			for(int c = 0; c < tablero[f].length; c++){
				System.out.print(tablero[f][c] + "\t");
			}
			System.out.println();
		}
	}


	public static void main (String args[]){
		Buscaminas buscaminas = new Buscaminas(8,8,15);
		buscaminas.imprimir();
		System.out.println("- - - - - -");
		buscaminas.colocarMinas();
		buscaminas.imprimir();
		System.out.println("- - - - - -");
		buscaminas.colocarNumeros();
		buscaminas.imprimir();

	}
}