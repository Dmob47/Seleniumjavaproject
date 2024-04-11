package org.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;

public class WebElementCommands {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome","src/test/resources/drivers/chromedriver.exe");
        WebDriver Driver = new ChromeDriver();
        Driver.get("https://www.saucedemo.com");
        Driver.findElement(By.id("user-name")).clear();
        Driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Driver.findElement(By.id("password")).clear();
        Driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
    }
}
