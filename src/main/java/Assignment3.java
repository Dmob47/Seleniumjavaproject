import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
        driver.findElement(By.id("input-firstname")).clear();
        driver.findElement(By.id("input-firstname")).sendKeys("Divakar");
        driver.findElement(By.id("input-lastname")).clear();
        driver.findElement(By.id("input-lastname")).sendKeys("Gulati");
        driver.findElement(By.id("input-email")).sendKeys("divakar234@gmail.com");
        driver.findElement(By.id("input-telephone")).sendKeys("9823456734");
        driver.findElement(By.id("input-password")).sendKeys("divakar1234");
        driver.findElement(By.id("input-confirm")).sendKeys("divakar1234");

        if (driver.findElement(By.name("newsletter")).isDisplayed()){
            if (!driver.findElement(By.xpath("(//input[@name='newsletter'])[1]")).isSelected()){
                driver.findElement(By.xpath("(//input[@name='newsletter'])[1]")).click();
            }

        }

        if (driver.findElement(By.name("agree")).isEnabled()){
            driver.findElement(By.name("agree")).click();
        }
        driver.findElement(By.xpath("//input[@value='Continue']")).click();
        String text = driver.findElement(By.xpath("//div[@id='content']//p")).getText();

        if (text.equals("Congratulations! Your new account has been successfully created!")) {
            System.out.println("Text is matching");
        }
        else {
            System.out.println("Text is not matching");
        }



    }
}
