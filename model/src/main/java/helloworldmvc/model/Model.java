package helloworldmvc.model;

import java.io.*;
import java.util.Scanner;

public class Model implements IModel{

    public String getMessage(){
        InputStream inputFile = Model.class.getResourceAsStream("message.txt");

        try(BufferedReader br = new BufferedReader(
                new InputStreamReader(inputFile)
        )) {
            return br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "ERROR: " + e.getMessage();
        }
    }

}
