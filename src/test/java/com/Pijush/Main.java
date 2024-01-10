package com.Pijush;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Main 
{
    public static void main(String[] args)
    {

System.setProperty("webdriver.chrome.driver","C:\\Users\\2130982\\Maven\\hellomaven\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

        //WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }
}
