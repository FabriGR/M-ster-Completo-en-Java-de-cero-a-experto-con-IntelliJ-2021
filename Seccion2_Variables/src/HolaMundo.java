import java.util.Locale;

public class HolaMundo {
    public static void main(String[] args) {
        String saludar = "Hola Mundo desde Java";
        // Texto MAYUSCULA
        System.out.println("saludar.toUpperCase(Locale.ROOT) = " + saludar.toUpperCase(Locale.ROOT));
        // Texto minuscula
        System.out.println("saludar.toLowerCase(Locale.ROOT) = " + saludar.toLowerCase(Locale.ROOT));

        int numero = 11;
        System.out.println("numero = " + numero);

        boolean valor = true;
        if(valor){
            System.out.println("print Valor");
        }
        String nombre;
        nombre = "Andres";

        if(numero >10){
            nombre = "Juan";
        }
        System.out.println("nombre = " + nombre);

        int edadPersona = 5;

        char a = '\u0021';
        System.out.println(a);
        System.out.println("¡Funciona" + a);
    }
}

