import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SampleBrowser_HandlingsTask1 {

   WebDriver.Driver;

    @Test(priority = 1)
    public void DriverSetup() {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
       ChromeDriver driver = new ChromeDriver(chromeOptions);
driver.get("https://katalon-demo-cura.herokuapp.com/");



    }

    @Test(priority = 2)
    public void Validation() {

driver.findElement
    }
}
