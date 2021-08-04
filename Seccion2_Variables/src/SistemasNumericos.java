public class SistemasNumericos {
    public static void main(String[] args) {
        int numeroDecimal = 30;
        System.out.println("numeroDecimal = " + numeroDecimal);

        // De string a Binario
        System.out.println("numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

        // de int a Binario
        int numeroBinario = 0b11110;
        System.out.println("nuemroBinario = " + numeroBinario);

        // Convertir el 30 en un Octal
        System.out.println("numeto octal de " + numeroBinario + " = " + Integer.toOctalString(numeroDecimal));
        // Para poner un numero a Octal, tienes que anteponer el 0
        int numeroOctal = 036;
        System.out.println("numeroOctal = " + numeroOctal);

        // 30 a Hexecimal
        System.out.println("numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));
        // Para un numero Hexadecimal, antepones el 0x
        int numeroHex = 0x1f4;
        int numeroHex1 = 0xB;
        int numeroHex2 = 0x1e;
        System.out.println("numeroHex = " + numeroHex);
        System.out.println("numeroHex1 = " + numeroHex1);
        System.out.println("numeroHex2 = " + numeroHex2);
    }
}
