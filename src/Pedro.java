import static utiles.Utilidades.*;
public class Pedro {
    public static void main(String[] args) {
        int pedro = 10;
        Object suma = 23;
        String suma2 = "20";
        Object respuesta = (int) suma + Integer.parseInt(suma2);
        String pedro2 = "Pedro2";
        String hol = " hola buenas tardes como te va la vida";
        print("hola buenas tades %s %s %s", pedro, pedro2, hol);
        int hola = 12;
        int hola1= 11;
        Object hola2 = (float) hola/hola1;
        Object hola12 = "hola buenas tardes";
        print(hola2);
        int hola21 = Integer.parseInt("22");
        int json =  Integer.parseInt((String) input("Escriba aqui lo que quieres que se repita: "));
        print(json);
        float json2 = (float) inputfloat("hola buenas tardes: ");
        print(json2);
//        int b = 0;
//        for(int a = 0; 100000000 >= a; a = a+1)
//        {
//            print("%s", a);
//            b = 99999999 + b;
//            print(b);
//        }
    }
}
