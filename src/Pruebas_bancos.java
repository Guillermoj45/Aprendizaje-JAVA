abstract class Banco {
    abstract int cogeTipoInteres();
}
class Santander extends Banco{
    int cogeTipoInteres(){
        return 7;
    }
}
class BBVA extends Banco{
    int cogeTipoInteres() { return 8; }
}
public class Pruebas_bancos{
    public static void main(String[] args){
        Banco b;
        b = new Santander();
        System.out.print(b.getClass()+" ofrece ");
        System.out.println("un Tipo de Interés del: "+b.cogeTipoInteres()+"%");
        b = new BBVA();
        System.out.print(b.getClass()+" ofrece ");
        System.out.println("un Tipo de Interés del: "+b.cogeTipoInteres()+"%");
    }
}