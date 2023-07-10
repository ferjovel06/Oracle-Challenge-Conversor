package Principal;
import javax.swing.JOptionPane;
import ConversorDivisas.ConversorDivisasLogica;
import ConversorTemperatura.ConversorTemperaturaLogica;

public class OpcionesConversion {

	public double convertirDivisasOpciones(String divisa, double monto, ConversorDivisasLogica conversor) {
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
		
		// Mostrar el resultado en un cuadro de dialogo
		JOptionPane.showMessageDialog(null, "Tienes " + mensaje);
		return resultado;

	}
	
	public double convertirTemperaturaOpciones(String temperatura, double valor, ConversorTemperaturaLogica conversor) {
		double resultado = 0.0;
		String mensaje = "";

		if (temperatura.equals("De Celsius a Fahrenheit")) {
			resultado = conversor.celsiusAFahrenheit(valor);
			mensaje = valor + "°C son equivalentes a " + String.format("%.2f", resultado) + " °F.";
		} else if (temperatura.equals("De Fahrenheit a Celsius")) {
			resultado = conversor.fahrenheitACelsius(valor);
			mensaje = valor + "°F son equivalentes a " + String.format("%.2f", resultado) + " °C.";
		} else if (temperatura.equals("De Kelvin a Celsius")) {
			resultado = conversor.kelvinACelsius(valor);
			mensaje = valor + "°K son equivalentes a " + String.format("%.2f", resultado) + " °C.";
		} else if (temperatura.equals("De Celsius a Kelvin")) {
			resultado = conversor.celsiusAKelvin(valor);
			mensaje = valor + "°C son equivalentes a " + String.format("%.2f", resultado) + " °K.";
		} else if (temperatura.equals("De Fahrenheit a Kelvin")) {
			resultado = conversor.fahrenheitAKelvin(valor);
			mensaje = valor + "°F son equivalentes a " + String.format("%.2f", resultado) + " °K.";
		} else if (temperatura.equals("De Kelvin a Fahrenheit")) {
			resultado = conversor.kelvinAFahrenheit(valor);
			mensaje = valor + "°K son equivalentes a " + String.format("%.2f", resultado) + " °F.";
		}
		
		// Mostrar el resultado en un cuadro de dialogo
		JOptionPane.showMessageDialog(null, mensaje);
		return resultado;
	}

}
