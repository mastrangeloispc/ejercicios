package com.selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebAutomationIII {

    WebDriver driver = null;

    @Test
    public void testWiki() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // PRACTICA INTEGRADORA:
        // 1. Abrir el navegador y navegar a la página de inicio de Google.
        driver.get("https://www.google.com/?hl=es");
       
        // 2. Maximizar la ventana del navegador.
        driver.manage().window().maximize();
        
        // 3. Navegar a la página de inicio de OpenAI.
        driver.navigate().to("https://www.openai.com");

        // 4. Reducir la ventana del navegador a la mitad de su tamaño y centrarla
        // en la pantalla.

        // Obtener la resolución del monitor
        Dimension screenSize = driver.manage().window().getSize();

        // Reducir la ventana del navegador a la mitad del tamaño obtenido
        Dimension halfSize = new Dimension(screenSize.getWidth() / 2, screenSize.getHeight() / 2);
        driver.manage().window().setSize(halfSize);

         // Centrar la ventana del navegador en la pantalla
        Point centerPosition = new Point((screenSize.getWidth() - halfSize.getWidth()) / 2, (screenSize.getHeight() - halfSize.getHeight()) / 2);
        driver.manage().window().setPosition(centerPosition);


        // 5. Navegar a la página de inicio de Wikipedia.
        driver.navigate().to("https://www.wikipedia.org/");
        
        // 6. Cambiar el tamaño de la ventana del navegador a su tamaño original
        driver.manage().window().maximize();

        // 7. Cerrar el navegador 
        driver.quit();


    }

}
