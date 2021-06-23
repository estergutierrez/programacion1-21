public class ListaSimplementeEnlazada{

	private Nodo primero; // Puntero al primero nodo de la lista

	// Necesitamos un nodo
	private class Nodo{// Contiene el valor y el puntero al siguiente nodo
		private int valor;
		private Nodo siguiente;

		public Nodo(int valor){
			this.valor = valor;
			this.siguiente = null;
		}

		public String toString(){
			return "Nodo: "+ this.valor;
		}
	}

	public ListaSimplementeEnlazada(){
		primero = null;
	}

	public void agregarAlInicio(int elemento){
		// 1 Creamos nodo
		// 2 Agregar el siguiente al nodo que creamos
		// 3 Actualizar el primer elemento
		Nodo nuevo = new Nodo(elemento);
		Nodo primeroViejo = this.primero;
		nuevo.siguiente = primeroViejo;
		this.primero = nuevo;
	}

	public void agregarAlFinal(int elemento){
		Nodo nuevo = new Nodo(elemento);
		if(this.primero == null){
			this.primero = nuevo;
		}
		else{ // Iterar hasta el último elemento de la lista y actualizar el siguiente
			Nodo actual = this.primero;
			while(actual.siguiente != null){
				actual = actual.siguiente;
			}
			actual.siguiente = nuevo;
		}
	}

	public Nodo buscarAnterior(int posicion){
		int posicionActual = 0;
		Nodo actual = this.primero;
		while(posicionActual+1 != posicion && actual != null){
			posicionActual++;
			actual = actual.siguiente;
		}
		return actual;
	}

	public boolean insertar(int posicion, int elemento){
		boolean insertado = false;
		// Insertar al inicio
		if(posicion == 0){
			this.agregarAlInicio(elemento);
			insertado = true;
		}
		// Un elemento a la mitad
		// Un elemento al final
		else if(posicion > 0 && this.primero != null){
			Nodo anterior = this.buscarAnterior(posicion);
			if(anterior != null){
				Nodo nuevo = new Nodo(elemento);
				nuevo.siguiente = anterior.siguiente;
				anterior.siguiente = nuevo;
				insertado = true;
			}
		}
		return insertado;
	}

	public boolean borrar(int posicion){
		// Casos para borrar un nodo:
		// Si es el primer elemento (0) -> necesitamos actualizar el puntero al inicio
		// Si es un nodo intermedio
		// Si es un nodo final o terminal
		boolean borrado = false;
		if(posicion >= 0 && this.primero != null){
			if (posicion == 0){ // El primer elemento
				Nodo temporal = this.primero;
				this.primero = this.primero.siguiente;
				temporal.siguiente = null;
				temporal = null;
				borrado = true;
			}
			else{
				Nodo actual = this.buscarAnterior(posicion);
				if(actual != null){
					Nodo borrar = actual.siguiente;
					if(borrar == null || borrar.siguiente == null){ // Si es un nodo final o terminal
						actual.siguiente = null;
						borrar = null;
						borrado = true;
					}
					else{ // Si es un nodo intermedio
						actual.siguiente = borrar.siguiente;
						borrar.siguiente = null;
						borrar = null;
						borrado = true;
					}
				}
			}
		}
		return borrado;	
	}

	public String toString(){
		String contenido = "";
		Nodo actual = this.primero;
		while(actual != null){
			String valor = actual.toString();
			contenido += valor + "\n";
			actual = actual.siguiente;
		}
		return contenido;
	}



	public static void main (String [] args){
		ListaSimplementeEnlazada lista = new ListaSimplementeEnlazada();
		lista.agregarAlInicio(10);
		lista.agregarAlInicio(9);
		lista.agregarAlInicio(8);
		lista.agregarAlInicio(7);
		lista.agregarAlInicio(6);
		System.out.print(lista);
		lista.agregarAlFinal(11);
		System.out.println("- - - - ");
		System.out.print(lista);

		System.out.println("- - - - ");
		lista.borrar(0);
		System.out.print(lista);

		System.out.println("- - - - ");
		lista.borrar(5);
		System.out.print(lista);

		System.out.println("- - - - ");
		lista.borrar(1);
		System.out.print(lista);
	}

	// Programe un método que permita asignar un valor a un nodo
	
}