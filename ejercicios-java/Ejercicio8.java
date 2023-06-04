/*
	un vendedor recibe un sueldo base mas un 10% por comision de ventas, 
	el vendedor desea conocer el dinero a obtener por concepto a comisiones por 
	las tres ventas que realiza en el mes y 
	el total recibido en el mes tomando en cuenta su sueldo base y comisiones
*/

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite el sueldo: ");
		var sueldo = scanner.nextDouble();
		
		System.out.println("Digite el monto de la primera venta: ");
		var venta1 = scanner.nextDouble();
		
		System.out.println("Digite el monto de la segunda venta: ");
		var venta2 = scanner.nextDouble();
		
		System.out.println("Digite el monto de la tercera venta: ");
		var venta3 = scanner.nextDouble();
		
		var comision = 0.10;
		
		var comision1 = venta1 * comision;
		var comision2 = venta2 * comision;
		var comision3 = venta3 * comision;
		
		var totalVentas = venta1 + venta2 + venta3;
		var totalComision = comision1 + comision2 + comision3;
		var totalSueldo = sueldo + totalComision;
		
		System.out.println("comision por primera venta: " + comision1);
		System.out.println("comision por segunda venta: " + comision2);
		System.out.println("comision por tercera venta: " + comision3);
		System.out.println("comision total por ventas: " + totalComision);
		System.out.println("sueldo del vendedor: " + totalSueldo);
		
		
		
	}
}
