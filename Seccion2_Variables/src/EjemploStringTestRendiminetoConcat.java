public class EjemploStringTestRendiminetoConcat {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();

        for(int i = 0; i < 100000; i++){
            // c = c.concat(a).concat(b).concat("\n"); // 500 ==> 2ms, 1000 => 7ms, 10000 => 134ms, 100000 => 5271ms
            // c += a + b +"\n"; //500 => 19ms, 1000 => 23ms, 10000 => 88ms, 100000 => 2096ms
             sb.append(a).append(b).append("\n"); // retorna la instancia del StringBuilder
            // ↑ 500 => 2ms, 1000 => 1ms, 10000 => 4ms, 100000 => 15ms
        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
    }
}