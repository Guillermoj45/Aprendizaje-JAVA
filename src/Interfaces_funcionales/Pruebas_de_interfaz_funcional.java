package Interfaces_funcionales;

public class Pruebas_de_interfaz_funcional {
    public static void main(String[] args) {
        InterFunc1 hola = new InterFunc1() {
            @Override
            public String saludaA(String nombre) {
                return null;
            }
        };

        hola.saludaA("hola");

        InterFunc2 hola2 = new InterFunc2() {
            @Override
            public String saludaA(String nombre) {
                return null;
            }
        };

        hola2.diceHolaMimosín();
    }
}