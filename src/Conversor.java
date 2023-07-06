public class Conversor {
	
	private final double USDNIO = 36.58;
	private final double EURNIO = 39.71;
	private final double GBPNIO = 46.44;
	private final double JPYNIO = 0.25;
	private final double KRWNIO = 0.028;
	
	public double cordobasADolar(double monto) {
		double resultado = monto / USDNIO;
		return resultado;
	}
	
	public double dolarACordobas(double monto) {
		double resultado = monto * USDNIO;
		return resultado;
	}
	
	public double cordobasAEuros(double monto) {
		double resultado = monto / EURNIO;
		return resultado;
	}
	
	public double eurosACordobas(double monto) {
		double resultado = monto * EURNIO;
		return resultado;
	}
	
	public double cordobasALibras(double monto) {
		double resultado = monto / GBPNIO;
		return resultado;
	}
	
	public double librasACordobas(double monto) {
		double resultado = monto * GBPNIO;
		return resultado;
	}
	
	public double cordobasAYenes(double monto) {
		double resultado = monto / JPYNIO;
		return resultado;
	}
	
	public double yenesACordobas(double monto) {
		double resultado = monto * JPYNIO;
		return resultado;
	}
	
	public double cordobasAWones(double monto) {
		double resultado = monto / KRWNIO;
		return resultado;
	}
	
	public double wonesACordobas(double monto) {
		double resultado = monto * KRWNIO;
		return resultado;
	}
	
}