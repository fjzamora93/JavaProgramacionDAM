import java.util.Scanner;


public class Ejercicio_2 {
    public static void main(String[] args) {

        //definir variables

        Scanner scanner = new Scanner(System.in);
        String nombre = null, apell1 = null, apell2 = null;
        String genero = null;
        double salario= 0;
        double sumaSalarios = 0;
        int hombres = 0, mujeres = 0;

        //cuerpo del ejercicio
        nombre = scanner.next();
        while (!nombre.equalsIgnoreCase("FIN")) { //El signo de exclamación devuelve un false
            apell1 = scanner.next();
            apell2 = scanner.next();
            salario = scanner.nextDouble();
            genero = scanner.next();

            switch (genero){
                case "h": case "H":
                    hombres++;
                    break;
                case "m" : case "M":
                    mujeres ++ ;
                    break;
            }

            System.out.println(nombreCompleto(nombre, apell1, apell2));
            System.out.println(literalGenero(genero));
            System.out.println(tipoSalario(salario));

            sumaSalarios += salario;
            nombre = scanner.next();
        }

        

}
}