package org.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectElementMethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko","src/test/resources/drivers/geckodriver.exe");
        WebDriver Driver = new FirefoxDriver();
        Driver.get("https://www.saucedemo.com/");
        Driver.findElement(By.id("user-name")).clear();
        Driver.findElement(By.id("user-name")).click();
        Driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Driver.findElement(By.id("password")).clear();
        Driver.findElement(By.id("password")).click();
        Driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Driver.findElement(By.id("login-button")).click();
        WebElement element = Driver.findElement(By.xpath("//select[@class = 'product_sort_container']"));
        Select select = new Select(element);
        //select.selectByVisibleText("Name (A to Z)");
        //select.selectByIndex(2);
        select.selectByValue("hilo");
        boolean multiplecheck = select.isMultiple();
        System.out.println(multiplecheck);
        Driver.quit();

    }
}
