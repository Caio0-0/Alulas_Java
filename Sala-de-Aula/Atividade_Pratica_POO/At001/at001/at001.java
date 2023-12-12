import at001.Cd;
import at001.Dvd;
import at001.Midia;

public class at001{
    public static void main(String[] args) {
        Cd cd1 = new Cd();
        Dvd dvd1 = new Dvd();
        Midia m1 = new Midia();
        
        System.out.println(cd1.getTipo());
        System.out.println(cd1.getDetalhes());
        cd1.setMusica(200);
        cd1.printDados();
        cd1.inserirDados(0, 0, null, 0);
        cd1.printDados();
        

    }
}