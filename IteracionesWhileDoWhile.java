package lecciones;
import java.util.Scanner;

/**
 * @author fjzamora93
 * @since 28-nov
 */

/* 
 * Existen dos formas de hacer bucles en Java:
 * while (condicion) {entre las llaves la acción que debe repetirse}
 * for (condición) {entre llaves lo que debe repetirse}
 */
public class IteracionesWhileDoWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int numeroLeido=0, suma= 0, cuantos =0;
		
		System.out.println ("Introducir número: ");
		numeroLeido = scanner.nextInt();
		
		while (numeroLeido >= 0 ) {
			//Aquí empezamos con el tratamiento que vamos a dar a las variables:
			cuantos ++;
			suma += numeroLeido;
			System.out.println ("Introducir número: ");
			numeroLeido = scanner.nextInt();
		}

		System.out.println ("ESTADÍSTICAS");
		System.out.println ("Suma de numerosLeidos: " + suma);
		System.out.println ("numeros procesados: " + cuantos);
		
		
	
		System.out.println ("\n UTILIZANDO EL DO WHILE");
		do {
			System.out.println ("Itroduce número");
			numeroLeido = scanner.nextInt();
			if (numeroLeido >=0 ) {
				cuantos++;
				suma += numeroLeido;
			}
		}while (numeroLeido >= 0);
		
		
		System.out.println ("ESTADÍSTICAS");
		System.out.println ("Suma de numerosLeidos: " + suma);
		System.out.println ("numeros procesados: " + cuantos);
		
	}
}
