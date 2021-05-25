public class PracticaMatrices{
	
/*
	Cree un método llamado sumarMatrices que intentará sumar 
	una matrizA con una matrizB. Tome 
	en cuenta que debe validar los tamaños de las matrices, 
	en caso contrario no se podrán sumar y 
	retornará los resultados. (Sumar matrices quiere decir sumar 
	cada entrada de la matrizA con su 
	entrada correspondiente en la matrizB)
*/

	public int [][] sumarMatrices(int [][] matrizA, int [][] matrizB){
		int [][] resultado = null;
		if(esRectangular(matrizA) && esRectangular(matrizB) && matrizA.length == matrizB.length && matrizA[0].length == matrizB[0].length){
			resultado = new int [matrizA.length][matrizA[0].length];
			for(int f = 0; f < resultado.length; f++){
				for(int c = 0; c < resultado[f].length; c++){
					resultado[f][c] = matrizA[f][c] + matrizB[f][c];
				}
			}
		}
		return resultado;
	}

	public boolean esRectangular(int [][] matriz){
		boolean resultado = true;
		int tam = matriz[0].length;
		for (int f = 0; f < matriz.length; f++){
			if(tam != matriz[f].length){
				resultado = false;
			}
		}
		return resultado;
	}

	public static void main (String [] args){
		PracticaMatrices pm = new PracticaMatrices();
		int [][] matrizA = {{1,2,3},{4,5,6}};
		int [][] matrizB = {{6,5,4},{9,8,7}};
	}

}