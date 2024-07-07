package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		double temperaturaCelsius = 30.5;
		final double CONSTANTEFT1 = 32.0;
		final double CONSTANTEFT2 = 9/5.0;
		double temperaturaFahrenheit = (temperaturaCelsius + CONSTANTEFT1) * CONSTANTEFT2;
		System.out.println("A temperatura, em ºF, equivalente a " + temperaturaCelsius + "ºC é " + temperaturaFahrenheit + "ºF.");
		// O uso de um main para cada exercício faz com
		// Que os exercícios fiquem isolados um do outro.
	}
}
