//dado dos numeros muestre la suma,resta multiplicacion y division de ambos
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite el numero 1: ");
		var numero1 = scanner.nextDouble();
		
		System.out.println("Digite el numero 1: ");
		var numero2 = scanner.nextDouble();
		
		var suma = numero1 + numero2;
		var resta = numero1 -  numero2;
		var multiplicacion = numero1 * numero2;
		var division = numero1 / numero2;
		
		System.out.println("suma = " + suma);
		System.out.println("resta = " + resta);
		System.out.println("multiplicacion = " + multiplicacion);
		System.out.println("division = " + division);
		
	}
}
