public class ConversorDivisas {
	
	private final double USDNIO = 36.58; // Tasa de cambio dolar/cordoba
	private final double EURNIO = 39.71; // Tasa de cambio euro/cordoba
	private final double GBPNIO = 46.44; // Tasa de cambio libra/cordoba
	private final double JPYNIO = 0.25;  // Tasa de cambio yen/cordoba
	private final double KRWNIO = 0.028; // Tasa de cambio won/cordoba
	
	// Metodo para convertir de cordobas a dolares
	public double cordobasADolar(double monto) {
		double resultado = monto / USDNIO;
		return resultado;
	}
	
	// Metodo para convertir de dolares a cordobas
	public double dolarACordobas(double monto) {
		double resultado = monto * USDNIO;
		return resultado;
	}
	
	// Metodo para convertir de cordobas a euros
	public double cordobasAEuros(double monto) {
		double resultado = monto / EURNIO;
		return resultado;
	}
	
	// Metodo para convertir de euros a cordobas
	public double eurosACordobas(double monto) {
		double resultado = monto * EURNIO;
		return resultado;
	}
	
	// Metodo para convertir de cordobas a libras
	public double cordobasALibras(double monto) {
		double resultado = monto / GBPNIO;
		return resultado;
	}
	
	// Metodo para convertir de libras a cordobas
	public double librasACordobas(double monto) {
		double resultado = monto * GBPNIO;
		return resultado;
	}
	
	// Metodo para convertir de cordobas a yenes
	public double cordobasAYenes(double monto) {
		double resultado = monto / JPYNIO;
		return resultado;
	}
	
	// Metodo para convertir de yenes a cordobas
	public double yenesACordobas(double monto) {
		double resultado = monto * JPYNIO;
		return resultado;
	}
	
	// Metodo para convertir de cordobas a wones
	public double cordobasAWones(double monto) {
		double resultado = monto / KRWNIO;
		return resultado;
	}
	
	// Metodo para convertir de wones a cordobas
	public double wonesACordobas(double monto) {
		double resultado = monto * KRWNIO;
		return resultado;
	}
	
}