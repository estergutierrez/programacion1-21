public class Contador {

	private int valor;

	public Contador(){
		valor = 0;
	}

	public void aumentar(){
		valor = valor + 1;
	}

	public void disminuir(){
		valor = valor - 1;
	}

	public void mostrarDatos(){
		System.out.println("Contador: "+ valor);
	}

	public void restablecer(){
		valor = 0;
	}

	public void aumentarEn(int numero){
		valor = valor + numero;
	}

	// Agregar método que permita duplicar el valor del contador
	// Agregar método que permita disminuirEn N cantidad

}