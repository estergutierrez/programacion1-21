public class Automovil {

/*
- aceleracion
- velocidadActual
- estado
- marchaActual

+ encender()
+ apagar()
+ cambiarMarcha(recibe la marcha)
+ acelerar() -> acelera en 12 ,tiempo = 1
+ frenar() -> frena en 8, tiempo 0.875
+ acelerar ( recibe la aceleracion, tiempo en segundos)
*/

	private double aceleracion;
	private int velocidadActual;
	private boolean estado;
	private char marchaActual;
	private double tiempo;

	public void encender(){
		estado = true;
	}

	public void apagar(){
		estado = false;
	}

	public void cambiarMarcha(char nuevaMarcha){
		marchaActual = nuevaMarcha;
	}

	public void acelerar(){
		aceleracion = aceleracion + 12;
		tiempo = tiempo + 1;
		velocidadActual = (int) (velocidadActual + aceleracion * tiempo); // truncar (NO redondea)
	}

	public void acelerar(double aceleracion, double tiempo){
		this.aceleracion = this.aceleracion + aceleracion;
		this.tiempo = this.tiempo + tiempo;
		velocidadActual = (int)(velocidadActual + this.aceleracion * this.tiempo);
	}

	public void frenar(){
		aceleracion = aceleracion - 8;
		tiempo = tiempo + 0.875;
		velocidadActual = (int)(velocidadActual + -8 * tiempo);
	}

	public double getAceleracion(){
		return aceleracion;
	}

	public int getVelocidad(){
		return velocidadActual;
	}

	public char getMarchaActual(){
		return marchaActual;
	}

	public boolean getEstado(){
		return estado;
	}

	public double getTiempo(){
		return tiempo;
	}

	public static void main(String [] args){
		Automovil auto1 = new Automovil();
		auto1.encender();
		auto1.cambiarMarcha('1');
		auto1.acelerar();
		System.out.println("Aceleracion: " + auto1.getAceleracion());
		System.out.println("Velocidad: " + auto1.getVelocidad());
		auto1.acelerar();
		System.out.println("Aceleracion: " + auto1.getAceleracion());
		System.out.println("Velocidad: " + auto1.getVelocidad());
		auto1.frenar();
		System.out.println("Aceleracion: " + auto1.getAceleracion());
		System.out.println("Velocidad: " + auto1.getVelocidad());
		auto1.acelerar(1.9876, 0.58473);
		System.out.println("Aceleracion: " + auto1.getAceleracion());
		System.out.println("Velocidad: " + auto1.getVelocidad());
		auto1.apagar();
	}
	
}