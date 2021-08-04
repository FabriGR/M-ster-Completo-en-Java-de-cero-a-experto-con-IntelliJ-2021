public class PrimitivosFloat {
    //varFlotante es un atributo variable de la clase
    static float varFlotante;

    public static void main(String[] args) {

        float realFloat = 2.12e3f; //2120f; +"." corre 3 digitos →
        System.out.println("realFloat = " + realFloat);

        float realFloat2 = 1.5e4f; //15000f;
        System.out.println("realFloat = " + realFloat2);

        float realFloat3 = 1.5e-10f; //0.00000000015f;

        float realFloat4 = 0.00000000015f; // 1.5e-10f;
        System.out.println("realFloat = " + realFloat3);
        System.out.println("realFloat4 = " + realFloat4);

        System.out.println("float corresponde en byte a = " + Float.BYTES);
        System.out.println("float corresponde en bites a = " + Float.SIZE);
        System.out.println("máximo valor para float = " + Float.MAX_VALUE);
        System.out.println("mínimo valor para float = " + Float.MIN_VALUE);
        
        double realDouble = 3.4028235E39;
        System.out.println("realDouble = " + realDouble);

        System.out.println("double corresponde en byte a = " + Double.BYTES);
        System.out.println("double corresponde en bites a = " + Double.SIZE);
        System.out.println("máximo valor para double = " + Double.MAX_VALUE);
        System.out.println("mínimo valor para double = " + Double.MIN_VALUE);

        //float varFlotante;
        System.out.println("varFlotante = " + varFlotante);

        float varFlotante2 = 3.1416f;
        System.out.println("varFlotante2 = " + varFlotante2);
    }
}
