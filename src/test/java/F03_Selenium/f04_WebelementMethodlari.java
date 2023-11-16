package F03_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class f04_WebelementMethodlari {

    public static void main(String[] args) {

        //1- Bir test class’i olusturun ilgili ayarlari yapin
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2- https://www.automationexercise.com/ adresine gidin

        driver.get("https://www.automationexercise.com/");

        //3- Sayfada 147 adet link bulundugunu test edin.
        List<WebElement> linkelementleriList = driver.findElements(By.tagName("a"));

        int expectedLinkSayisi = 147;
        int actualLinkSayisi = linkelementleriList.size();

        if (expectedLinkSayisi == actualLinkSayisi){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }


        //4- Products linkine tiklayin

        driver.findElement(By.partialLinkText(" Products")).click();

        //5- special offer yazisinin gorundugunu test edin

        WebElement specialOfferElementi = driver.findElement(By.id("sale_image"));

        if (specialOfferElementi.isDisplayed()){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }
        //6- Sayfayi kapatin

        driver.quit();
    }
}
