abstract class Animal {
    // Método abstracto sin cuerpo
    public abstract void sonidoAnimal();
    // Método normal con su cuerpo implementado
    public void dormir() {
        System.out.println("Zzz");
    }
}
class Cerdo extends Animal {
    public void sonidoAnimal() {
        // Aquí se le da cuerpo al método abstracto heredado
        System.out.println("El cerdo suena parecido a: uiii uiii");
    }
}
public class Pruebas_clases_abstraptas {
    public static void main(String[] args) {
        Cerdo miCerdo = new Cerdo();
        miCerdo.sonidoAnimal();
        miCerdo.dormir();
    }
}

