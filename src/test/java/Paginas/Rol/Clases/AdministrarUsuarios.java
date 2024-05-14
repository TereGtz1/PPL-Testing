package Paginas.Rol.Clases;

import Paginas.Rol.Componentes.ComponentRol;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static Estructuras.Functions.esperar;

public class AdministrarUsuarios extends ComponentRol{
    public AdministrarUsuarios(WebDriver driver) {PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);}

    public void verDetalles( WebDriver driver) {
        btnDetalles.click();
    }

    public void eliminarUsuario() {
        deleteUSer.click();
        esperar(1000);
        btnEliminar.click();
        //btnCancelar.click();
        //btnCloseModal.click();
    }

    public WebElement modalCapturista() {
        btnUsuarios.click();
        return btnUsuarios;
    }

    public void agregarUsuario() {
        esperar(1000);
        tabAgregarUsuario.click();
    }
}
