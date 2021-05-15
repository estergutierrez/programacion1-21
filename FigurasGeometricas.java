public class FigurasGeometricas{
	
	public String imprimirRombo(int lineaMedia){
		String resultado = "";
		for (int i = 0 ; i <= lineaMedia/2 ; i++){
			String asteriscos = "* ";
			int contador = lineaMedia/2 - i;
			for (int espacios = 0 ; espacios < contador  ; espacios++){
				resultado += "  ";
			}
			for (int j = 0; j < (2*i+1); j++){
				resultado += "* ";	
			}
			
			resultado +="\n";
		}
		return resultado;
	}

	public static void main (String [] args){
		FigurasGeometricas fg = new FigurasGeometricas();
		System.out.println(fg.imprimirRombo(5));
	}
}