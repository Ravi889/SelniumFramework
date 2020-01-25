package App;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {
    static WebDriver driver;
    public static WebDriver initialise() throws Exception {
        Properties prop =new Properties();
        FileInputStream fis = new FileInputStream("E:\\SelniumFramework\\src\\main\\resources\\config.properties");
        prop.load(fis);
        String browser = prop.getProperty("browser");
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver;
    }

     public static void getScreenshot(String result) throws IOException
        {
           // System.out.println("getscreen "+driver);
            System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            try {
            File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(src, new File("D://test//"+result+"screenshot.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
