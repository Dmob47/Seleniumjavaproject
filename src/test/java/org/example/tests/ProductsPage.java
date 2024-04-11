package org.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductsPage
{
    public static void main(String[] args)
    {
        System.setProperty("Webdriver.chrome","src/test/resources/drivers/chromedriver.exe");
        WebDriver Driver = new ChromeDriver();
        Driver.get("https://www.saucedemo.com/");
        Driver.findElement(By.id("user-name")).clear();
        Driver.findElement(By.id("user-name")).click();
        Driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Driver.findElement(By.id("password")).clear();
        Driver.findElement(By.id("password")).click();
        Driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Driver.findElement(By.id("login-button")).click();
        String title =  Driver.findElement(By.className("title")).getText();
        System.out.println(title);

    }
}
