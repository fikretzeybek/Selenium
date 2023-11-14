package F02_SeleniumIlkOtomasyon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class f03_ {

    public static void main(String[] args) throws InterruptedException {
         /*
    Selenium 4.12 versiyonu ile
    kendi Webdriver' ini da olusturabiliyor

    Yani artik disardan bir webdriver tanimlma mecburiyeti kalmadi

    ANCAK..sirketlerin pek cogu kendilerine ozel olarak
    satin aldiklari webdriver' lari kullanabiliyor

    Biz bu duruma alismak icin
    Selenium webdriver yerine indirdigimiz driver.exe
        dosyasini kullanmaya devam edecegiz


     */

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.testotomasyonu.com");
        Thread.sleep(1000);

        //System.out.println(driver.getPageSource());

        System.out.println(driver.getWindowHandle());
        //Window handle degeri : selenium' un olusturdugu her webdriver objesine verdigi
        //                      uniq bir koddur
        //                      biz bu degerleri birden fazla sayfa acildiginda sayfalar arasi gecis icin kullanacagiz

        System.out.println(driver.getWindowHandles());


        Thread.sleep(3000);
        driver.quit();
    }


}
