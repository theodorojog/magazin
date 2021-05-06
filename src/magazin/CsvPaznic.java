package magazin;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class CsvPaznic extends CsvLoader{
    private static CsvPaznic instance;
    private static ArrayList<Angajat> arr;
    private Logger logger;

    private CsvPaznic(ArrayList<Angajat> arr,String filepath) {
        super(filepath);
        this.arr = arr;
    }

    public static CsvPaznic create(ArrayList<Angajat> arr,String filepath){
        if(instance==null){
            instance=new CsvPaznic(arr,filepath);
        }
        return instance;
    }

    public void load(){
        try{
            BufferedReader reader=new BufferedReader(fr);
            String line= reader.readLine();
            while(line!=null){
                String[] s=line.split(",",4);
                arr.add(new Paznic(s[0],s[1],Integer.parseInt(s[2]),Integer.parseInt(s[3])));
                line= reader.readLine();
            }

        }
        catch (IOException e){}

    }

    public void add(){
        Paznic lc= (Paznic) arr.get(arr.size()-1);
        try {
            fw.write(lc.getNume()+","+lc.getTelefon()+","+lc.getTura()+","+lc.getBonusSalariu()+"\n");
            fw.flush();
            logger.PaznicWrite();
        } catch (IOException e) {}
    }

    public static void setArr(ArrayList<Angajat> arr) {
        CsvPaznic.arr = arr;
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
