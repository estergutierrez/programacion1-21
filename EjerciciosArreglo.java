public class EjerciciosArreglo{
	
	public void imprimir(int[] arreglo){
		for(int i = 0 ; i < arreglo.length ; i++){
			System.out.print(arreglo[i] + " ");
		}
		System.out.println();
	}

	public int buscarMayor(int[]arreglo){
		int mayor = arreglo[0];
		for (int i = 1; i < arreglo.length; i++){
			if(mayor < arreglo[i]){ // Encontramos un nuevo mayor
				mayor = arreglo[i];
			}
		}
		return mayor;
	}
}