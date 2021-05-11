public class Arreglo{
	public static void main (String[] args){
		int [] datos = new int [10];
		for (int i = 0 ; i < 10 ; i++){
			datos[i] = i+1;
		}

		for (int celda : datos){
			System.out.println(celda);
		}
	}
}