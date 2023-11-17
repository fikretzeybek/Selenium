package F04_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class F01_Xpath_cozum1 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdrive.chrome.driver", "src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //1- https://testotomasyonu.com/addremove/ adresine gidin
        driver.get("https://testotomasyonu.com/addremove/");

        //2- Add Element butonuna basin
        driver.findElement(By.id("sub-btn")).click();

        //3- Delete butonu’nun gorunur oldugunu test edin
        WebElement arananButon = driver.findElement(By.className("remove-btn"));

        if (arananButon.isDisplayed()) {
            System.out.println("Remove gorunurluk testi PASSED");
        } else {
            System.out.println("Remove gorunurluk testi FAILED");

        }
        //4- Delete tusuna basin
        //driver.findElement(By.className("remove-btn")).click();
        arananButon.click();
        System.out.println("Butona basildi");

        // 5- “Add/Remove Elements” yazısının görünür olduğunu test et
        WebElement addRemoveText = driver.findElement(By.tagName("h2"));

        if (addRemoveText.isDisplayed()) {
            System.out.println("Add/Remove Elements yazısı görünürlük testi PASSED");
        } else {
            System.out.println("Add/Remove Elements yazısı görünürlük testi FAILED");
        }




        Thread.sleep(3000);
        driver.quit();
    }
}
