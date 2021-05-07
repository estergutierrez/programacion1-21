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


	public double calcularPotencia(double base, int exponente){
		double contador = 1;
		double resultado = 1;
		while(contador <= exponente){
			resultado *= base;
			contador++;
		}
		return resultado;
	}

	public int calcularFactorial(int numero){
		int resultado = 1;
		for (int i = 1; i <= numero; i++){
			resultado *= i;
		}
		return resultado;
	}

	public double calcularSeno(double x, int n){
		int contador = 1;
		double resultado = 0;
		int signo = 1;
		if(n%2==0){
			n++;
		}
		while(contador <= n){
			double numerador = calcularPotencia(x,contador);
			int denominador = calcularFactorial(contador);
			double fraccion = numerador/denominador * signo;
			resultado += fraccion;
			signo *= -1;
			contador += 2;
		}
		return resultado;
	}

	public int obtenerCantidadeDigitos(int numero){
		int cantidad = 0;
		while(numero != 0){
			cantidad++;
			numero = numero / 10;
		}
		return cantidad;
	}

	public boolean calcularArmstrong(int numero){
		int cantidad = obtenerCantidadeDigitos(numero);
		int numeroTemporal = numero;
		int resultado = 0;
		while(numeroTemporal != 0){
			int digito = numeroTemporal % 10;
			resultado += calcularPotencia(digito, cantidad);
			numeroTemporal /= 10;
		}
		return numero == resultado;
	}

	public void imprimirNumerosArmstrong(int limiteSuperior){
		for (int i = 1; i<=limiteSuperior; i++){
			if (calcularArmstrong(i)){
				System.out.println("El número " + i + " es de Armstrong");
			}
		}
	}

}