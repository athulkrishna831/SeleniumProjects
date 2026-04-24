/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.selenium;

/**
 *
 * @author roodie
 */
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import java.lang.Thread;
/**
 *
 * @author HP
 */
public class draganddrop {
    void drag() throws InterruptedException{
       WebDriverManager.chromedriver().setup();
       WebDriver driver=new ChromeDriver();
       driver.get("https://the-internet.herokuapp.com/drag_and_drop");
       Actions mouse=new Actions(driver);
       WebElement acol=driver.findElement(By.id("column-a"));
       WebElement bcol=driver.findElement(By.id("column-b"));
       Thread.sleep(3000);
       mouse.dragAndDrop(bcol, acol).perform();
       Thread.sleep(3000);
       mouse.dragAndDrop(acol, bcol).perform();
       System.out.println("drag and drop performed succesfully");
       driver.quit();
    }
    public static void main(String[] args) throws InterruptedException{
        draganddrop m=new draganddrop();
        m.drag();
       
    }
}
