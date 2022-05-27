package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/*Login Facebook account using Selenium - Test*/

public class FaceBook_LogIn_Selenium_Intro {
    @Test
    public void selenium_Chrome_FB_LogIn() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                            "C:\\Users\\Prakash Udikeri\\IdeaProjects\\Selenium_CFP\\src\\WebDriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);

        driver.findElement(By.name("email")).sendKeys("Test@gmail.com");
        Thread.sleep(2000);

        driver.findElement(By.id("email")).clear();
        Thread.sleep(2000);

        driver.findElement(By.name("pass")).sendKeys("Test@123");

        System.out.println("Title of the Page: " + driver.getTitle());
        System.out.println("Current URL of the Page: " + driver.getCurrentUrl());
        Thread.sleep(2000);

        driver.close();
    }
}
