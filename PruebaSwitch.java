public class PruebaSwitch{

	public static void main (String [] args){
		Interfaz interfaz = new Interfaz();
		Calculadora calculadora = new Calculadora();

		String opciones = "Digite una opcion:\n1- Convertir de kg a lbs\n2- Convertir de cm a plg";
		int valor = interfaz.solicitarNumeroEntero(opciones);
		
		switch(valor){
			case 1:
				// Ejecucion del caso de kg a lbs
				double kg = (double)(interfaz.solicitarNumeroEntero("Digite la cantidad de kg"));
				double lb = calculadora.convertirDeKgALb(kg);
				System.out.println("Resultado: "+  kg + " kilogramos son " + lb + " libras");
			break;
			case 2:
				// Ejecucion del caso de cm a plg
				double cm = (double)(interfaz.solicitarNumeroEntero("Digite la cantidad de cm"));
				double plg = calculadora.convertirDeCmAPlg(cm);
				System.out.println("Resultado: "+ cm + " centimetros son "+ plg + " pulgadas");
			break;
			default:
				// Que pasa si ningun caso anterior se cumple
				System.out.println("Opción inválida");
		}
	}
}