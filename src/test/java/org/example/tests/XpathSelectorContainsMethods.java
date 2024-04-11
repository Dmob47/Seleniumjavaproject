package org.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathSelectorContainsMethods {

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("(//a[contains(@href,'contact')])[1]")).click();

        if (driver.findElement(By.xpath("//textarea[@id='input-enquiry']")).isDisplayed()){
            System.out.println("text is present");
        }
        else {
            System.out.println("text is not present");
        }



    }
}
