import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Project2
{
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver","src/test/resources/drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.demoblaze.com/");
//        driver.manage().window().maximize();

//        driver.findElement(By.xpath("//a[text()='Sign up']")).click();
//        driver.findElement(By.xpath("//input[@id='sign-username']")).sendKeys("dino@test.com");
//        driver.findElement(By.xpath("//input[@id='sign-password']")).sendKeys("dino123");
//        driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[2]")).click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[text()='Log in']")).click();
        driver.findElement(By.id("loginusername")).sendKeys("dino@test.com");
        driver.findElement(By.id("loginpassword")).sendKeys("dino123");
        driver.findElement(By.xpath("//button[@class='btn btn-primary' and text()='Log in']")).click();
        try {
            driver.manage().wait(30);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.xpath("//a[@class='hrefch' and text()='Nokia lumia 1520']")).click();
        driver.findElement(By.xpath("//a[@class='btn btn-success btn-lg' and text()='Add to cart']")).click();
        driver.findElement(By.id("cartur")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-success' and text()='Place Order']")).click();
        driver.findElement(By.id("name")).sendKeys("dino");
        driver.findElement(By.id("country")).sendKeys("dino pradesh");
        driver.findElement(By.id("city")).sendKeys("dino island");
        driver.findElement(By.id("card")).sendKeys("123456789");
        driver.findElement(By.id("month")).sendKeys("12");
        driver.findElement(By.id("year")).sendKeys("3232");
        driver.findElement(By.xpath("//button[@class='btn btn-primary' and text()='Purchase']")).click();


    }
}
