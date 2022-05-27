package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

/*Login Facebook account using different Timeouts of Selenium - Test*/

public class FaceBook_LogIn_TimeOuts {

        @Test
        public void selenium_Implicit() throws InterruptedException {
            System.setProperty("webdriver.chrome.driver",
                            "C:\\Users\\Prakash Udikeri\\IdeaProjects\\Selenium_CFP\\src\\WebDriver\\chromedriver.exe");

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // Wait for all element - Implicit

            driver.get("https://www.facebook.com/");
            Thread.sleep(2000);

            driver.findElement(By.name("email")).sendKeys("Test@gmail.com");
            Thread.sleep(2000);

            driver.findElement(By.name("pass")).sendKeys("Test@123");
            Thread.sleep(2000);

            driver.close();
        }

    @Test
    public void selenium_Explicit() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                            "C:\\Users\\Prakash Udikeri\\IdeaProjects\\Selenium_CFP\\src\\WebDriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5)); //Certain Condition or Element

        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);

        driver.findElement(By.name("pass")).sendKeys("123");
        Thread.sleep(2000);

        WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email"))); //Explicit way
        email.sendKeys("prakash@gmail.com");

        WebElement password = driver.findElement(By.name("pass"));
        password.sendKeys("Test@123");
        Thread.sleep(2000);

        driver.findElement(By.name("pass")).sendKeys("Test@123");
        Thread.sleep(2000);

        driver.close();
    }

}
