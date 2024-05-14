package Paginas.Estructuras.Clases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Paginas.Estructuras.Componentes.ComponentEstructuras;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class VerMas extends ComponentEstructuras{

	public VerMas(WebDriver driver) {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver,20),this);
	}

	public WebElement open() {
		btnVerMas.click();
		return btnVerMas;
	}
}



