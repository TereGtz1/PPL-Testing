package Paginas.Estructuras.Clases;

import Paginas.Estructuras.Componentes.ComponentEstructuras;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class PaginaEstructuras extends ComponentEstructuras{

	public PaginaEstructuras(WebDriver driver) {
		PageFactory.initElements( new AjaxElementLocatorFactory(driver, 20), this);
	}

	public void selectTablero() {
		mEstructuras.click();
	}

}