import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ignou_Admission_status_login {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://isms.ignou.ac.in/changeadmdata/AdmissionStatusNew.ASP");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@type='text' and @name ='EnrNo']")).click();
        driver.findElement(By.xpath("//input[@type='text' and @name ='EnrNo']")).sendKeys("2200412272");
        WebElement element= driver.findElement(By.xpath("//select[@name ='program']"));
        Select select = new Select(element);
        select.selectByValue("MBA");
        System.out.println("Please enter the verification code");
//        driver.quit();
    }
}
