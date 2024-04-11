package org.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocatorIndexMethod {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
        if (driver.findElement(By.xpath("(//input[@type = 'radio' and @name = 'newsletter'])[1]")).isSelected()){
            System.out.println("Newsletter is enabled");
        }
        else {
            System.out.println("Newsletter is not enabled");
        }

    }
}
