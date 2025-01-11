package Ebay_WebSite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import static org.assertj.core.api.Assertions.*;
public class Driver_Setup {

    WebDriver driver;


    @Test
    public void LaunchBrowser(){
       ChromeOptions chromeoptions = new ChromeOptions();
        chromeoptions.addArguments("--start-maximized");
       // WebDriverManager.chromedriver().setup();
       // driver = new ChromeDriver(chromeoptions);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("https://www.ebay.com/b/Desktops-All-In-One-Computers/171957/bn_1643067");

        driver.getCurrentUrl();

//Verify Title
        Assert.assertEquals(driver.getTitle(), "Desktops & All-In-One Computers | eBay");

        // AssertJ Assertion
        assertThat(driver.getTitle()).isNotBlank().isNotEmpty().isEqualTo("Desktops & All-In-One Computers | eBay");




    }
}
