package lecciones;

/**
 * @author fjzamora93
 * @since 28-nov
 */


import java.util.Scanner;

public class IteracionesWhileRaro {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int numeroLeido=0, suma= 0, cuantos =0;
		
		System.out.println ("Introduce número: ");
		numeroLeido = scanner.nextInt();
		
		
		//Este es el while raro de Tomás, que incluye un break
		while (true) {
			numeroLeido = scanner.nextInt();
			if (numeroLeido < 0)
				break; //rompe el bucle del tirón
			cuantos ++;
			suma += numeroLeido;
		}
				


		System.out.println ("ESTADÍSTICAS");
		System.out.println ("Suma de numerosLeidos: " + suma);
		System.out.println ("numeros procesados: " + cuantos);
		
		
	}
}


