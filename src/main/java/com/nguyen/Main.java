package com.nguyen;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://chat.openai.com/");
        driver.manage().deleteAllCookies();
        driver.findElement(By.xpath("//*[@id=\"prompt-textarea\"]")).sendKeys("what is the most popular transportation in Vietnam?");
        driver.findElement(By.xpath("//*[@id=\"prompt-textarea\"]")).sendKeys(Keys.RETURN);

    }

}