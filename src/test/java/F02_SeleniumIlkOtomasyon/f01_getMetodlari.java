package F02_SeleniumIlkOtomasyon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class f01_getMetodlari {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("Webdriver.chrome.driver", "src/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.testotomasyonu.com");
        Thread.sleep(3000);

        driver.get("https://www.wisequarter.com");
        Thread.sleep(3000);

        //driver.get("www.youtube.com");
        // https yazilmadan calismaz

        driver.get("https://youtube.com");


        Thread.sleep(10000);
        driver.quit();

    }
}
