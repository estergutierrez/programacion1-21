import javax.swing.JOptionPane;

public class PruebaCalculadora{
	public static void main (String [] args){
		Calculadora calculadora1 = new Calculadora();





		System.out.println(calculadora1.multiplicar(5,6));
		JOptionPane.showMessageDialog(null, "El resultado es: " + calculadora1.multiplicar(5,6), "Resultado", JOptionPane.WARNING_MESSAGE);
	}
}