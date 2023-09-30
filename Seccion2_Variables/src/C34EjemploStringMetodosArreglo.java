public class C34EjemploStringMetodosArreglo {
    public static void main(String[] args) {
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.length() = " + trabalenguas.length());
        System.out.println("trabalenguas.toCharArray()" + trabalenguas.toCharArray());

        char[] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length;
        System.out.println("largo = " + largo);
        for(int i = 0; i < largo; i++){
            System.out.println("arreglo = " + arreglo[i]);
        }
        // Arreglo String segun un parametro
        // Convertir a String en un arreglo
        System.out.println();
        System.out.println("\ntrabalenguas = " + trabalenguas.split("a"));

        String[] arreglo2 = trabalenguas.split("a");
        int l = arreglo2.length;
        System.out.println("a es separador: trabalenguas");
        for (int j=0; j<l; j++){
            System.out.println(arreglo2[j]);
        }

        String archivo ="alguna.imagen.pdf";
        String[] archivoArr = archivo.split("\\."); //. → Caracter "."
        // El punto por si solo no funciona porque es una expresión regular
        l = archivoArr.length;
        System.out.println(". es separador: alguna.imagen.pdf");
        System.out.println("l = " + l);
        for (int j=0; j < l; j++){
            System.out.println(archivoArr[j]);
        }
        System.out.println("extension = " + archivoArr[l-1]);
    }
}
