//recibir por teclado una cantidad por minutos y devolver la conversion en horas equivalentes

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite la cantidad en minutos: ");
		var minutos = scanner.nextInt();
		
		var conversion = minutos / 60.0;
		
		System.out.println("Los minutos en horas es = " + conversion);
	}
}
