import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {

        // Entrada de la terminal de la consola, System.in
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero:");
        // Escanear la linea del terminal que ingreso de tipo String
        //--String numeroStr = scanner.nextLine();

        int numeroDecimal = 0;
        // Arreglo de errores
        try {
            //Obtener el entero desde el scanner
            numeroDecimal = scanner.nextInt();// Integer.parseInt(numeroStr);
            // Si usas Exception usas todos o "casi todos los tipos de error?~"
        } catch (Exception e){ //Para usar solo este caso: (InputMismatchException e)
            System.out.println("Error debe ingresar un número entero!");
            main(args);
            System.exit(0);
        }

        // Salida, System.out
        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        // De string a Binario
        // de int a Binario

        String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        // Convertir el num en un Octal

        String resultadoHex = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        // num a Hexecimal

        // Condadenar numero binario, octal, hexadecimal
        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHex;

        System.out.println(mensaje);
    }
}
