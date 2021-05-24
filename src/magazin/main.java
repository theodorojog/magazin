package magazin;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;
import java.sql.*;

public class main {
    int profit;

    public static void main(String[] args){
        try {
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/magazin","root","pass");


            Scanner in=new Scanner(System.in);

            ArrayList<Distribuitor> distribuitors=new ArrayList<Distribuitor>();
            Logger logger=Logger.create("logs.txt");

            Service service=new Service(conn,logger);




            while(true) {
                System.out.println("Alege o optiune");
                System.out.println("1) Adauga distribuitor");
                System.out.println("2) Afiseaza distribuitori");
                System.out.println("3) Adauga angajat");
                System.out.println("4) Afiseaza lucratorii comerciali");
                System.out.println("5) Afiseaza paznicii");
                System.out.println("6) Seteaza salariul de baza al lucratorilor comerciali");
                System.out.println("7) Seteaza salariul de baza al paznicilor");
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
                        service.adaugaAngajat();
                        break;
                        case 4:
                            service.afiseazaLucratoriComerciali();
                            break;

                    case 5:
                        service.afiseazaPaznici();
                        break;
                    case 6:
                        y=x.nextInt();
                        LucratorComercial.setSalariuBaza(y);
                        break;
                    case 7:

                        y=x.nextInt();
                        Paznic.setSalariuBaza(y);
                        break;

                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }



    }
}
