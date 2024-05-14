package Paginas.Estructuras.Clases;

import Paginas.Estructuras.Componentes.ComponentEstructuras;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;


public class CrearEstructuras extends ComponentEstructuras {

	public CrearEstructuras(WebDriver driver) {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver,20),this);
	}

	public WebElement openModal() {
		btnAgregar.click();
		return btnAgregar;
	}

	public void modalsendInfo(String Name, String Goal) {
		name.clear();
		name.sendKeys(Name);
		goal.clear();
		goal.sendKeys(Goal);
		btnCrear.click();
	}
}
