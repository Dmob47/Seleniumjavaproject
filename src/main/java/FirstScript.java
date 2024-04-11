import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://gmail.com");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        if (title.equals("Gmail")){
            System.out.println("Title is correct");
        }
        else {
            System.out.println("Title is incorrect");
        }
        driver.quit();
        String imagesbutton = "//*[@id=\"gb\"]/div/div[1]/div/div[2]/a";
    }
}
