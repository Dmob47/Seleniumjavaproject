package org.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathSelectorStartsWithMethod
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
        driver.manage().window().maximize();
        if (driver.findElement(By.xpath("//img[starts-with(@title,'Canon')]")).isDisplayed()) {
            System.out.println("Element is diplayed on the page");
            driver.findElement(By.xpath("//img[starts-with(@title,'Canon')]")).click();
        }

    }
}
