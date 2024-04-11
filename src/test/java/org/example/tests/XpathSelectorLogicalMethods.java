package org.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathSelectorLogicalMethods
{
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("test@123.com");
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("diva12345");
        driver.findElement(By.xpath("//input[@type = 'submit' and @value = 'Login']")).click();

        driver.findElement(By.xpath("//a[@class = 'btn btn-primary' or @text() = 'Continue']")).click();
    }
}
