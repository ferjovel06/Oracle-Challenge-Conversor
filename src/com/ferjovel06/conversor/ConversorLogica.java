package com.ferjovel06.conversor;

public class ConversorLogica {

	private static final double USDNIO = 36.58; // Tasa de cambio dolar/cordoba
	private static final double EURNIO = 39.71; // Tasa de cambio euro/cordoba
	private static final double GBPNIO = 46.44; // Tasa de cambio libra/cordoba
	private static final double JPYNIO = 0.25;  // Tasa de cambio yen/cordoba
	private static final double KRWNIO = 0.028; // Tasa de cambio won/cordoba
	private static final double FAHRENHEIT = 1.8;
	private static final double CELSIUS = 32;
	private static final double KELVIN = 273.15;
	private static final double KILOMETRO_METRO = 1000.0;
	private static final double METRO_CENTIMETRO = 100.0;
	private static final double CENTIMETRO_MILIMETRO = 10.0;
	private static final double PULGADA_METRO = 39.37;
	private static final double PIE_PULGADA = 12.0;

	public double convertir(double valor, double factorConversion, char tipoConversion) {
		if (tipoConversion == '*') {
			return valor * factorConversion;
		} else if (tipoConversion == '/') {
			return valor / factorConversion;
		} else {
			throw new IllegalArgumentException("El tipo de conversion debe ser '*' o '/'");
		}
	}

	public double convertirTemperatura(double valor, double factor1, double factor2, double constante) {
		return (valor - factor1) * factor2 + constante;
	}

	public double celsiusAFahrenheit(double valor) {
		return convertirTemperatura(valor, CELSIUS, FAHRENHEIT, 0);
	}

	public double fahrenheitACelsius(double valor) {
		return convertirTemperatura(valor, 0, 1 / FAHRENHEIT, CELSIUS);
	}

	public double kelvinACelsius(double valor) {
		return convertirTemperatura(valor, KELVIN, 1, 0);
	}

	public double celsiusAKelvin(double valor) {
		return convertirTemperatura(valor, 0, 1, KELVIN);
	}

	public double fahrenheitAKelvin(double valor) {
		return convertirTemperatura(valor, CELSIUS, 5.0 / 9.0, KELVIN);
	}

	public double kelvinAFahrenheit(double valor) {
		return convertirTemperatura(valor, KELVIN, FAHRENHEIT, 0);
	}

	public static double getKilometroMetro() {
		return KILOMETRO_METRO;
	}

	public static double getMetroCentimetro() {
		return METRO_CENTIMETRO;
	}

	public static double getCentimetroMilimetro() {
		return CENTIMETRO_MILIMETRO;
	}

	public static double getPulgadaMetro() {
		return PULGADA_METRO;
	}

	public static double getPiePulgada() {
		return PIE_PULGADA;
	}

	public static double getUsdnio() {
		return USDNIO;
	}

	public static double getEurnio() {
		return EURNIO;
	}

	public static double getGbpnio() {
		return GBPNIO;
	}

	public static double getJpynio() {
		return JPYNIO;
	}

	public static double getKrwnio() {
		return KRWNIO;
	}
	
}
