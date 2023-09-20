package com.selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebLocatorsByLinkTest {

     WebDriver driver = null;

    @Test
    public void testWiki() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Abrir la página de Wikipedia
        driver.get("https://es.wikipedia.org/wiki/Jos%C3%A9_Gervasio_Artigas");

        // // Localizar el cuadro de búsqueda por LinkText
        //  driver.findElement(By.linkText("Padre de la Patria")).click();

         // Localizar el cuadro de búsqueda por partialLinkText
         driver.findElement(By.partialLinkText("de la Patria")).click();



    
}
    
}
