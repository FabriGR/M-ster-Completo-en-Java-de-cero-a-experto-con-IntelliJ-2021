import java.util.Locale;

public class EjemploStringExtencionArchivo {
    public static void main(String[] args) {

        //  Funciona porque que extrae 4 caracteres .jpeg
        String archivo = "alguna_imagen.jpeg";
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(archivo.length()-4) = " + archivo.substring(archivo.length()-4));

        // Metodo para imprimir despues del "."
        // El probelma es que si la imagen tiene un "." antes la aplicación falla
        String archivo2 = "alguna_imagen.js";
        String archivo3 = "alguna_imagen.jpeg";
        String archivo4 = "alguna.imagen.jpeg";
        int i = archivo2.indexOf(".");
        int i2= archivo3.indexOf(".");
        int i3= archivo4.indexOf(".");
        System.out.println("i = " + i);
        System.out.println("archivo2.length() = " + archivo2.length());
        System.out.println("archivo2.substring(i+1) = " + archivo2.substring(i+1));
        System.out.println("archivo3.substring(i2+1) = " + archivo3.substring(i2+1));
        System.out.println("archivo4.substring(i3+1) = " + archivo4.substring(i3+1));

        // Metodo para imprimir despues del "." final (Correcta)
        String archivo5 = "alguna.imagen.js";
        String archivo6 = "alg.una.imag.en.jpg";
        int i5 = archivo2.lastIndexOf(".");
        int i6 = archivo6.lastIndexOf(".");
        System.out.println("archivo5.substring(i5+1) = " + archivo5.substring(i5+1));
        System.out.println("archivo6 = " + archivo6);
        System.out.println("archivo6.substring(i6+1) = " + archivo6.substring(i6+1));
    }
}
