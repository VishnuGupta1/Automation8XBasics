package Automation_Bacis2.Com;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class SamplePageValidations {

    WebDriver driver;

   // @Description("User sucessful lanched the browser")
    @Test(priority = 1)
    public void SetUp_Launch_Browser() {
        driver = new ChromeDriver();
        //ChromeOptions chromeoptions = new ChromeOptions();
        //chromeoptions.addArguments("--start-maximized");
        //WebDriverManager.chromedriver().setup();
        //driver = new ChromeDriver(chromeoptions);
        driver.get("https://demo.us.espocrm.com/#");
        String strUrl = driver.getCurrentUrl();
        System.out.println("Current Url is:" + strUrl);

        Assert.assertEquals(driver.getCurrentUrl(), "https://demo.us.espocrm.com/#");


    }

    @Test(priority = 2)
    public void Username_Administration_Validation() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
/*
//Logo Validation
        WebElement logoPresent = driver.findElement(By.xpath("//div[@class='logo-container']/img"));
        Assert.assertTrue(logoPresent.isDisplayed());
        System.out.println("Logo validation passed");
*/

//Drop down Selection
        Select admin= new Select(driver.findElement(By.xpath("//*[@name='username']")));
        admin.selectByVisibleText("Administrator");

        //Language Selection
        Select dropdowns= new Select(driver.findElement(By.id("field-language")));
         List<WebElement> lang= dropdowns.getOptions();
         System.out.println(lang.size()); //length
        // Loop to print one by one
        for(WebElement options: lang)
            System.out.println(options.getText());
        dropdowns.selectByVisibleText("German");

        //Button Click
driver.findElement(By.xpath("//*[text()='Login']")).click();

    }

    @Test(priority = 3)
    public void HomePage_Validations(){
//Page Titile validation
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
WebElement createbutton=driver.findElement(By.xpath(" //*[contains(text(),'Create Account')]"));
Assert.assertTrue(createbutton.isDisplayed());
        createbutton.click();

    }
    }
