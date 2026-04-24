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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.io.File;
 
/**
 *
 * @author HP
 */
public class filednld {
        void dnld(){
            WebDriverManager.chromedriver().setup();
            WebDriver driver=new ChromeDriver();
            driver.get("https://the-internet.herokuapp.com/download");
            WebElement img=driver.findElement(By.xpath("//a[normalize-space()='sample.pdf']"));
            img.click();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                System.getLogger(filednld.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
        String home = System.getProperty("user.home");
        String filePath = home + File.separator + "Downloads" + File.separator + "sample.pdf";
 
        File downloadedFile = new File(filePath);
            if (downloadedFile.exists()) {
            System.out.println("✅ File downloaded successfully: " + downloadedFile.getName());
            System.out.println("File size: " + downloadedFile.length() + " bytes");
        } else {
            System.out.println("❌ File not downloaded");
        }
            driver.quit();
        }
            public static void main(String[] args){
                filednld call=new filednld();
                call.dnld();
            }
}
