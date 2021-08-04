import javax.swing.*;
public class SistemasNumericosInterfaz {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número entero");

        int numeroDecimal = 0;
        // Arreglo de errores
        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error debe ingresar un número entero");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        // De string a Binario
        System.out.println(resultadoBinario);

        // de int a Binario
        int numeroBinario = 0b11110;
        System.out.println("numeroBinario = " + numeroBinario);

        String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        // Convertir el 30 en un Octal
        System.out.println(resultadoOctal);
        // Para poner un numero a Octal, tienes que anteponer el 0
        int numeroOctal = 036;
        System.out.println("numeroOctal = " + numeroOctal);

        String resultadoHex = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        // 30 a Hexecimal
        System.out.println(resultadoHex);
        // Para un numero Hexadecimal, antepones el 0x
        int numeroHex = 0x1f4;
        int numeroHex1 = 0xB;
        int numeroHex2 = 0x1e;
        System.out.println("numeroHex = " + numeroHex);
        System.out.println("numeroHex1 = " + numeroHex1);
        System.out.println("numeroHex2 = " + numeroHex2);

        // Condadenar numero binario, octal, hexadecimal
        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHex;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
