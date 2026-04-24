/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.selenium;

/**
 *
 * @author roodie
 */
 

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
 
public class FixedRobotCopyPaste{
    
    public static void main(String[] args) throws AWTException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        
        try {
            driver.get("https://www.google.com");
            driver.manage().window().maximize();
            
            // Find search box
            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys("Selenium Automation");
            
            // CRITICAL: Ensure browser has focus
            Thread.sleep(1000);
            
            // Method 1: Click on element to ensure focus
            searchBox.click();
            Thread.sleep(500);
            
            // Method 2: Use Actions class to ensure focus
            Actions actions = new Actions(driver);
            actions.click(searchBox).perform();
            Thread.sleep(500);
            
            // Now Robot commands should work
            selectAllText();
            Thread.sleep(500);
            copyText();
            Thread.sleep(500);
            
            // Clear and paste
            searchBox.clear();
            Thread.sleep(500);
            pasteText();
            
        } finally {
            Thread.sleep(3000);
            driver.quit();
        }
    }
    
    public static void selectAllText() throws AWTException {
        Robot robot = new Robot();
        
        // Add small delay before action
        robot.delay(200);
        
        // Press Ctrl
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.delay(100);
        
        // Press A
        robot.keyPress(KeyEvent.VK_A);
        robot.delay(100);
        
        // Release in reverse order
        robot.keyRelease(KeyEvent.VK_A);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        
        System.out.println("Select All performed");
    }
    
    public static void copyText() throws AWTException {
        Robot robot = new Robot();
        
        robot.delay(200);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_C);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_C);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        
        System.out.println("Copy performed");
    }
    
    public static void pasteText() throws AWTException {
        Robot robot = new Robot();
        
        robot.delay(200);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_V);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_V);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        
        System.out.println("Paste performed");
    }
}
