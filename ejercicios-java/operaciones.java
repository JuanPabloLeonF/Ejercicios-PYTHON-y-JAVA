import java.util.Scanner;

public class operaciones{
	
	public static void main(String args[]) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escribe el primer numero:");
		int numero1 = scanner.nextInt();
		
		System.out.println("Escribe el segundo numero:");
		int numero2 = scanner.nextInt();
		
		//suma
		int suma = numero1 + numero2;
		System.out.println("Suma = " + suma );
		
		//multiplicacion
		double multiplicar = numero1 * numero2;
		System.out.println("Multiplicacion = " + multiplicar);
		
		//dividion
		double dividir = numero1 / numero2;
		System.out.println("Division = " + dividir);
	}
}