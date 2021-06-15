public class Recursividad{

	public int calcularSumatoria(int n){
		int resultado = 0;

		if(n == 0){ // Caso base (trivial)
			resultado = 0;
		}
		else if (n > 0){ // Caso recursivo(s)
			resultado = n + calcularSumatoria(n-1);
		}
		
		return resultado;
	}

	//		   n: 0 1 2 3 4 5 6 7  8  9
	// Secuencia: 0 1 1 2 3 5 8 13 21 34

	// f(0) = 0
	// f(1) = 1
	// f(n) = f(n-1) + f(n-2)


	public int calcularFibonacci(int n){
		int resultado = 0;
		// hay que pensar en casos base o trivales
		if(n == 0){ // cuando n vale 0
			resultado = 0;
		}
		else if(n==1){ //cuando n vale 1
			resultado = 1;
		}
		else if (n>1){
			resultado = calcularFibonacci(n-1) + calcularFibonacci(n-2);
		}
		// casos recursivos
		return resultado;
	}


	public static void main (String [] args){
		Recursividad instanciaRecursividad = new Recursividad();
		int sumatoria = instanciaRecursividad.calcularSumatoria(5);
		System.out.println("La sumatoria de 5 es: "+ sumatoria);

		int fibonacci = instanciaRecursividad.calcularFibonacci(50);
		System.out.println("El fibonacci es: " + fibonacci);
	}
}