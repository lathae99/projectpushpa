import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testfordate {
    @Test
    void tesdate(){
        System.setProperty("webdriver.chrome.driver", "C://Users//shivaprasad//Downloads//chromedriver_win32 (2)//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://en.wikipedia.org/wiki/Pushpa:_The_Rise");
        driver.manage().window().maximize();
        String dor = driver.findElement(By.xpath("//tbody/tr[12]/td[1]/div[1]/ul[1]/li[1]")).getText();
        driver.get("https://www.imdb.com/title/tt9389998/");
        String releasedate = driver.findElement(By.xpath("//a[normalize-space()='January 7, 2022 (United States)']")).getText();
        Assert.assertEquals(dor,releasedate);
    }

}
