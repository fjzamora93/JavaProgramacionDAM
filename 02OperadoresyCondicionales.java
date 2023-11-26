import java.util.Scanner; // Debes importar la clase Scanner al principio del archivo

public class OperadoresCondicionales {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Crea una instancia de Scanner

    System.out.println("¿Cuánto es X? ");  // Muestra un mensaje para indicar al usuario que ingrese un valor
    int x = scanner.nextInt(); // Lee un entero ingresado por el usuario y lo almacena en la variable 'x'
                              // Existe un "next" distinto para cada tipo de dato (nextLine, nextBoolean, nextDouble)

    System.out.println("¿Cuánto es Y? ");
    int y= scanner.nextInt();

    scanner.nextLine(); // Introducimos una nueva linea... Esto son mierdas del Java, que el Scanner consume la linea y si no, no pasa a la siguiente.

    System.out.println ("Ahora introduce un texto: ");
    String texto = scanner.nextLine();

    int resultado= x+y;
    System.out.println("El resultado es: " + resultado);
    System.out.println("El texto introducido es:" + texto);

    scanner.close(); //Una buena práctica es cerrar el Scanner

    //Los operadores de Java son los ya conocidos (+,-,*,/,%,=) 
    //El único operador especial que puede ir a examen son los que juegan con el incremento (++). Veamos algún ejemplo.

  
    int contador=1;

    x += contador;
    y = contador++;

    System.out.println("El incremento de [x += contador] es: " + x);
    //En este primer caso obtenemos un incremento simple del contador.

    System.out.println("El incremento de [y = contador++] es: " + y);
    //En este segundo caso, estamos autoincrementando contador, pero y toma el valor de contador antes de su autoincremento
    //Por lo que el incremento de y todavía NO ha producido!!!

    System.out.println("Y con la operación anterior, el valor de contador es:" + contador );
    //Sin embargo, con la operación anterior, podemos ver que la variable contador sí que se ha autoincrementado.


    /*CONDICIONALES (<,>,==, && (and), || (or))
    Son todos los operadores que utilizaremos para crear condiciones
    */

    if (x > y && x > contador){
      System.out.println("El símbolo && obliga a que se cumplan las dos condiciones");
    }else if (y > x || y > contador ) {
      System.out.println("El símbolo || da opción a que se cumpla una de las dos condiciones");
    }else {
      System.out.println("El resto de símbolos ya los hemos visto y no vamos a explicarlos");
    }


    //Otra forma de hacer condicionales es con la herramienta switch/case. Veamos como funciona:
    switch(x){
      case 1:
        System.out.println ("El número es uno");
        break;
      case 2:
        System.out.println ("El número es dos");
        break;
      case 3:
      case 4:
      case 5:
        System.out.println ("El número es tres,cuatro o cinco!");
        break;
      default:
        System.out.println("Ninguna de las anteriores");
    }


  }
}