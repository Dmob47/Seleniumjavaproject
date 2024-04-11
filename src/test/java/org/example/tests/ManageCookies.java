package org.example.tests;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class ManageCookies
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome","src/test/resources/drivers/chromedriver.exe");
        WebDriver Driver = new ChromeDriver();
        Driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");

        Set<Cookie> cookies = Driver.manage().getCookies();
        System.out.println(cookies);

        Cookie curr = Driver.manage().getCookieNamed("currency");
        System.out.println(curr);

        Cookie customcookie = new Cookie("User","TimidTester");
        Driver.manage().addCookie(customcookie);
        System.out.println(Driver.manage().getCookieNamed("User"));

        Driver.manage().deleteCookie(customcookie);
        Driver.manage().deleteCookieNamed("currency");
        Driver.manage().deleteAllCookies();

        Set<Cookie> cookies1 = Driver.manage().getCookies();
        System.out.println(cookies1);


    }
}
