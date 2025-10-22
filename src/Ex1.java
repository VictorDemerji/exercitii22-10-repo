import java.util.Scanner;

    class Persoana {
        public String name;
        public int age;
        private String IDNP;

        // Constructor
        public Persoana(String name, int age, String IDNP) {
            this.name = name;
            this.age = age;
            this.IDNP = IDNP;
        }

        // Metodă specială pentru Politist: acces la IDNP
        public String getIDNP() {
            return IDNP;
        }

        // Politist poate schimba IDNP-ul (opțional)
        public void setIDNP(String IDNP) {
            this.IDNP = IDNP;
        }
    }

    class Politist {
        public void verificaPersoana(Persoana p) {
            System.out.println("Politistul verifica persoana:");
            System.out.println("Nume: " + p.name);
            System.out.println("Vârsta: " + p.age);
            System.out.println("IDNP: " + p.getIDNP());
        }
    }

    class PersoanaStraina {
        public void afiseazaDate(Persoana p) {
            System.out.println("Persoana străină vede doar:");
            System.out.println("Nume: " + p.name);
            System.out.println("Vârsta: " + p.age);
            // fără acces la IDNP
        }
    }

    public class Ex1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Introdu numele: ");
            String name = sc.nextLine();

            System.out.print("Introdu vârsta: ");
            int age = sc.nextInt();
            sc.nextLine(); // consumăm newline

            System.out.print("Introdu IDNP: ");
            String idnp = sc.nextLine();

            Persoana persoana = new Persoana(name, age, idnp);

            Politist politist = new Politist();
            PersoanaStraina straina = new PersoanaStraina();

            System.out.println("\n=== Verificare de către polițist ===");
            politist.verificaPersoana(persoana);

            System.out.println("\n=== Vizualizare de către persoană străină ===");
            straina.afiseazaDate(persoana);
        }
    }
