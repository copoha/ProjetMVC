

import helloworldmvc.model.Model;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestModel {
    @Test
    public void TestGetMessage(){
        Model model=new Model();
        String m=model.getMessage();
        Assert.assertNotNull(m);
        Assert.assertEquals(m, "Hello World !");
    }
}