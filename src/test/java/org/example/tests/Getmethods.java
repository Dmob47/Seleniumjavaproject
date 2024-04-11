package org.example.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getmethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome","src/test/resources/drivers/chromedriver.exe");
        WebDriver Driver = new ChromeDriver();
        Driver.get("https://google.com");
        String Title = Driver.getTitle();
        String URL = Driver.getCurrentUrl();
        String Source = Driver.getPageSource();

        System.out.println(Title + " " + URL + " " + Source);

        if (Source.contains("en-IN")){
            System.out.println("Text is present in the source code");
        }
        else
        {
            System.out.println("Text is not present in the source code");
        }
        //Driver.close();
        Driver.get("https://naukri.com");
        Driver.quit();
    }
}
