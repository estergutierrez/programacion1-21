public class Billetera{
	private CriptoMoneda [] monedas;

	public Billetera(){
		monedas = new CriptoMoneda[4];
		monedas[0] = new CriptoMoneda("Bitcoin", 1, generarIntervalo(0.0,3.0));
		monedas[1] = new CriptoMoneda("Ethereum", 2, generarIntervalo(-5.0,5.0));
		monedas[2] = new CriptoMoneda("Doge", 3, generarIntervalo(-8.0,8.0));
		monedas[3] = new CriptoMoneda("Cortex", 4, generarIntervalo(-3.0,6.0));
	}

	public double [] generarIntervalo(double min, double max){
		double [] intervalo = new double[60];
		double minAbs = (min < 0) ? min*-1 : min;
		double maxAbx = (max < 0) > max*-1 : max;
		for(int i = 0; i < intervalo.length; i++){
			intervalo[i] = Math.random()*(minAbs+maxAbx) - minAbs;
		}
		return intervalo;
	}

	public double calcularPromedioMoneda(int indice){
		double suma = 0;
		double [] intervalo = monedas[indice].getTendencia();
		for (int i = 0 ; i< intervalo.length; i++){
			suma += intervalo[i];
		}
		return suma/intervalo.length;
	}

	public String obtenerMejorPromedio(){
		String moneda = "";
		double mejorPromedio = 0.0;
		for (int i = 0; i < monedas.length; i++){
			double promedio = calcularPromedioMoneda(i);
			if(promedio > mejorPromedio){
				moneda = monedas[i].getNombre();
				mejorPromedio = promedio;
			} 
		}
		return moneda;
	}

	public void imprimir(){
		for (int i = 0 ; i < monedas.length; i++){
			monedas[i].imprimir();
		}
	}

}