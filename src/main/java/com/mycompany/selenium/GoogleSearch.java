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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
 
/**
 *
 * @author HP
 */
public class GoogleSearch {
    void googleSearchProcess(){
        try{
            WebDriverManager.chromedriver().setup();
            WebDriver chrome=new ChromeDriver();
            chrome.get("https://www.google.com");
            WebElement searchBox=chrome.findElement(By.name("q"));
            searchBox.sendKeys("Selenium WebDriver");
            Thread.sleep(1000);
            searchBox.submit();
            System.out.println("The page title after search is"+chrome.getTitle());
            chrome.quit();
        }
        catch(Exception e){
        System.out.println("The exception is"+e);
        }
    }
    public static void main(String[] args){
        
        GoogleSearch s= new GoogleSearch();
        s.googleSearchProcess();
    }
}
