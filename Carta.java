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

	public String retornarDatos(){
		String datos = "La carta es: " + numero + " de " + palo;
		return datos;
	}

}