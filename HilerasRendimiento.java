import java.time.Instant;
import java.time.Duration;

public class HilerasRendimiento{
	
	public static void main (String args[]){
		
		SystemInfo info = new SystemInfo();
		Instant tiempoInicial = Instant.now();
		// Estática
		// String x = new String ("Hola");
		// Dinámica
		StringBuilder x = new StringBuilder("Hola");

		for (int i = 0 ; i < 100000 ; i++){
			//x+="Hola";
			x.append("Hola");
		}

		Instant tiempoFinal = Instant.now();
		long tiempoTranscurrido = Duration.between(tiempoInicial, tiempoFinal).toMillis();
		System.out.println("Tiempo: " + tiempoTranscurrido/1000.0 + " segundos");
		System.out.println("Tam String: " + x.length());
		System.out.println(info.MemInfo());
	}

}