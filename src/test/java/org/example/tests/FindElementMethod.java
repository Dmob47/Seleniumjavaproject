package org.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome","src/test/resources/drivers/chromedriver.exe");
        WebDriver Driver = new ChromeDriver();
        Driver.get("https://google.com");
        WebElement element =  Driver.findElement(By.name("btnK"));

        if (element.isEnabled()){
            System.out.println("element is enabled");
        }
        else {
            System.out.println("element is not enabled");
        }
    }
}
