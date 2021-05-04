public class EstructurasRepeticion{

	public void imprimirCicloWhile(){
		System.out.println("\nInicio del ciclo while");
		int n = 2;
		while(n <= 100){
			System.out.print(n + " ");
			n += 2;
		}
		System.out.println();
		System.out.println("Fin del ciclo while");
	}

	public void imprimirDoWhile(){
		System.out.println("\nInicio del ciclo do-while");
		int n = 2;
		do {
			System.out.print(n + " "); 
			n += 2;
		} while(n <= 100);
		System.out.println("\nFin del ciclo do-while");
	}

	public void imprimirFor(){
		System.out.println("\nInicio del ciclo for");
		for (int i = 2 ; i <= 100 ; i += 2){
			System.out.print (i + " ");
		}
		System.out.println("\nFin del ciclo for");
	}

	public static void main (String [] args){
		EstructurasRepeticion instanciaRepeticion = new EstructurasRepeticion();
		instanciaRepeticion.imprimirCicloWhile();
		instanciaRepeticion.imprimirDoWhile();
		instanciaRepeticion.imprimirFor();
	}
	
	
}
