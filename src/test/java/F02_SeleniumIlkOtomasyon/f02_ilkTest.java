package F02_SeleniumIlkOtomasyon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class f02_ilkTest {
    public static void main(String[] args) throws InterruptedException {
        // testotomasyonu anasayfaya gidin
        // URL'in https://www.testotomasyonu.com oldugunu
        // ve Title'in test kelimesi icerdigini test edin

        //her test icin gerekli blokdur
        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // testotomasyonu anasayfaya gidin

        driver.get("https://www.testotomasyonu.com");

        // URL'in https://www.testotomasyonu.com oldugunu

        String expectedUrl = "https://www.testotomasyonu.com";
        String actUrl = driver.getCurrentUrl();

        if (expectedUrl.equals(actUrl)){
            System.out.println("URL testi PASSED");
        }else {
            System.out.println("URL testi FAILED");
            System.out.println("Actual URL :" +actUrl);
        }

        // ve Title'in test kelimesi icerdigini test edin

        String expectedTitleIcerigi = "test";
        String actualTitle = driver.getTitle();

        if (expectedTitleIcerigi.contains(actualTitle)){
            System.out.println("TITLE testi PASSED");
        }else{
            System.out.println("TITLE testi FAILED");
            System.out.println("Actual TITLE :" +actualTitle);
        }


        Thread.sleep(3000);

        driver.quit();

    }
}
