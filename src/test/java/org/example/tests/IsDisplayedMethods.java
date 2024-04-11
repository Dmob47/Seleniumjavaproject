package org.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class IsDisplayedMethods {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome","src/test/resources/drivers/chromedriver.exe");
        WebDriver Driver = new ChromeDriver();
        Driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
        Driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.MILLISECONDS);
        Driver.findElement(By.id("input-firstname")).click();
        Driver.findElement(By.id("input-firstname")).clear();
        Driver.findElement(By.id("input-firstname")).sendKeys("Divakar");
        Driver.findElement(By.id("input-lastname")).click();
        Driver.findElement(By.id("input-lastname")).clear();
        Driver.findElement(By.id("input-lastname")).sendKeys("Gulati");

        if (Driver.findElement(By.name("newsletter")).isDisplayed()){
             if (!Driver.findElement(By.xpath("(//input[@name='newsletter'])[1]")).isSelected()){
                 Driver.findElement(By.xpath("(//input[@name='newsletter'])[1]")).click();
             }

        }

        if (Driver.findElement(By.name("agree")).isEnabled()){
            Driver.findElement(By.name("agree")).click();
        }



    }
}
