public class Arreglo{

	public void imprimir(int[] arreglo){
		for(int i = 0 ; i < arreglo.length ; i++){
			System.out.print(arreglo[i] + " ");
		}
		System.out.println();
	}

	public static void main (String[] args){
		Arreglo arregloInstancia = new Arreglo();
		int [] arreglo = new int [50];
		System.out.println(arreglo);
		arregloInstancia.imprimir(arreglo);
		for(int i = 0; i < arreglo.length ; i++){
			arreglo[i] = 2 * (i+1);
		}
		arregloInstancia.imprimir(arreglo);	

		int [] arreglo2 = {10,20,30,40,50};
		arregloInstancia.imprimir(arreglo2);

		arreglo2[2] = 1337;
		arregloInstancia.imprimir(arreglo2);		
	}
}