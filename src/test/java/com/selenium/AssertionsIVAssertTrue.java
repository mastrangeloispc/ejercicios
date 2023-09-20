package com.selenium;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionsIVAssertTrue {

    WebDriver driver = null;

    @Test
    public void testWiki() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Práctica assertTrue
        // En estos ejercicios deberás usar el método assertTrue para realizar las
        // siguientes verificaciones.

        // Ejercicio 1: Verificar que la página de inicio de Google esté cargada.

        driver.get("https://www.google.com");

        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        assertTrue(actualTitle.contains(expectedTitle));

        // Ejercicio 2: Verificar que un producto esté disponible en Amazon.

        driver.get("https://www.amazon.com");

        String producto = "monitor";
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys(producto);
        searchBox.submit();

        boolean isAvailable = driver.findElements(By.xpath("//span[contains(text(), 'No results for')]")).isEmpty();
        assertTrue(!isAvailable);

    }
}
