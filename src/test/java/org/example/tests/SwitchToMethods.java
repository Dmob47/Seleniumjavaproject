package org.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethods
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome","src/test/resources/drivers/chromedriver.exe");
        WebDriver Driver = new ChromeDriver();
        Driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//        Driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//        String alertMessage = Driver.switchTo().alert().getText();
//        System.out.println("Alert message is " + alertMessage);
//        Driver.switchTo().alert().accept();
//        Driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//        Driver.switchTo().alert().dismiss();
        Driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        Driver.switchTo().alert().sendKeys("Hello boi");
        Driver.switchTo().alert().accept(); 

    }
}
