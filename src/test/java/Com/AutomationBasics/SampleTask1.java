package Com.AutomationBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;
import java.time.Duration;


public class SampleTask1{
    // WebDriver driver;
    WebDriver driver;

    @Description("User sucessful lanched the browser")
    @Test(priority = 1)
    public void SetUp_Launch_Browser() throws InterruptedException {

        ChromeOptions chromeoptions = new ChromeOptions();
        chromeoptions.addArguments("--start-maximized");
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver(chromeoptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/");


    }


    @Description("Getting titile of the page")
    @Test(priority = 2)
    public void Titile_Validation() {
        //Wait before click on button
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        Assert.assertEquals(driver.getTitle(), "CURA Healthcare Service");
        System.out.println(driver.getTitle());

    }

    @Description("Click on the button-appoitment")
    @Test(priority = 3)
    public void Buttonclick() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.id("btn-make-appointment")).click();

    }

    @Description("User Login screen")
    @Test(priority = 4)
    public void User_Login_Screen() {

        String User_name = "John Doe";
        String pass_word = "ThisIsNotAPassword";

        WebElement Username = driver.findElement(By.id("txt-username"));
        Username.sendKeys(User_name);


        WebElement Password = driver.findElement(By.id("txt-password"));
        Username.sendKeys(pass_word);
        driver.findElement(By.id("btn-login")).click();
        assertThat(driver.getCurrentUrl()).isEqualTo("https://katalon-demo-cura.herokuapp.com/#appointment");


    }
}