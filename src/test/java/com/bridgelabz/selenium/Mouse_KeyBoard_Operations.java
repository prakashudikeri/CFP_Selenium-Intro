package com.bridgelabz.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Mouse_KeyBoard_Operations {

    @Test
    public void KeyBoard_Operations() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        Robot robo = null;
        try {
            robo = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }

        robo.keyPress(KeyEvent.VK_CONTROL);
        robo.keyPress(KeyEvent.VK_SHIFT);
        robo.keyPress(KeyEvent.VK_N);
        Thread.sleep(3000);
        robo.keyRelease(KeyEvent.VK_N);
        robo.keyRelease(KeyEvent.VK_SHIFT);
        robo.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(2000);

        robo.keyPress(KeyEvent.VK_CONTROL);
        robo.keyPress(KeyEvent.VK_T);
        robo.keyRelease(KeyEvent.VK_T);
        robo.keyRelease(KeyEvent.VK_CONTROL);

        driver.get("https://www.gmail.com");
        driver.navigate().to("http://www.gmail.com");
        Thread.sleep(2000);

        robo.keyPress(KeyEvent.VK_CONTROL);
        robo.keyPress(KeyEvent.VK_TAB);
        robo.keyRelease(KeyEvent.VK_TAB);
        robo.keyPress(KeyEvent.VK_9);
        robo.keyRelease(KeyEvent.VK_9);
        robo.keyPress(KeyEvent.VK_W);
        robo.keyRelease(KeyEvent.VK_TAB);
        robo.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(5000);

        driver.close();
    }

    @Test
    public void Mouse_Operations() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        Robot robo = null;
        try {
            robo = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }

        robo.mouseMove(0, 0);

    }
}
