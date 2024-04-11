import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class FinalProject {

    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//span[text()='My Account']")).click();
        driver.findElement(By.xpath("//a[text()='Login']")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
        driver.findElement(By.id("input-email")).sendKeys("divakar234@gmail.com");
        driver.findElement(By.id("input-password")).sendKeys("divakar1234");
        driver.findElement(By.xpath("//input[@type='submit' and @value='Login']")).click();
        WebElement laptopsnotebooks = driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']"));
        WebElement showalllaptops = driver.findElement(By.xpath("//a[text()='Show AllLaptops & Notebooks']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(laptopsnotebooks).click(showalllaptops).build().perform();
        driver.findElement(By.xpath("(//span[text()='Add to Cart'])[3]")).click();
        driver.findElement(By.xpath("(//span[text()='Add to Cart'])[4]")).click();
        driver.findElement(By.xpath("//span[text()='Shopping Cart']")).click();

        if (driver.findElement(By.xpath("(//a[text()='MacBook Air'])[2]")).isDisplayed()){
            System.out.println("Macbook air is in the cart");
        }
        else {
            System.out.println("Macbook air is not in the cart");
        }

        if (driver.findElement(By.xpath("(//a[text()='MacBook Pro'])[2]")).isDisplayed()){
            System.out.println("Macbook pro is in the cart");
        }
        else {
            System.out.println("Macbook pro is not in the cart");
        }

        String totalbill = driver.findElement(By.xpath("(//td[@class='text-right' and text()='$3,000.00'])[2]")).getText();
        System.out.println("TOTAL AMOUNT IS "+ totalbill);

        driver.findElement(By.xpath("//a[@class='btn btn-primary' and text()='Checkout']")).click();

        driver.quit();


    }
}
