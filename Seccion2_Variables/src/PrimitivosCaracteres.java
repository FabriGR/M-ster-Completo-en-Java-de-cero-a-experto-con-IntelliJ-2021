public class PrimitivosCaracteres {
    public static void main(String[] args) {

        // char, solo un caracter
        char caracter = 'a';
        char caracter2 = '0';
        var caracter3 = '\u0040';
        System.out.println("caracter = " + caracter);
        System.out.println("caracter2 = " + caracter2);
        System.out.println("caracter3 = " + caracter3);

        var decimal = 64;
        char decimal2 = 64;
        System.out.println("decimal = " + decimal);
        System.out.println("decimal2 = " + decimal2);
        System.out.println("decimal = caracter3: " + (decimal == caracter3));

        //Caracteres espaciales
        // Un String puede concadenar un char
        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter3: " + (simbolo == caracter3));

        System.out.println("char corresponde en byte:" + espacio + Character.BYTES);
        System.out.println("char corresponde en byte:" + retroceso + Character.BYTES);
        System.out.println("char corresponde en \b byte:" + retroceso + retroceso + Character.BYTES);
        System.out.println("char corresponde en \t byte:" + tabulador + Character.BYTES);
        System.out.println("char corresponde en byte:" + nuevaLinea + retornoCarro +Character.BYTES);
        System.out.println("char corresponde en byte:" + retornoCarro + Character.BYTES);
        System.out.println("char corresponde en byte: " + System.getProperty("line.separator") + Character.BYTES);
        System.out.println("char corresponde en byte: " + System.lineSeparator() + Character.BYTES);
        System.out.println("char corresponde en bites = " + Character.SIZE);
        System.out.println("Character.MIN_VALUE = " + Character.MIN_VALUE);
        System.out.println("Character.MAX_VALUE = " + Character.MAX_VALUE);
    }
}
