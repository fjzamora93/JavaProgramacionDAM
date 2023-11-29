import java.util.Scanner;

public class CrearFunciones {

    // Definición de la función
    static void miFuncion() {
        System.out.println("¡Hola desde miFuncion!");
    }

    static String clasificarSalario(double salario) {
        if (salario < 20000) {
            return "bajo";
        } else if (salario >= 20000 && salario < 50000) {
            return "medio";
        } else {
            return "alto";
        }
    }

public static void main(String[] args) {

    // Crear un objeto Scanner para leer la entrada del usuario
    Scanner scanner = new Scanner(System.in);

    // Solicitar al usuario que ingrese su nombre y leerlo
    System.out.print("Por favor, ingrese su nombre: ");
    String nombre = scanner.nextLine();
    System.out.println("Hola, " + nombre + "!");
    scanner.close();


    // Llamando a la función de clasificar salarios

    double[] salarios = {
        15000, 
        35000, 
        60000, 
        25000, 
        48000};
    
    // Forma 1 de iterar el bucle
    for (double salario : salarios) {
        System.out.println("Un salario de " + salario + " es un salario " + clasificarSalario(salario));
    }

    //Forma 2 de iterar el bucle
    for (int i=0; i<salarios.length; i++) {
        System.out.println("El salario número " +  (i+1) + " es un salario " + clasificarSalario(salarios[i]) );
    }

   //Forma 3 de iterar el bucle
   int i=0;
    for (double salario:salarios) {
        System.out.println("Esta es la tercera forma con su índice " +  (i+1) + " y la clasificación del salario " + salario + clasificarSalario(salario) );
        i++;
    }



    }
}
