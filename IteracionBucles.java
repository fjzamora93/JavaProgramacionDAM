/* Aparentemente hay varias formas de iterar un bucle en java,
 * a continuación detallo las tres formas de iterarlos:
 */


 public class IteracionBucles{
    public static void main (String[]args){
        
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
        
        int i = 0;

//Primera forma de iterar un bucle
for (String montadito:montaditos){
    System.out.println ((i++) + " " + montadito);
    i++;
}


//Segunda forma de iterar un bucle
System.out.println("Segunda forma: ");
for (int index=0; index<montaditos.length; index++){
    System.out.println ((index +1) +": "+ montaditos[index]);
}


    }
 }

