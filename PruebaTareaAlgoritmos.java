import javax.swing.JOptionPane;

public class PruebaTareaAlgoritmos{
	public static void main (String [] args){
		Calculadora calculadora1 = new Calculadora();
		Interfaz interfaz = new Interfaz ();

		//Digite el primer n\u00FAmero
		//double numero1 = (double)interfaz.solicitarNumeroReal("Digite el valor de X");
		int numero2 = interfaz.solicitarNumeroEntero("Digite el valor de N");
	
		//int resultado = calculadora1.multiplicar(numero1,numero2);
		//double resultado = calculadora1.calcularPotencia(2.0,5);
		//int resultado = calculadora1.calcularFactorial(4);
		
		//double seno = calculadora1.calcularSeno(numero1, numero2);

		//System.out.println(seno);
		//JOptionPane.showMessageDialog(null, "El area es: " + resultado, "Resultado", JOptionPane.WARNING_MESSAGE);
	
		calculadora1.imprimirNumerosArmstrong(10000000);
	}
}