public class PruebaIf{
	public int buscarMenor (int a, int b, int c){
		int menor = a;
		if( a < b && a < c){
			menor = a;
		}
		else{
			if (b < c){
				menor = b;
			}
			else{
				menor = c;
			}
		}
		return menor;
	}

	public static void main(String args[]){
		PruebaIf prueba = new PruebaIf();
		Interfaz interfaz = new Interfaz();
		int numero1 = interfaz.solicitarNumeroEntero("Digite el primer valor");
		int numero2 = interfaz.solicitarNumeroEntero("Digite el segundo valor");
		int numero3 = interfaz.solicitarNumeroEntero("Digite el tercer valor");
		int valorMenor = prueba.buscarMenor(numero1,numero2,numero3);
		String mensajeSalida = "El valor menor es: "+ valorMenor;
		System.out.println(mensajeSalida);
		interfaz.mostrarMensaje(mensajeSalida);
	}
}