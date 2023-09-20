
package com.selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class WebLocatorsIntegrador {

    WebDriver driver = null;

    @Test
    public void testWiki() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Abra el navegador en Chrome.

        // Vaya a una URL de tu preferencia.

        // Identifique un elemento por ID.

        driver.get("https://es.wikipedia.org/");

        // Localizar el cuadro de búsqueda por ID
        WebElement searchBox = driver.findElement(By.id("searchInput"));

        // Escribir dentro del cuadro de busqueda
        searchBox.sendKeys("Montoto es un capo");

        // Vaya a otra URL.

        driver.get("https://es.wikipedia.org/wiki/Jos%C3%A9_Gervasio_Artigas");

        // Identifique un elemento por LinkText.

        // Haga click en ese elemento.

        driver.findElement(By.linkText("Padre de la Patria")).click();

        // Cierre el navegador
        driver.quit();

    }
}
