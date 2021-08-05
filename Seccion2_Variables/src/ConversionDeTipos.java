public class ConversionDeTipos {
    public static void main(String[] args) {
        String numeroStr = "50";

        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "98765.43e-3";
        //Byte.parseByte()
        //Short.parseShort()
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String logicoStr = "TruE";
        // parseBoolean, true o false, aunque tenga Mayusculas indebidas
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        // Conversiones de tipo primitivos a cadenas
        int otroNumeroInt = 100;
        // 1ra forma
        System.out.println("otroNumeroInt = " + otroNumeroInt);

        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);
        // 2da forma - valueof, convertir primitivos a String
        otroNumeroStr = String.valueOf(otroNumeroInt+10);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        // un numero real o decimal a String
        // 1ra forma
        double otroRealDouble = 1.23456e2;  // 123.456
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr); // 1.23456 convertido a String
        // 2da forma
        otroRealStr = String.valueOf(1.23456e2f); // termina en f(es float)
        System.out.println("otroRealStr = " + otroRealStr);

        // Conversiones entre tipos
        int i = 22768;
        // int a short
        short s = (short)i;
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        System.out.println(Short.MAX_VALUE);
        // boolean b = (boolean) i;  boolean es incompatible a int
        char b = (char) i;
        System.out.println("b = " + b);
        float f = (float) i;
        System.out.println("f = " + f);
    }
}
