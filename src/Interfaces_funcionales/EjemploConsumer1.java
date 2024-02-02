package Interfaces_funcionales;

import java.util.function.Consumer;
public class EjemploConsumer1 {
    public static void main(String[] args) {
        Consumer<String> muestra = new Consumer<String>() {
            @Override
            public void accept(String saludo) {
                System.out.println(saludo);
            }
        };
        muestra.accept("Hola, soy yo Mimosín");
    }
}