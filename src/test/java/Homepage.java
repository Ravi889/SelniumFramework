import App.Base;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Boolean.FALSE;


public class Homepage extends Base {
    private  static java.util.logging.Logger log = java.util.logging.Logger.getLogger(Homepage.class.getName());

    @Test
    public void basePageNavigation() throws Exception {
    //    Logger log = LogManager.getLogger(Homepage.class.getName());
        WebDriver driver;
    //  Homepage hm =new Homepage();
        Base hm =new Base();
        driver = hm.initialise();
        //System.out.println(driver);
        driver.get("http://www.qaclickacademy.com/");
        //Assert.assertFalse(TRUE);
        Assert.assertTrue(FALSE);
        //Logger.getLogger("ee");
        log.info("asda");


    }
}
