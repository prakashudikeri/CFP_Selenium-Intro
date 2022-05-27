package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Scanner;

/*Create Facebook account using different browsers, Selenium - Test*/

public class FaceBook_CreateAccount {

    public static void main(String[] args) throws InterruptedException {
        FaceBook_Create_Account selection = new FaceBook_Create_Account();
        selection.typeOfBrowser();
    }

    private void typeOfBrowser() throws InterruptedException {
        FaceBook_Create_Account browser = new FaceBook_Create_Account();
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose the type of browser: \n 1: Google Chrome  \n 2: Microsoft Edge");
        System.out.println("Enter your Choice here: ");
        int choice = scan.nextInt();
        switch (choice){
            case 1:
                System.out.println("Google Chrome Launched!!!");
                browser.createAccount_Chrome();
                break;
            case 2:
                System.out.println("Microsoft Edge Launched!!!");
                browser.createAccount_Edge();
                break;
            case 3:
                System.out.println("Try Again!!! Enter a valid Choice!!!");
                break;
        }
    }

    @Test
    public void createAccount_Chrome() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                            "C:\\Users\\Prakash Udikeri\\IdeaProjects\\Selenium_CFP\\src\\WebDriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Test");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("123");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("test@gmail.com");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("test@gmail.com");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Test@1234");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("1");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("August");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("1999");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@name='websubmit']")).click();
        Thread.sleep(2000);

        driver.close();
    }

    @Test
    public void createAccount_Edge() throws InterruptedException {
        System.setProperty("webdriver.edge.driver",
                            "C:\\Users\\Prakash Udikeri\\IdeaProjects\\Selenium_CFP\\src\\WebDriver\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);

        driver.findElement(By.linkText("Create New Account")).click();
        Thread.sleep(2000);

        driver.findElement(By.name("firstname")).sendKeys("Prakash");
        Thread.sleep(2000);

        driver.findElement(By.name("lastname")).sendKeys("Udikeri");
        Thread.sleep(2000);

        driver.findElement(By.name("reg_email__")).sendKeys("Test@gmail.com");
        Thread.sleep(2000);

        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Test@gmail.com");
        Thread.sleep(2000);

        driver.findElement(By.name("reg_passwd__")).sendKeys("Test@123");
        Thread.sleep(2000);

        driver.findElement(By.id("day")).sendKeys("1");
        Thread.sleep(2000);

        driver.findElement(By.id("month")).sendKeys("August");
        Thread.sleep(2000);

        driver.findElement(By.id("year")).sendKeys("1999");
        Thread.sleep(2000);

        List<WebElement> gender = driver.findElements(By.name("sex"));
        gender.get(0).click();
        Thread.sleep(2000);

        System.out.println("Title of the Page: " + driver.getTitle());
        System.out.println("Current URL of the Page: " + driver.getCurrentUrl());

        driver.close();
    }
}
