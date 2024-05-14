package Paginas.Login.Componentes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComponentLogin {
    @FindBy(xpath="//input[@id='mui-1']")
    public WebElement txtEmail;

    @FindBy(xpath="//input[@id='mui-2']")
    public WebElement txtPassWord;

    @FindBy(id="btnsignin")
    public WebElement btnLogin;
}
