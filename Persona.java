public class Persona
{
	// Atributos nombre y una edad
	private String nombre;
	private int edad;

	// Métodos:

	// Asignación de nombre y edad
	// Saludar
	// 1.public o private -> acceso desde instancia (usualmente publico)
	// 2.Qué devuelve el método?
	// 3.Nombre o identificador del método -> acción -> verbo
	// 4.Parámetros -> qué necesita el método para funcionar

	// void significa que el método no va a retornar un resultado
	public void bautizar(String nombreParametro, int edadParametro){
		nombre = nombreParametro;
		edad = edadParametro;
	}

	public void saludar(){
		String datosDeLaPersona = "Hola me llamo " + nombre +" y tengo " + edad + " años"; 
		System.out.println(datosDeLaPersona);
	}

}