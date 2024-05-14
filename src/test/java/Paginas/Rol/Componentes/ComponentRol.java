package Paginas.Rol.Componentes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComponentRol {

    //@FindBy(xpath = "//div[contains(text(),'Rol/Privilegios')]")
    @FindBy(css = "body.light:nth-child(2) div.login_option_container.bg-minimalize-dark div.ag-format-container div.overlay_mask_menu div.ag-courses_box div.ag-courses_item:nth-child(19) a.ag-courses-item_link > div.ag-courses-item_title:nth-child(2)")
    public WebElement mRol;

    @FindBy(xpath = "//button[contains (@class,'btn-expand btn-tz ml-2 btn-tz-link')]")
    public WebElement btnCrear;

    @FindBy(xpath = "//input[@id='outlined-size-normal']")
    public WebElement nameRol;

    @FindBy(xpath = "//button[contains (@class, 'btn-tz btn-tz-create')]")
    public WebElement btnGuardar;

    //@FindBy(css = "div.project.project-tasks.col2 div.project-column:nth-child(1) div.h100vh-options div.col-12.mb-3:nth-child(2) div.col-12.row.d-flex.align-items-center div.col div.MuiCollapse-root.MuiCollapse-vertical.MuiCollapse-entered.css-c4sutr div.MuiCollapse-wrapper.MuiCollapse-vertical.css-hboir5 div.MuiCollapse-wrapperInner.MuiCollapse-vertical.css-8atqhb > div.draggable.task__tag.row.justify-content-between:nth-child(2)")
    //public WebElement from;

    @FindBy(css = "body.light:nth-child(2) div.container-fluid div.row main.main-container.px-sm-0.px-lg-5 div.create_new_role div.create_new_role_data.row:nth-child(2) div.project.project-tasks.col2 div.project-column:nth-child(1) div.h100vh-options div.col-12.mb-3:nth-child(3) div.col-12.row.d-flex.align-items-center div.col div.MuiCollapse-root.MuiCollapse-vertical.MuiCollapse-entered.css-c4sutr div.MuiCollapse-wrapper.MuiCollapse-vertical.css-hboir5 div.MuiCollapse-wrapperInner.MuiCollapse-vertical.css-8atqhb > div.draggable.task__tag.row.justify-content-between:nth-child(1)")
    public WebElement from;

    @FindBy(css = "div.project.project-tasks.col2 div.project-column:nth-child(2) div:nth-child(4) > div.h100vh-options")
    public WebElement to;

    @FindBy(css = "div.accordion-item:nth-child(6) h2.accordion-header button.accordion-button.collapsed div.main.row div.col-auto > i.color-icon-delete.cursor-pointer.fa.fa-trash.mr-2")
    public WebElement btnBorrar;

    @FindBy(xpath = "//img[contains(@class, 'modalClose justify-content-end')]")
    public WebElement btnCloseModal;

    @FindBy(xpath = "//button[contains(text(),'Eliminar')]")
    public WebElement btnEliminar;

    @FindBy(xpath = "//button[contains(text(),'Cancelar')]")
    public WebElement btnCancelar;

    @FindBy(css = "div.accordion-item:nth-child(6) h2.accordion-header button.accordion-button.collapsed div.main.row div.col-auto > i.color-icon-settings.cursor-pointer.fa.fa-cogs.ml-2.mr-2")
    public WebElement btnOpciones;

    @FindBy(xpath = "//input[@id='outlined-size-normal']")
    public WebElement newNameRol;

    @FindBy(css = "div:nth-child(2) div.accordion div.accordion-item:nth-child(6) h2.accordion-header > button.accordion-button")
    public WebElement btnDetalles;

    @FindBy(css = "div.accordion-item:nth-child(6) div.accordion-collapse.collapse.show div.accordion-body div.row.border-top-2S div.col-2.pt-2:nth-child(2) > i.color-icon-settings.cursor-pointer.fa.fa-cogs.ml-2.mr-2")
    public WebElement btnUsuarios;

    @FindBy(xpath = "//button[@id='simple-tab-1']")
    public WebElement tabAgregarUsuario;

    @FindBy(xpath = "//input[contains(@name, 'checkedValue')]")
    public WebElement checkBox;

    @FindBy(xpath = "//div[contains(text(),'¡Ingresa un nombre!')]")
    public WebElement msgIngresaNombre;

    @FindBy(xpath = "//a[contains(@class, 'btn-content')]")
    public WebElement permissions;

    @FindBy(css = "div.accordion-item:nth-child(6) div.accordion-collapse.collapse.show div.accordion-body div.row.border-top-2S div.nameList.row:nth-child(4) div.col-3.my-1 > i.fa.fa-trash.color-icon-delete.mr-2")
    public WebElement deleteUSer;

    @FindBy(xpath = "//i[contains(@class, 'fa fa-angle-double-left')]")
    public WebElement btnOcultarNavBar;

    @FindBy(className ="sideLogoS")
    public WebElement btnHome;

}
