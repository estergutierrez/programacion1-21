public class PruebaContador{
	
	public static void main (String [] args){
		Contador contador1 = new Contador ();
		contador1.mostrarDatos();
		contador1.aumentar(); // 1
		contador1.mostrarDatos();  // 1

		contador1.aumentar(); // 2
		contador1.aumentar(); // 3
		contador1.aumentar(); // 4
		contador1.mostrarDatos();

		contador1.disminuir(); // 3
		contador1.mostrarDatos();

		contador1.restablecer();
		contador1.mostrarDatos();

		contador1.aumentarEn(18);
		contador1.mostrarDatos();

		contador1.aumentarEn(6);
		contador1.mostrarDatos();

	}

}