package com.selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebAutomationII {

    WebDriver driver = null;

    @Test
    public void testWiki() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // EJERCICIO 1: abrir el navegador y navegar hacia una página web
        // Escribe un script que abra el navegador Chrome y vaya a la página principal
        // de Google

        driver.get("https://www.google.com/?hl=es");

        // EJERCICIO 2: manipular la ventana del navegador
        // Escribe un script que abra la página principal de Google, maximice la ventana
        // del navegador
        // y luego cierre el navegador.

        // Maximizar la ventana del navegador
        driver.manage().window().maximize();

        // Cerrar el navegador (comentado para continuar con los siguientes ejercicios)
        // driver.quit();

        // EJERCICIO 3: Navegación hacia atrás y hacia delante
        // escribe un script que abra la página principal de Google, luego vaya a la
        // página principal
        // de OpenAI, luego navegue hacia atrás a Google, luego hacia delante a OpenAI,
        // y finalmente
        // cierre el navegador

        // Abrir la página principal de Google
        driver.get("https://www.google.com");

        // Navegar a la página principal de OpenAI
        driver.navigate().to("https://www.openai.com");

        // Navegar hacia atrás a Google
        driver.navigate().back();

        // Navegar hacia delante a OpenAI
        driver.navigate().forward();

        // Cerrar el navegador
        driver.quit();
    }

}
