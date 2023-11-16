package F03_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.List;

public class f02_ByClassname {

    public static void main(String[] args) {


        // 1- Bir test class’i olusturun ilgili ayarlari yapin
        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com/");

        //3- Category bolumundeki elementleri locate edin
        List<WebElement> katagoriElementleriListesi = driver.findElements(By.className("panel_title"));
        //4- Category bolumunde 3 element oldugunu test edin

        int expectedKatagorisayisi = 3;
        int actualKatagoriSayisi = katagoriElementleriListesi.size();

        if (expectedKatagorisayisi == actualKatagoriSayisi) {
            System.out.println("Katagori sayisi testi PASSED");
        } else {
            System.out.println("Katagori sayisi testi FAILED");
        }
        //5- Category isimlerini yazdirin
        System.out.println(ReusableMethods.stringListeDonustur(katagoriElementleriListesi));
        //6- Sayfayi kapatin

        driver.quit();


    }
}
