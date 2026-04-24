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
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
//import java.util.Scanner;
 
/**
 *
 * @author HP
 */
public class dropdown {
    void drop() throws InterruptedException{
       // Scanner sc=new Scanner(System.in);
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement newd=driver.findElement(By.id("dropdown"));
        newd.click();
        Select select = new Select(newd);
        //System.out.println("enter the option to select:");
        //String text=sc.nextLine();
        //select.selectByVisibleText("Option 2");
        //int option=sc.nextInt();
        select.selectByVisibleText("Option 1");
        System.out.println("Selected: " + select.getFirstSelectedOption().getText());
        Thread.sleep(5000);
        driver.quit();
    }
        public static void main(String[] args) throws InterruptedException
        {
        dropdown mg=new dropdown();
        mg.drop();
        }
}



