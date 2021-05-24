package magazin;

public class Angajat {
    private int id;
    private String nume, telefon;

    public Angajat(int id,String nume, String telefon) {
        this.id=id;
        this.nume = nume;
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return "ID: "+id+" Nume: " + nume +"\nTelefon: " + telefon+"\n";
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
