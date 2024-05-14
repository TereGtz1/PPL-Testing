package Paginas.Login.Clases;

import Paginas.Login.Componentes.ComponentLogin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class PaginaLogin extends ComponentLogin {

    public PaginaLogin(WebDriver driver) {
        PageFactory.initElements(new AjaxElementLocatorFactory(driver,40),this);
    }

    public void enterEmail(String email, String password) {
        txtEmail.clear();
        txtEmail.sendKeys(email);
        txtPassWord.clear();
        txtPassWord.sendKeys(password);
        btnLogin.click();

    }
}
