/*
#En una clase llamada Calculadora, programe un método que sea capaz de 
#recibir un número real por parámetro y retorne su parte decimal. 
#Por ejemplo si el método recibe por parámetro 3.1458, retornará 0.1458. 
#Utilice un nombre significativo para nombrar a su método


#En una clase llamada calculadora, programe un método que permita calcular la sucesión de números:
#x^1+x^2+...+x^n
#En donde el número n será un número entero hasta el cual deseamos calcular 
#la  sucesión y x será el número base.
#El método deberá recibir por parámetro los valores de x y n (números enteros) 
#y retornar el resultado de la sucesión.
#Deberá validar que el valor ingresado sea un número entero positivo.
#Por ejemplo, si se recibe x como 2 y n como 3, el método retornará: 14
*/

public class Quiz3{

	public double obtenerParteDecimal(double numero){
		return numero - (int)(numero);
	}

	public int calcularExponente(int base, int exponente){
		int resultado = 1;
		for(int i = 0; i < exponente; i++){
			resultado *= base;
		}
		return resultado;
	}

	public int calcularSucesion(int x, int n){
		int resultado = 0;
		for(int i=1; i <= n ; i++){
			resultado += calcularExponente(x,i);
		}
		return resultado;
	}



}