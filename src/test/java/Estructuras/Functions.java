package Estructuras;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Functions {

    static public void waitFor(WebDriver driver){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    static public void esperar(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
