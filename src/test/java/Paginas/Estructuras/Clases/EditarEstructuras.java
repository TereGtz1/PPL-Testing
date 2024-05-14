package Paginas.Estructuras.Clases;

import Paginas.Estructuras.Componentes.ComponentEstructuras;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import static Estructuras.Functions.esperar;

public class EditarEstructuras extends ComponentEstructuras{

	public EditarEstructuras(WebDriver driver) {
		PageFactory.initElements( new AjaxElementLocatorFactory(driver, 20), this);
	}

	public void selectTablero() {
		btnEditar.click();
	}
	
	public void mandardatos(String nombre, String meta) {
	    esperar(2000);
	    txtnombre.click();
	    txtnombre.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE);
	    txtnombre.sendKeys(nombre);
	    txtmeta.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE);
	    txtmeta.sendKeys(meta);
	    btnGuardar.click();
	}







}