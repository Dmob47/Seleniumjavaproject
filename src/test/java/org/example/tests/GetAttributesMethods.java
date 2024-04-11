package org.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class GetAttributesMethods {

    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome","src/test/resources/drivers/chromedriver.exe");
        WebDriver Driver = new ChromeDriver();
        Driver.get("http://google.com");
        String Value =Driver.findElement(By.name("btnK")).getAttribute("data-ved");
        System.out.println(Value);


    }
}
