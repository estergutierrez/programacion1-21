import java.io.*;
public class LectorDeArchivos{
	// Abrir
	// Leer (una línea o el archivo completo)
	// Cerrar
	public BufferedReader lector;
	public boolean abierto;

	public LectorDeArchivos(String ruta){
		try{
			lector = new BufferedReader(new FileReader(ruta));
			abierto = true;
		}
		catch(IOException e){
			abierto = false;
			System.err.println("@Lector: Ocurrió un error al abrir el archivo " + e);
		}
	}

	public void cerrar(){
		if(abierto){
			try{
				lector.close();
			}
			catch(IOException e){
				System.err.println("@Lector: Ocurrió un error al cerrar el archivo " + e);
			}
		}
		abierto = false;
	}

	public String leerArchivo(){
		String contenido = "";
		if(abierto){
			String linea = "";
			while((linea = leerLinea()) != null){
				contenido += linea;
				contenido += "\r\n";
			}
		}
		return contenido;
	}


	public String leerLinea(){
		String linea = null;
		if(abierto){
			try{
				linea = lector.readLine();
			}
			catch(IOException e){
				abierto = false;
				System.err.println("@Lector: Ocurrió un error al leer el archivo " + e);
			}
		}
		return linea;
	}

	public static void main (String [] args){
		LectorDeArchivos lector = new LectorDeArchivos("pruebaExcel.csv");
		System.out.println(lector.leerArchivo());
		/*
		String linea = "";
		while(linea != null){
			linea = lector.leerLinea();
			System.out.println(linea);
		}*/
		
		lector.cerrar();
	}
}