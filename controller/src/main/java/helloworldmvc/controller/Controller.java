package helloworldmvc.controller;

import helloworldmvc.model.IModel;
import helloworldmvc.view.IView;

import java.io.FileNotFoundException;

public class Controller {
    private IModel model;
    private IView view;

    public Controller(IModel model, IView view){
        this.model = model;
        this.view = view;
    }

    public void run() throws FileNotFoundException {
        String str = this.model.getMessage();
        this.view.display(str);
    }

}
