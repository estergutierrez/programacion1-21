public class CriptoMoneda{
	
	private String nombre;
	private int popularidad;
	private double[] tendencia;

	public CriptoMoneda(String nombre, int popularidad, double[] tendencia){
		this.nombre = nombre;
		this.popularidad = popularidad;
		this.tendencia = tendencia;
	}

	public void setNumero(String nombre){
		this.nombre = nombre;
	}

	public void setPopularidad(int popularidad){
		this.popularidad = popularidad;
	}

	public void setTendencia(double [] tendencia){
		this.tendencia = tendencia;
	}

	public String getNombre(){
		return this.nombre;
	}

	public int getPopularidad(){
		return popularidad;
	}

	public double [] getTendencia(){
		return tendencia;
	}

	public void imprimir(){
		String datos = "Nombre: "+ nombre +"\nPopularidad: "+ popularidad+"\n";
		for(int i = 0; i < tendencia.length; i++){
			datos +=  tendencia[i] +" ";
		}
		System.out.println(datos);
	}
}