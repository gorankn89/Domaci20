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
        String userName = "NekoIme iPrezime";
        String userEmail = "email@email.com";

        WebElement fullName = driver.findElement(By.id("userName"));
        WebElement email = driver.findElement(By.id("userEmail"));
        WebElement currentAdress = driver.findElement(By.id("currentAddress"));
        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        WebElement buttonSubmit = driver.findElement(By.id("submit"));




        // Upisujem podatke u stranicu i kliknem dugme submit

        fullName.sendKeys(userName);
        email.sendKeys(userEmail);
        currentAdress.sendKeys("Sadasnja Adresa 15");
        permanentAddress.sendKeys("Stalna Adresa 20");
        buttonSubmit.click();



        // Vracam podatke sa stranice za poredjenje
        WebElement fullNameResult = driver.findElement(By.id("name"));
        WebElement emailResult = driver.findElement(By.id("email"));
/*
ZADATAK ZA OVAJ DEO
        Uporediti da li u rezultatu (ispod submit), full name i email su isti kao uneseni pre submita, da nije doslo do izmene. Upisati odgovarajucu poruku ako su isti ili ako se razlikuju podaci.

                Zadatak okaciti na github.
*/
        System.out.println("Ime uneseno sa ispisom je : " + ((fullNameResult.getText().substring(fullNameResult.getText().length()-userName.length()).equals(userName))? "jednako":"nije jednako"));
        System.out.println("Email unesen sa ispisanim je: " + ((emailResult.getText().substring(emailResult.getText().length()-userEmail.length()).equals(userEmail))? "jednako" : "nije jednako"));






                System.out.println("Hello world!");
        Thread.sleep(10000);
        driver.close();
    }
}