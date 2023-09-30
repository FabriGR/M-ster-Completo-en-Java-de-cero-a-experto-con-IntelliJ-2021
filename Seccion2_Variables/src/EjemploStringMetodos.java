public class EjemploStringMetodos {
    public static void main(String[] args) {
       
        String nombre = "Andres";
        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Andres\") = " + nombre.equals("Andres"));
        System.out.println("nombre.equals(\"andres\") = " + nombre.equals("andres"));
        System.out.println("nombre.equalsIgnoreCase(\"andres\") = " + nombre.equalsIgnoreCase("andres"));
        // Orden lexico grafico (compareTo) - Orden numerico de la tabla Unicorn
        System.out.println("nombre.compareTo(\"Andres\") = " + nombre.compareTo("Andres")); // Identicos, igual = 0
        System.out.println("nombre.compareTo(\"Aaron\") = " + nombre.compareTo("Aaron"));
        // Convertir un String en caracteres (CharArt)
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0)); // A
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1)); // n
        System.out.println("nombre.charAt(5) = " + nombre.charAt(5)); // s  
        // Total -1
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));

        // Obtener fragmento del String (substring)
        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1, 4) = " + nombre.substring(1, 4));// de 1 hasta 4 (4 no se incluye)
        System.out.println("nombre.substring(4,5) = " + nombre.substring(4,5));// de 4 hasta 5 (5 no se incluye)
        // Obtener los ultimos caracteres
        System.out.println("nombre.substring(nombre.length()-1) = " + nombre.substring(nombre.length()-1));
        System.out.println("nombre.substring(nombre.length()-2) = " + nombre.substring(nombre.length()-2));


        String trabalenguas = "trabalenguas";
        // Reemplazar (replace)
        System.out.println("trabalenguas.replace(\"a\",\".\") = " + trabalenguas.replace("a","."));
        System.out.println("trabalenguas = " + trabalenguas);
        // Saber si se encuentra un caracter dentro del String
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a')); // 2 veces 'a'
        // Ultima ocurrencia (lastIndexOf)
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a')); // 10
        System.out.println("trabalenguas.indexOf('z') = " + trabalenguas.indexOf('z')); // Si no esta: -1
        System.out.println("trabalenguas.indexOf('t') = " + trabalenguas.indexOf("t"));
        // Secuancia de caracteres....    Curisidad (" " → String, ' ' → Carater)
        // Si un String esta dentro de un String (contains)
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("t"));
        // Si comienza con (.StartsWith) - boolean
        // Si termina con (.endsWith) - boolean
        System.out.println("trabalenguas.contains(\"lenguas\") = " + trabalenguas.contains("lenguas"));
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba")); // true
        System.out.println("trabalenguas.startsWith(\"leng\") = " + trabalenguas.startsWith("leng")); // false
        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("lenguas")); // true
        System.out.println("trabalenguas.endsWith(\"tr\") = " + trabalenguas.endsWith("tr")); // false

        // Quitar espacios en blanco (.trim)
        System.out.println(" trabalenguas ");
        System.out.println(" trabalenguas ".trim());
    }
}