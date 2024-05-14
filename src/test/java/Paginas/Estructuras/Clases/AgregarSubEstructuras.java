package Paginas.Estructuras.Clases;

import Paginas.Estructuras.Componentes.ComponentEstructuras;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;


public class AgregarSubEstructuras extends ComponentEstructuras {

	public AgregarSubEstructuras(WebDriver driver) {
		PageFactory.initElements( new AjaxElementLocatorFactory(driver, 20), this);
	}


	public void selectTablero() {btnEditar.click();}
	
	public void mandardatos(String nombre, String meta) {
	   txtnombre.sendKeys(nombre);
	   txtmeta.sendKeys(meta);
	   btnCrear.click();
	}






}