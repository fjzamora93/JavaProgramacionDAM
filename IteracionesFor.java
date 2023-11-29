
/**Aquí vamos a ver cómo se itera a través del for.
 * @author fjzamora93
 * @since 28-nov
 */


public class IteracionesFor {

	public static void main(String[] args) {
		int sumaPares = 0;
		
		/*El primer for que vamos a ver tiene tres partes:
		 * 1. Metemos un índice, que suele ser una i iniciada en 0 o 1.
		 * 2. Introducimos la condición que debe cumplirse.
		 * 3. Autoincrementamos el índice de nuestro array
		 */
		
		for (int i = 1; i <= 15; i++) {
			if (i%2 == 0) 
				sumaPares += i;
		}
		System.out.println ("Suma de pares : " + sumaPares + "\n");
		
		
		System.out.println ("Pero la realidad es que el for se utiliza iterar Arrays, así que vamos a ello:");
		
		int [] numeros = {2,3,4,5,6,7,8};
		
		System.out.println ("La longitud de nuestro array es de: " + numeros.length + "Pero comenzamos en el 0");
		for (int i=0; i<numeros.length; i++) {
			System.out.println ("La posición " + i + " tiene " + numeros[i]);}
		
		System.out.println ("\nY ahora veremos el Array optimizado de Tomás");
		for (int numero:numeros) {
			System.out.println ("El número contiene: " + numero + "\n");}
		
		System.out.println("Y a continuación vamos a iterar un array de String: \n");
        String[] montaditos = {
            "Jamón gran reserva",
            "Tortilla de patatas",
            "Pollo tandori",
            "Bacon con salsa BBQ",
            "Pollo kebab y salsa BBQ",
            "Pollo y alioli",
            "Lomo al ajillo y mayonesa",
            "Carrillera al vino tinto",
        };
        
		for (String montadito:montaditos){
			System.out.println (montadito);
		}




		
	}

}
