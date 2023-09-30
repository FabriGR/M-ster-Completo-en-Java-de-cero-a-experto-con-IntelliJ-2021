import java.util.Locale;

public class EjemploStringValidar {
    public static void main(String[] args) {

        String curso = null; // Sin instancia

        boolean esNulo = curso == null; // Validación

        System.out.println("esNulo = " + esNulo);

        if(esNulo) {
            curso = " ";//"Programación Java";
        }

        boolean esVacio = curso.length() == 0;

        System.out.println("esVacio = " + esVacio);

        boolean esVacio2 = curso.isEmpty(); // isEmpty (evalua si es 0, es vacio)
        System.out.println("esVacio2 = " + esVacio2);

        if(!esVacio) {
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso ".concat(curso));
        }

        if(!esVacio2) {
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso ".concat(curso));
        }

        if(curso.isEmpty() == false){
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenidos al curso ".concat(curso));
        }

        // .isBlank() - Distinto de de null, isEmpty y distinto de espacio en blanco
        boolean esBlanco = curso.isBlank();
        System.out.println("esBlanco = " + esBlanco);

        if(esBlanco == false){
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenidos al curso ".concat(curso));
        }
    }
}
