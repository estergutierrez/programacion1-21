public class HilerasDeCaracteres{
	public static void main (String [] args){
		System.out.println("Ejemplo de creación");
		String hilera = "Hola mundo bonito";
		String hilera2 = new String ("Hola mundo");

		System.out.println(hilera);
		System.out.println(hilera2);

		System.out.println("Ejemplo de indexOf");
		int indice = hilera.indexOf("mun");
		System.out.println(indice);	
		indice = hilera.indexOf("adiós");
		System.out.println(indice);	
		indice = hilera.indexOf("hola");
		System.out.println(indice);	

		System.out.println("Ejemplo de split 1");
		String hilera3 = "Esto es un ejemplo de hilera de caracteres";
		String [] partes = hilera3.split(" ");	
		for (int i = 0 ; i < partes.length; i++){
			System.out.println(i + "-" + partes[i]);
		}
		System.out.println("Ejemplo de split 2");
		partes = hilera3.split("de");	
		for (int i = 0 ; i < partes.length; i++){
			System.out.println(i + "-" +  partes[i]);
		}
		System.out.println("Ejemplo de split 3");
		partes = hilera3.split("\n");	
		for (int i = 0 ; i < partes.length; i++){
			System.out.println(i + "-" +partes[i]);
		}


		String h1 = "AbEcEdaRiO";
		String h2 = "Arbol";
		String h3 = "Casa";
		String h4 = "Casas";
		String h5 = "casa";
		String h6 = "        Hola m uuu   nnn  dd oooo         ";

		System.out.println("h1.compareTo(h2) "+h1.compareTo(h2));
		System.out.println("h3.compareTo(h4) "+h3.compareTo(h4));
		System.out.println("h4.compareTo(h1) "+h4.compareTo(h1));
		System.out.println("h4.compareTo(h4) "+h4.compareTo(h4));

		System.out.println("h3.equals(h4) "+h3.equals(h4));
		System.out.println("h3.equals(h5) "+h3.equals(h5));
		System.out.println("h3.equalsIgnoreCase(h5): "+h3.equalsIgnoreCase(h5));

		System.out.println("h3.toUpperCase() " + h3.toUpperCase());
		System.out.println("h1.toLowerCase() " + h1.toLowerCase());

		System.out.println("h6.trim() \"" + h6.trim()+"\"");

		System.out.println(hilera.substring(8));
		System.out.println(hilera.substring(4,9));

	}
}