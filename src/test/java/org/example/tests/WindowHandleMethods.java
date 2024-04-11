package org.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandleMethods
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.naukri.com/");

        String mainwindow = driver.getWindowHandle();
        System.out.println(mainwindow);

        Set<String> handles = driver.getWindowHandles();
        for (String handle: handles){
            if (!mainwindow.equals(handle)){
                driver.switchTo().window(handle);
                System.out.println(driver.switchTo().window(handle).getTitle());
                driver.close();
            }
        }
        driver.switchTo().window(mainwindow);
        driver.findElement(By.xpath("//input[contains(@placeholder, 'Enter skills')]")).sendKeys("Automation Testing");
        driver.findElement(By.xpath("//div[text()='Search']")).click();


    }
}
