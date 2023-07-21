package com.ferjovel06.conversor;

/**
 * Clase que proporciona métodos para realizar conversiones de divisas, temperaturas y unidades de longitud.
 * Las conversiones de divisas se realizan utilizando tasas de cambio predefinidas,
 * mientras que las conversiones de temperatura y longitud utilizan fórmulas específicas.
 * @author ferjovel
 *
 */
public class ConversorLogica {
	// Constantes de tasas de cambio para divisas
	private static final double USDNIO = 36.58; // Tasa de cambio dolar/cordoba
	private static final double EURNIO = 39.71; // Tasa de cambio euro/cordoba
	private static final double GBPNIO = 46.44; // Tasa de cambio libra/cordoba
	private static final double JPYNIO = 0.25;  // Tasa de cambio yen/cordoba
	private static final double KRWNIO = 0.028; // Tasa de cambio won/cordoba
	
	// Factores de conversion para temperaturas
	private static final double FAHRENHEIT = 1.8;
	private static final double CELSIUS = 32;
	private static final double KELVIN = 273.15;
	
	// Factores de conversion para longitud
	private static final double KILOMETRO_METRO = 1000.0;
	private static final double METRO_CENTIMETRO = 100.0;
	private static final double CENTIMETRO_MILIMETRO = 10.0;
	private static final double PULGADA_METRO = 3.281;
	private static final double PIE_PULGADA = 12.0;

	/**
	 * Realiza las conversiones de divisas y unidades de longitud
	 * @param valor El valor que se desea convertir
	 * @param factorConversion El factor de conversion a aplicar
	 * @param tipoConversion El tipo de conversion que puede ser '*' o '/'
	 * @return El resultado de la conversion
	 * @throws IllegalArgumentException Si el tipo de conversion no es '*' o '/'
	 */
	public double convertir(double valor, double factorConversion, char tipoConversion) {
		if (tipoConversion == '*') {
			return valor * factorConversion;
		} else if (tipoConversion == '/') {
			return valor / factorConversion;
		} else {
			throw new IllegalArgumentException("El tipo de conversion debe ser '*' o '/'");
		}
	}

	/**
	 * Funcion base para realizar las conversiones de Temperatura
	 * @param valor El valor de la temperatura a convertir
	 * @param factor1 Primer factor de conversion
	 * @param factor2 Segundo factor de conversion
	 * @param constante Constante añadida al resultado final de la conversion
	 * @return El valor de la temperatura convertido
	 */
	private double convertirTemperatura(double valor, double factor1, double factor2, double constante) {
		return (valor - factor1) * factor2 + constante;
	}

	/**
	 * Convierte grados Celsius a grados Fahrenheit.
	 * @param valor El valor en grados Celsius a convertir.
	 * @return El valor equivalente en grados Fahrenheit.
	 */
	public double celsiusAFahrenheit(double valor) {
		return convertirTemperatura(valor, CELSIUS, FAHRENHEIT, 0);
	}

	/**
	 * Convertir grados Fahrenheit a grados Celsius
	 * @param valor El valor en grados Fahrenheit a convertir.
	 * @return El valor equivalente en grados Celsius
	 */
	public double fahrenheitACelsius(double valor) {
		return convertirTemperatura(valor, 0, 1 / FAHRENHEIT, CELSIUS);
	}

	/**
	 * Convertir de grados Kelvin a grados Celsius
	 * @param valor El valor en grados Kelvin a convertir.
	 * @return El valor equivalente en grados Celsius
	 */
	public double kelvinACelsius(double valor) {
		return convertirTemperatura(valor, KELVIN, 1, 0);
	}

	/**
	 * Convertir de grados Celsius a grados Kelvin
	 * @param valor El valor en grados Celsius a convertir.
	 * @return El valor equivalente en grados Kelvin
	 */
	public double celsiusAKelvin(double valor) {
		return convertirTemperatura(valor, 0, 1, KELVIN);
	}

	/**
	 * Convertir de grados Fahrenheit a grados Kelvin
	 * @param valor El valor en grados Fahrenheit a convertir.
	 * @return El valor equivalente en grados Kelvin
	 */
	public double fahrenheitAKelvin(double valor) {
		return convertirTemperatura(valor, CELSIUS, 5.0 / 9.0, KELVIN);
	}

	/**
	 * Convertir de grados Kelvin a grados Fahrenheit
	 * @param valor El valor en grados Kelvin a convertir.
	 * @return El valor equivalente en grados Fahrenheit
	 */
	public double kelvinAFahrenheit(double valor) {
		return convertirTemperatura(valor, KELVIN, FAHRENHEIT, 0);
	}

	/**
	 * 
	 * @return El factor de conversion de Kilometros a Metros
	 */
	public static double getKilometroMetro() {
		return KILOMETRO_METRO;
	}

	/**
	 * 
	 * @return El factor de conversion de Metros a Centimetros
	 */
	public static double getMetroCentimetro() {
		return METRO_CENTIMETRO;
	}

	/**
	 * 
	 * @return El factor de conversion de Centimetros a Milimetros
	 */
	public static double getCentimetroMilimetro() {
		return CENTIMETRO_MILIMETRO;
	}

	/**
	 * 
	 * @return El factor de conversion de Pulgadas a Metros
	 */
	public static double getPulgadaMetro() {
		return PULGADA_METRO;
	}

	/**
	 * 
	 * @return El factor de conversion de Pies a Pulgadas
	 */
	public static double getPiePulgada() {
		return PIE_PULGADA;
	}

	/**
	 * 
	 * @return La tasa de cambio de Dolares a Cordobas
	 */
	public static double getUsdnio() {
		return USDNIO;
	}

	/**
	 * 
	 * @return La tasa de cambio de Euros a Cordobas
	 */
	public static double getEurnio() {
		return EURNIO;
	}

	/**
	 * 
	 * @return La tasa de cambio de Libras Esterlinas a Cordobas
	 */
	public static double getGbpnio() {
		return GBPNIO;
	}

	/**
	 * 
	 * @return La tasa de cambio de Yenes a Cordobas
	 */
	public static double getJpynio() {
		return JPYNIO;
	}

	/**
	 * 
	 * @return La tasa de cambio de Won Coreano a Cordoba
	 */
	public static double getKrwnio() {
		return KRWNIO;
	}
	
}
