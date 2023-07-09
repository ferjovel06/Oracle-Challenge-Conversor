import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		ConversorApp conversor = new ConversorApp();

		String[] tipoConversion = { "Conversor de Moneda", "Conversor de Temperatura" };

		String resp = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion", "Menu",
				JOptionPane.DEFAULT_OPTION, null, tipoConversion, tipoConversion[0]);

		if (resp.equals(tipoConversion[0])) {
			conversor.convertirDivisas();
		}

	}

}
