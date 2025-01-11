package Orange_HRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.time.Duration;

public class Basic_Setup_HRM {

    WebDriver driver;


    @Test
    public void LaunchBrowser(){
       ChromeOptions chromeoptions = new ChromeOptions();
        chromeoptions.addArguments("--start-maximized");
       // WebDriverManager.chromedriver().setup();
       // driver = new ChromeDriver(chromeoptions);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("https://demo.us.espocrm.com/?l=en_US#Account");

        driver.getCurrentUrl();

        driver.findElement(By.id("btn-login")).click();


    }
}
