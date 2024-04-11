package org.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectElementMethods {

    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://only-testing-blog.blogspot.com/");
        WebElement element = driver.findElement(By.name("FromLB"));
        Select select = new Select(element);
        select.selectByValue("USA");
        select.selectByIndex(5);
        select.selectByVisibleText("Russia");
        //select.deselectByValue("USA");
        //select.deselectByIndex(5);
        select.deselectAll();
    }
}
