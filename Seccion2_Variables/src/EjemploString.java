public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programación Java"; // Objeto tipo: String
        String curso2 = new String("Programación Java");
        String curso3 = new String("Programacion Java");
        String curso4 = new String("programación java");
        boolean esIgual = curso == curso2;
        System.out.println("curso == curso2 = " + esIgual);

        // Comparar
        esIgual = curso.equals(curso2); // Se compara el valor, no el objeto
        System.out.println("curso.equals(curso2) = " + esIgual);

        esIgual = curso.equals(curso3); // Se compara el valor, no el objeto
        System.out.println("curso.equals(curso3) = " + esIgual);

        esIgual = curso.equalsIgnoreCase(curso4); // .equalsIgnoreCase Ignora la mayuscula y minuscula
        System.out.println("curso.equalsIgnoreCase(curso4) = " + esIgual);

        String curso5 = "Programación Java";
        esIgual = curso == curso5;
        System.out.println("curso == curso5 = " + esIgual);
    }
}
