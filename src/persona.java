public class persona {
    String nombre, coloFavorito;
    int edad;

    persona (String nombrePersona, int edadpersona, String colorFavoritoculo){
        nombre = nombrePersona;
        edad = edadpersona;
        coloFavorito = colorFavoritoculo;
    }
    public static void main(String[] args) {
        persona persona1 = new persona("guillermo", 12, "Negro");
        System.out.print(persona1.nombre);
        System.out.print(persona1.edad);
        System.out.print(persona1.coloFavorito);
    }

}
