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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import java.util.Scanner;
import org.openqa.selenium.WebElement;
 
 
 
public class LoginTest {
    void logintest(){
    WebDriverManager.chromedriver().setup();
  
    WebDriver driver=new ChromeDriver();
    driver.get("https://the-internet.herokuapp.com/login");
    WebElement username=driver.findElement(By.id("username"));
    username.sendKeys("tomsmith");
    WebElement password=driver.findElement(By.id("password"));
    password.sendKeys("SuperSecretPassword!");
    driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
    String loginmessage=driver.findElement(By.id("flash")).getText();
    System.out.println("the login message is "+loginmessage);
       
    driver.quit();
    
    
    
    }
    public static void main(String[] args){
        LoginTest obj=new LoginTest();
        obj.logintest();
    }
}
