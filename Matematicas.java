public class Matematicas {
	
	// 2 -> 1 2
	// 5 -> 1 5
	// 10 -> 1 10 (2 5)

	public boolean esPrimo(int numero){
		// Dividir consecutivamente
		// Si el numero es divisor invalida que sea primo
		// Sacar los pares de una vez -> Optimización
		boolean primo = (numero >= 2);
		int contador = 2;
		while(primo && contador <= numero/2){
			if(numero%contador == 0){
				primo = false;
			}
			contador++;
		}
		return primo;
	}

	public void imprimirPrimos(){
		for(int i = 2; i < 1000; i++){
			if (this.esPrimo(i)){
				System.out.println("El número "+ i +" es primo");
			}
		}
	}





	public static void main (String [] args){
		Matematicas matematicas = new Matematicas();
		System.out.println(matematicas.esPrimo(10));
		System.out.println(matematicas.esPrimo(100));
		System.out.println(matematicas.esPrimo(27));
		System.out.println(matematicas.esPrimo(5));
		System.out.println(matematicas.esPrimo(23));
		System.out.println(matematicas.esPrimo(-23));

		matematicas.imprimirPrimos();
	}


}