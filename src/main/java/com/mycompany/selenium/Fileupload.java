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
 
/**
 *
 * @author HP
 */
public class Fileupload {
    void upload(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement chosefilebtn=driver.findElement(By.xpath("//input[@id='file-upload']"));
        chosefilebtn.sendKeys("C:\\Users\\roodie\\Downloads\\zentsu.jpg");
        //chosefilebtn.sendKeys(Keys.RETURN);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            System.getLogger(Fileupload.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        WebElement submitbtn=driver.findElement(By.xpath("//input[@id='file-submit']"));
        submitbtn.click();
        String check=driver.findElement(By.cssSelector("div[class='example'] h3")).getText();
        if(check.contains("File Uploaded!"))
        {
            System.out.println("the file have been uploaded successfully");
        }
        else
        {
            System.out.println("the file has not been uploaded");
        }
    }
    public static void main(String[] args){
    Fileupload n=new Fileupload();
    n.upload();
    }
    
}

