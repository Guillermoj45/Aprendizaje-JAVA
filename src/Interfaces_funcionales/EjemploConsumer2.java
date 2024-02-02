package Interfaces_funcionales;

import java.util.function.Consumer;

public class EjemploConsumer2 {
    public static void main(String[] args) {
        Consumer<String> muestra1 = new Consumer<>() {
            @Override
            public void accept(String saludo) {
                System.out.println(saludo);
            }
        };
        Consumer<String> muestra2 = new Consumer<>() {
            @Override
            public void accept(String saludo) {
                System.out.println(saludo);
            }
        };
        Consumer<String> muestraSec = muestra1.andThen(muestra2);
        muestraSec.accept("Hola, soy yo Mimosín");
    }
}
