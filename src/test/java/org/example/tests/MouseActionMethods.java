package org.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class MouseActionMethods
{
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.id("input-firstname"));

        Actions actions = new Actions(driver);

        actions.moveToElement(element).click(element).sendKeys("DIVAKAR").doubleClick(element).contextClick(element).build().perform();


    }
}
