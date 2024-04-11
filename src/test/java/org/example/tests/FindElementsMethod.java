package org.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsMethod {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome","src/test/resources/drivers/chromedriver.exe");
        WebDriver Driver = new ChromeDriver();
        Driver.get("https://google.com");
        List<WebElement> allLinks = Driver.findElements(By.tagName("a"));
        for (WebElement e: allLinks){
            System.out.println(e.getText());
            
        }
    }
}
