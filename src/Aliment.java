public class Aliment extends Produs{
    String conditiiExpunere;
    Aliment(String cod,String nume,int pret,int laRaft,int inDepozit,int reducere,Distribuitor distribuitor, String conditiiExpunere){
        super(cod,nume,pret,laRaft,inDepozit,reducere,distribuitor);
        this.conditiiExpunere=conditiiExpunere;
    }
}
