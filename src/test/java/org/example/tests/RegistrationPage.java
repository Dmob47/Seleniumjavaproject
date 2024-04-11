package org.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RegistrationPage
{
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
        driver.manage().window().maximize();
        driver.findElement(By.id("input-firstname")).sendKeys("Divakar");
        driver.findElement(By.id("input-lastname")).sendKeys("Gulati");
        driver.findElement(By.id("input-email")).sendKeys("divakar@test.com");
        driver.findElement(By.id("input-telephone")).sendKeys("1234567890");
        driver.findElement(By.name("password")).sendKeys("tester");
        driver.findElement(By.name("confirm")).sendKeys("tester");
//        driver.findElement(By.linkText("Login")).click();
//        if (driver.findElement(By.linkText("Login")).isDisplayed()){
//            System.out.println("Login text is displayed");
//        }
//        else {
//            System.out.println("Login text is not displayed");
//        }
//        driver.navigate().back();
        driver.findElement(By.partialLinkText("Log")).click();
        if (driver.findElement(By.partialLinkText("Log")).isDisplayed()){
            System.out.println("Login text is displayed");
        }
        else {
            System.out.println("Login text is not displayed");
        }
        driver.navigate().back();
        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        for (WebElement button: buttons){
            System.out.println(button.getText());
        }



    }

}
