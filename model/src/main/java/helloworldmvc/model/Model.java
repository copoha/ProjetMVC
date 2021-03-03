package helloworldmvc.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Model implements IModel{

    public String getMessage(){
        String str="";
        try {
            String filepath = Model.class.getResource("message.txt").getFile();
            File messageFile = new File(filepath);
            Scanner sc = new Scanner(messageFile);
            while (sc.hasNextLine()){
                str+=sc.nextLine();
            }
        }catch (FileNotFoundException fe){
            str="ERROR - File not Found";
        }

        return str;
    }
}
