package Paginas.Estructuras.Clases;

import Paginas.Estructuras.Componentes.ComponentEstructuras;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static Estructuras.Functions.esperar;

public class EliminarEstructura extends ComponentEstructuras{
    private WebDriver driver;

    public EliminarEstructura(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
    }

    public WebElement openModale() {
        btnEliminar.click();
        return btnEliminar;
    }

    public void eliminar() {
        esperar(1000);
        btnDelete.click();

    }
}


