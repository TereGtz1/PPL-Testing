package Paginas.Rol.Clases;

import org.openqa.selenium.Keys;
import Paginas.Rol.Componentes.ComponentRol;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static Estructuras.Functions.esperar;

public class ActualizarRol extends ComponentRol{

    public ActualizarRol(WebDriver driver) {PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);}

    public void opciones(String newNameRol2) {
        btnOpciones.click();
        esperar(1000);
        newNameRol.click();
        newNameRol.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE);
        newNameRol.sendKeys(newNameRol2);
        btnGuardar.click();
    }
}
