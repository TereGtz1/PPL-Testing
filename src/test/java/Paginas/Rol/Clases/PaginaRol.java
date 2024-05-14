package Paginas.Rol.Clases;

import Paginas.Rol.Componentes.ComponentRol;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static Estructuras.Functions.esperar;

public class PaginaRol extends ComponentRol{

    public PaginaRol(WebDriver driver) {
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
    }

    public void selectRol() { mRol.click(); }

    public void navBar() {btnOcultarNavBar.click();}

    public void irHome() {btnHome.click();}

}
