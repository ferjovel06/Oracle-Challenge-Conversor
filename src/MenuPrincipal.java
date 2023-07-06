import javax.swing.JOptionPane;

public class MenuPrincipal {

	public static void main(String[] args) {
		Conversor conversor = new Conversor();
		
		String[] tipoConversion = {
				"Conversor de Moneda",
				"Conversor de Temperatura"
		};
		
		String[] divisaDestino = {
				"De Cordobas a Dolar",
				"De Cordobas a Euro",
				"De Cordobas a Libras",
				"De Cordobas a Yen",
				"De Cordobas a Won Coreano",
				"De Dolar a Cordobas",
				"De Euro a Cordobas",
				"De Libras a Cordobas",
				"De Yen a Cordobas",
				"De Won Coreano a Cordobas"
		};
		
		String resp = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion", "Menu", JOptionPane.DEFAULT_OPTION, null, tipoConversion, tipoConversion[0]);
		
		if (resp.equals(tipoConversion[0])) {
			String input = JOptionPane.showInputDialog(null, "Ingresa la cantidad de dinero que deseas cambiar:");
			double monto = Double.parseDouble(input);
			String divisa = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion", "Menu", JOptionPane.DEFAULT_OPTION, null, divisaDestino, divisaDestino[0]);
			if (divisa.equals(divisaDestino[0])) {
				double resultado = conversor.cordobasADolar(monto);
				JOptionPane.showMessageDialog(null, "Tienes $" + String.format("%.2f", resultado) + " dolares.");
			} else if (divisa.equals(divisaDestino[1])) {
				double resultado = conversor.cordobasAEuros(monto);
				JOptionPane.showMessageDialog(null, "Tienes €" + String.format("%.2f", resultado) + " euros.");
			} else if (divisa.equals(divisaDestino[2])) {
				double resultado = conversor.cordobasALibras(monto);
				JOptionPane.showMessageDialog(null, "Tienes £" + String.format("%.2f", resultado) + " libras esterlinas.");
			} else if (divisa.equals(divisaDestino[3])) {
				double resultado = conversor.cordobasAYenes(monto);
				JOptionPane.showMessageDialog(null, "Tienes ¥" + String.format("%.2f", resultado) + " yenes.");
			} else if (divisa.equals(divisaDestino[4])) {
				double resultado = conversor.cordobasAWones(monto);
				JOptionPane.showMessageDialog(null, "Tienes ₩" + String.format("%.2f", resultado) + " wones.");
			} else if (divisa.equals(divisaDestino[5])) {
				double resultado = conversor.dolarACordobas(monto);
				JOptionPane.showMessageDialog(null, "Tienes C$" + String.format("%.2f", resultado) + " cordobas.");
			}
		}
		
		
	}
	
}
