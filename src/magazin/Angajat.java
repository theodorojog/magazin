package magazin;

public class Angajat {
    private String nume, telefon;

    public Angajat(String nume, String telefon) {
        this.nume = nume;
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return "Nume: " + nume +"\nTelefon: " + telefon+"\n";
    }

    public String getNume() {
        return nume;
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
}
