public class CajeroAutomatico{
	private int dineroDisponible;
	private int pin;

	public CajeroAutomatico(){
		pin = 1234;
		dineroDisponible = 100000;
	}

	public int getDineroDisponible(){
		return dineroDisponible;
	}

	public boolean verificarPin (int password){
		boolean esCorrecto = false;
		if(password == pin){
			esCorrecto = true;
		}
		return esCorrecto;
	}

	public boolean retirarDinero(int cantidad){
		boolean puedeRetirar = false;
		if (cantidad < dineroDisponible){
			puedeRetirar = true;
			dineroDisponible -= cantidad;
		}
		else{
			puedeRetirar = false;
		}
		return puedeRetirar;
	}

	// Tenemos 3 oportunidades para digitar el pin valido
	// Si se fallan las 3 veces -> se traga la tarjeta (se cierra el programa)
	// Si digita una letra indica un error -> es inválido

	public static void main (String [] args){
		CajeroAutomatico cajero = new CajeroAutomatico();
		Interfaz interfaz = new Interfaz();

		// Qué queremos repetir?
		boolean esValido = false;
		int intentosRestantes = 3;
		do{
			int pin = interfaz.solicitarNumeroEntero("Digite el pin");
			esValido = cajero.verificarPin(pin);
			intentosRestantes--;
			if(!esValido){
				System.out.println("El pin digitado es inválido, le quedan "+intentosRestantes+ " intentos restantes");
			}
		} while(!esValido && intentosRestantes > 0);

		if (esValido){
			//Digitamos el dinero
			int dineroARetirar = interfaz.solicitarNumeroEntero("Digite el monto a retirar");
			boolean tieneDinero = cajero.retirarDinero(dineroARetirar);
			if (tieneDinero){
				// Darle el dinero :)
				System.out.println("El saldo retirado es: "+ dineroARetirar);
				System.out.println("Su saldo disponible restante es: " + cajero.getDineroDisponible() );
			}
			else{
				// No tiene dinero :(
				System.out.println("No tiene dinero :(");
			}
		}
		else{
			// Mostramos error de pin
			System.out.println("Se ha excedido el número máximo de intentos permitidos");
		}
	}
}