package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		double temperaturaCelsius = 30.5;
		final int AJUSTEFHT = 32;
		final double FATORFHT = 9/5.0;
		double temperaturaFahrenheit = (temperaturaCelsius + AJUSTEFHT) * FATORFHT;
		System.out.println("A temperatura, em ºF, equivalente a " + temperaturaCelsius + "ºC é " + temperaturaFahrenheit + "ºF.");
		// O uso de um main para cada exercício faz com
		// Que os exercícios fiquem isolados um do outro.
	}
}
