package magazin;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class CsvLucratorComercial extends CsvLoader{
    private static CsvLucratorComercial instance;
    private static ArrayList<Angajat> arr;
    private Logger logger;

    private CsvLucratorComercial(ArrayList<Angajat> arr,String filepath) {
        super(filepath);
        this.arr = arr;
    }

    public static CsvLucratorComercial create(ArrayList<Angajat> arr,String filepath){
        if(instance==null){
            instance=new CsvLucratorComercial(arr,filepath);
        }
        return instance;
    }

    public void load(){
        try{
            BufferedReader reader=new BufferedReader(fr);
            String line= reader.readLine();
            while(line!=null){
                String[] s=line.split(",",4);
                arr.add(new LucratorComercial(s[0],s[1],s[2],Integer.parseInt(s[3])));
                line= reader.readLine();
            }

        }
        catch (IOException e){}

    }

    public void add(){
        LucratorComercial lc= (LucratorComercial) arr.get(arr.size()-1);
        try {
            fw.write(lc.getNume()+","+lc.getTelefon()+","+lc.getDepartament()+","+lc.getBonusSalariu()+"\n");
            fw.flush();
            logger.LucratorComercialWrite();
        } catch (IOException e) {
            System.out.println("wtf");
        }
    }

    public static void setArr(ArrayList<Angajat> arr) {
        CsvLucratorComercial.arr = arr;
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
