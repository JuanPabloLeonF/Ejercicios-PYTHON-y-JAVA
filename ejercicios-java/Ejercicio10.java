/*
 * un aprendiz desea conocer cual sera su calificacion final en la competencia de programacion, 
 * la calificacion se compone de : 55% promedio de sus tres calificaciones parciales, 
 * 30% examen final, 15% el proyecto final
*/

import java.util.Scanner;


public class Ejercicio10 {

	public static void main(String args[]) {
		
		var calificacionesParciales = 0.55;
		var examenFinal = 0.30;
		var proyectoFinal = 0.15;
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite la calificaion del primer parcial: ");
		var parcial1 = scanner.nextDouble();
		
		System.out.println("Digite la calificacion del segundo parcial: ");
		var parcial2 = scanner.nextDouble();
		
		System.out.println("Digite la calificacion del tercer parcial: ");
		var parcial3 = scanner.nextDouble();
		
		var promedioCalificacionesParciales = (parcial1 + parcial2 + parcial3) / 3;
		
		System.out.println("Digite la calificaion del examen final: ");
		var notExamenFinal = scanner.nextDouble();
		
		System.out.println("Digite la calificaion del proyecto final: ");
		var notaProyectoFinal = scanner.nextDouble();
		
		var calificacionFinalProgramacion = (calificacionesParciales * promedioCalificacionesParciales) + 
				(examenFinal * notExamenFinal) + (proyectoFinal * notaProyectoFinal);
		
		System.out.println("Su calificacion final de las competencias de programacion: " + calificacionFinalProgramacion);
	}
}
