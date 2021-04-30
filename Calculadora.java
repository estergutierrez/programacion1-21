public class Calculadora{
	
	public double multiplicar(double valor1, double valor2){
		double resultado = valor2 * valor1;
		System.out.println("multiplicar(double , double )");
		return resultado;
	}

	public int multiplicar(int valor1, int valor2){
		System.out.println("multiplicar(int , int )");
		return valor1*valor2;
	}

	public double multiplicar(double valor1, int valor2){
		System.out.println("multiplicar(double , int )");
		return valor1*valor2;
	}

	public double multiplicar(int valor1, int valor2, int valor3){
		System.out.println("multiplicar(int , int, int)");
		return valor1*valor2*valor3;
	}

	public double convertirDeCmAPlg(double cm){
		return cm / 2.54;
	}

	
	public double convertirDeKgALb(double kg){
		double lb = kg * 2.204623;
		return lb;
	}



	// Modificar para agregar suma, resta y division de números reales

}