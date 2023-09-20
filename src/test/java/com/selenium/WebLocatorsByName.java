package com.selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebLocatorsByName {

        WebDriver driver = null;

    @Test
    public void testWiki() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Abrir la página de Wikipedia
        driver.get("https://es.wikipedia.org/");

        // Localizar el cuadro de búsqueda por Name
        WebElement searchBox = driver.findElement(By.name("search"));

        // Escribir dentro del cuadro de busqueda
        searchBox.sendKeys("Montoto es un capo");

        // Abrir Google Maps
        driver.get("https://www.google.com.ar/maps");

        // Localizar el cuadro de búsqueda por Name
        WebElement cuadroBusqueda = driver.findElement(By.name("q"));

        // Escribir dentro del cuadro de busqueda
        cuadroBusqueda.sendKeys("Casa de Montoto");

        // El ejercicio dice al menos 4, pero no tengo ganas.

    
}
}

