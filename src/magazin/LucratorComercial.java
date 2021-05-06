package magazin;

public class LucratorComercial extends Angajat{
    private static int salariuBaza=0;
    private String departament;
    private int bonusSalariu;

    public LucratorComercial(String nume, String telefon, String departament, int bonusSalariu) {
        super(nume, telefon);
        this.departament = departament;
        this.bonusSalariu = bonusSalariu;
    }

    public int salariuTotal(){
        return salariuBaza+bonusSalariu;
    }

    @Override
    public String toString() {
        return super.toString()+"Departament: " + departament  +" Bonus salariu: " + bonusSalariu+"\n"+"Salariu total: "+salariuTotal()+"\n";
    }

    public static int getSalariuBaza() {
        return salariuBaza;
    }

    public static void setSalariuBaza(int salariuBaza) {
        LucratorComercial.salariuBaza = salariuBaza;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public int getBonusSalariu() {
        return bonusSalariu;
    }

    public void setBonusSalariu(int bonusSalariu) {
        this.bonusSalariu = bonusSalariu;
    }
}
