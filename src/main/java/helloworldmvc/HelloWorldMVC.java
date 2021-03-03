package helloworldmvc;

import helloworldmvc.controller.Controller;
import helloworldmvc.model.Model;
import helloworldmvc.view.View;

import java.io.FileNotFoundException;

public class HelloWorldMVC {
    public static void main(String[] args) throws FileNotFoundException {
        Controller c = new Controller(new Model(), new View());
        c.run();
    }
}
