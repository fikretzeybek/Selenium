package F02_SeleniumIlkOtomasyon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class f04_navigateMethodlari {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        // testotomasyonu ana sayfaya gidin
        driver.get("http://www.testotomasyonu.com");

        // title' nin Otomasyon icerdigini test edin
        String expectedTitleIcerik = "Otomasyon";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitleIcerik)){
            System.out.println("Testotomasyonu title testi PASSED");
        }else {
            System.out.println("Testotomasyonu title testi FAILED");
        }

        //sonra wisequarter ana sayfaya gidin
        driver.navigate().to("https://www.wisequarter.com");

        //Url' nin wisequarter icerdigini test edin
        String expectedUrlIcerik = "wisequarter";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrlIcerik)){
            System.out.println("Wisequarter url testi PASSED");
        }else {
            System.out.println("Wisequarter url testi FAILED");
        }

        //tekrar test otomasyon sayfasina gidin
        driver.navigate().back();

        //Url' nin otomasyon icerdigini test edin
        expectedUrlIcerik = "otomasyon";
        actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrlIcerik)){
            System.out.println("Testotomasyonu URL testi PASSED");
        }else {
            System.out.println("Testotomasyonu URL testi FAILED");
            System.out.println("actual URL" + actualUrl);
        }

        // sayfayi kapatin






driver.quit();

    }
}
