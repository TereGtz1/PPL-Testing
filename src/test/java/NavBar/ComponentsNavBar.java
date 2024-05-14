package NavBar;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComponentsNavBar {

    @FindBy(xpath = "//i[contains(@class, 'fa fa-angle-double-left')]")
    public WebElement btnOcultarNavBar;

    @FindBy(className ="sideLogoS")
    public WebElement btnHome;

}
