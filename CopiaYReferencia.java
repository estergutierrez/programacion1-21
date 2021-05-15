public class CopiaYReferencia{
	
	public void imprimir(int[] arreglo){
		for(int i = 0 ; i < arreglo.length ; i++){
			System.out.print(arreglo[i] + " ");
		}
		System.out.println();
	}

	public void sumar(int numero){
		numero = numero + 2;
		System.out.println("Dentro del método numero vale: "+ numero);
	}

	public void sumar(int[] arreglo){
		arreglo[0] += 5;
	}

	public static void main (String [] args){
		CopiaYReferencia cr = new CopiaYReferencia();
		int numero = 10;
		int [] miArreglo = {1,2,3,4,5};
		cr.sumar(numero);
		System.out.println("En el main numero vale: " + numero);

		cr.sumar(miArreglo);
		cr.imprimir(miArreglo);

	}
}