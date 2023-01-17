package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");

        WebElement fullName = driver.findElement(By.id("userName"));
        WebElement email = driver.findElement(By.id("userEmail"));
        WebElement currentAdress = driver.findElement(By.id("currentAddress"));
        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        WebElement buttonSubmit = driver.findElement(By.id("submit"));


        fullName.sendKeys("NekoIme iPrezime");
        email.sendKeys("email@email.com");
        currentAdress.sendKeys("Sadasnja Adresa 15");
        permanentAddress.sendKeys("Stalna Adresa 20");
        buttonSubmit.submit();







        System.out.println("Hello world!");
        Thread.sleep(10000);
        driver.close();
    }
}