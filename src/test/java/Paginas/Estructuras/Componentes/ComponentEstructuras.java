package Paginas.Estructuras.Componentes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComponentEstructuras {
    @FindBy(xpath = "//div[contains(text(),'Estructuras')]")
    public WebElement mEstructuras;

    @FindBy(css = "body.light:nth-child(2) div.container-fluid div.row main.main-container.px-sm-0.px-lg-5 div.col-8.offset-2:nth-child(3) div.accordion:nth-child(1) div.accordion-item h2.accordionHeader.accordion-header button.accordion-button.collapsed div.main.row div.text-end.mt-2.col-6 a.update_data.color-icon-details.ml-2:nth-child(1) > i.fa.fa-eye")
    public WebElement btnVerMas;

    @FindBy(xpath = "//body/div[@id='root']/main[1]/div[1]/div[1]/main[1]/main[1]/main[1]/div[2]/div[1]/div[1]/div[2]/i[1]")
    public WebElement btnEditar;

    @FindBy(xpath = "//input[@id='NAME']")
    public WebElement txtnombre;

    @FindBy(xpath = "//input[@id='goal']")
    public WebElement txtmeta;

    @FindBy(xpath = "//button[contains(text(),'Crear')]")
    public WebElement btnCrear;

    @FindBy(css = "body.light:nth-child(2) div.container-fluid div.row main.main-container.px-sm-0.px-lg-5 main:nth-child(1) main:nth-child(1) div.head:nth-child(1) div.d-inline-flex > button.btn-expand.btn-tz.ml-2.btn-tz-link:nth-child(1)")
    public  WebElement btnAgregar;

    @FindBy(id = "NAME")
    public WebElement name;

    @FindBy(id = "goal")
    public WebElement goal;

    @FindBy(css = "body.light.modal-open:nth-child(2) div.fade.modal-container.modal.show:nth-child(7) div.modal-dialog.modal-lg.modal-dialog-centered div.modal-content div.modal-body div.MuiBox-root.css-snsbfi:nth-child(1) div.MuiFormControl-root.MuiFormControl-fullWidth.MuiTextField-root.css-1picyw > div.MuiInputBase-root.MuiOutlinedInput-root.MuiInputBase-colorPrimary.MuiInputBase-fullWidth.MuiInputBase-formControl.MuiInputBase-sizeSmall.css-fmbgxk")
    public WebElement mnombre;

    @FindBy(xpath = "//button[contains(text(),'Guardar')]")
    public WebElement btnGuardar;

    @FindBy(css = "body.light:nth-child(2) div.container-fluid div.row main.main-container.px-sm-0.px-lg-5 div.col-8.offset-2:nth-child(3) div.accordion:nth-child(1) div.accordion-item h2.accordionHeader.accordion-header button.accordion-button.collapsed div.main.row div.text-end.mt-2.col-6 a.update_data.color-icon-details.mr-2:nth-child(3) > i.color-icon-delete.fa.fa-trash")
    public WebElement btnEliminar;

    @FindBy(xpath = "//button[contains(text(),'confirmar')]")
    public WebElement btnDelete;

    @FindBy(css = "body.light:nth-child(2) div.container-fluid div.row main.main-container.px-sm-0.px-lg-5 main:nth-child(1) main:nth-child(1) div.head:nth-child(1) div.d-inline-flex > button.btn-expand.btn-tz.ml-2.btn-tz-secondary:nth-child(2)")
    public WebElement btnMover;

    @FindBy(xpath = "//body/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/*[1]")
    public WebElement btnDE;

    @FindBy(xpath = "//body/div[@id='menu-']/div[3]/ul[1]/li[1]")
    public WebElement btnOP1;

    @FindBy(xpath = "//body/div[3]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/*[1]")
    public WebElement btnA;

    @FindBy(xpath = "//body/div[@id='menu-']/div[3]/ul[1]/li[2]")
    public WebElement btnOP2;

    @FindBy(xpath = "//body/div[3]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/*[1]")
    public WebElement btnAN2;

    @FindBy(xpath = "//body/div[@id='menu-']/div[3]/ul[1]/li[1]")
    public WebElement btnOP;

    @FindBy(xpath = "//button[contains(text(),'confirmar')]")
    public WebElement btnCrearM;

}
