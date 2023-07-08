import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		ConversorDivisas conversorDivisas = new ConversorDivisas();
		Pantallas pantallas = new Pantallas();

		String[] tipoConversion = { "Conversor de Moneda", "Conversor de Temperatura" };

		String[] divisaDestino = { "De Cordobas a Dolar", "De Cordobas a Euro", "De Cordobas a Libras",
				"De Cordobas a Yen", "De Cordobas a Won Coreano", "De Dolar a Cordobas", "De Euro a Cordobas",
				"De Libras a Cordobas", "De Yen a Cordobas", "De Won Coreano a Cordobas" };

		String resp = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion", "Menu",
				JOptionPane.DEFAULT_OPTION, null, tipoConversion, tipoConversion[0]);

		if (resp.equals(tipoConversion[0])) {
			String input = JOptionPane.showInputDialog(null, "Ingresa la cantidad de dinero que deseas cambiar:");
			double monto = Double.parseDouble(input);
			String divisa = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion", "Menu",
					JOptionPane.DEFAULT_OPTION, null, divisaDestino, divisaDestino[0]);

			double resultado = pantallas.ConvertirDivisas(divisa, monto, conversorDivisas);
		}

	}

}
