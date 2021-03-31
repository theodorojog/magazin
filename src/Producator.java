public class Producator extends Distribuitor{
    int subventie;
    public Producator(String nume, String telefon, String adresa,int subventie) {
        super(nume,telefon, adresa);
        this.subventie=subventie;
    }
}
