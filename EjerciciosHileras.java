/*
AnÃ­ta lava la tina

=> Convertir todo a minÃºsculas/mayÃºsculas
anÃ­ta lava la tina

=> Quitemos espacios en blanco

anÃ­talavalatina

=> Remover acentos

anitalavalatina
|             |
 |           |
  |         |
   |       |
    |     |
     |   |
      | |
       |

*/



public class EjerciciosHileras{

	public String removerAcentosYEspacios(String frase){
		String [] letraBuscada = {" ", ",", ".", ":", "á", "é", "í", "ó", "ú", "ñ"};
		String [] reemplazo    = {"",  "",  "",  "",  "a", "e", "i", "o", "u", "n"};
		for (int i = 0; i< letraBuscada.length; i++){
			frase = frase.replace(letraBuscada[i], reemplazo[i]);
		}
		return frase;	
	}

	public String removerAcentos(String frase){
		String [] letraBuscada = {"á", "é", "í", "ó", "ú"};
		String [] reemplazo    = {"a", "e", "i", "o", "u"};
		for (int i = 0; i< letraBuscada.length; i++){
			frase = frase.replace(letraBuscada[i], reemplazo[i]);
		}
		return frase;	
	}

	public boolean esPalindromo(String frase){
		boolean palindromo = true;
		frase = frase.toLowerCase();
		frase = removerAcentosYEspacios(frase);
		int i = 0;
		while(i <= frase.length()/2 && palindromo){
			if(frase.charAt(i) != frase.charAt(frase.length()-1-i)){
				//frase.charAt(i) => 'a'
				palindromo = false;
			}
			i++;
		}
		return palindromo;
	}

	public boolean esPalindromoV2(String frase){
		// damos la vuelta al string
		// comparacion de strings
		frase = removerAcentosYEspacios(frase);
		frase = frase.toLowerCase();
		String inverso = "";
		for(int i = 0; i < frase.length() ; i++){
			inverso += frase.charAt(frase.length()-1-i);
		}
		return inverso.equals(frase);
	}

	public int calcularVocalesConsecutivasMaxima(String frase){
		// como saber si es vocal?
		// como saber si es consecutiva?
		// arreglo con vocales, comparamos letra con el arreglo
		// String con las vocales y comparamos como si fuera un arreglo
		// ciclo que itera por la frase, si encuentra una vocal activa el contador
		frase = removerAcentos(frase);
		int cantidadMaxima = 0;
		int cantidadActual = 0;
		for (int i = 0 ; i < frase.length() ; i++){
			if("aeiou".contains(""+frase.charAt(i))){
				// Es una vocal
				cantidadActual++;
				if(cantidadActual > cantidadMaxima)
					cantidadMaxima = cantidadActual;
				
			}
			else{
				cantidadActual = 0;
			}
		}
		return cantidadMaxima;
	}

	public static void main (String [] args){
		EjerciciosHileras eh = new EjerciciosHileras();
		eh.esPalindromoV2("Anítá lava la ina");

		//indexOf contains
		System.out.println("aeiou".indexOf("k"));
		System.out.println("aeiou".contains("" + 'a'));
	}
}