package Interfaces_funcionales;

@FunctionalInterface
public interface InterFunc2 {
    public String saludaA(String nombre);
    public default String diceHolaMimosín() {
        return "Hola Mimosín";
    }
}
