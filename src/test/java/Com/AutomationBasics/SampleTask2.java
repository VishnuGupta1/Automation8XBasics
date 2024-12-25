package Com.AutomationBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;


public class SampleTask2 {
    // WebDriver driver;
    WebDriver driver;

    @Description("User sucessful lanched the browser-Task2")
    @Test(priority = 1)
    public void SetUp_Launch_Browser() throws InterruptedException {

        ChromeOptions chromeoptions = new ChromeOptions();
        chromeoptions.addArguments("--start-maximized");
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver(chromeoptions);
        driver.get("https://awesomeqa.com/practice.html");
        Assert.assertEquals(driver.getCurrentUrl(), "https://awesomeqa.com/practice.html");
Thread.sleep(3000);

    }


    @Description("Button_Handling")
    @Test(priority = 2)
    public void Button_Handling() {
driver.findElement(By.name("firstname")).sendKeys("Raju");
        driver.findElement(By.name("lastname")).sendKeys("Kumar");

        WebElement RadioButtons=driver.findElement(By.xpath("//*[contains(text(),'Gender')]"));
        RadioButtons.isDisplayed();
        System.out.println(RadioButtons.getSize());

driver.findElement(By.name("sex")).click();

    }
}