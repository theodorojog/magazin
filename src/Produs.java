public class Produs {
    static int nrProduse=0;
    String cod;
    String nume;
    int pret;
    int laRaft;
    int inDepozit;
    int reducere;
    Distribuitor distribuitor;

    Produs(String cod,String nume,int pret,int laRaft,int inDepozit,int reducere,Distribuitor distribuitor){
        this.cod=cod;
        this.nume=nume;
        this.pret=pret;
        this.laRaft=laRaft;
        this.inDepozit=inDepozit;
        this.reducere=reducere;
        this.distribuitor=distribuitor;
    }
    Produs(){
        this.cod="nedefinit";
        this.nume="nedefinit";
        this.pret=0;
        this.laRaft=0;
        this.inDepozit=0;
        this.reducere=0;
    }
    public void afisare(){
        System.out.println("Cod: " + cod + " Nume: " + nume);
        System.out.println("Pret: " + pret + " Reducere: " + reducere);
        System.out.println("Stoc depozit: " + inDepozit + " Stoc magazin: " + laRaft);
    }
    public int pretRaft(){
        return pret*(1-reducere);
    }
    public int vinde(int i){
        if(i>laRaft)
            i=laRaft;
        laRaft=laRaft-i;
        return i*pretRaft();
    }
    public void umpleRaft(int i){
        if(i>inDepozit)
            i=inDepozit;
        laRaft=laRaft+i;
        inDepozit=inDepozit-i;
    }
    public void aruncaProduse(int i){
        if(i>inDepozit)
            i=inDepozit;
        inDepozit=inDepozit-i;
    }
    public static void stergeProdus(){
        nrProduse--;
    }
    public static void produsNou(){
        nrProduse++;
    }
}
