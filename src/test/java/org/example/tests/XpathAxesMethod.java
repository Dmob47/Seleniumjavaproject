package org.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxesMethod {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("(//input[@id='input-firstname']//following::input)[1]")).sendKeys("divakar");

        driver.findElement(By.xpath("//input[@value='Continue']//ancestor::div[1]/a")).click();

        driver.findElement(By.xpath("//input[@name='agree']//following-sibling::input")).click();

        driver.navigate().refresh();

        String actualtext = driver.findElement(By.xpath("//a[text()='login page']//parent::p")).getText();

        if (actualtext.equals("If you already have an account with us, please login at the login page.")){
            System.out.println("text is matching");

        }
        else {
            System.out.println("text is not matching");
        }

        driver.navigate().refresh();

        driver.findElement(By.xpath("//div[@id='account-register']//descendant::input[4]")).sendKeys("divakar@test.com");
    }
}
