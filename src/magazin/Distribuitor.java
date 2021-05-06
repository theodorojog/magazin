package magazin;

public class Distribuitor implements Comparable<Distribuitor> {
    private String nume;
    private String telefon;
    private String adresa;

    public Distribuitor(String nume, String telefon, String adresa) {
        this.nume = nume;
        this.telefon = telefon;
        this.adresa = adresa;
    }
    public String toString(){
        return "Nume: "+nume+"\nTelefon: "+telefon+"\nAdresa: "+ adresa+"\n";
    }
    public String getNume(){
        return this.nume;
    }


    @Override
    public int compareTo(Distribuitor d) {
        return this.getNume().compareTo(d.getNume());
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
}

