package utiles;

public class Utilidades {
//    public static void print (Object texto) {
//        System.out.println(texto);
//    }
    public static void print (Object texto, Object... variables) {
        if (variables != null && variables.length > 0) {
            System.out.printf((texto.toString()) + "%n", variables);
        } else {
            System.out.println(texto);
        }
    }
}
