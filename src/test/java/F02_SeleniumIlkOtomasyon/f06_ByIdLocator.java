package F02_SeleniumIlkOtomasyon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class f06_ByIdLocator {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.get("https://www.testotomasyonu.com");

        WebElement aramaKutusu = driver.findElement(By.id("global-search"));

        aramaKutusu.sendKeys("phone");

        aramaKutusu.submit();

        WebElement sonuYaziElementi = driver.findElement(By.className("product-count-text"));
        System.out.println(sonuYaziElementi.getText());

        String sonucSayisiStr = sonuYaziElementi.getText().replaceAll("\\D","");

        int sonucSayisiInt = Integer.parseInt(sonucSayisiStr);

        if (sonucSayisiInt > 0){
            System.out.println("Arama testi PASSED");
        }else{
            System.out.println("Arama testi FAILED");
        }




        Thread.sleep(2000);
        driver.quit();

    }
}
