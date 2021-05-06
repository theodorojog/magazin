package magazin;

public class Paznic extends Angajat{
    private static int salariuBaza=0;
    private int tura,bonusSalariu;

    public Paznic(String nume, String telefon, int tura, int bonusSalariu) {
        super(nume, telefon);
        this.tura = tura;
        this.bonusSalariu = bonusSalariu;
    }

    public int salariuTotal(){
        return salariuBaza+bonusSalariu;
    }

    public String toString() {
        return super.toString()+"Tura: " + tura  +" Bonus salariu: " + bonusSalariu+"\n"+"Salariu total: "+salariuTotal()+"\n";
    }

    public static int getSalariuBaza() {
        return salariuBaza;
    }

    public static void setSalariuBaza(int salariuBaza) {
        Paznic.salariuBaza = salariuBaza;
    }

    public int getTura() {
        return tura;
    }

    public void setTura(int tura) {
        this.tura = tura;
    }

    public int getBonusSalariu() {
        return bonusSalariu;
    }

    public void setBonusSalariu(int bonusSalariu) {
        this.bonusSalariu = bonusSalariu;
    }
}
