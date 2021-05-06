package magazin;

public class Aliment extends Produs{
    private String conditiiExpunere;
    private int zileValabilitate;
    Aliment(String cod,String nume,int pret,int laRaft,int inDepozit,int reducere,Distribuitor distribuitor, String conditiiExpunere,int zileValabilitate){
        super(cod,nume,pret,laRaft,inDepozit,reducere,distribuitor);
        this.conditiiExpunere=conditiiExpunere;
        this.zileValabilitate=zileValabilitate;
    }

    public String toString(){
        super.toString();
        return "\nRecomandare expunere: "+conditiiExpunere+" Numar zile valabilitate: "+zileValabilitate;
    }

    public String getConditiiExpunere() {
        return conditiiExpunere;
    }

    public void setConditiiExpunere(String conditiiExpunere) {
        this.conditiiExpunere = conditiiExpunere;
    }

    public int getZileValabilitate() {
        return zileValabilitate;
    }

    public void setZileValabilitate(int zileValabilitate) {
        this.zileValabilitate = zileValabilitate;
    }
}
