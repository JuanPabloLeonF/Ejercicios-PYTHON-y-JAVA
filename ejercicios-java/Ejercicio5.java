//realizar la conversion de grados fareing en celcius

import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite la temperatura en Fahrenheit: ");
		var Fahrenheit = scanner.nextDouble();
		
		var conversionCelsius = (Fahrenheit-32)* 5/9;
		
		System.out.println("Celsius = " + conversionCelsius);
	}
}
