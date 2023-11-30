package lecciones;

/**
 * @author elgatobarista
 * @since 28-nov
 */


import java.util.Scanner;

public class AplicandoScannerEnStrings {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println ("A continuación vamos a observar un fenómeno de Java \n"
				+ "Si en el scanner queremos leer un String, podemos usar simplemente next() \n"
				+ "Sin embargo, al usar next() solo nos cogerá la siguiente palabra \n"
				+ "Para corregir este efecto, deberemos usar nexLine(), y tomará toda la linea");
		
		String nombre= "";
		System.out.println("Introduce tomas para comparar con el ==");
		nombre = scanner.next();
		//MUCHO CUIDADO CON EL NEXT! EL next solo coge la primera palabra hasta el espacio.
		
		
		if (nombre == "tomas")
			System.out.println ("Son iguales");
		else
			System.out.println ("Son distintos");
		
		System.out.println("¿Qué ha sucedido en el caso anterior? \n"
				+ "Si bien las comparaciones eran iguales, el símbolo == no se aplica para String\n"
				+ "Esto tiene que ver con el almacenamiento de las variables,\n"
				+ "pero lo que nosotros queremos es comparar el contenido de la variable.\n"
				+ "Para comparar el contenido de la variable utilizaremos equals()\n \n"
				+ "Introduce tomas para comparar con el equals");
		
		scanner.nextLine(); //Acuérdate de consumir el salto de línea para que lo consuma el Scanner
		
		String comparador = scanner.nextLine(); //El nextLine te coge toda la linea.
		if (comparador.equals("tomas"))
			System.out.println ("Son iguales");
		else
			System.out.println ("Son distintos");
		 
		
		System.out.println ("Vamos a utilizar ahora el equalsIgnoreCase() para ignorar mayúsculas \n"
				+ "Escribe TOMAS con mayúsculas para ver qué pasa:");
		
		//Aquí ya no hay que consumir línea, ya que el último scanner era nextLine()
		String ignorarmayusculas = scanner.nextLine(); 
		if (ignorarmayusculas.equalsIgnoreCase("tomas"))
			System.out.println (ignorarmayusculas + " y tomas --- son iguales porque hemos aplicado equalsIgnoreCase");
		else
			System.out.println ("Son distintos");
		
		
	
		
		System.out.println("\nAhora vamos a hacerlo con un switch, que lleva implícito el equal:"
				+ "\n Introduce sumar, restar, multiplicar o dividir para el switch: ");
		String opcion = scanner.next();
		switch(opcion) {
		case "sumar":
			System.out.println("Sumando");
			break;
		case "restar":
			System.out.println("restand");
			break;
		case "multiplicar":
			System.out.println("Multiplicando");
			break;
		case "dividir":
			System.out.println("dividiendo");
			break;
		default:
			System.out.println("opción errónea");
			break;
		
		}
		
		
		System.out.println("Siempre es buena práctica cerrar el scanner, no te olvides");
		scanner.close();
		
	}
}