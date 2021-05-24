package magazin;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Service {
    private final Connection conn;
    private final Logger logger;

    public Service(Connection conn,Logger logger) {
        this.conn = conn;
        this.logger=logger;
    }

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

    public void adaugaAngajat(){
        PreparedStatement pstm;
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
                System.out.println("Introdu bonusul de plata: ");
                b[3]=i.nextLine();
                try {
                    pstm = conn.prepareStatement("INSERT into magazin.angajati (nume,telefon) VALUES ( ?, ?);");

                    pstm.setString(1,b[0]);
                    pstm.setString(2,b[1]);
                    pstm.execute();
                    Statement stm=conn.createStatement();
                    ResultSet rs=stm.executeQuery("SELECT id_angajat FROM magazin.angajati ORDER BY id_angajat DESC LIMIT 0, 1;");
                    rs.next();
                    pstm= conn.prepareStatement("INSERT into magazin.lucratori_comerciali (id_lucrator_comercial,departament,bonus_salariu) VALUES ( ?, ?, ? );");
                    pstm.setInt(1,rs.getInt("id_angajat"));
                    pstm.setString(2,b[2]);
                    pstm.setInt(3,Integer.parseInt(b[3]));
                    pstm.execute();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                logger.LucratorComercialWrite();
                break;
            case "paznic":
                System.out.println("Introdu numele: ");
                b[0]=i.nextLine();
                System.out.println("Introdu numarul de telefon: ");
                b[1]=i.nextLine();
                System.out.println("Introdu tura de lucru: ");
                b[2]=i.nextLine();
                System.out.println("Introdu bonusul de plata: ");
                b[3]=i.nextLine();
                try {
                    pstm = conn.prepareStatement("INSERT into magazin.angajati (nume,telefon) VALUES ( ?, ?);");

                    pstm.setString(1,b[0]);
                    pstm.setString(2,b[1]);
                    pstm.execute();
                    Statement stm=conn.createStatement();
                    ResultSet rs=stm.executeQuery("SELECT id_angajat FROM magazin.angajati ORDER BY id_angajat DESC LIMIT 0, 1;");
                    rs.next();
                    pstm= conn.prepareStatement("INSERT into magazin.paznici (id_paznic,tura,bonus_salariu) VALUES ( ?, ?, ? );");
                    pstm.setInt(1,rs.getInt("id_angajat"));
                    pstm.setInt(2,Integer.parseInt(b[2]));
                    pstm.setInt(3,Integer.parseInt(b[3]));
                    pstm.execute();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                logger.PaznicWrite();
                break;
            default:
                System.out.println("Nu este o pozitie valida\n\n");

        }
    }

    public void afiseazaLucratoriComerciali(){
        try {
            Statement stm=conn.createStatement();

            ResultSet rs=stm.executeQuery("SELECT * FROM magazin.angajati JOIN magazin.lucratori_comerciali on(id_angajat=id_lucrator_comercial)");
            while(rs.next()){
                LucratorComercial a=new LucratorComercial(rs.getInt("id_angajat"),rs.getString("nume"),rs.getString("telefon"),rs.getString("departament"),rs.getInt("bonus_salariu"));
                System.out.println(a.toString());
            }
        }
         catch (SQLException throwables) {
        throwables.printStackTrace();
        }
    }

    public void afiseazaPaznici(){
        try {
            Statement stm=conn.createStatement();

            ResultSet rs=stm.executeQuery("SELECT * FROM magazin.angajati JOIN magazin.paznici on(id_angajat=id_paznic)");
            while(rs.next()){
                Paznic a=new Paznic(rs.getInt("id_angajat"),rs.getString("nume"),rs.getString("telefon"),rs.getInt("tura"),rs.getInt("bonus_salariu"));
                System.out.println(a.toString());
            }
        }
        catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


}

