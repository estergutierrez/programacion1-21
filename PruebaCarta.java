public class PruebaCarta{
	public static void main (String [] args){
		Carta carta1 = new Carta();
		carta1.setNumero(10);
		carta1.setPalo("Corazones");

		int numero1 = carta1.getNumero(); 	
		System.out.println("El número de la carta es: "+ numero1);

		String simbolo1 = carta1.getPalo();
		System.out.println("El símbolo de la carta es: "+ simbolo1);
	
		Carta carta2 = new Carta();
		int numero2 = carta2.getNumero();
		String simbolo2 = carta2.getPalo();

		System.out.println ("La carta 2 es un: "+ numero2 + " de " + simbolo2);
		System.out.println ("La carta 2 es un: "+ numero2/2 + " de " + simbolo2);

		//public Carta(int, String )
		Carta carta3 = new Carta(3, "Diamantes");
		int numero3 = carta3.getNumero();
		String simbolo3 = carta3.getPalo();
		System.out.println ("La carta 3 es un: "+ numero3 + " de " + simbolo3);


		Carta carta4 = new Carta(6, "Espadas");
		String datosCarta4 = carta4.retornarDatos();
		System.out.println(datosCarta4);

		Carta carta5 = new Carta(5, "Espadas");
		System.out.println(carta5.retornarDatos());
	}
}