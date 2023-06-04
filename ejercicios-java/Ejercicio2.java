//calcule el perimetro,area de un rectanglo dada su base y altura
import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite la base del rectangulo: ");
		var base = scanner.nextDouble();
		
		System.out.println("Digite la altura del rectangulo: ");
		var altura = scanner.nextDouble();
		
		var perimetro = 2*(base + altura);
		
		System.out.println("perimetro = " + perimetro);
		
		var area = base * altura; 
		
		System.out.println("area = " + area);
	}
}