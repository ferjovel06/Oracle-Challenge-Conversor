package ConversorTemperatura;

public class ConversorTemperaturaLogica {
	
	private final double FAHRENHEIT = 1.8;
	private final double CELSIUS = 32;
	private final double KELVIN = 273.15;
	private double resultado;
	
	public double celsiusAFahrenheit(double valor) {
		resultado = (valor*FAHRENHEIT)+CELSIUS;
		return resultado;
	}
	
	public double fahrenheitACelsius(double valor) {
		resultado = (valor-CELSIUS)/FAHRENHEIT;
		return resultado;
	}
	
	public double kelvinACelsius(double valor) {
		resultado = valor-KELVIN;
		return resultado;
	}
	
	public double celsiusAKelvin(double valor) {
		resultado = valor+KELVIN;
		return resultado;
	}
	
	public double fahrenheitAKelvin(double valor) {
		resultado = 5/9*(valor-CELSIUS)+KELVIN;
		return resultado;
	}
	
	public double kelvinAFahrenheit(double valor) {
		resultado = FAHRENHEIT*(valor*KELVIN)+CELSIUS;
		return resultado;
	}

}
