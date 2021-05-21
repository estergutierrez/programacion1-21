public class OperadorTernario{
	
	public static void main (String [] args){

		boolean condicion = true;
		String resultado = "";
		if(condicion){
			resultado = ("Si");
		}
		else{
			resultado = ("No");
		}
		System.out.println(resultado);
		// Operador ternario
		// variable = condicionBooleana ? Que asigno si verdadero : Que asigno si es falso
		resultado = (condicion) ? "Si" : "No";
		System.out.println(resultado);


	}


}