import java.util.Comparator;

public class Distribuitor implements Comparable<Distribuitor> {
    String nume;
    String telefon;
    String adresa;

    public Distribuitor(String nume, String telefon, String adresa) {
        this.nume = nume;
        this.telefon = telefon;
        this.adresa = adresa;
    }
    public void afisare(){
        System.out.println("Nume: " + nume);
        System.out.println("Telefon: " + telefon);
        System.out.println("Adresa: "+ adresa);
    }
    public String getNume(){
        return this.nume;
    }


    @Override
    public int compareTo(Distribuitor d) {
        return this.getNume().compareTo(d.getNume());
    }
}

