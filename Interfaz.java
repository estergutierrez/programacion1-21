import javax.swing.JOptionPane;

public class Interfaz {

	public String solicitarUnaHilera(String titulo){
		String hilera = JOptionPane.showInputDialog(titulo);
		return hilera;
	}

	public void mostrarMensaje(String contenido){
		JOptionPane.showMessageDialog(null, contenido );
	}
	
	public int solicitarNumeroEntero(String titulo){
		String numeroHilera = JOptionPane.showInputDialog(titulo);
		int numero = 0;
		try{
			numero = Integer.parseInt(numeroHilera);
		}
		catch(NumberFormatException e){
			System.err.println("El valor digitado no es un número");
			JOptionPane.showMessageDialog(
				null, 
				"El valor digitado no es un n\u00FAmero", 
				"Error", 
				JOptionPane.ERROR_MESSAGE);
		}
		return numero;
	}

	// Agregar método solicitar números reales al usuario

}