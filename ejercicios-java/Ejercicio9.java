/*
 * una tienda ofrece el 15% de descuento sobre el total de la compra y el cliente 
 * debe saber cuanto debe pagar por su pedido
 */
import java.util.Scanner;


public class Ejercicio9 {

	public static void main(String args[]) {
		
		var descuento = 0.15;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite el total de la compra: ");
		var totalCompra = scanner.nextDouble();
		
		var totalDescuento = totalCompra * descuento;
		
		var totalPagar = totalCompra - descuento;
		
		System.out.println("total a pagar = " + totalPagar);
	}
}
