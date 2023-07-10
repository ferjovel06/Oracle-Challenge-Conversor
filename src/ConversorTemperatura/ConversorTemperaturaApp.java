package ConversorTemperatura;

import javax.swing.JOptionPane;

import Principal.OpcionesConversion;

public class ConversorTemperaturaApp {
	ConversorTemperaturaLogica conversorTemperatura = new ConversorTemperaturaLogica();
	OpcionesConversion pantallas = new OpcionesConversion();

	String[] temperaturaDestino = { "De Celsius a Fahrenheit", "De Fahrenheit a Celsius", "De Kelvin a Celsius",
			"De Celsius a Kelvin", "De Fahrenheit a Kelvin", "De Kelvin a Fahrenheit" };
	
	public void convertirTemperatura() {
		// Solicitar la temperatura al usuario
				String input = JOptionPane.showInputDialog(null, "Ingresa la temperatura que desea convertir:");
				if (input.matches("-?[0-9]+(\\.[0-9]+)?")) {
					try {
						// Convertir la cantidad ingresada a double
						double valor = Double.parseDouble(input);
						// Mostrar menu para seleccionar la opcion de conversion
						String temperatura = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion", "Menu",
								JOptionPane.DEFAULT_OPTION, null, temperaturaDestino, temperaturaDestino[0]);
						// Realizar la conversion de temperatura y obtener el resultado
						double resultado = pantallas.convertirTemperaturaOpciones(temperatura, valor, conversorTemperatura);
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
					convertirTemperatura();
					break;
				case 1:
				case 2:
					// Si el usuario elige no o cancelar, mostrar un cuadro de dialogo de programa terminado
					JOptionPane.showMessageDialog(null, "Programa terminado");
					break;
				}
	}

}
