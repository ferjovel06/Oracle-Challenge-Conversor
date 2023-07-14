package com.ferjovel06.conversor;

import javax.swing.JOptionPane;

/**
 * 
 * @author ferjovel
 *
 */
public class ConversorApp {

	ConversorDivisasLogica conversorDivisas = new ConversorDivisasLogica();
	ConversorTemperaturaLogica conversorTemperatura = new ConversorTemperaturaLogica();
	ConversorLongitudLogica conversorLongitud = new ConversorLongitudLogica();
	OpcionesConversion opciones = new OpcionesConversion();

	String[] divisaDestino = { "De Cordobas a Dolar", "De Cordobas a Euro", "De Cordobas a Libras", "De Cordobas a Yen",
			"De Cordobas a Won Coreano", "De Dolar a Cordobas", "De Euro a Cordobas", "De Libras a Cordobas",
			"De Yen a Cordobas", "De Won Coreano a Cordobas" };

	String[] temperaturaDestino = { "De Celsius a Fahrenheit", "De Fahrenheit a Celsius", "De Kelvin a Celsius",
			"De Celsius a Kelvin", "De Fahrenheit a Kelvin", "De Kelvin a Fahrenheit" };
	
	String[] longitudDestino = { "De Kilometros a Metros", "De Metros a Centimetros", "De Centimetros a Milimetros",
			"De Milimetros a Centimetros", "De Centimetros a Metros", "De Metros a Kilometros" };

	/**
	 * Realiza diferentes tipos de conversiones basadas en la entrada proporcionada
	 * @param input
	 * @param resp
	 * @param tipoConversion
	 */
	public void convertir(String input, Object resp, String[] tipoConversion) {
		if (input == null) {
			JOptionPane.showMessageDialog(null, "Programa terminado");
			System.exit(0);
			return;
		}

		if (input.matches("-?[0-9]+(\\.[0-9]+)?")) {
			if (resp.equals(tipoConversion[0])) {
				double monto = Double.parseDouble(input);
				String divisa = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion",
						"Menu", JOptionPane.DEFAULT_OPTION, null, divisaDestino, divisaDestino[0]);
				opciones.convertirDivisasOpciones(divisa, monto, conversorDivisas);
			} else if (resp.equals(tipoConversion[1])) {
				double valor = Double.parseDouble(input);
				String temperatura = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion",
						"Menu", JOptionPane.DEFAULT_OPTION, null, temperaturaDestino, temperaturaDestino[0]);
				opciones.convertirTemperaturaOpciones(temperatura, valor, conversorTemperatura);
			} else if (resp.equals(tipoConversion[2])) {
				double valor = Double.parseDouble(input);
				String longitud = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion",
						"Menu", JOptionPane.DEFAULT_OPTION, null, longitudDestino, longitudDestino[0]);
				opciones.convertirLongitudOpciones(longitud, valor, conversorLongitud);
			}

		} else {
			JOptionPane.showMessageDialog(null, "Valor no valido", "Valor invalido", JOptionPane.WARNING_MESSAGE);
		}
		
		int option = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
		switch (option) {
		case 0:
			Main.main(new String[0]);
			break;
		case 1:
		case 2:
			JOptionPane.showMessageDialog(null, "Programa terminado");
			System.exit(0);
			break;
		}
	}

}
