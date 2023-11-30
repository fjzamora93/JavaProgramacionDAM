/* En este primer tutorial vamos a explicar:
        1. Cómo crear un archivo de Java.
        2. Importar librerías.
        3. Declarar variables y utilizarlas.
 */

//1. Antes de crear el documento, deberemos incluir todas las librerías que vamos a importar, en este caso, de LEER un input.

import java.util.Scanner;


//2. En segundo lugar, declaramos una clase con el nombre del archivo, declaramos que es público para que se pueda importar desde otro archivo.
public class DefiniendoVariables {


//3. El tercer paso, es crear el espacio en el que vamos a crear todas nuestras funciones.
//En caso de que no vayamos a crear ninguna función, este espacio no será necesario:
    
    static void miPrimeraFuncion() {
        System.out.println("¡Soy una función!");
    }

/*4.  Finalmente, haremos el punto de entrada para la EJECUCIÓN de Java, donde podemos distinguir:
        1. main: Este es el nombre del método. Es el punto de entrada principal para la ejecución del programa.
        2. (String[]args): Entre paréntesis están los parámetros del main, que en este caso es toooodo el array[] de args. 
        3. void: En java, podríamos haber dicho que es un int, o un String. Pero al decir que es void, declaramos que el método está vacío, no devuelve ningún valor.
        4. public: esto es para que sea público. Al ser público, podremos importar el fichero y usarlo desde cualquier lugar.
        5. static: Es el "self" de python. Es decir, la clase se refiere a sí misma, y no hace falta un método para llamarla */

    public static void main(String[]args) {


// 5. A partir de aquí, empezaremos a escribir nuestro código. Vamos a declarar los tipos de variables que pueden ir a examen:

String texto = "Soy una variable de texto";
char letra = 'a' ; //una variable caracter

int numero = 0; //una variable numérica
double decimal = 0.99; //una variable decimal

boolean booleano = true; // una variable booleano



int[] arrayNumerico ={1,2,3,4};
String[] arrayTexto ={"perro","manzana","piedra"};


System.out.println(texto);
System.out.println(numero);
System.out.println(decimal);
System.out.println(letra);
System.out.println(booleano);
System.out.println(arrayNumerico);
System.out.println(arrayTexto);


Scanner scanner = new Scanner(System.in);
System.out.print("Ingrese un número: ");
numero = scanner.nextInt();
System.out.println(numero);
scanner.close();

    }
}