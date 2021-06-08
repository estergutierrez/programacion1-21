public class MatrizExamen{
	
	public int [][] generarMatriz(int filas, int cols){
		int [][] matriz = null;
		if (filas > 0 && cols > 0){
			matriz = new int [filas][cols];
			for (int f = 0; f < filas; f++){
				for (int c = 0 ; c < cols; c++){
					matriz[f][c] = (int)(Math.random()*100);
				}
			}
		}
		return matriz;
	}

	public void imprimirMatriz(int [][] matriz){
		for (int f = 0; f < matriz.length; f++){
			for (int c = 0 ; c < matriz[f].length; c++){
				System.out.print(matriz[f][c] + "\t");
			}
			System.out.println();
		}
	}

	public void imprimirMatriz(String [][] matriz){
		for (int f = 0; f < matriz.length; f++){
			for (int c = 0 ; c < matriz[f].length; c++){
				String sep = (f==1) ? "\t   " : "\t";
				System.out.print(sep + matriz[f][c] );
			}
			System.out.println();
		}
	}

	public String [][] generarCategorias(int cantidad){
		String [][] categoria = new String [2][cantidad];
		int limInferior = 0;
		for (int i = 0 ; i < cantidad; i++){
			int siguiente = (int) Math.ceil(99.0/cantidad*(i+1));
			categoria[0][i] = "[" + limInferior + "-"+ siguiente+ "[";
			categoria[1][i] = "0";
			limInferior = siguiente;
		}
		return categoria;
	}

	public String [][] categorizarMatriz(int[][] matriz, int numCategorias){
		String [][] categoria = generarCategorias(numCategorias);
		int ventana = (int)Math.ceil(99.0/numCategorias);
		for (int f = 0; f < matriz.length; f++){
			for (int c = 0 ; c < matriz[f].length; c++){
				int celda = matriz[f][c] != 99 ? matriz[f][c]/ventana : categoria[0].length-1;
				categoria[1][celda] = Integer.parseInt(categoria[1][celda]) + 1 + "";
			}
		}
		return categoria;
	}

	public static void main (String [] args){
		MatrizExamen instanciaMatriz = new MatrizExamen();
		int [][] matriz = instanciaMatriz.generarMatriz(4,5);
		instanciaMatriz.imprimirMatriz(matriz);
		instanciaMatriz.imprimirMatriz(instanciaMatriz.categorizarMatriz(matriz,3));
	}
}