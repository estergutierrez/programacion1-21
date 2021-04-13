public class PruebaPersona{
	public static void main(String[] args){
		Persona persona1 = new Persona();
		persona1.bautizar("Brenda", 18);
		persona1.saludar();

		Persona persona2 = new Persona();
		persona2.bautizar("Justin", 24);
		persona2.saludar();
	}
}