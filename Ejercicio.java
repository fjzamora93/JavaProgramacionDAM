public class Ejercicio {

    public static void main(String[] args) {
        
        // definir variables
        double[] salarios = {19_999, 20_000, 20_001, 39_999, 40_000};
        char[] generos = {'h', 'm', 'h', 'H', 'm'};

        System.out.println(nombreCompleto("eva", "lopez", "perez"));

        for (double salario : salarios) {
            System.out.println(salario + " - " + tipoSalario(salario));
        }

        for (char genero : generos) {
            System.out.println(genero + " - " + literalGenero(genero));
        }
    }

    public static String tipoSalario(double salario) {
        String literal = null;
        if (salario < 20_000)
            literal = "Salario Bajo";
        else if (salario >= 20_000 && salario <= 40_000)
            literal = "Salario medio";
        else
            literal = "Salario alto";

        return literal;
    }

    public static String literalGenero(char genero) {
        String literal2 = null;
        switch(genero) {
            case 'M': case 'm':
                literal2 = "Mujer";
                break;
            case 'H': case 'h':
                literal2 = "Hombre";
                break;
            default:
                literal2 = "Error";
        }
        return literal2;
    }

    public static String nombreCompleto(String nombre, String apellido1, String apellido2) {
        return apellido1.toUpperCase() + " " + apellido2.toUpperCase() + ", " + nombre.toUpperCase();
    }
}
