package magazin;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Service {
    public void adaugaDistribuitor(ArrayList<Distribuitor> d){
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

    public void afiseazaDistribuitori(ArrayList<Distribuitor> d){
        if(d.size()<=0)
            System.out.println("Nu exista distribuitori");
        else
            for(int i=0;i<d.size();i++) {
                System.out.print(i+1+" ");
                System.out.println(d.get(i));
            }
    }

    public void adaugaAngajat(ArrayList<Angajat> list){
        System.out.println("Angajatul este lucrator comercial sau paznic?");
        Scanner i=new Scanner(System.in);
        String[] b=new  String[4];
        String a=i.nextLine();
        switch (a){
            case "lucrator comercial":
                System.out.println("Introdu numele: ");
                b[0]=i.nextLine();
                System.out.println("Introdu numarul de telefon: ");
                b[1]=i.nextLine();
                System.out.println("Introdu departamentul: ");
                b[2]=i.nextLine();
                System.out.println("Introdu bunusul de plata: ");
                b[3]=i.nextLine();
                list.add(new LucratorComercial(b[0],b[1],b[2],Integer.parseInt(b[3])));
                break;
            case "paznic":
                System.out.println("Introdu numele: ");
                b[0]=i.nextLine();
                System.out.println("Introdu numarul de telefon: ");
                b[1]=i.nextLine();
                System.out.println("Introdu tura de lucru: ");
                b[2]=i.nextLine();
                System.out.println("Introdu bunusul de plata: ");
                b[3]=i.nextLine();
                list.add(new Paznic(b[0],b[1],Integer.parseInt(b[2]),Integer.parseInt(b[3])));
                break;
            default:
                System.out.println("Nu este o pozitie valida\n\n");

        }
    }

    public void afiseazaAngajati(ArrayList<Angajat> list){
        for(int i=0;i<list.size();i++){
            System.out.println((i+1)+" "+list.get(i)+"\n");
        }
    }


}

