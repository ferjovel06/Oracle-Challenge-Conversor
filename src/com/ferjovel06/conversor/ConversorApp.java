package com.ferjovel06.conversor;

import javax.swing.JOptionPane;

public class ConversorApp {
	
	ConversorDivisasLogica conversorDivisas = new ConversorDivisasLogica();
	ConversorTemperaturaLogica conversorTemperatura = new ConversorTemperaturaLogica();
	OpcionesConversion opciones = new OpcionesConversion();
	
	String[] divisaDestino = { "De Cordobas a Dolar", "De Cordobas a Euro", "De Cordobas a Libras",
			"De Cordobas a Yen", "De Cordobas a Won Coreano", "De Dolar a Cordobas", "De Euro a Cordobas",
			"De Libras a Cordobas", "De Yen a Cordobas", "De Won Coreano a Cordobas" };
	
	String[] temperaturaDestino = { "De Celsius a Fahrenheit", "De Fahrenheit a Celsius", "De Kelvin a Celsius",
			"De Celsius a Kelvin", "De Fahrenheit a Kelvin", "De Kelvin a Fahrenheit" };
	
	public void convertir(String input, Object resp, String[] tipoConversion) {
        if (input == null) {
            JOptionPane.showMessageDialog(null, "Programa terminado");
            System.exit(0);
            return;
        }
		
		// Solicitar la temperatura al usuario
				if (input.matches("-?[0-9]+(\\.[0-9]+)?")) {
					try {
						if (resp.equals(tipoConversion[0])) {
							// Convertir la cantidad ingresada a double
							double monto = Double.parseDouble(input);
							// Mostrar menu para seleccionar la opcion de conversion
							String divisa = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion", "Menu",
									JOptionPane.DEFAULT_OPTION, null, divisaDestino, divisaDestino[0]);
							// Realizar la conversion de divisas y obtener el resultado
							double resultado = opciones.convertirDivisasOpciones(divisa, monto, conversorDivisas);
						} else if (resp.equals(tipoConversion[1])) {
							// Convertir la cantidad ingresada a double
							double valor = Double.parseDouble(input);
							// Mostrar menu para seleccionar la opcion de conversion
							String temperatura = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion", "Menu",
									JOptionPane.DEFAULT_OPTION, null, temperaturaDestino, temperaturaDestino[0]);
							// Realizar la conversion de temperatura y obtener el resultado
							double resultado = opciones.convertirTemperaturaOpciones(temperatura, valor, conversorTemperatura);
						}
						
					} catch (NumberFormatException e) {
						e.printStackTrace();
					}
				} else {
					// Mostrar un mensaje de error si la cantidad ingresada no es valida
					JOptionPane.showMessageDialog(null, "Valor no valido", "Valor invalido", JOptionPane.WARNING_MESSAGE);
				}
				// Preguntar al usuario si desea continuar realizando conversiones
				int option = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
				switch (option) {
				case 0:
					// Si el usuario elige continuar, llamar recursivamente al metodo ConvertirTemperatura
					Main.main(new String[0]);
	                break;
				case 1:
				case 2:
					// Si el usuario elige no o cancelar, mostrar un cuadro de dialogo de programa terminado
					JOptionPane.showMessageDialog(null, "Programa terminado");
					System.exit(0);
					break;
				}
	}

}
