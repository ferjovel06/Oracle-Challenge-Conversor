package com.ferjovel06.conversor;

public class ConversorLongitudLogica {
	
	private final double km = 1000.0;
	private final double mt = 100.0;
	private final double cm = 10.0;
	
	public double kilometroMetro(double valor) {
		double resultado = valor * km;
		return resultado;
	}
	
	public double metroKilometro(double valor) {
		double resultado = valor / km;
		return resultado;
	}
	
	public double centimetroMetro(double valor) {
		double resultado = valor * mt;
		return resultado;
	}
	
	public double metroCentimetro(double valor) {
		double resultado = valor / mt;
		return resultado;
	}
	
	public double centimetroMilimetro(double valor) {
		double resultado = valor * cm;
		return resultado;
	}
	
	public double milimetroCentimetro(double valor) {
		double resultado = valor / cm;
		return resultado;
	}

}
