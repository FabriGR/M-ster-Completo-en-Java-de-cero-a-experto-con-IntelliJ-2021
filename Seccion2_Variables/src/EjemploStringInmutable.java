public class EjemploStringInmutable {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Andrés Guzmán";

        // Concadenar
        String resultado = curso.concat(profesor);
        System.out.println("profesor = " + profesor);
        System.out.println("resultado = " + resultado);
        System.out.println(curso == resultado); //False, 2 Objetos distintos
        // Resultado es resultado curso & profesor

        String resultado2 = curso.transform(c ->{ // c es curso
            return c + " con " + profesor;
        });//Transformar un String

        System.out.println("curso = " + curso);
        System.out.println("resultado2 = " + resultado2);
        String resultado3 = resultado.replace("a","A"); // reemplazamos "a" por "A"

        System.out.println("resultado = " + resultado);
        System.out.println("resultado3 = " + resultado3);
    }
}