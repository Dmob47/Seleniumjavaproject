package org.example.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome","src/test/resources/drivers/chromedriver.exe");
        WebDriver Driver = new ChromeDriver();
        Driver.navigate().to("https://facebook.com");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Driver.navigate().to("https://udemy.com");
        Driver.navigate().back();
        Driver.navigate().refresh();
        Driver.navigate().forward();
    }
}
