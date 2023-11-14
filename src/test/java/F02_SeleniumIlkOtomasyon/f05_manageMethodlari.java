package F02_SeleniumIlkOtomasyon;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class f05_manageMethodlari {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        /*
        wait konusu ileride daha detayli anlatilacak
        implicitlyWait() methodu sayfanin yuklenmesi ve/veya
        arayacagimiz webelementleri bulmak icin dinamik olarak
        maximum bekleme suresidir

        Asil amac bekleme degil gorevi yapmaktir

        Burada tanimlanan sure gorevi yapmaya
        cabalayacagi max suredir
        bu sure icersinde gorevi yapamazsa
        exception firlatir
         */

        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());

        driver.manage().window().maximize();
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());

        driver.manage().window().fullscreen();
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());
        Thread.sleep(2000);

        // pencereyi baslangic noktasi (50,100) ve size' i(1000,700) yapin


        driver.manage().window().setSize(new Dimension(1000,700));
        driver.manage().window().setPosition(new Point(50,100));

        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());

        System.out.println(driver.manage().window().getSize().getWidth());


        Thread.sleep(2000);
        driver.quit();


    }
}
