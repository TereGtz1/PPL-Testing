package Paginas.Estructuras.Clases;

import Paginas.Estructuras.Componentes.ComponentEstructuras;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static Estructuras.Functions.esperar;

public class MoverEstructuras  extends ComponentEstructuras{

	public MoverEstructuras(WebDriver driver) {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver,20),this);
	}

	public WebElement openModal() {
		btnMover.click();
		return btnMover;
	}

	public void modalsendInfo() {
	    btnDE.click();
	    btnOP1.click();
	    
	    btnA.click();
	    btnOP2.click();

		esperar(2000);
	    
	    btnAN2.click();
	    btnOP.click();

		esperar(2000);
	    
	    btnCrearM.click();
	    btnCrearM.click();
	}
}



