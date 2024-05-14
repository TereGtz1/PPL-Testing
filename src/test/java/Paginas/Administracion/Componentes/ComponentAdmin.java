package Paginas.Administracion.Componentes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComponentAdmin {
    //Abrir modulo
    @FindBy(xpath = "//div[contains(text(),'Administración')]")
    public WebElement mEstructuras;

    //Botón crear administrador
    @FindBy(xpath = "//button[contains(@class, btn-expandbtn-tzml-2btn-tz-link)]//i[contains(@class, btn-expand-text)]")
    public WebElement addAdmin;

    //Campos paso 1 crear
    @FindBy(id = "mui-component-select-roleId")
    public WebElement rolPrivil;

    @FindBy(id = "employeeId")
    public WebElement noID;

    @FindBy(id = "demo-simple-select")
    public WebElement department;

    @FindBy(xpath = "//body/div[@id='root']/main[1]/div[1]/div[1]/main[1]/div[4]/div[1]/div[1]/div[1]/div[2]/button[2]")
    public WebElement btnSiguientep1;

    //Campos paso 2 crear
    @FindBy(id = "name")
    public WebElement txtName;

    @FindBy(id = "lastName")
    public WebElement txtLastName;

    @FindBy(id = "secondLastName")
    public WebElement txtSecondLastName;

    @FindBy(id = "EMAIL")
    public WebElement txtEmail;

    @FindBy(xpath = "//body/div[@id='root']/main[1]/div[1]/div[1]/main[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]")
    public WebElement optionGender;

    @FindBy(id = "phoneNumber")
    public WebElement txtNumber;

    @FindBy(id = "//body/div[@id='root']/main[1]/div[1]/div[1]/main[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
    public WebElement Birthday;

    @FindBy(id = "curp")
    public WebElement curp;

    @FindBy(xpath = "//body/div[@id='root']/main[1]/div[1]/div[1]/main[1]/div[4]/div[1]/div[2]/div[1]/div[2]/button[2]")
    public WebElement btnSiguientep2;

    @FindBy()
    public WebElement txtColonia;

    @FindBy(id = "zipCode")
    public WebElement txtCode;

    @FindBy(name = "externalNumber")
    public WebElement txtExtNumber;

    @FindBy(name = "internalNumber")
    public WebElement txtIntNumber;
}
