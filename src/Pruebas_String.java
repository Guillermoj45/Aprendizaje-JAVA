public class Pruebas_String {
    public static void main(String args[]){
        String str1 = new String ("Hola");
        String str2 = "Hola";
        String str3 = str1.intern(); //se trae de la variable en memoria, sólo el contenido (sin referencias)
        System.out.println(str1==str2);
        System.out.println(str2==str3);
    }

}
