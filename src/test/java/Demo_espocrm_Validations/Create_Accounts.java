package Demo_espocrm_Validations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;
import java.time.Duration;

public class Create_Accounts extends Basic_Setup {

    @Test(priority=2)
    public void Create_account_Validations() throws Exception {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        System.out.println(driver.getTitle());
    WebElement Account = driver.findElement(By.xpath("//*[contains(text(),'Create Account')]"));
    Account.click();
//Using explicit wait
       // WebElement accountElement = driver.findElement(By.xpath("//span[text()='Accounts']"));
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Accounts']")));
        //accountElement.click();



        //If user click on Save button

        WebElement SaveClick=driver.findElement(By.xpath("//*[text()='Save']"));
        SaveClick.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebElement error_message = driver.findElement(By.xpath("//*[text()='Not vali']"));
        Assert.assertEquals(error_message.getText(),"Not valid");
        System.out.println(error_message.getText());
       // assertThat(error_message.getText()).isNotEmpty().isNotBlank().isEqualTo("Your email, password, IP address or location did not match");


    }
}
