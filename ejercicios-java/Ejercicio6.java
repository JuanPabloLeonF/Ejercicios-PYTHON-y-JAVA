//realizar la media de tres numeros introducidos por teclado
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite el numero 1: ");
		var numero1 = scanner.nextDouble();
		
		System.out.println("Digite el numero 2: ");
		var numero2 = scanner.nextDouble();
		
		System.out.println("Digite el numero 3: ");
		var numero3 = scanner.nextDouble();
		
		var resultado = (numero1 + numero2 + numero3) / 3;
		System.out.println("El promedio de los tres numeros es = " + resultado);
	}
}
