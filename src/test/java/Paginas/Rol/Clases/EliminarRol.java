package Paginas.Rol.Clases;

import Paginas.Rol.Componentes.ComponentRol;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static Estructuras.Functions.esperar;

public class EliminarRol  extends ComponentRol{

    public EliminarRol(WebDriver driver) {PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);}

    public WebElement modalEliminar() {
        btnBorrar.click();
        return btnBorrar;
    }

    public void deleteRol() {
        esperar(1000);
        btnEliminar.click();
    }
}
