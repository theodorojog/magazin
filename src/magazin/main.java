package magazin;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    int profit;

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        Service service=new Service();
        ArrayList<Angajat> angajati=new ArrayList<Angajat>();
        ArrayList<Distribuitor> distribuitors=new ArrayList<Distribuitor>();
        Logger logger=Logger.create("logs.txt");

        CsvLucratorComercial csvLC=CsvLucratorComercial.create(angajati, "lucratori_comerciali.csv");
        csvLC.setLogger(logger);
        CsvPaznic csvP=CsvPaznic.create(angajati,"paznici.csv");
        csvP.setLogger(logger);
        csvLC.load();
        logger.LucratorComercialLoad();
        csvP.load();
        logger.PaznicLoad();


        while(true) {
            System.out.println("Alege o optiune");
            System.out.println("1) Adauga distribuitor");
            System.out.println("2) Afiseaza distribuitori");
            System.out.println("3) Adauga angajat");
            System.out.println("4) Afiseaza angajatii");
            System.out.println("5) Seteaza salariul de baza al lucratorilor comerciali");
            System.out.println("6) Seteaza salariul de baza al paznicilor");
            int a = in.nextInt();
            Scanner x=new Scanner(System.in);
            int y;
            switch (a) {
                case 1:
                    service.adaugaDistribuitor(distribuitors);
                    break;
                case 2:
                    service.afiseazaDistribuitori(distribuitors);
                    break;
                case 3:
                    service.adaugaAngajat(angajati);
                    String s=angajati.get(angajati.size()-1).getClass().getName();
                    System.out.println(s);
                    switch(s){
                        case "magazin.LucratorComercial":
                            csvLC.add();
                            break;
                        case "magazin.Paznic":
                            csvP.add();
                            break;
                    }
                    break;
                case 4:
                    service.afiseazaAngajati(angajati);
                    break;
                case 5:
                    y=x.nextInt();
                    LucratorComercial.setSalariuBaza(y);
                    break;
                case 6:

                    y=x.nextInt();
                    Paznic.setSalariuBaza(y);
                    break;

            }
        }



    }
}
