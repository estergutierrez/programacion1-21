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
		int numero = 0;
		boolean esValido = true;
		do{
			String numeroHilera = JOptionPane.showInputDialog(titulo);
			try{
				numero = Integer.parseInt(numeroHilera);
				esValido = true;
			}
			catch(NumberFormatException e){
				esValido = false;
				System.err.println("El valor digitado no es un número");
				JOptionPane.showMessageDialog(
					null, 
					"El valor digitado no es un n\u00FAmero", 
					"Error", 
					JOptionPane.ERROR_MESSAGE);
			}
		}while(!esValido);
		return numero;
	}

	public double solicitarNumeroReal(String titulo){
		
		double numero = 0;
		boolean esValido = true;
		do{
			String numeroHilera = JOptionPane.showInputDialog(titulo);
			try{
				numero = Double.parseDouble(numeroHilera);
				esValido = true;
			}
			catch(NumberFormatException e){
				esValido = false;
				System.err.println("El valor digitado no es un número");
				JOptionPane.showMessageDialog(
					null, 
					"El valor digitado no es un n\u00FAmero", 
					"Error", 
					JOptionPane.ERROR_MESSAGE);
			}
		}while(!esValido);
		return numero;
	}

}