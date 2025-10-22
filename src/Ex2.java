class Televizor {
    public void conecteazaDevice(String device) {
        System.out.println("Acest televizor nu poate conecta un " + device);
    }
}
class TelevizorPerformant extends Televizor {
    public void conecteazaDevice (String device) {
        System.out.println(device + "a fost conectat cu succes la televizorul performant!");
    }
}

public class Ex2 {
    public static void main(String[] args) {
        Televizor tvSimplu = new Televizor();
        TelevizorPerformant tvSmart = new TelevizorPerformant();

        System.out.println("=== Televizor simplu ===");
        tvSimplu.conecteazaDevice("XBOX");

        System.out.println("\n=== Televizor performant ===");
        tvSmart.conecteazaDevice("XBOX");
    }
}
