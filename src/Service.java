import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Service {
    static void adaugaDistribuitor(ArrayList<Distribuitor> d){
        Scanner in=new Scanner(System.in);
        System.out.println("Este producator?");
        String a=in.nextLine();
        String nume;
        String telefon;
        String adresa;
        int subventie;
        switch(a){
            case "da":
                System.out.println("Introdu numele");
                nume=in.nextLine();
                System.out.println("Introdu numarul de telefon");
                telefon=in.nextLine();
                System.out.println("Introdu adresa");
                adresa=in.nextLine();
                System.out.println("Introdu procentul subventionat");
                subventie=in.nextInt();
                d.add(new Producator(nume,telefon,adresa,subventie));
                break;
            default:
                System.out.println("Introdu numele");
                nume=in.nextLine();
                System.out.println("Introdu numarul de telefon");
                telefon=in.nextLine();
                System.out.println("Introdu adresa");
                adresa=in.nextLine();
                d.add(new Distribuitor(nume,telefon,adresa));
                break;

        }
        Collections.sort(d);
    }

    static void afiseazaDistribuitori(ArrayList<Distribuitor> d){
        if(d.size()<=0)
            System.out.println("Nu exista distribuitori");
        else
            for(int i=0;i<d.size();i++) {
                System.out.println(i);
                d.get(i).afisare();
            }
    }
}

