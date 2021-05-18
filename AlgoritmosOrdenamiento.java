public class AlgoritmosOrdenamiento{
	
	public void imprimir(int [] arreglo){
		for (int i = 0 ; i < arreglo.length; i++){
			System.out.print(arreglo[i] + " ");
		}
		System.out.println();
	}

	public int [] clonar(int [] arreglo){
		int copia [] = new int [arreglo.length];
		for (int i = 0 ; i < arreglo.length ; i++){
			copia[i] = arreglo[i];
		}
		return copia;
	}

	public int [] ordernarSeleccion(int [] arreglo){
		int copia [] = clonar(arreglo);
		for (int i = 0; i < copia.length; i++){
			for (int j = i+1 ; j < copia.length; j++){
				if(copia[i] > copia[j]){
					int temporal = copia[i];
					copia[i] = copia[j];
					copia[j] = temporal;
				}
			}
		}
		return copia;
	}

	public int [] ordenarBurbujaLadrillo(int [] arreglo){
		int [] copia = clonar(arreglo);
		for(int i = 0 ; i < copia.length; i++){
			for(int j = copia.length - i -1; j > 0 ; j--){
				if(copia[j-1] > copia[j]){
					int temporal = copia[j-1];
					copia[j-1] = copia[j];
					copia[j] = temporal;
				}
			
			}
		}
		return copia;
	}

	public int [] ordenarBurbuja(int [] arreglo){
		int [] copia = clonar(arreglo);
		for(int i = 0 ; i < copia.length; i++){
			for(int j = 1; j < copia.length - i ; j++){
				if(copia[j-1] > copia[j]){
					int temporal = copia[j-1];
					copia[j-1] = copia[j];
					copia[j] = temporal;
				}
			
			}
		}
		return copia;
	}

	public static void main (String [] args){
		int [] arreglo = {1,4,2,7,9,0,6,10,11,200,-2,-4};
		AlgoritmosOrdenamiento ao = new AlgoritmosOrdenamiento();
		ao.imprimir(arreglo);
		int [] arregloOrdenado = ao.ordernarSeleccion(arreglo);
		System.out.println("Despues de ordenar por selección:");
		ao.imprimir(arreglo);
		ao.imprimir(arregloOrdenado);

		System.out.println("Despues de ordenar por burbuja:");
		int [] arregloOrdenadoBurbuja = ao.ordenarBurbuja(arreglo);
		ao.imprimir(arreglo);
		ao.imprimir(arregloOrdenadoBurbuja);

	}


}