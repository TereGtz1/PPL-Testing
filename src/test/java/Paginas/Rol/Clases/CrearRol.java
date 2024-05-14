package Paginas.Rol.Clases;

import Paginas.Rol.Componentes.ComponentRol;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class CrearRol extends ComponentRol {
    public CrearRol(WebDriver driver) {
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
    }

    public WebElement openModal(){
        btnCrear.click();
        return btnCrear;
    }

    public void createRol(String NameRol, WebDriver driver) {
        nameRol.clear();
        nameRol.sendKeys(NameRol);
    }
}
