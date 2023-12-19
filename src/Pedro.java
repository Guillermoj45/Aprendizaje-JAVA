import static utiles.Utilidades.*;
public class Pedro {
    public static void main(String[] args) {
        int pedro = 10;
        Object suma = 23;
        String suma2 = "20";
        Object respuesta = (int) suma + Integer.parseInt(suma2);
        String pedro2 = "pito";
        String hol = " hola buenas tardes como te va la vida";
        print("hola buenas tades %s %s %s", pedro, pedro2, hol);
        int hola = 12;
        int hola1= 11;
        Object hola2 = (float) hola/hola1;
        Object hola12 = "hola buenas tardes";
        print(hola2);
        String json = (String) input("Escriba aqui lo que quieres que se repita: ");
        print(json);
    }
}
