package Database;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class database {

    public database(){
        createFile();
    }

    public void createFile(){
        //create path for storage database
        String PATH = "D:\\receipt";
        String fileName = "R.xlsx";

        File directory = new File(PATH);
        if (! directory.exists()){
            directory.mkdir();
            // If you require it to make the entire directory path including parents,
            // use directory.mkdirs(); here instead.
        }

        File file = new File(PATH + "/" + fileName);
        if (! file.exists()){
            try{
                FileWriter fw = new FileWriter(file.getAbsoluteFile());
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write("");
                bw.close();
            }
            catch (IOException e){
                e.printStackTrace();
                System.exit(-1);
            }

        }
    }
}
