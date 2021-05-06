package magazin;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static Logger instance=null;
    private File f;
    private FileWriter fw;

    private Logger(String filepath){
        this.f=new File(filepath);
        try {
            this.fw = new FileWriter(f, true);
        }
        catch (IOException e){};
    }

    public static Logger create(String filepath) {
        if (instance == null) {
            instance = new Logger(filepath);
        }
        return instance;
    }

    public String timestamp(){
        return ZonedDateTime.now( ZoneId.systemDefault() ).format( DateTimeFormatter.ofPattern( " HH:mm:ss dd.mm.uuuu" ) );
    }

    public void newLog(String msj){
        try {
            fw.write(msj+","+ timestamp()+"\n");
            fw.flush();
        }
        catch (IOException e ){};
    }

    public void LucratorComercialLoad(){ newLog("Intrarile din lucratori_comerciali.csv au fost incarcate");}
    public void LucratorComercialWrite(){ newLog("Intrare noua adaugata in lucratori_comerciali.csv");}
    public void PaznicLoad(){ newLog("Intrarile din paznici.csv au fost incarcate");}
    public void PaznicWrite(){ newLog("Intrare noua adaugata in paznici.csv");}

    public void close(){
        try {
            fw.close();
        }
        catch (IOException e){};
    }



}
