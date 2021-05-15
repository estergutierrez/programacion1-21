public class ArgumentosConsola{
	public static void main(String [] args){
		Calculadora c1 = new Calculadora();
		for (String argumento : args){
			int numero = Integer.parseInt(argumento);
			int resultado = c1.calcularFactorial(numero);
			System.out.println("El factorial de "+ numero + " es "+ resultado);
		}
	}
}