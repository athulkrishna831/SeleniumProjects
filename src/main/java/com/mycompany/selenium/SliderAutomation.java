/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.selenium;

/**
 *
 * @author roodie
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
 
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class SliderAutomation {
 
    public static void main(String[] args) throws InterruptedException {
 
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
 
        try {
            driver.manage().window().maximize();
            driver.get("https://testautomationpractice.blogspot.com/");
 
            // Locate slider handle
            WebElement slider = driver.findElement(By.xpath("//div[@class='ui-slider-range ui-corner-all ui-widget-header']"));
 
            // Create Actions class
            Actions actions = new Actions(driver);
           
            // Move slider to the right
           
            actions.dragAndDropBy(slider, 100, 0).perform();
            System.out.println("Slider moved right");
            Thread.sleep(2000);
 
            // Move slider to the left
            actions.dragAndDropBy(slider, -50, 0).perform();
            System.out.println("Slider moved left");
            Thread.sleep(2000);
 
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
