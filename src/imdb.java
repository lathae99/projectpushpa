import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class imdb {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C://Users//shivaprasad//Downloads//chromedriver_win32 (2)//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.imdb.com/title/tt9389998/");
        driver.manage().window().maximize();

       String releasedate = driver.findElement(By.xpath("//a[normalize-space()='January 7, 2022 (United States)']")).getText();
       System.out.println("release date:" +releasedate);

       String country = driver.findElement(By.xpath("//a[normalize-space()='India']")).getText();
       System.out.println("country of release :" +country);

       driver.close();
    }
}
