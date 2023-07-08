import javax.swing.JOptionPane;

public class Pantallas {

	public double ConvertirDivisas(String divisa, double monto, ConversorDivisas conversor) {
		double resultado = 0.0;
		String mensaje = "";

		if (divisa.equals("De Cordobas a Dolar")) {
			resultado = conversor.cordobasADolar(monto);
			mensaje = "$" + String.format("%.2f", resultado) + " dolares.";

		} else if (divisa.equals("De Cordobas a Euro")) {
			resultado = conversor.cordobasAEuros(monto);
			mensaje = "€" + String.format("%.2f", resultado) + " euros.";
		} else if (divisa.equals("De Cordobas a Libras")) {
			resultado = conversor.cordobasALibras(monto);
			mensaje = "£" + String.format("%.2f", resultado) + " libras esterlinas.";
		} else if (divisa.equals("De Cordobas a Yen")) {
			resultado = conversor.cordobasAYenes(monto);
			mensaje = "¥" + String.format("%.2f", resultado) + " yenes.";
		} else if (divisa.equals("De Cordobas a Won Coreano")) {
			resultado = conversor.cordobasAWones(monto);
			mensaje = "₩" + String.format("%.2f", resultado) + " wones.";
		} else if (divisa.equals("De Dolar a Cordobas")) {
			resultado = conversor.dolarACordobas(monto);
			mensaje = "C$" + String.format("%.2f", resultado) + " cordobas.";
		} else if (divisa.equals("De Euro a Cordobas")) {
			resultado = conversor.eurosACordobas(monto);
			mensaje = "C$" + String.format("%.2f", resultado) + " cordobas.";
		} else if (divisa.equals("De Libras a Cordobas")) {
			resultado = conversor.librasACordobas(monto);
			mensaje = "C$" + String.format("%.2f", resultado) + " cordobas.";
		} else if (divisa.equals("De Yen a Cordobas")) {
			resultado = conversor.yenesACordobas(monto);
			mensaje = "C$" + String.format("%.2f", resultado) + " cordobas.";
		} else if (divisa.equals("De Won Coreano a Cordobas")) {
			resultado = conversor.wonesACordobas(monto);
			mensaje = "C$" + String.format("%.2f", resultado) + " cordobas.";
		}
		JOptionPane.showMessageDialog(null, "Tienes " + mensaje);
		return resultado;

	}

}
