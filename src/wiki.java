
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wiki {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C://Users//shivaprasad//Downloads//chromedriver_win32 (2)//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://en.wikipedia.org/wiki/Pushpa:_The_Rise");

        driver.manage().window().maximize();

       String dor = driver.findElement(By.xpath("//tbody/tr[12]/td[1]/div[1]/ul[1]/li[1]")).getText();
       System.out.println("date of release" +dor);

      String country = driver.findElement(By.xpath("//td[normalize-space()='India']")).getText();
      System.out.println("country :" +country);

      driver.close();
    }
}