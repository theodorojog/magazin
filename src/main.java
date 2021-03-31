import java.util.ArrayList;
import java.util.Scanner;

public class main {
    int profit;

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        ArrayList<Distribuitor> distribuitors=new ArrayList<Distribuitor>();
        while(true) {
            System.out.println("Alege o optiune");
            System.out.println("1) Adauga distribuitor");
            System.out.println("2) Afiseaza distribuitori");
            int a = in.nextInt();
            switch (a) {
                case 1:
                    Service.adaugaDistribuitor(distribuitors);
                    break;
                case 2:
                    Service.afiseazaDistribuitori(distribuitors);

            }
        }


    }
}
