package ConversorDivisas;
import javax.swing.JOptionPane;
import Principal.OpcionesConversion;

public class ConversorDivisasApp {
	ConversorDivisasLogica conversorDivisas = new ConversorDivisasLogica();
	OpcionesConversion pantallas = new OpcionesConversion();
	
	String[] divisaDestino = { "De Cordobas a Dolar", "De Cordobas a Euro", "De Cordobas a Libras",
			"De Cordobas a Yen", "De Cordobas a Won Coreano", "De Dolar a Cordobas", "De Euro a Cordobas",
			"De Libras a Cordobas", "De Yen a Cordobas", "De Won Coreano a Cordobas" };
	
	public void convertirDivisas() {
		// Solicitar la cantidad de dinero al usuario
		String input = JOptionPane.showInputDialog(null, "Ingresa la cantidad de dinero que deseas cambiar:");
		if (input.matches("-?[0-9]+(\\.[0-9]+)?")) {
			try {
				// Convertir la cantidad ingresada a double
				double monto = Double.parseDouble(input);
				// Mostrar menu para seleccionar la opcion de conversion
				String divisa = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion", "Menu",
						JOptionPane.DEFAULT_OPTION, null, divisaDestino, divisaDestino[0]);
				// Realizar la conversion de divisas y obtener el resultado
				double resultado = pantallas.convertirDivisasOpciones(divisa, monto, conversorDivisas);
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
			// Si el usuario elige continuar, llamar recursivamente al metodo ConvertirDivisas
			convertirDivisas();
			break;
		case 1:
		case 2:
			// Si el usuario elige no o cancelar, mostrar un cuadro de dialogo de programa terminado
			JOptionPane.showMessageDialog(null, "Programa terminado");
			break;
		}
	}

}
