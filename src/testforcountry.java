import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testforcountry {
    @Test
    void countrytst() {
        System.setProperty("webdriver.chrome.driver", "C://Users//shivaprasad//Downloads//chromedriver_win32 (2)//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://en.wikipedia.org/wiki/Pushpa:_The_Rise");
        driver.manage().window().maximize();
        String country = driver.findElement(By.xpath("//td[normalize-space()='India']")).getText();
        driver.get("https://www.imdb.com/title/tt9389998/");
        String countryimdb = driver.findElement(By.xpath("//a[normalize-space()='India']")).getText();
        Assert.assertEquals(country,countryimdb);
    }
}












