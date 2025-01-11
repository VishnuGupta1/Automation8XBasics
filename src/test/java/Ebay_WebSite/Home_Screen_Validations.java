package Ebay_WebSite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Home_Screen_Validations extends Driver_Setup {
    //Enter Search

    @Test(priority = 2)
    public void Validations() {
        // //input[@id="gh-ac"]
        WebElement searchBox = driver.findElement(By.xpath("//*[@id='gh-ac-box2']/input[@id='gh-ac']"));
        searchBox.sendKeys("Machine");

        //Click on Search button
        WebElement searchButton = driver.findElement(By.xpath("//input[@value='Search']"));
        searchButton.click();

        List<WebElement> searchTitles = driver.findElements(By.xpath("//div[@class='s-item__title']"));
        List<WebElement> searchTitlesPrices = driver.findElements(By.xpath("//span[@class='s-item__price']"));

        int size = Math.min(searchTitlesPrices.size(), searchTitles.size());


        for (int i = 0; i < size; i++) {
            System.out.println("Title : " + searchTitles.get(i).getText() + " || " + "Price : " + searchTitlesPrices.get(i).getText());


        }
    }

    @Test(priority = 3)
    public void ListOF_Links() {
        List<WebElement> Links = driver.findElements(By.tagName("a"));
        System.out.println(Links.size());


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
           /*
           //Click on Item
           List<WebElement>Items= driver.findElements(By.xpath("//div[@class='s-item__title']"));

           for ( WebElement lists: Items ) {
                       if(lists.getText().contains("Auto Needle Threader DIY Tool Home Hand Machine Sewing Automatic Thread Device↷"))
                       lists.click();
                   }
*/
    }
        @Test(priority = 4)
        public void Shipping_andCheck () throws InterruptedException {
        Thread.sleep(2000);
            List<WebElement> Brand = driver.findElements(By.xpath(" //button[@aria-expanded='true']"));


            for (WebElement brandList : Brand) {
                System.out.println(brandList.getText());
                if (brandList.getText().contains("Used")){
                    brandList.click();
                    break;
                }
            }
        }
    }








