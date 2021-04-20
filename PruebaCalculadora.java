import javax.swing.JOptionPane;

public class PruebaCalculadora{
	public static void main (String [] args){
		Calculadora calculadora1 = new Calculadora();
		Interfaz interfaz = new Interfaz ();

		//Digite el primer n\u00FAmero
		int numero1 = interfaz.solicitarNumeroEntero("Digite el largo del rectángulo");
		int numero2 = interfaz.solicitarNumeroEntero("Digite el ancho del rectángulo");
	
		int resultado = calculadora1.multiplicar(numero1,numero2);
		System.out.println(resultado);
		JOptionPane.showMessageDialog(null, "El area es: " + resultado, "Resultado", JOptionPane.WARNING_MESSAGE);
	}
}