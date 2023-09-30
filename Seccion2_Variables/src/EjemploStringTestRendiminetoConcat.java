public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Andrés Guzmán";

        String detalle = curso + " con el instructor " + profesor;
        System.out.println("detalle = " + detalle);

        int numeroA = 10;
        int numeroB = 5;

        System.out.println(detalle + (numeroA + numeroB));
        System.out.println(detalle + numeroA + numeroB);//Concadeno String ~Sum
        System.out.println(numeroA + numeroB + detalle); // Concadena la sum al String

        String detalle2 = curso.concat(" con ".concat(profesor)); // Concadena instancias y asigna a detalles
        System.out.println("detalle2 = " + detalle2);
    }
}