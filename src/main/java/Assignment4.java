import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4
{
    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("divakar234@gmail.com");
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("divakar1234");

        driver.findElement(By.xpath("//input[@type='submit' and @value ='Login']")).click();

        if (driver.findElement(By.xpath("(//a[text()='Logout'])[1]")).isEnabled()){
            System.out.println("Logout link is displayed under MyAccount menu");
        }
        else {
            System.out.println("Logout link is not displayed under MyAccount menu");
        }


    }
}
