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
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;
 
import java.time.Duration;
 
public class DemoQAFormTest{
 
  
    public void fillForm() throws InterruptedException {
 
        // Setup
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 
        // Open URL
        driver.get("https://demoqa.com/automation-practice-form");
 
        // Scroll (important for hidden elements)
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
 
        // First Name
        driver.findElement(By.id("Name")).sendKeys("Shiva");
 
        // Last Name
        driver.findElement(By.id("lastName")).sendKeys("Dath");
 
        // Email
        driver.findElement(By.id("userEmail")).sendKeys("shiva@test.com");
 
        // Gender (click label)
        driver.findElement(By.xpath("//label[text()='Male']")).click();
 
        // Mobile
        driver.findElement(By.id("userNumber")).sendKeys("9876543210");
 
        // Date of Birth
        driver.findElement(By.id("dateOfBirthInput")).click();
        driver.findElement(By.className("react-datepicker__year-select")).sendKeys("1998");
        driver.findElement(By.className("react-datepicker__month-select")).sendKeys("May");
        driver.findElement(By.xpath("//div[text()='15']")).click();
 
        // Subjects
        WebElement subject = driver.findElement(By.id("subjectsInput"));
        subject.sendKeys("Maths");
        subject.sendKeys(Keys.ENTER);
 
        // Hobbies
        driver.findElement(By.xpath("//label[text()='Sports']")).click();
 
        // Upload Picture
        driver.findElement(By.id("uploadPicture"))
              .sendKeys("C:\\Users\\roodie\\Downloads\\zentsu.jpg");
 
        // Address
        driver.findElement(By.id("currentAddress"))
              .sendKeys("Kerala, India");
 
        // Scroll again
        js.executeScript("window.scrollBy(0,500)");
 
        // State
        driver.findElement(By.id("state")).click();
        driver.findElement(By.xpath("//div[text()='NCR']")).click();
 
        // City
        driver.findElement(By.id("city")).click();
        driver.findElement(By.xpath("//div[text()='Delhi']")).click();
 
        // Submit
        driver.findElement(By.id("submit")).click();
 
        Thread.sleep(3000);
 
        // Validation (Popup)
        String confirmationText = driver.findElement(By.id("example-modal-sizes-title-lg")).getText();
        System.out.println("Form Submitted: " + confirmationText);
 
        // Close
        driver.quit();
    }
    public static void main(String[] args) throws InterruptedException{
    
    DemoQAFormTest nm=new DemoQAFormTest();
    nm.fillForm();
    }
}
