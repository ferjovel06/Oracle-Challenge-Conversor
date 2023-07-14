package com.ferjovel06.conversor;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		ConversorApp conversor = new ConversorApp();

		String[] tipoConversion = { "Conversor de Moneda", "Conversor de Temperatura", "Conversor de Unidades de Longitud" };
		
		Object resp = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion", "Menu",
				JOptionPane.DEFAULT_OPTION, null, tipoConversion, tipoConversion[0]);

		if (resp == null) {
			JOptionPane.showMessageDialog(null, "Programa terminado");
			System.exit(0);
		} else {
			String input = JOptionPane.showInputDialog(null, "Ingresa el valor que deseas convertir en el " + resp);
			conversor.convertir(input, resp, tipoConversion);
		}
			
	}

}

