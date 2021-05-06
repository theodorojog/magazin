package magazin;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public abstract class CsvLoader {
    File f;
    FileWriter fw;
    FileReader fr;

    public CsvLoader(String filepath){
        this.f=new File(filepath);
        try {
            this.fw = new FileWriter(f, true);
            this.fr= new FileReader(f);
        }
        catch (IOException e){};
    }


}
