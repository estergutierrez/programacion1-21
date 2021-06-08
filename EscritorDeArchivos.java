import java.io.*;

public class EscritorDeArchivos{

	private BufferedWriter escritor;
	private boolean abierto;

	public EscritorDeArchivos(String ruta, boolean agregarAlFinal){
		try{
			this.escritor = new BufferedWriter(new FileWriter(ruta, agregarAlFinal)); // agregarAlFinal
			this.abierto = true;
		}
		catch(IOException e){
			this.abierto = false;
			System.err.println("Ocurrió un error al abrir el archivo: "+ruta +" "+ e);
		}
	}

	// Crear un método para abrir un archivo

	// Cerrar
	public void cerrar(){
		if(abierto){
			try{
				this.escritor.close();
			}
			catch(IOException e){
				System.err.println("Ocurrió un error al cerrar el archivo: "+ e);
			}
		}
		abierto = false;
	}

	// Escribir
	public boolean escribir(String datos){
		boolean escrito = false;
		if(abierto){
			try{
				escritor.write(datos);
				escrito = true;
			}
			catch(IOException e){
				System.err.println("Ocurrió un error al escribir el archivo: "+ e);
				abierto = false;
			}
		}
		return escrito;
	}

	public static void main (String [] args){
		EscritorDeArchivos escritor = new EscritorDeArchivos("pruebaExcel.csv", true);
		escritor.escribir("país,ciudad,cantón\n");
		escritor.escribir("Costa Rica, San José, Montes De Oca\n");
		escritor.escribir("Costa Rica, Atenas, Atenas\n");
		escritor.escribir("Costa Rica, Heredia, Belén\n");
		escritor.cerrar();
	}
}