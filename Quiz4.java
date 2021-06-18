public class Quiz4{
	

	/*
	 Dado un arreglo de valores enteros, 
	 programe un método que determine si existe un punto en el
	 que se pueda realizar una partición del mismo en donde la 
	 suma de elementos de un lado sea igual a la del otro.
  	
  	 sePuedeBalancear([1, 1, 1, 2, 1]) → true
  	 sePuedeBalancear([2, 1, 1, 2, 1]) → false
	*/

  	public boolean sePuedeBalancear(int [] arreglo){
  		int suma = 0;
  		int total = 0;
  		for (int i = 0;i<arreglo.length;i++){
  			total += arreglo[i];
  		}

  		double mitad = total/2.0;
  		int celda = 0;
  		while(suma < mitad){
  			suma += arreglo[celda];
  			celda++;
  		}

  		return suma == mitad;
  	}

  	/*
	Programe un método que tome un String recibido por parámetro 
	y lo modifique reemplazando cada letra por la siguiente en el alfabeto 
	(e.g una ‘c’ se convierte en ‘d’, una ‘z’ se convierte en ‘a’). 
	Convierta a mayúscula cada vocal y minúscula las consonantes. 
	Por ejemplo si se recibe:
	
  	*/

  	public String convertirHilera(String entrada){
  		entrada = entrada.toLowerCase(); // Convertimos todas las letras a minúsculas
  		String letras = "abcdefghijklmnopqrstuvwxyz";
  		for(int i = 0 ; i< entrada.length();i++){ // Recorremos cada letra en la hilera
  			int posicionEnLetras = (letras.indexOf(""+entrada.charAt(i))); // Buscamos la posicion en letras
  			if (posicionEnLetras != -1){// Verificamos si es una letra para realizar el corrimiento
  				// Creamos una hilera con la unión de la nueva letra junto a la primera y última parte
  				entrada = entrada.substring(0,i)+ letras.charAt((posicionEnLetras+1)%letras.length()) + entrada.substring(i+1);
  			}
  		}
  		String vocales = "aeiou";
  		for(int i = 0 ; i< vocales.length();i++){ //Realizamos un reemplazo de las vocales por mayúsculas
  			entrada = entrada.replace(""+vocales.charAt(i), (""+vocales.charAt(i)).toUpperCase());
  		}
  		return entrada;
  	}


  	public static void main (String [] args){
  		Quiz4 quiz = new Quiz4();
  		int [] arreglo  = {1, 1, 1, 2, 1};
  		int [] arreglo2 = {2, 1, 1, 2, 1};
  		System.out.println(quiz.sePuedeBalancear(arreglo));
  		System.out.println(quiz.sePuedeBalancear(arreglo2));
  		System.out.println(quiz.convertirHilera("Hola Mundo*3"));
  	}
}