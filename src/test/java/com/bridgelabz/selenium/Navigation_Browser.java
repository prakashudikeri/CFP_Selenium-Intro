package com.bridgelabz.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Navigation_Browser {

    @Test
    public void Browser_Operations() throws InterruptedException{
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();

        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.navigate().to("http://www.gmail.com");
        Thread.sleep(5000);

        driver.navigate().back();
        Thread.sleep(2000);

        driver.navigate().forward();
        Thread.sleep(5000);

        driver.navigate().refresh();
        Thread.sleep(5000);

        driver.close();
    }


}
