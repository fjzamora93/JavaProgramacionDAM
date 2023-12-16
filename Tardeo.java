import java.util.Scanner;

/*
 * Escribir los números múltiplos de 3 y de 7, que hay entre el 1 y el 250. Y además escribir al final,
cuántos de los 250 son:
a. Múltiplos de 3 y de 7.
b. Cuantos hay múltiplos de 3
c. Cuantos hay múltiplos de 7.
d. Cuantos no son múltiplos de ni de 3 ni de 7.
Ojo la suma de todos NO da 250. Tened en cuenta que por ejemplo el número 21, es múltiplo de 3 y 7 , por
tanto lo es de 3 y lo es de 7.
Recordar que un número es múltiplo de otro cuando al dividirlos su resto es cero.
 */

public class Tardeo {

	public static void main(String[] args) {
		Scanner leer = new Scanner (System.in);
        int multiplo3 = 0;
        int multiplo7 = 0;
        int otros = 0;
        int multiploAmbos = 0;

        for (int i= 1; i <= 250; i++ ){
            System.out.println(i);
            if (i%7 == 0){
                multiplo7 ++;
            }if (i %3 == 0){
                multiplo3++;
            if ( i%3 == 0 && i%7 ==0 ){
                multiploAmbos++;
            }else
                otros ++;
        }
        
        System.out.println (" Hay tantos multiplos7 " + multiplo7 + "\n  Hay tantos multiplos3 " + multiplo3 + " \nDe ambos " + multiploAmbos + "\n Hay otros " + otros );
        



    leer.close();

	}
}
