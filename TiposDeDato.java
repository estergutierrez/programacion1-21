public class TiposDeDato{
	
	public static void main (String [] args){
		System.out.println("Programa TiposDeDato");
		int x = 12;
		int y = 5;

		System.out.println(x);
		System.out.println(y);

		x = x * 3 + y;
		// x = 12 * 3 + 5
		System.out.println(x);
		double miNumeroReal = (double)x;
		System.out.println(miNumeroReal);

		System.out.println(x/y);
		System.out.println(miNumeroReal/y);

	}

}