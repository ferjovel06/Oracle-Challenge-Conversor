package Principal;
import javax.swing.JOptionPane;
import ConversorDivisas.ConversorDivisasApp;
import ConversorTemperatura.ConversorTemperaturaApp;

public class Main {

	public static void main(String[] args) {
		ConversorDivisasApp conversorDivisas = new ConversorDivisasApp();
		ConversorTemperaturaApp conversorTemperatura = new ConversorTemperaturaApp();

		String[] tipoConversion = { "Conversor de Moneda", "Conversor de Temperatura" };

		String resp = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion", "Menu",
				JOptionPane.DEFAULT_OPTION, null, tipoConversion, tipoConversion[0]);

		if (resp.equals(tipoConversion[0])) {
			conversorDivisas.convertirDivisas();
		} else if (resp.equals(tipoConversion[1])) {
			conversorTemperatura.convertirTemperatura();
		}

	}

}
