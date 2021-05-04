public class Carta {

	// Atributos de clase
	private int numero; // numero de tipo entero
	private String palo;

	public Carta(){
		numero = 7;
		palo = "Tréboles";
	}

	public Carta(int numeroParametro, String paloParametro){
		numero = numeroParametro;
		palo = paloParametro;
	}

	public void setNumero(int numeroParametro){
		numero = numeroParametro;
	}

	public void setPalo(String paloParametro){
		palo = paloParametro;
	}

	public int getNumero(){
		return numero;
	}

	public String getPalo(){
		return palo;
	}

	public String convertirNumero(){
		String dato= "";
		switch(this.numero){
			case 11:
				dato = "J";
			break;
			case 12:
				dato = "Q";
			break;
			case 13:
				dato = "K";
			break;
			case 1:
				dato = "As";
			break;
			default:
				dato += numero;
		}
		return dato;
	}

	public String retornarDatos(){
		String datos = "La carta es: " + convertirNumero() + " de " + palo;
		return datos;
	}

}