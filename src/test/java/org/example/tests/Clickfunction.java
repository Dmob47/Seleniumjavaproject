package org.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Clickfunction {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome","src/test/resources/drivers/chromedriver.exe");
        WebDriver Driver = new ChromeDriver();
        Driver.get("https://www.saucedemo.com");
        Driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
        Driver.findElement(By.id("user-name")).clear();
        Driver.findElement(By.id("user-name")).click();
        Driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Driver.findElement(By.id("password")).clear();
        Driver.findElement(By.id("password")).click();
        Driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Driver.findElement(By.id("login-button")).click();
        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(Driver.findElement(By.id("item_4_title_link"))));
        Driver.findElement(By.id("item_4_title_link")).click();



    }
}
