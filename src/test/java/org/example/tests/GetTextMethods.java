package org.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class GetTextMethods {

    public static void main(String[] args) {

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
        String text = Driver.findElement(By.xpath("//span[@class='title']")).getText();

        if (text.equals("Products")) {
            System.out.println("Text is matching");
        }
        else {
            System.out.println("Text is not matching");
        }
        String tag = Driver.findElement(By.id("item_4_img_link")).getTagName();
        if (tag.equals("a")){
            System.out.println("tagname is correct");
        }
        else {
            System.out.println("tagname is incorrect");
        }
        }
    }

