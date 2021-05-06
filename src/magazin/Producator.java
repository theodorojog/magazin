package magazin;

public class Producator extends Distribuitor{
    private int subventie;

    public Producator(String nume, String telefon, String adresa,int subventie) {
        super(nume,telefon, adresa);
        this.subventie=subventie;
    }
    public String toString(){
        return super.toString()+"\nSubventie: "+subventie+"\n";
    }

    public int getSubventie() {
        return subventie;
    }

    public void setSubventie(int subventie) {
        this.subventie = subventie;
    }
}
