/*
- Matriz con distinto tipo de contenido?
- Tener en los arreglos null? -> Si, si son objetos
- Matriz de números puede ordenar columnas y filas? -> Si (hay que tener una función)
- Se pueden intercambiar valores dentro de las celdas? Si, usamos intercambio visto
- Para ordenar cartas (Palo Numero) queremos ordenar por número para operar la matriz tomar en cuenta solo 1
- Matriz por extensión en ejemplos
*/

public class Matriz{

	public void imprimirArreglo(int [] arreglo){
		for (int i = 0 ; i < arreglo.length; ++i){
			System.out.print(arreglo[i]+" ");
		}
		System.out.println();
	}

	public void imprimirMatriz(int [][] matriz){
		for (int f = 0 ; f < matriz.length; f++){
			for (int c = 0 ; c < matriz[f].length ; c++){
				System.out.print(matriz[f][c] + " ");
			}
			System.out.println();
		}
	}

	public void imprimirMatriz(char [][] matriz){
		for (int f = 0 ; f < matriz.length; f++){
			for (int c = 0 ; c < matriz[f].length ; c++){
				System.out.print(matriz[f][c] + " ");
			}
			System.out.println();
		}
	}

	// a b
	// c d
	// e f
	public char [][] crearMatrizLetras(int filas, int columnas){
		char [][] matriz = new char[filas][columnas];
		char [] letra = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int contador = 0;
		for (int f = 0 ; f < matriz.length; f++){
			for(int c = 0; c < matriz[f].length; c++){
				matriz[f][c] = letra[contador%letra.length];
				contador++;
			}
		}
		return matriz;
	} 
	public char [][] crearMatrizLetrasAleatorias(int filas, int columnas){
		char [][] matriz = new char[filas][columnas];
		char [] letra = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		for (int f = 0 ; f < matriz.length; f++){
			for(int c = 0; c < matriz[f].length; c++){
				matriz[f][c] = letra[(int)(Math.random()*letra.length)];
			}
		}
		return matriz;
	} 

	public char [][] crearMatrizLetrasV2(int filas, int columnas){
		char [][] matriz = new char[filas][columnas];
		int letra = 0;
		for (int f = 0 ; f < matriz.length; f++){
			for(int c = 0; c < matriz[f].length; c++){
				// Son 26 letras
				// Y necesito una letra entre [65 , 65 + 26 [ 
				// % 26 -> 0 , 25
				matriz[f][c] = (char)(65+letra%26);
				letra++;
			}
		}
		return matriz;
	} 


	
	public static void main (String [] args){
		Matriz matrizInstancia = new Matriz();
		
		int [] arreglo = {1,2,3,4,5};
		System.out.println("Impresion del arreglo");
		matrizInstancia.imprimirArreglo(arreglo);


		int [][] matriz1 = {
			{1,2,3,4,5},
			{10,20,30,40,50},
			{2,4}
		};
		System.out.println("Impresion de la matriz");
		matrizInstancia.imprimirMatriz(matriz1);

		System.out.println("Ejemplo 2");
		System.out.println("Ejemplo 2 - Arreglo");
		int [] arreglo2 = new int [10];
		// 0 0 0 0 0 0 0 0 0 0
		matrizInstancia.imprimirArreglo(arreglo2);

		int [][] matriz2 = new int [3][6];
		// 0 0 0 0 0 0
		// 0 0 0 0 0 0
		// 0 0 0 0 0 0
		System.out.println("Ejemplo 2 - Matriz");
		matrizInstancia.imprimirMatriz(matriz2);

		matriz2[1][3] = 6;
		// La fila 1, columna 3 se le asigna un 6
		System.out.println("Ejemplo 2 - Matriz");
		matrizInstancia.imprimirMatriz(matriz2);
		matriz2[2][4] = 1;
		System.out.println("Ejemplo 2 - Matriz");
		matrizInstancia.imprimirMatriz(matriz2);

		int valor = matriz2[1][3];
		System.out.println( "matriz2[1][3] contiene: "+ valor);

		System.out.println("Matriz 2 tiene "  + matriz2.length + " filas");
		System.out.println("Matriz 2, fila 0 tiene "  + matriz2[0].length + " columnas");

		int [][] matriz3 = new int [4][];
		/* [
				null, 
				null, 
				null, 
				null
			]
		*/
		matriz3[0] = new int [6]; 
		/* [
				[0,0,0,0,0,0], 
				null, 
				null, 
				null
			]
		*/
		matriz3[1] = new int [10];
		matriz3[2] = new int [5];
		matriz3[3] = new int [3];
		matrizInstancia.imprimirMatriz(matriz3);

		// a b
		// c d
		// e f
		System.out.println("Ejemplo 2 - Matriz Letras 1");
		char [][] matrizLetras1 = matrizInstancia.crearMatrizLetras(3,2);
		matrizInstancia.imprimirMatriz(matrizLetras1);
		System.out.println("Ejemplo 2 - Matriz Letras 2");
		matrizLetras1 = matrizInstancia.crearMatrizLetras(4,5);
		matrizInstancia.imprimirMatriz(matrizLetras1);

		System.out.println("Ejemplo 2 - Matriz Letras 3");
		matrizLetras1 = matrizInstancia.crearMatrizLetras(10,5);
		matrizInstancia.imprimirMatriz(matrizLetras1);


		System.out.println("Ejemplo 2 - Matriz Letras 4");
		matrizLetras1 = matrizInstancia.crearMatrizLetrasAleatorias(10,5);
		matrizInstancia.imprimirMatriz(matrizLetras1);

		System.out.println(65);
		System.out.println((char)65);
		System.out.println((char)66);


		System.out.println("Ejemplo 2 - Matriz Letras 5 - V2");
		matrizLetras1 = matrizInstancia.crearMatrizLetrasV2(10,5);
		matrizInstancia.imprimirMatriz(matrizLetras1);
		

	}
}
