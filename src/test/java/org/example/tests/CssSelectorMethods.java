package org.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorMethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input#input-email")).sendKeys("divakar234@gmail.com");
        driver.findElement(By.cssSelector("input#input-password")).sendKeys("divakar1234");
        driver.findElement(By.cssSelector("input[value='Login']")).click();
    }
}
