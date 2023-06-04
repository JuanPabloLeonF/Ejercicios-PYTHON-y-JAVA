//calcular la hipotenusa de un triangulo cuando se conocen sus catetos
import java.util.Scanner;

public class Ejercicio3 {
	
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite el cateto 1 : ");
		var cateto1 = scanner.nextDouble();
		
		System.out.println("Digite el cateto 2 : ");
		var cateto2 = scanner.nextDouble();
		
		var hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
		
		System.out.println("La hipotenusa es de = " + hipotenusa);
	}
}