//preguntar al usuaruario su nombre y luego saludar
import java.util.Scanner;


public class Ejercicio1 {
	
	public static void main(String args[]) {
		
		System.out.println("¿Cual es tu nombre? :");
		Scanner scanner = new Scanner(System.in);
		var nombreUsuario = scanner.nextLine();
		
		System.out.println("Hola querido/a " + nombreUsuario);
		
	}

}
