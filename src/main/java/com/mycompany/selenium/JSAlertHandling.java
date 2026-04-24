/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.selenium;

/**
 *
 * @author roodie
 */
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class JSAlertHandling {
 
    public static void main(String[] args) throws InterruptedException {
 
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
 
        try {
            driver.get("https://the-internet.herokuapp.com/javascript_alerts");
            driver.manage().window().maximize();
 
            // ***********************
            // 1. SIMPLE ALERT
            // ***********************
            driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
 
            Alert simpleAlert = driver.switchTo().alert();
            System.out.println("Simple Alert Text: " + simpleAlert.getText());
            simpleAlert.accept(); // click OK
 
            Thread.sleep(1000);
 
            // ***********************
            // 2. CONFIRM ALERT
            // ***********************
            driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
 
            Alert confirmAlert = driver.switchTo().alert();
            System.out.println("Confirm Alert Text: " + confirmAlert.getText());
            confirmAlert.dismiss(); // click Cancel
 
            Thread.sleep(1000);
 
            // ***********************
            // 3. PROMPT ALERT
            // ***********************
            driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
 
            Alert promptAlert = driver.switchTo().alert();
            System.out.println("Prompt Text: " + promptAlert.getText());
 
            promptAlert.sendKeys("Hello Heroku App!"); // type text in prompt
            promptAlert.accept(); // click OK
 
            Thread.sleep(1000);
 
            // Result message
            String result = driver.findElement(By.id("result")).getText();
            System.out.println("Result Text: " + result);
 
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
